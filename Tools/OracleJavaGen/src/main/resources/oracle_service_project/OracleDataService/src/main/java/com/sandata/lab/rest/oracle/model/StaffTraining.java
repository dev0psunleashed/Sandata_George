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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Stores information on the In Service Trainings offered by the Business Entity that Staff member has completed or is scheduled to complete.
 * State approved education or training program means a program that provides education or training for persons to meet any requirement established by the Department for providing home health aide services or personal care services, which program is approved by the Department or the New York State Education Department. (NY State Dept of Health)
 * 
 * <p>Java class for Staff_Training complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Staff_Training">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Staff_Training_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Code" type="{}Change_Reason_Code" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Staff_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Staff_Training_Start_Datetime" use="required" type="{}Start_Datetime" />
 *       &lt;attribute name="Staff_Training_Enrolled_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Staff_Training_Result_Code" type="{}Code" />
 *       &lt;attribute name="Staff_Training_Location_Name" use="required" type="{}Name" />
 *       &lt;attribute name="Staff_Training_Code" use="required" type="{}Code" />
 *       &lt;attribute name="Staff_Training_Qualifier" use="required" type="{}Staff_Training_Qualifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Staff_Training")
@OracleMetadata(
        packageName = "PKG_STAFF",
        insertMethod = "insertStaffTrng",
        updateMethod = "updateStaffTrng",
        deleteMethod = "deleteStaffTrng",
        getMethod = "getStaffTrng",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.StaffTrngT",
        primaryKeys = {})
public class StaffTraining extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Staff_Training_SK", required = true)
    @SerializedName("StaffTrainingSK")
	@Mapping(getter = "getStaffTrngSk", setter = "setStaffTrngSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger staffTrainingSK;
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
    @XmlAttribute(name = "Change_Reason_Code")
    @SerializedName("ChangeReasonCode")
	@Mapping(getter = "getChangeReasonCode", setter = "setChangeReasonCode", type = "String", index = 7)
    protected String changeReasonCode;
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
    @XmlAttribute(name = "Staff_ID", required = true)
    @SerializedName("StaffID")
	@Mapping(getter = "getStaffId", setter = "setStaffId", type = "String", index = 12)
    protected String staffID;
    @XmlAttribute(name = "Staff_Training_Start_Datetime", required = true)
    @SerializedName("StaffTrainingStartDatetime")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getStaffTrngStartDtime", setter = "setStaffTrngStartDtime", type = "java.sql.Timestamp", index = 13)
    protected Date staffTrainingStartDatetime;
    @XmlAttribute(name = "Staff_Training_Enrolled_Date")
    @SerializedName("StaffTrainingEnrolledDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
	@Mapping(getter = "getStaffTrngEnrolledDate", setter = "setStaffTrngEnrolledDate", type = "java.sql.Timestamp", index = 14)
    protected Date staffTrainingEnrolledDate;
    @XmlAttribute(name = "Staff_Training_Result_Code")
    @SerializedName("StaffTrainingResultCode")
	@Mapping(getter = "getStaffTrngResultCode", setter = "setStaffTrngResultCode", type = "String", index = 15)
    protected String staffTrainingResultCode;
    @XmlAttribute(name = "Staff_Training_Location_Name", required = true)
    @SerializedName("StaffTrainingLocationName")
	@Mapping(getter = "getStaffTrngLocName", setter = "setStaffTrngLocName", type = "String", index = 16)
    protected String staffTrainingLocationName;
    @XmlAttribute(name = "Staff_Training_Code", required = true)
    @SerializedName("StaffTrainingCode")
	@Mapping(getter = "getStaffTrngCode", setter = "setStaffTrngCode", type = "String", index = 17)
    protected String staffTrainingCode;
    @XmlAttribute(name = "Staff_Training_Qualifier", required = true)
    @SerializedName("StaffTrainingQualifier")
	@Mapping(getter = "getStaffTrngQlfr", setter = "setStaffTrngQlfr", type = "String", index = 18)
    protected StaffTrainingQualifier staffTrainingQualifier;

    /**
     * Gets the value of the staffTrainingSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaffTrainingSK() {
        return staffTrainingSK;
    }

    /**
     * Sets the value of the staffTrainingSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaffTrainingSK(BigInteger value) {
        this.staffTrainingSK = value;
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
     * Gets the value of the changeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeReasonCode() {
        return changeReasonCode;
    }

    /**
     * Sets the value of the changeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeReasonCode(String value) {
        this.changeReasonCode = value;
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
     * Gets the value of the staffID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffID() {
        return staffID;
    }

    /**
     * Sets the value of the staffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffID(String value) {
        this.staffID = value;
    }

    /**
     * Gets the value of the staffTrainingStartDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStaffTrainingStartDatetime() {
        return staffTrainingStartDatetime;
    }

    /**
     * Sets the value of the staffTrainingStartDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffTrainingStartDatetime(Date value) {
        this.staffTrainingStartDatetime = value;
    }

    /**
     * Gets the value of the staffTrainingEnrolledDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStaffTrainingEnrolledDate() {
        return staffTrainingEnrolledDate;
    }

    /**
     * Sets the value of the staffTrainingEnrolledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffTrainingEnrolledDate(Date value) {
        this.staffTrainingEnrolledDate = value;
    }

    /**
     * Gets the value of the staffTrainingResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffTrainingResultCode() {
        return staffTrainingResultCode;
    }

    /**
     * Sets the value of the staffTrainingResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffTrainingResultCode(String value) {
        this.staffTrainingResultCode = value;
    }

    /**
     * Gets the value of the staffTrainingLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffTrainingLocationName() {
        return staffTrainingLocationName;
    }

    /**
     * Sets the value of the staffTrainingLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffTrainingLocationName(String value) {
        this.staffTrainingLocationName = value;
    }

    /**
     * Gets the value of the staffTrainingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffTrainingCode() {
        return staffTrainingCode;
    }

    /**
     * Sets the value of the staffTrainingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffTrainingCode(String value) {
        this.staffTrainingCode = value;
    }

    /**
     * Gets the value of the staffTrainingQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link StaffTrainingQualifier }
     *     
     */
    public StaffTrainingQualifier getStaffTrainingQualifier() {
        return staffTrainingQualifier;
    }

    /**
     * Sets the value of the staffTrainingQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffTrainingQualifier }
     *     
     */
    public void setStaffTrainingQualifier(StaffTrainingQualifier value) {
        this.staffTrainingQualifier = value;
    }

}