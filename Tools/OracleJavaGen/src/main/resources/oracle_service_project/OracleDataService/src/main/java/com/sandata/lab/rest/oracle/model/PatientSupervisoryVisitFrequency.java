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
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Patient_Supervisory_Visit_Frequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Patient_Supervisory_Visit_Frequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="50"/>
 *     &lt;enumeration value="Every 14 Days"/>
 *     &lt;enumeration value="Every 30 Days"/>
 *     &lt;enumeration value="Every 60 Days"/>
 *     &lt;enumeration value="Every 90 Days"/>
 *     &lt;enumeration value="Every 120 Days"/>
 *     &lt;enumeration value="Every 180 Days"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Patient_Supervisory_Visit_Frequency")
@XmlEnum
public enum PatientSupervisoryVisitFrequency {

    @XmlEnumValue("Every 14 Days")
    EVERY_14_DAYS("Every 14 Days"),
    @XmlEnumValue("Every 30 Days")
    EVERY_30_DAYS("Every 30 Days"),
    @XmlEnumValue("Every 60 Days")
    EVERY_60_DAYS("Every 60 Days"),
    @XmlEnumValue("Every 90 Days")
    EVERY_90_DAYS("Every 90 Days"),
    @XmlEnumValue("Every 120 Days")
    EVERY_120_DAYS("Every 120 Days"),
    @XmlEnumValue("Every 180 Days")
    EVERY_180_DAYS("Every 180 Days");
    private final String value;

    PatientSupervisoryVisitFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatientSupervisoryVisitFrequency fromValue(String v) {
        for (PatientSupervisoryVisitFrequency c: PatientSupervisoryVisitFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}