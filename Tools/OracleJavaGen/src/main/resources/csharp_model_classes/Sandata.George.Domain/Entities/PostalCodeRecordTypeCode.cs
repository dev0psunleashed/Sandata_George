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
 * <p>Java class for Postal_Code_Record_Type_Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Postal_Code_Record_Type_Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
public enum PostalCodeRecordTypeCode {


    /**
     * General delivery
     * 
     */
    G,

    /**
     * Highrise
     * 
     */
    H,

    /**
     * Firm
     * 
     */
    F,

    /**
     * Street
     * 
     */
    S,

    /**
     * PO Box
     * 
     */
    P,

    /**
     * Rural route/highway contract
     * 
     */
    R;

    public String value() {
        return name();
    }

    public static PostalCodeRecordTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
	}
}
