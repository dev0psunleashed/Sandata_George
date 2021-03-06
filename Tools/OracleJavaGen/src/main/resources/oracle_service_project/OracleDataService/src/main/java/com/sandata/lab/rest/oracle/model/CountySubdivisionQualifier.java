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
 * <p>Java class for County_Subdivision_Qualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="County_Subdivision_Qualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="50"/>
 *     &lt;enumeration value="BARRIO"/>
 *     &lt;enumeration value="BARRIO-PUEBLO"/>
 *     &lt;enumeration value="BOROUGH"/>
 *     &lt;enumeration value="CAMP"/>
 *     &lt;enumeration value="CCD"/>
 *     &lt;enumeration value="CENSUS SUBAREA"/>
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="COUNTY"/>
 *     &lt;enumeration value="DISTRICT"/>
 *     &lt;enumeration value="FORT"/>
 *     &lt;enumeration value="LAKE"/>
 *     &lt;enumeration value="MUNICIPALITY"/>
 *     &lt;enumeration value="PLANTATION"/>
 *     &lt;enumeration value="PRECINCT"/>
 *     &lt;enumeration value="RESERVATION"/>
 *     &lt;enumeration value="RESERVOIR"/>
 *     &lt;enumeration value="TOWN"/>
 *     &lt;enumeration value="TOWNSHIP"/>
 *     &lt;enumeration value="VILLAGE"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="NOT DEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "County_Subdivision_Qualifier")
@XmlEnum
public enum CountySubdivisionQualifier {


    /**
     * A district of a town in Spain and Spanish-speaking countries. (In the US) the Spanish-speaking quarter of a town or city, especially one with a high poverty level.
     * 
     */
    BARRIO("BARRIO"),

    /**
     * The barrio-pueblo is differentiated from other barrios because it is the historical center and seat of government of its municipio.
     * 
     */
    @XmlEnumValue("BARRIO-PUEBLO")
    BARRIO_PUEBLO("BARRIO-PUEBLO"),

    /**
     * A town or district that is an administrative unit, in particular.An incorporated municipality in certain US states. Each of five divisions of New York City.
     * 
     */
    BOROUGH("BOROUGH"),

    /**
     * A settlement newly sprung up in a lumbering or mining region.
     * 
     */
    CAMP("CAMP"),

    /**
     * Census County Division
     * 
     */
    CCD("CCD"),

    /**
     * Census Sub-Area
     * 
     */
    @XmlEnumValue("CENSUS SUBAREA")
    CENSUS_SUBAREA("CENSUS SUBAREA"),

    /**
     * A large town.
     * 
     */
    CITY("CITY"),

    /**
     * (In the US) a political and administrative division of a state, providing certain local governmental services. A territorial division of some countries, forming the chief unit of local administration.
     * 
     */
    COUNTY("COUNTY"),

    /**
     * An area of a country or city, especially one regarded as a distinct unit because of a particular characteristic.
     * 
     */
    DISTRICT("DISTRICT"),

    /**
     * A fortified building or strategic position. A permanent army post.
     * 
     */
    FORT("FORT"),

    /**
     * A large body of water surrounded by land.
     * 
     */
    LAKE("LAKE"),

    /**
     * A city or town that has corporate status and local government.
     * 
     */
    MUNICIPALITY("MUNICIPALITY"),

    /**
     * A district of a city or town as defined for police purposes.
     * 
     */
    PLANTATION("PLANTATION"),

    /**
     * The area within the walls or perceived boundaries of a particular building or place. A district of a city or town as defined for police purposes.
     * 
     */
    PRECINCT("PRECINCT"),

    /**
     * An area of land in the U.S. that is kept separate as a place for Native Americans to live
     * 
     */
    RESERVATION("RESERVATION"),

    /**
     * A large natural or artificial lake used as a source of water supply.
     * 
     */
    RESERVOIR("RESERVOIR"),

    /**
     * An urban area that has a name, defined boundaries, and local government, and that is generally larger than a village and smaller than a city.
     * 
     */
    TOWN("TOWN"),

    /**
     * A division of a county with some corporate powers.
     * 
     */
    TOWNSHIP("TOWNSHIP"),

    /**
     * A group of houses and associated buildings, larger than a hamlet and smaller than a town, situated in a rural area. (In the US) a small municipality with limited corporate powers.
     * 
     */
    VILLAGE("VILLAGE"),

    /**
     * Other
     * 
     */
    OTHER("OTHER"),

    /**
     * Not defined
     * 
     */
    @XmlEnumValue("NOT DEFINED")
    NOT_DEFINED("NOT DEFINED");
    private final String value;

    CountySubdivisionQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountySubdivisionQualifier fromValue(String v) {
        for (CountySubdivisionQualifier c: CountySubdivisionQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
