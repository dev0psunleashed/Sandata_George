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


import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Information pertaining to the clinical assessment of a patient
 * 
 * <p>Java class for Patient_Clinical_Assessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient_Clinical_Assessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Patient_Clinical_Assessment_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Patient_Clinical_Assessment_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Patient_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Patient_Functional_Abilities">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="250"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient_Clinical_Assessment")
@OracleMetadata(
        packageName = "PKG_PATIENT",
        insertMethod = "insertPtClinicalAsmt",
        updateMethod = "updatePtClinicalAsmt",
        deleteMethod = "deletePtClinicalAsmt",
        getMethod = "getPtClinicalAsmt",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.PtClinicalAsmtT",
        primaryKeys = {})
public class PatientClinicalAssessment extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Patient_Clinical_Assessment_SK", required = true)
    @SerializedName("PatientClinicalAssessmentSK")
	@Mapping(getter = "getPtClinicalAsmtSk", setter = "setPtClinicalAsmtSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger patientClinicalAssessmentSK;
    @XmlAttribute(name = "Patient_Clinical_Assessment_ID", required = true)
    @SerializedName("PatientClinicalAssessmentID")
	@Mapping(getter = "getPtClinicalAsmtId", setter = "setPtClinicalAsmtId", type = "String", index = 1)
    protected String patientClinicalAssessmentID;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecCreateTmstp", setter = "setRecCreateTmstp", type = "java.sql.Timestamp", index = 2)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecUpdateTmstp", setter = "setRecUpdateTmstp", type = "java.sql.Timestamp", index = 3)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Record_Effective_Timestamp", required = true)
    @SerializedName("RecordEffectiveTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecEffTmstp", setter = "setRecEffTmstp", type = "java.sql.Timestamp", index = 4)
    protected Date recordEffectiveTimestamp;
    @XmlAttribute(name = "Record_Termination_Timestamp", required = true)
    @SerializedName("RecordTerminationTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecTermTmstp", setter = "setRecTermTmstp", type = "java.sql.Timestamp", index = 5)
    protected Date recordTerminationTimestamp;
    @XmlAttribute(name = "Record_Created_By")
    @SerializedName("RecordCreatedBy")
	@Mapping(getter = "getRecCreatedBy", setter = "setRecCreatedBy", type = "String", index = 6)
    protected String recordCreatedBy;
    @XmlAttribute(name = "Record_Updated_By")
    @SerializedName("RecordUpdatedBy")
	@Mapping(getter = "getRecUpdatedBy", setter = "setRecUpdatedBy", type = "String", index = 7)
    protected String recordUpdatedBy;
    @XmlAttribute(name = "Change_Reason_Memo")
    @SerializedName("ChangeReasonMemo")
	@Mapping(getter = "getChangeReasonMemo", setter = "setChangeReasonMemo", type = "String", index = 8)
    protected String changeReasonMemo;
    @XmlAttribute(name = "Current_Record_Indicator", required = true)
    @SerializedName("CurrentRecordIndicator")
	@Mapping(getter = "getCurrRecInd", setter = "setCurrRecInd", type = "java.math.BigDecimal", index = 9)
    protected boolean currentRecordIndicator;
    @XmlAttribute(name = "Change_Version_ID", required = true)
    @SerializedName("ChangeVersionID")
	@Mapping(getter = "getChangeVersionId", setter = "setChangeVersionId", type = "java.math.BigDecimal", index = 10)
    protected BigInteger changeVersionID;
    @XmlAttribute(name = "Business_Entity_ID", required = true)
    @SerializedName("BusinessEntityID")
	@Mapping(getter = "getBeId", setter = "setBeId", type = "String", index = 11)
    protected String businessEntityID;
    @XmlAttribute(name = "Patient_ID", required = true)
    @SerializedName("PatientID")
	@Mapping(getter = "getPtId", setter = "setPtId", type = "String", index = 12)
    protected String patientID;
    @XmlAttribute(name = "Patient_Functional_Abilities")
    @SerializedName("PatientFunctionalAbilities")
	@Mapping(getter = "getPtFuncAbilities", setter = "setPtFuncAbilities", type = "String", index = 13)
    protected String patientFunctionalAbilities;

    /**
     * Gets the value of the patientClinicalAssessmentSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPatientClinicalAssessmentSK() {
        return patientClinicalAssessmentSK;
    }

    /**
     * Sets the value of the patientClinicalAssessmentSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPatientClinicalAssessmentSK(BigInteger value) {
        this.patientClinicalAssessmentSK = value;
    }

    /**
     * Gets the value of the patientClinicalAssessmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientClinicalAssessmentID() {
        return patientClinicalAssessmentID;
    }

    /**
     * Sets the value of the patientClinicalAssessmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientClinicalAssessmentID(String value) {
        this.patientClinicalAssessmentID = value;
    }

    /**
     * Gets the value of the recordCreateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRecordCreateTimestamp() {
        return recordCreateTimestamp;
    }

    /**
     * Sets the value of the recordCreateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCreateTimestamp(Date value) {
        this.recordCreateTimestamp = value;
    }

    /**
     * Gets the value of the recordUpdateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRecordUpdateTimestamp() {
        return recordUpdateTimestamp;
    }

    /**
     * Sets the value of the recordUpdateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordUpdateTimestamp(Date value) {
        this.recordUpdateTimestamp = value;
    }

    /**
     * Gets the value of the recordEffectiveTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRecordEffectiveTimestamp() {
        return recordEffectiveTimestamp;
    }

    /**
     * Sets the value of the recordEffectiveTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordEffectiveTimestamp(Date value) {
        this.recordEffectiveTimestamp = value;
    }

    /**
     * Gets the value of the recordTerminationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRecordTerminationTimestamp() {
        return recordTerminationTimestamp;
    }

    /**
     * Sets the value of the recordTerminationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTerminationTimestamp(Date value) {
        this.recordTerminationTimestamp = value;
    }

    /**
     * Gets the value of the recordCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordCreatedBy() {
        return recordCreatedBy;
    }

    /**
     * Sets the value of the recordCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCreatedBy(String value) {
        this.recordCreatedBy = value;
    }

    /**
     * Gets the value of the recordUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordUpdatedBy() {
        return recordUpdatedBy;
    }

    /**
     * Sets the value of the recordUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordUpdatedBy(String value) {
        this.recordUpdatedBy = value;
    }

    /**
     * Gets the value of the changeReasonMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeReasonMemo() {
        return changeReasonMemo;
    }

    /**
     * Sets the value of the changeReasonMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeReasonMemo(String value) {
        this.changeReasonMemo = value;
    }

    /**
     * Gets the value of the currentRecordIndicator property.
     * 
     */
    public boolean isCurrentRecordIndicator() {
        return currentRecordIndicator;
    }

    /**
     * Sets the value of the currentRecordIndicator property.
     * 
     */
    public void setCurrentRecordIndicator(boolean value) {
        this.currentRecordIndicator = value;
    }

    /**
     * Gets the value of the changeVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChangeVersionID() {
        return changeVersionID;
    }

    /**
     * Sets the value of the changeVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChangeVersionID(BigInteger value) {
        this.changeVersionID = value;
    }

    /**
     * Gets the value of the businessEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEntityID() {
        return businessEntityID;
    }

    /**
     * Sets the value of the businessEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEntityID(String value) {
        this.businessEntityID = value;
    }

    /**
     * Gets the value of the patientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * Sets the value of the patientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientID(String value) {
        this.patientID = value;
    }

    /**
     * Gets the value of the patientFunctionalAbilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientFunctionalAbilities() {
        return patientFunctionalAbilities;
    }

    /**
     * Sets the value of the patientFunctionalAbilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientFunctionalAbilities(String value) {
        this.patientFunctionalAbilities = value;
    }

}
