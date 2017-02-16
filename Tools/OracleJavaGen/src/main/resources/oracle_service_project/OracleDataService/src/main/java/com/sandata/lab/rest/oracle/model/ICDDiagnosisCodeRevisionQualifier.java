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
 * <p>Java class for ICD_Diagnosis_Code_Revision_Qualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ICD_Diagnosis_Code_Revision_Qualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="10"/>
 *     &lt;enumeration value="ICD-9"/>
 *     &lt;enumeration value="ICD-10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ICD_Diagnosis_Code_Revision_Qualifier")
@XmlEnum
public enum ICDDiagnosisCodeRevisionQualifier {


    /**
     * International Classification of Diseases ICD-9 Standard
     * 
     */
    @XmlEnumValue("ICD-9")
    ICD_9("ICD-9"),

    /**
     * International Classification of Diseases ICD-10 Standard
     * 
     */
    @XmlEnumValue("ICD-10")
    ICD_10("ICD-10");
    private final String value;

    ICDDiagnosisCodeRevisionQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ICDDiagnosisCodeRevisionQualifier fromValue(String v) {
        for (ICDDiagnosisCodeRevisionQualifier c: ICDDiagnosisCodeRevisionQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}