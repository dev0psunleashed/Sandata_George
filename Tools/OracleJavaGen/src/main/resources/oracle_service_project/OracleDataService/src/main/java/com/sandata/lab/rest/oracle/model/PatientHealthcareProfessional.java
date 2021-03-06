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
 * <p>Java class for Patient_Healthcare_Professional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient_Healthcare_Professional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Patient_Healthcare_Professional_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Healthcare_Professional_National_Provider_Identifier" use="required" type="{}National_Provider_Identifier" />
 *       &lt;attribute name="Patient_Healthcare_Professional_Start_Date" use="required" type="{}Start_Datetime" />
 *       &lt;attribute name="Patient_Healthcare_Professional_End_Date" type="{}End_Datetime" />
 *       &lt;attribute name="Patient_Healthcare_Professional_Provider_Type_Name" use="required" type="{}Healthcare_Professional_Provider_Type_Name" />
 *       &lt;attribute name="Patient_Healthcare_Professional_Provider_Type_Name_Other">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Patient_Healthcare_Professional_Signature_Indicator" type="{}Indicator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient_Healthcare_Professional")
@OracleMetadata(
        packageName = "PKG_PATIENT",
        insertMethod = "insertPtHcp",
        updateMethod = "updatePtHcp",
        deleteMethod = "deletePtHcp",
        getMethod = "getPtHcp",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.PtHcpT",
        primaryKeys = {})
