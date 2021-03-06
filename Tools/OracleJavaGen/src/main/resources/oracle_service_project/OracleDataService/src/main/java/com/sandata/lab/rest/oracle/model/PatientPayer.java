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


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Allows for a many-to-many relationship between the Patient and Payer entities
 * 
 * <p>Java class for Patient_Payer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient_Payer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Patient_Payer_Limit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Patient_Payer_Insurance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Patient_Payer_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Payer_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Contract_ID" type="{}ID" />
 *       &lt;attribute name="Payer_Rank_Name" use="required" type="{}Payer_Rank_Name" />
 *       &lt;attribute name="Service_Name" type="{}Service_Name" />
 *       &lt;attribute name="Patient_Payer_Effective_Date" type="{}Attribute_Effective_Date" />
 *       &lt;attribute name="Patient_Payer_Termination_Date" type="{}Attribute_Termination_Date" />
 *       &lt;attribute name="Patient_Self_Pay_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Patient_Gaurantor_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Patient_Payer_Relationship_Type_Name" use="required" type="{}Patient_Payer_Relationship_Type_Name" />
 *       &lt;attribute name="Patient_Payer_Frequency_Type_Name" type="{}Frequency_Type_Name" />
 *       &lt;attribute name="Patient_Payer_Payment_Responsibility_Value_Qualifier" type="{}Payment_Responsibility_Value_Qualifier" />
 *       &lt;attribute name="Patient_Payer_Payment_Responsibility_Value" type="{}Money" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient_Payer", propOrder = {
    "patientPayerLimit",
    "patientPayerInsurance"
})
@OracleMetadata(
        packageName = "PKG_PATIENT",
        insertMethod = "insertPtPayer",
        updateMethod = "updatePtPayer",
        deleteMethod = "deletePtPayer",
        getMethod = "getPtPayer",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.PtPayerT",
        primaryKeys = {})
