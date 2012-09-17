/*
 * Copyright (c) 2012 ForgeRock AS. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions Copyrighted [2012] [ForgeRock Inc]".
 *
 */

package org.forgerock.openam.oauth2.rest;

import com.iplanet.sso.SSOException;
import com.iplanet.sso.SSOToken;
import com.iplanet.sso.SSOTokenManager;
import com.sun.identity.sm.SMSEntry;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationFilter implements Filter {

    FilterConfig filterConfig = null;

    public void init(FilterConfig filterConfig) throws ServletException{
        this.filterConfig = filterConfig;
    }

    public void doFilter ( ServletRequest request, ServletResponse response, FilterChain chain )
            throws IOException, ServletException{
        boolean authorized = false;
        HttpServletRequest req = (HttpServletRequest) request;

        try {
            request.setCharacterEncoding("UTF-8");
            SSOTokenManager manager = SSOTokenManager.getInstance();
            SSOToken ssoToken = manager.createSSOToken(req);
            manager.validateToken(ssoToken);

            if (ssoToken.getPrincipal().getName().equalsIgnoreCase(
                    "id=amadmin,ou=user," + SMSEntry.getRootSuffix())
                    ) {
                //Is an admin continue
                authorized = true;
            } else {
                authorized = false;
            }
        } catch (SSOException e) {
            authorized = false;
        }

        if (authorized){
            chain.doFilter(request, response);
            return;
        } else {
            filterConfig.getServletContext().getRequestDispatcher("/UI/Login?goto="+req.getRequestURL().toString()).
                    forward(request, response);

            return;
        }

    }

    public void destroy(){

    }

}
