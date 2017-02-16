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
 * Stores environmental information related to Patient
 * 
 * Current Residence
 * The environment in which the visit is being conducted. 
 * Includes Sanitation and Safety Hazards
 * Includes Structural Barriers that limit independent mobility
 * 
 * Any environmental factors that may affect the visiting Business Entity staff member
 * Any special needs and requests from the patient regarding the potential visiting staff caregiver 
 * 
 * 
 * <p>Java class for Patient_Environment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient_Environment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Patient_Pet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Patient_Structural_Barrier_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Patient_Environment_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Patient_Environment_ID" use="required" type="{}ID" />
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
 *       &lt;attribute name="Sanitation_And_Safety_Hazard">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="400"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Structural_Barrier_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Smoking_Environment_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Strong_Odor_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Pet_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Aggresive_Pet_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Access_To_WiFi_Indicator" type="{}Indicator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient_Environment", propOrder = {
    "patientPet",
    "patientStructuralBarrierDetail"
})
@OracleMetadata(
        packageName = "PKG_PATIENT",
        insertMethod = "insertPtEnv",
        updateMethod = "updatePtEnv",
        deleteMethod = "deletePtEnv",
        getMethod = "getPtEnv",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.PtEnvT",
        primaryKeys = {})
public class PatientEnvironment extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Patient_Pet")
    @SerializedName("PatientPet")
    protected List<PatientPet> patientPet;
    @XmlElement(name = "Patient_Structural_Barrier_Detail")
    @SerializedName("PatientStructuralBarrierDetail")
    protected List<PatientStructuralBarrierDetail> patientStructuralBarrierDetail;
    @XmlAttribute(name = "Patient_Environment_SK", required = true)
    @SerializedName("PatientEnvironmentSK")
	@Mapping(getter = "getPtEnvSk", setter = "setPtEnvSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger patientEnvironmentSK;
    @XmlAttribute(name = "Patient_Environment_ID", required = true)
    @SerializedName("PatientEnvironmentID")
	@Mapping(getter = "getPtEnvId", setter = "setPtEnvId", type = "String", index = 1)
    protected String patientEnvironmentID;
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
    @XmlAttribute(name = "Sanitation_And_Safety_Hazard")
    @SerializedName("SanitationAndSafetyHazard")
	@Mapping(getter = "getSanitationAndSftyHazard", setter = "setSanitationAndSftyHazard", type = "String", index = 13)
    protected String sanitationAndSafetyHazard;
    @XmlAttribute(name = "Structural_Barrier_Indicator")
    @SerializedName("StructuralBarrierIndicator")
	@Mapping(getter = "getStructBrrInd", setter = "setStructBrrInd", type = "java.math.BigDecimal", index = 14)
    protected Boolean structuralBarrierIndicator;
    @XmlAttribute(name = "Smoking_Environment_Indicator")
    @SerializedName("SmokingEnvironmentIndicator")
	@Mapping(getter = "getSmokingEnvInd", setter = "setSmokingEnvInd", type = "java.math.BigDecimal", index = 15)
    protected Boolean smokingEnvironmentIndicator;
    @XmlAttribute(name = "Strong_Odor_Indicator")
    @SerializedName("StrongOdorIndicator")
	@Mapping(getter = "getStrongOdorInd", setter = "setStrongOdorInd", type = "java.math.BigDecimal", index = 16)
    protected Boolean strongOdorIndicator;
    @XmlAttribute(name = "Pet_Indicator")
    @SerializedName("PetIndicator")
	@Mapping(getter = "getPetInd", setter = "setPetInd", type = "java.math.BigDecimal", index = 17)
    protected Boolean petIndicator;
    @XmlAttribute(name = "Aggresive_Pet_Indicator")
    @SerializedName("AggresivePetIndicator")
	@Mapping(getter = "getAggresivePetInd", setter = "setAggresivePetInd", type = "java.math.BigDecimal", index = 18)
    protected Boolean aggresivePetIndicator;
    @XmlAttribute(name = "Access_To_WiFi_Indicator")
    @SerializedName("AccessToWiFiIndicator")
	@Mapping(getter = "getAccessToWifiInd", setter = "setAccessToWifiInd", type = "java.math.BigDecimal", index = 19)
    protected Boolean accessToWiFiIndicator;

    /**
     * Gets the value of the patientPet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientPet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientPet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientPet }
     * 
     * 
     */
    public List<PatientPet> getPatientPet() {
        if (patientPet == null) {
            patientPet = new ArrayList<PatientPet>();
        }
        return this.patientPet;
    }

    /**
     * Gets the value of the patientStructuralBarrierDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientStructuralBarrierDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientStructuralBarrierDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientStructuralBarrierDetail }
     * 
     * 
     */
    public List<PatientStructuralBarrierDetail> getPatientStructuralBarrierDetail() {
        if (patientStructuralBarrierDetail == null) {
            patientStructuralBarrierDetail = new ArrayList<PatientStructuralBarrierDetail>();
        }
        return this.patientStructuralBarrierDetail;
    }

    /**
     * Gets the value of the patientEnvironmentSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPatientEnvironmentSK() {
        return patientEnvironmentSK;
    }

    /**
     * Sets the value of the patientEnvironmentSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPatientEnvironmentSK(BigInteger value) {
        this.patientEnvironmentSK = value;
    }

    /**
     * Gets the value of the patientEnvironmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientEnvironmentID() {
        return patientEnvironmentID;
    }

    /**
     * Sets the value of the patientEnvironmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientEnvironmentID(String value) {
        this.patientEnvironmentID = value;
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
     * Gets the value of the sanitationAndSafetyHazard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanitationAndSafetyHazard() {
        return sanitationAndSafetyHazard;
    }

    /**
     * Sets the value of the sanitationAndSafetyHazard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanitationAndSafetyHazard(String value) {
        this.sanitationAndSafetyHazard = value;
    }

    /**
     * Gets the value of the structuralBarrierIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStructuralBarrierIndicator() {
        return structuralBarrierIndicator;
    }

    /**
     * Sets the value of the structuralBarrierIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStructuralBarrierIndicator(Boolean value) {
        this.structuralBarrierIndicator = value;
    }

    /**
     * Gets the value of the smokingEnvironmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingEnvironmentIndicator() {
        return smokingEnvironmentIndicator;
    }

    /**
     * Sets the value of the smokingEnvironmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingEnvironmentIndicator(Boolean value) {
        this.smokingEnvironmentIndicator = value;
    }

    /**
     * Gets the value of the strongOdorIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrongOdorIndicator() {
        return strongOdorIndicator;
    }

    /**
     * Sets the value of the strongOdorIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrongOdorIndicator(Boolean value) {
        this.strongOdorIndicator = value;
    }

    /**
     * Gets the value of the petIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPetIndicator() {
        return petIndicator;
    }

    /**
     * Sets the value of the petIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPetIndicator(Boolean value) {
        this.petIndicator = value;
    }

    /**
     * Gets the value of the aggresivePetIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAggresivePetIndicator() {
        return aggresivePetIndicator;
    }

    /**
     * Sets the value of the aggresivePetIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAggresivePetIndicator(Boolean value) {
        this.aggresivePetIndicator = value;
    }

    /**
     * Gets the value of the accessToWiFiIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessToWiFiIndicator() {
        return accessToWiFiIndicator;
    }

    /**
     * Sets the value of the accessToWiFiIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessToWiFiIndicator(Boolean value) {
        this.accessToWiFiIndicator = value;
    }

}
