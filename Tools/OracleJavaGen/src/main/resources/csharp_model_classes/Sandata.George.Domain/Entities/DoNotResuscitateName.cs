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
 * <p>Java class for Do_Not_Resuscitate_Name.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Do_Not_Resuscitate_Name">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="50"/>
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Unknown/Not Applicable"/>
 *     &lt;enumeration value="Advanced Directive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
public enum DoNotResuscitateName {

    YES("Yes"),
    NO("No"),
    UNKNOWN_NOT_APPLICABLE("Unknown/Not Applicable"),
    ADVANCED_DIRECTIVE("Advanced Directive");
    private final String value;

    DoNotResuscitateName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoNotResuscitateName fromValue(String v) {
        for (DoNotResuscitateName c: DoNotResuscitateName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
	}
}
