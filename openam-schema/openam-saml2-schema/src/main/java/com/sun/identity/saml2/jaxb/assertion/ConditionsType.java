//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.assertion;


/**
 * Java content class for ConditionsType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/saml2/saml-schema-assertion-2.0.xsd line 157)
 * <p>
 * <pre>
 * &lt;complexType name="ConditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}Condition"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}AudienceRestriction"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}OneTimeUse"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}ProxyRestriction"/>
 *       &lt;/choice>
 *       &lt;attribute name="NotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="NotOnOrAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ConditionsType {


    /**
     * Gets the value of the notBefore property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getNotBefore();

    /**
     * Sets the value of the notBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setNotBefore(java.util.Calendar value);

    /**
     * Gets the value of the ConditionOrAudienceRestrictionOrOneTimeUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ConditionOrAudienceRestrictionOrOneTimeUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionOrAudienceRestrictionOrOneTimeUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.saml2.jaxb.assertion.ProxyRestrictionElement}
     * {@link com.sun.identity.saml2.jaxb.assertion.ConditionElement}
     * {@link com.sun.identity.saml2.jaxb.assertion.AudienceRestrictionElement}
     * {@link com.sun.identity.saml2.jaxb.assertion.OneTimeUseElement}
     * 
     */
    java.util.List getConditionOrAudienceRestrictionOrOneTimeUse();

    /**
     * Gets the value of the notOnOrAfter property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getNotOnOrAfter();

    /**
     * Sets the value of the notOnOrAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setNotOnOrAfter(java.util.Calendar value);

}