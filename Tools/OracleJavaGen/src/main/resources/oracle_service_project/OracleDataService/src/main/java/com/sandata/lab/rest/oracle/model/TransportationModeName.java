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
 * <p>Java class for Transportation_Mode_Name.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Transportation_Mode_Name">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="50"/>
 *     &lt;enumeration value="DRIVING"/>
 *     &lt;enumeration value="WALKING"/>
 *     &lt;enumeration value="TRANSIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Transportation_Mode_Name")
@XmlEnum
public enum TransportationModeName {


    /**
     * Indicates distance calculation using the road network.
     * 
     */
    DRIVING,

    /**
     * Indicates walking via pedestrian paths & sidewalks (where available).
     * 
     */
    WALKING,

    /**
     * Mass transit including trains, busses and subway.
     * 
     */
    TRANSIT;

    public String value() {
        return name();
    }

    public static TransportationModeName fromValue(String v) {
        return valueOf(v);
    }

}
