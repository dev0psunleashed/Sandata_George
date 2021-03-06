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
 * <p>Java class for Schedule_Permission_Qualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Schedule_Permission_Qualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="50"/>
 *     &lt;enumeration value="PREVENT"/>
 *     &lt;enumeration value="WARN"/>
 *     &lt;enumeration value="ALLOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Schedule_Permission_Qualifier")
@XmlEnum
public enum SchedulePermissionQualifier {


    /**
     * Indicates that scheduling must be prevented
     * 
     */
    PREVENT,

    /**
     * Indicates that scheduling may be permitted with a warning
     * 
     */
    WARN,

    /**
     * Indicates that scheduling is allowed
     * 
     */
    ALLOW;

    public String value() {
        return name();
    }

    public static SchedulePermissionQualifier fromValue(String v) {
        return valueOf(v);
    }

}
