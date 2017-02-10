/*******************************************************************************
 *  Copyright FUJITSU LIMITED 2017
 *******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.05 at 01:29:11 PM CET 
//


package org.oscm.billingservice.business.model.billingresult;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceModelCalculationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="priceModelCalculationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREE_OF_CHARGE"/>
 *     &lt;enumeration value="PRO_RATA"/>
 *     &lt;enumeration value="PER_UNIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "priceModelCalculationType")
@XmlEnum
public enum PriceModelCalculationType {

    FREE_OF_CHARGE,
    PRO_RATA,
    PER_UNIT;

    public String value() {
        return name();
    }

    public static PriceModelCalculationType fromValue(String v) {
        return valueOf(v);
    }

}
