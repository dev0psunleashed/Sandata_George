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
 * Information pertaining to staff certifications and offical appovals to do certain activities professionally or legally
 * 
 * <p>Java class for Staff_Certification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Staff_Certification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Staff_Certification_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Staff_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Staff_Certification_ID" type="{}ID" />
 *       &lt;attribute name="Staff_Certification_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Staff_Certification_Description" type="{}Description_Short" />
 *       &lt;attribute name="Staff_Certification_Institution" type="{}Organization_Name" />
 *       &lt;attribute name="Staff_Certification_Received_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Staff_Certification_Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Staff_Certification")
@OracleMetadata(
        packageName = "PKG_STAFF",
        insertMethod = "insertStaffCert",
        updateMethod = "updateStaffCert",
        deleteMethod = "deleteStaffCert",
        getMethod = "getStaffCert",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.StaffCertT",
        primaryKeys = {})
public class StaffCertification extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Staff_Certification_SK", required = true)
    @SerializedName("StaffCertificationSK")
	@Mapping(getter = "getStaffCertSk", setter = "setStaffCertSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger staffCertificationSK;
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
    @XmlAttribute(name = "Staff_ID", required = true)
    @SerializedName("StaffID")
	@Mapping(getter = "getStaffId", setter = "setStaffId", type = "String", index = 11)
    protected String staffID;
    @XmlAttribute(name = "Staff_Certification_ID")
    @SerializedName("StaffCertificationID")
	@Mapping(getter = "getStaffCertId", setter = "setStaffCertId", type = "String", index = 12)
    protected String staffCertificationID;
    @XmlAttribute(name = "Staff_Certification_Name")
    @SerializedName("StaffCertificationName")
	@Mapping(getter = "getStaffCertName", setter = "setStaffCertName", type = "String", index = 13)
    protected String staffCertificationName;
    @XmlAttribute(name = "Staff_Certification_Description")
    @SerializedName("StaffCertificationDescription")
	@Mapping(getter = "getStaffCertDesc", setter = "setStaffCertDesc", type = "String", index = 14)
    protected String staffCertificationDescription;
    @XmlAttribute(name = "Staff_Certification_Institution")
    @SerializedName("StaffCertificationInstitution")
	@Mapping(getter = "getStaffCertInstitution", setter = "setStaffCertInstitution", type = "String", index = 15)
    protected String staffCertificationInstitution;
    @XmlAttribute(name = "Staff_Certification_Received_Date")
    @SerializedName("StaffCertificationReceivedDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
	@Mapping(getter = "getStaffCertRcvdDate", setter = "setStaffCertRcvdDate", type = "java.sql.Timestamp", index = 16)
    protected Date staffCertificationReceivedDate;
    @XmlAttribute(name = "Staff_Certification_Expiration_Date")
    @SerializedName("StaffCertificationExpirationDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
	@Mapping(getter = "getStaffCertExprDate", setter = "setStaffCertExprDate", type = "java.sql.Timestamp", index = 17)
    protected Date staffCertificationExpirationDate;

    /**
     * Gets the value of the staffCertificationSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaffCertificationSK() {
        return staffCertificationSK;
    }

    /**
     * Sets the value of the staffCertificationSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaffCertificationSK(BigInteger value) {
        this.staffCertificationSK = value;
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
     * Gets the value of the staffCertificationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffCertificationID() {
        return staffCertificationID;
    }

    /**
     * Sets the value of the staffCertificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffCertificationID(String value) {
        this.staffCertificationID = value;
    }

    /**
     * Gets the value of the staffCertificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffCertificationName() {
        return staffCertificationName;
    }

    /**
     * Sets the value of the staffCertificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffCertificationName(String value) {
        this.staffCertificationName = value;
    }

    /**
     * Gets the value of the staffCertificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffCertificationDescription() {
        return staffCertificationDescription;
    }

    /**
     * Sets the value of the staffCertificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffCertificationDescription(String value) {
        this.staffCertificationDescription = value;
    }

    /**
     * Gets the value of the staffCertificationInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffCertificationInstitution() {
        return staffCertificationInstitution;
    }

    /**
     * Sets the value of the staffCertificationInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffCertificationInstitution(String value) {
        this.staffCertificationInstitution = value;
    }

    /**
     * Gets the value of the staffCertificationReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStaffCertificationReceivedDate() {
        return staffCertificationReceivedDate;
    }

    /**
     * Sets the value of the staffCertificationReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffCertificationReceivedDate(Date value) {
        this.staffCertificationReceivedDate = value;
    }

    /**
     * Gets the value of the staffCertificationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStaffCertificationExpirationDate() {
        return staffCertificationExpirationDate;
    }

    /**
     * Sets the value of the staffCertificationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffCertificationExpirationDate(Date value) {
        this.staffCertificationExpirationDate = value;
    }

}
