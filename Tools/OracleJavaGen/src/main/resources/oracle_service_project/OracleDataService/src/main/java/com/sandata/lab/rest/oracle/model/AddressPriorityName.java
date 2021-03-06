//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.27 at 10:53:27 PM EST 
//


package com.sandata.lab.rest.oracle.model;

import com.sandata.lab.data.model.*;
import com.google.gson.annotations.SerializedName;
import com.sandata.lab.data.model.base.BaseObject;
import com.sandata.lab.data.model.dl.annotation.Mapping;
import com.sandata.lab.data.model.dl.annotation.OracleMetadata;


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address_Priority_Name.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Address_Priority_Name">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="50"/>
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="SECONDARY"/>
 *     &lt;enumeration value="TERTIARY"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Address_Priority_Name")
@XmlEnum
public enum AddressPriorityName {


    /**
     * Primary Address
     * 
     */
    PRIMARY,

    /**
     * Secondary Address
     * 
     */
    SECONDARY,

    /**
     * Tertiary Address
     * 
     */
    TERTIARY,

    /**
     * Other Address
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static AddressPriorityName fromValue(String v) {
        return valueOf(v);
    }

}
