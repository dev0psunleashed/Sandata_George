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
 * <p>Java class for Medication_National_Council_for_Prescription_Drug_Programs_Unit_Of_Measure_Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Medication_National_Council_for_Prescription_Drug_Programs_Unit_Of_Measure_Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="20"/>
 *     &lt;enumeration value="EA"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="GM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Medication_National_Council_for_Prescription_Drug_Programs_Unit_Of_Measure_Code")
@XmlEnum
public enum MedicationNationalCouncilForPrescriptionDrugProgramsUnitOfMeasureCode {


    /**
     * "Unit of ""Each"" (EA)"
     * 
     */
    EA,

    /**
     * "Unit of ""Milliliter"" (ML)"
     * 
     */
    ML,

    /**
     * "Unit of ""Gram"" (GM)"
     * 
     */
    GM;

    public String value() {
        return name();
    }

    public static MedicationNationalCouncilForPrescriptionDrugProgramsUnitOfMeasureCode fromValue(String v) {
        return valueOf(v);
    }

}