public class PatientHealthcareProfessional extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Patient_Healthcare_Professional_SK", required = true)
    @SerializedName("PatientHealthcareProfessionalSK")
	@Mapping(getter = "getPtHcpSk", setter = "setPtHcpSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger patientHealthcareProfessionalSK;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecCreateTmstp", setter = "setRecCreateTmstp", type = "java.sql.Timestamp", index = 1)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecUpdateTmstp", setter = "setRecUpdateTmstp", type = "java.sql.Timestamp", index = 2)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Record_Effective_Timestamp", required = true)
    @SerializedName("RecordEffectiveTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecEffTmstp", setter = "setRecEffTmstp", type = "java.sql.Timestamp", index = 3)
    protected Date recordEffectiveTimestamp;
    @XmlAttribute(name = "Record_Termination_Timestamp", required = true)
    @SerializedName("RecordTerminationTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecTermTmstp", setter = "setRecTermTmstp", type = "java.sql.Timestamp", index = 4)
    protected Date recordTerminationTimestamp;
    @XmlAttribute(name = "Record_Created_By")
    @SerializedName("RecordCreatedBy")
	@Mapping(getter = "getRecCreatedBy", setter = "setRecCreatedBy", type = "String", index = 5)
    protected String recordCreatedBy;
    @XmlAttribute(name = "Record_Updated_By")
    @SerializedName("RecordUpdatedBy")
	@Mapping(getter = "getRecUpdatedBy", setter = "setRecUpdatedBy", type = "String", index = 6)
    protected String recordUpdatedBy;
    @XmlAttribute(name = "Change_Reason_Memo")
    @SerializedName("ChangeReasonMemo")
	@Mapping(getter = "getChangeReasonMemo", setter = "setChangeReasonMemo", type = "String", index = 7)
    protected String changeReasonMemo;
    @XmlAttribute(name = "Current_Record_Indicator", required = true)
    @SerializedName("CurrentRecordIndicator")
	@Mapping(getter = "getCurrRecInd", setter = "setCurrRecInd", type = "java.math.BigDecimal", index = 8)
    protected boolean currentRecordIndicator;
    @XmlAttribute(name = "Change_Version_ID", required = true)
    @SerializedName("ChangeVersionID")
	@Mapping(getter = "getChangeVersionId", setter = "setChangeVersionId", type = "java.math.BigDecimal", index = 9)
    protected BigInteger changeVersionID;
    @XmlAttribute(name = "Business_Entity_ID", required = true)
    @SerializedName("BusinessEntityID")
	@Mapping(getter = "getBeId", setter = "setBeId", type = "String", index = 10)
    protected String businessEntityID;
    @XmlAttribute(name = "Patient_ID", required = true)
    @SerializedName("PatientID")
	@Mapping(getter = "getPtId", setter = "setPtId", type = "String", index = 11)
    protected String patientID;
    @XmlAttribute(name = "Healthcare_Professional_National_Provider_Identifier", required = true)
    @SerializedName("HealthcareProfessionalNationalProviderIdentifier")
	@Mapping(getter = "getHcpNpi", setter = "setHcpNpi", type = "String", index = 12)
    protected String healthcareProfessionalNationalProviderIdentifier;
    @XmlAttribute(name = "Patient_Healthcare_Professional_Start_Date", required = true)
    @SerializedName("PatientHealthcareProfessionalStartDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getPtHcpStartDate", setter = "setPtHcpStartDate", type = "java.sql.Timestamp", index = 13)
    protected Date patientHealthcareProfessionalStartDate;
    @XmlAttribute(name = "Patient_Healthcare_Professional_End_Date")
    @SerializedName("PatientHealthcareProfessionalEndDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getPtHcpEndDate", setter = "setPtHcpEndDate", type = "java.sql.Timestamp", index = 14)
    protected Date patientHealthcareProfessionalEndDate;
    @XmlAttribute(name = "Patient_Healthcare_Professional_Provider_Type_Name", required = true)
    @SerializedName("PatientHealthcareProfessionalProviderTypeName")
	@Mapping(getter = "getPtHcpProviderTypName", setter = "setPtHcpProviderTypName", type = "String", index = 15)
    protected HealthcareProfessionalProviderTypeName patientHealthcareProfessionalProviderTypeName;
    @XmlAttribute(name = "Patient_Healthcare_Professional_Provider_Type_Name_Other")
    @SerializedName("PatientHealthcareProfessionalProviderTypeNameOther")
	@Mapping(getter = "getPtHcpProviderTypNameOther", setter = "setPtHcpProviderTypNameOther", type = "String", index = 16)
    protected String patientHealthcareProfessionalProviderTypeNameOther;
    @XmlAttribute(name = "Patient_Healthcare_Professional_Signature_Indicator")
    @SerializedName("PatientHealthcareProfessionalSignatureIndicator")
	@Mapping(getter = "getPtHcpSigInd", setter = "setPtHcpSigInd", type = "java.math.BigDecimal", index = 17)
    protected Boolean patientHealthcareProfessionalSignatureIndicator;

    /**
     * Gets the value of the patientHealthcareProfessionalSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPatientHealthcareProfessionalSK() {
        return patientHealthcareProfessionalSK;
    }

    /**
     * Sets the value of the patientHealthcareProfessionalSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPatientHealthcareProfessionalSK(BigInteger value) {
        this.patientHealthcareProfessionalSK = value;
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
     * Gets the value of the healthcareProfessionalNationalProviderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthcareProfessionalNationalProviderIdentifier() {
        return healthcareProfessionalNationalProviderIdentifier;
    }

    /**
     * Sets the value of the healthcareProfessionalNationalProviderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthcareProfessionalNationalProviderIdentifier(String value) {
        this.healthcareProfessionalNationalProviderIdentifier = value;
    }

    /**
     * Gets the value of the patientHealthcareProfessionalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPatientHealthcareProfessionalStartDate() {
        return patientHealthcareProfessionalStartDate;
    }

    /**
     * Sets the value of the patientHealthcareProfessionalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientHealthcareProfessionalStartDate(Date value) {
        this.patientHealthcareProfessionalStartDate = value;
    }

    /**
     * Gets the value of the patientHealthcareProfessionalEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPatientHealthcareProfessionalEndDate() {
        return patientHealthcareProfessionalEndDate;
    }

    /**
     * Sets the value of the patientHealthcareProfessionalEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientHealthcareProfessionalEndDate(Date value) {
        this.patientHealthcareProfessionalEndDate = value;
    }

    /**
     * Gets the value of the patientHealthcareProfessionalProviderTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareProfessionalProviderTypeName }
     *     
     */
    public HealthcareProfessionalProviderTypeName getPatientHealthcareProfessionalProviderTypeName() {
        return patientHealthcareProfessionalProviderTypeName;
    }

    /**
     * Sets the value of the patientHealthcareProfessionalProviderTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareProfessionalProviderTypeName }
     *     
     */
    public void setPatientHealthcareProfessionalProviderTypeName(HealthcareProfessionalProviderTypeName value) {
        this.patientHealthcareProfessionalProviderTypeName = value;
    }

    /**
     * Gets the value of the patientHealthcareProfessionalProviderTypeNameOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientHealthcareProfessionalProviderTypeNameOther() {
        return patientHealthcareProfessionalProviderTypeNameOther;
    }

    /**
     * Sets the value of the patientHealthcareProfessionalProviderTypeNameOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientHealthcareProfessionalProviderTypeNameOther(String value) {
        this.patientHealthcareProfessionalProviderTypeNameOther = value;
    }

    /**
     * Gets the value of the patientHealthcareProfessionalSignatureIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPatientHealthcareProfessionalSignatureIndicator() {
        return patientHealthcareProfessionalSignatureIndicator;
    }

    /**
     * Sets the value of the patientHealthcareProfessionalSignatureIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPatientHealthcareProfessionalSignatureIndicator(Boolean value) {
        this.patientHealthcareProfessionalSignatureIndicator = value;
    }

}