public class PatientPayer extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Patient_Payer_Limit")
    @SerializedName("PatientPayerLimit")
    protected List<PatientPayerLimit> patientPayerLimit;
    @XmlElement(name = "Patient_Payer_Insurance")
    @SerializedName("PatientPayerInsurance")
    protected List<PatientPayerInsurance> patientPayerInsurance;
    @XmlAttribute(name = "Patient_Payer_SK", required = true)
    @SerializedName("PatientPayerSK")
	@Mapping(getter = "getPtPayerSk", setter = "setPtPayerSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger patientPayerSK;
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
    @XmlAttribute(name = "Payer_ID", required = true)
    @SerializedName("PayerID")
	@Mapping(getter = "getPayerId", setter = "setPayerId", type = "String", index = 12)
    protected String payerID;
    @XmlAttribute(name = "Contract_ID")
    @SerializedName("ContractID")
	@Mapping(getter = "getContrId", setter = "setContrId", type = "String", index = 13)
    protected String contractID;
    @XmlAttribute(name = "Payer_Rank_Name", required = true)
    @SerializedName("PayerRankName")
	@Mapping(getter = "getPayerRankName", setter = "setPayerRankName", type = "String", index = 14)
    protected PayerRankName payerRankName;
    @XmlAttribute(name = "Service_Name")
    @SerializedName("ServiceName")
	@Mapping(getter = "getSvcName", setter = "setSvcName", type = "String", index = 15)
    protected ServiceName serviceName;
    @XmlAttribute(name = "Patient_Payer_Effective_Date")
    @SerializedName("PatientPayerEffectiveDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getPtPayerEffDate", setter = "setPtPayerEffDate", type = "java.sql.Timestamp", index = 16)
    protected Date patientPayerEffectiveDate;
    @XmlAttribute(name = "Patient_Payer_Termination_Date")
    @SerializedName("PatientPayerTerminationDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getPtPayerTermDate", setter = "setPtPayerTermDate", type = "java.sql.Timestamp", index = 17)
    protected Date patientPayerTerminationDate;
    @XmlAttribute(name = "Patient_Self_Pay_Indicator")
    @SerializedName("PatientSelfPayIndicator")
	@Mapping(getter = "getPtSelfPayInd", setter = "setPtSelfPayInd", type = "java.math.BigDecimal", index = 18)
    protected Boolean patientSelfPayIndicator;
    @XmlAttribute(name = "Patient_Gaurantor_Indicator")
    @SerializedName("PatientGaurantorIndicator")
	@Mapping(getter = "getPtGaurantorInd", setter = "setPtGaurantorInd", type = "java.math.BigDecimal", index = 19)
    protected Boolean patientGaurantorIndicator;
    @XmlAttribute(name = "Patient_Payer_Relationship_Type_Name", required = true)
    @SerializedName("PatientPayerRelationshipTypeName")
	@Mapping(getter = "getPtPayerRelTypName", setter = "setPtPayerRelTypName", type = "String", index = 20)
    protected PatientPayerRelationshipTypeName patientPayerRelationshipTypeName;
    @XmlAttribute(name = "Patient_Payer_Frequency_Type_Name")
    @SerializedName("PatientPayerFrequencyTypeName")
	@Mapping(getter = "getPtPayerFreqTypName", setter = "setPtPayerFreqTypName", type = "String", index = 21)
    protected FrequencyTypeName patientPayerFrequencyTypeName;
    @XmlAttribute(name = "Patient_Payer_Payment_Responsibility_Value_Qualifier")
    @SerializedName("PatientPayerPaymentResponsibilityValueQualifier")
	@Mapping(getter = "getPtPayerPmtRespValQlfr", setter = "setPtPayerPmtRespValQlfr", type = "String", index = 22)
    protected PaymentResponsibilityValueQualifier patientPayerPaymentResponsibilityValueQualifier;
    @XmlAttribute(name = "Patient_Payer_Payment_Responsibility_Value")
    @SerializedName("PatientPayerPaymentResponsibilityValue")
	@Mapping(getter = "getPtPayerPmtRespVal", setter = "setPtPayerPmtRespVal", type = "java.math.BigDecimal", index = 23)
    protected BigDecimal patientPayerPaymentResponsibilityValue;

    /**
     * Gets the value of the patientPayerLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientPayerLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientPayerLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientPayerLimit }
     * 
     * 
     */
    public List<PatientPayerLimit> getPatientPayerLimit() {
        if (patientPayerLimit == null) {
            patientPayerLimit = new ArrayList<PatientPayerLimit>();
        }
        return this.patientPayerLimit;
    }

    /**
     * Gets the value of the patientPayerInsurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientPayerInsurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientPayerInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientPayerInsurance }
     * 
     * 
     */
    public List<PatientPayerInsurance> getPatientPayerInsurance() {
        if (patientPayerInsurance == null) {
            patientPayerInsurance = new ArrayList<PatientPayerInsurance>();
        }
        return this.patientPayerInsurance;
    }

    /**
     * Gets the value of the patientPayerSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPatientPayerSK() {
        return patientPayerSK;
    }

    /**
     * Sets the value of the patientPayerSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPatientPayerSK(BigInteger value) {
        this.patientPayerSK = value;
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
     * Gets the value of the payerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerID() {
        return payerID;
    }

    /**
     * Sets the value of the payerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerID(String value) {
        this.payerID = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractID(String value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the payerRankName property.
     * 
     * @return
     *     possible object is
     *     {@link PayerRankName }
     *     
     */
    public PayerRankName getPayerRankName() {
        return payerRankName;
    }

    /**
     * Sets the value of the payerRankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerRankName }
     *     
     */
    public void setPayerRankName(PayerRankName value) {
        this.payerRankName = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceName }
     *     
     */
    public ServiceName getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceName }
     *     
     */
    public void setServiceName(ServiceName value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the patientPayerEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPatientPayerEffectiveDate() {
        return patientPayerEffectiveDate;
    }

    /**
     * Sets the value of the patientPayerEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientPayerEffectiveDate(Date value) {
        this.patientPayerEffectiveDate = value;
    }

    /**
     * Gets the value of the patientPayerTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPatientPayerTerminationDate() {
        return patientPayerTerminationDate;
    }

    /**
     * Sets the value of the patientPayerTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientPayerTerminationDate(Date value) {
        this.patientPayerTerminationDate = value;
    }

    /**
     * Gets the value of the patientSelfPayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPatientSelfPayIndicator() {
        return patientSelfPayIndicator;
    }

    /**
     * Sets the value of the patientSelfPayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPatientSelfPayIndicator(Boolean value) {
        this.patientSelfPayIndicator = value;
    }

    /**
     * Gets the value of the patientGaurantorIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPatientGaurantorIndicator() {
        return patientGaurantorIndicator;
    }

    /**
     * Sets the value of the patientGaurantorIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPatientGaurantorIndicator(Boolean value) {
        this.patientGaurantorIndicator = value;
    }

    /**
     * Gets the value of the patientPayerRelationshipTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link PatientPayerRelationshipTypeName }
     *     
     */
    public PatientPayerRelationshipTypeName getPatientPayerRelationshipTypeName() {
        return patientPayerRelationshipTypeName;
    }

    /**
     * Sets the value of the patientPayerRelationshipTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientPayerRelationshipTypeName }
     *     
     */
    public void setPatientPayerRelationshipTypeName(PatientPayerRelationshipTypeName value) {
        this.patientPayerRelationshipTypeName = value;
    }

    /**
     * Gets the value of the patientPayerFrequencyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyTypeName }
     *     
     */
    public FrequencyTypeName getPatientPayerFrequencyTypeName() {
        return patientPayerFrequencyTypeName;
    }

    /**
     * Sets the value of the patientPayerFrequencyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyTypeName }
     *     
     */
    public void setPatientPayerFrequencyTypeName(FrequencyTypeName value) {
        this.patientPayerFrequencyTypeName = value;
    }

    /**
     * Gets the value of the patientPayerPaymentResponsibilityValueQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponsibilityValueQualifier }
     *     
     */
    public PaymentResponsibilityValueQualifier getPatientPayerPaymentResponsibilityValueQualifier() {
        return patientPayerPaymentResponsibilityValueQualifier;
    }

    /**
     * Sets the value of the patientPayerPaymentResponsibilityValueQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponsibilityValueQualifier }
     *     
     */
    public void setPatientPayerPaymentResponsibilityValueQualifier(PaymentResponsibilityValueQualifier value) {
        this.patientPayerPaymentResponsibilityValueQualifier = value;
    }

    /**
     * Gets the value of the patientPayerPaymentResponsibilityValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPatientPayerPaymentResponsibilityValue() {
        return patientPayerPaymentResponsibilityValue;
    }

    /**
     * Sets the value of the patientPayerPaymentResponsibilityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPatientPayerPaymentResponsibilityValue(BigDecimal value) {
        this.patientPayerPaymentResponsibilityValue = value;
    }

}
