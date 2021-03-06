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
 * <p>Java class for Servicing_Location_Qualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Servicing_Location_Qualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="50"/>
 *     &lt;enumeration value="Provider billing address"/>
 *     &lt;enumeration value="Provider servicing location address"/>
 *     &lt;enumeration value="Patient address"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
public enum ServicingLocationQualifier {

    PROVIDER_BILLING_ADDRESS("Provider billing address"),
    PROVIDER_SERVICING_LOCATION_ADDRESS("Provider servicing location address"),
    PATIENT_ADDRESS("Patient address");
    private final String value;

    ServicingLocationQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServicingLocationQualifier fromValue(String v) {
        for (ServicingLocationQualifier c: ServicingLocationQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
	}
}
