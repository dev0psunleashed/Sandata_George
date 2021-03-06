//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.27 at 10:53:27 PM EST 
//


using Sandata.George.Common;
using Sandata.George.Common.Helpers;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;





/**
 * <p>Java class for Patient_Payer_Relationship_Type_Name.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Patient_Payer_Relationship_Type_Name">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="50"/>
 *     &lt;enumeration value="BUSINESS"/>
 *     &lt;enumeration value="CHILD"/>
 *     &lt;enumeration value="EXTENDED FAMILY"/>
 *     &lt;enumeration value="FRIEND"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PARENT"/>
 *     &lt;enumeration value="SELF"/>
 *     &lt;enumeration value="SIBLING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
public enum PatientPayerRelationshipTypeName {


    /**
     * Business
     * 
     */
    BUSINESS("BUSINESS"),

    /**
     * Child
     * 
     */
    CHILD("CHILD"),

    /**
     * Extended Family
     * 
     */
    EXTENDED_FAMILY("EXTENDED FAMILY"),

    /**
     * Friend
     * 
     */
    FRIEND("FRIEND"),

    /**
     * Other
     * 
     */
    OTHER("OTHER"),

    /**
     * Parent
     * 
     */
    PARENT("PARENT"),

    /**
     * Self
     * 
     */
    SELF("SELF"),

    /**
     * Sibling
     * 
     */
    SIBLING("SIBLING");
    private final String value;

    PatientPayerRelationshipTypeName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatientPayerRelationshipTypeName fromValue(String v) {
        for (PatientPayerRelationshipTypeName c: PatientPayerRelationshipTypeName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
	}
}
