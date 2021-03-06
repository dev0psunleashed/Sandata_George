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
 * ERROR: String not found in file
 * 
 * <p>Java class for Staff_Contact_Phone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Staff_Contact_Phone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Staff_Contact_Phone_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" type="{}ID" />
 *       &lt;attribute name="Staff_ID" type="{}ID" />
 *       &lt;attribute name="Address_Priority_Name" type="{}Address_Priority_Name" />
 *       &lt;attribute name="Staff_Contact_Phone_Qualifier">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="100"/>
 *             &lt;enumeration value="HOME"/>
 *             &lt;enumeration value="WORK"/>
 *             &lt;enumeration value="MOBILE"/>
 *             &lt;enumeration value="FAX"/>
 *             &lt;enumeration value="OTHER"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Staff_Phone" type="{}Phone" />
 *       &lt;attribute name="Staff_Phone_Extension" type="{}Phone_Extension" />
 *       &lt;attribute name="Staff_Phone_Primary_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Staff_PhoneText_Message_Indicator" type="{}Indicator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Staff_Contact_Phone")
@OracleMetadata(
        packageName = "PKG_STAFF",
        insertMethod = "insertStaffContPhone",
        updateMethod = "updateStaffContPhone",
        deleteMethod = "deleteStaffContPhone",
        getMethod = "getStaffContPhone",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.StaffContPhoneT",
        primaryKeys = {})
public class StaffContactPhone extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Staff_Contact_Phone_SK", required = true)
    @SerializedName("StaffContactPhoneSK")
	@Mapping(getter = "getStaffContPhoneSk", setter = "setStaffContPhoneSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger staffContactPhoneSK;
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
    @XmlAttribute(name = "Current_Record_Indicator", required = true)
    @SerializedName("CurrentRecordIndicator")
	@Mapping(getter = "getCurrRecInd", setter = "setCurrRecInd", type = "java.math.BigDecimal", index = 7)
    protected boolean currentRecordIndicator;
    @XmlAttribute(name = "Change_Reason_Memo")
    @SerializedName("ChangeReasonMemo")
	@Mapping(getter = "getChangeReasonMemo", setter = "setChangeReasonMemo", type = "String", index = 8)
    protected String changeReasonMemo;
    @XmlAttribute(name = "Change_Version_ID", required = true)
    @SerializedName("ChangeVersionID")
	@Mapping(getter = "getChangeVersionId", setter = "setChangeVersionId", type = "java.math.BigDecimal", index = 9)
    protected BigInteger changeVersionID;
    @XmlAttribute(name = "Business_Entity_ID")
    @SerializedName("BusinessEntityID")
	@Mapping(getter = "getBeId", setter = "setBeId", type = "String", index = 10)
    protected String businessEntityID;
    @XmlAttribute(name = "Staff_ID")
    @SerializedName("StaffID")
	@Mapping(getter = "getStaffId", setter = "setStaffId", type = "String", index = 11)
    protected String staffID;
    @XmlAttribute(name = "Address_Priority_Name")
    @SerializedName("AddressPriorityName")
	@Mapping(getter = "getAddrPrioName", setter = "setAddrPrioName", type = "String", index = 12)
    protected AddressPriorityName addressPriorityName;
    @XmlAttribute(name = "Staff_Contact_Phone_Qualifier")
    @SerializedName("StaffContactPhoneQualifier")
	@Mapping(getter = "getStaffContPhoneQlfr", setter = "setStaffContPhoneQlfr", type = "String", index = 13)
    protected String staffContactPhoneQualifier;
    @XmlAttribute(name = "Staff_Phone")
    @SerializedName("StaffPhone")
	@Mapping(getter = "getStaffPhone", setter = "setStaffPhone", type = "String", index = 14)
    protected String staffPhone;
    @XmlAttribute(name = "Staff_Phone_Extension")
    @SerializedName("StaffPhoneExtension")
	@Mapping(getter = "getStaffPhoneExt", setter = "setStaffPhoneExt", type = "String", index = 15)
    protected String staffPhoneExtension;
    @XmlAttribute(name = "Staff_Phone_Primary_Indicator")
    @SerializedName("StaffPhonePrimaryIndicator")
	@Mapping(getter = "getStaffPhonePrmyInd", setter = "setStaffPhonePrmyInd", type = "java.math.BigDecimal", index = 16)
    protected Boolean staffPhonePrimaryIndicator;
    @XmlAttribute(name = "Staff_PhoneText_Message_Indicator")
    @SerializedName("StaffPhoneTextMessageIndicator")
	@Mapping(getter = "getStaffPhonetextMsgInd", setter = "setStaffPhonetextMsgInd", type = "java.math.BigDecimal", index = 17)
    protected Boolean staffPhoneTextMessageIndicator;

    /**
     * Gets the value of the staffContactPhoneSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaffContactPhoneSK() {
        return staffContactPhoneSK;
    }

    /**
     * Sets the value of the staffContactPhoneSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaffContactPhoneSK(BigInteger value) {
        this.staffContactPhoneSK = value;
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
     * Gets the value of the addressPriorityName property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPriorityName }
     *     
     */
    public AddressPriorityName getAddressPriorityName() {
        return addressPriorityName;
    }

    /**
     * Sets the value of the addressPriorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPriorityName }
     *     
     */
    public void setAddressPriorityName(AddressPriorityName value) {
        this.addressPriorityName = value;
    }

    /**
     * Gets the value of the staffContactPhoneQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffContactPhoneQualifier() {
        return staffContactPhoneQualifier;
    }

    /**
     * Sets the value of the staffContactPhoneQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffContactPhoneQualifier(String value) {
        this.staffContactPhoneQualifier = value;
    }

    /**
     * Gets the value of the staffPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffPhone() {
        return staffPhone;
    }

    /**
     * Sets the value of the staffPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffPhone(String value) {
        this.staffPhone = value;
    }

    /**
     * Gets the value of the staffPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffPhoneExtension() {
        return staffPhoneExtension;
    }

    /**
     * Sets the value of the staffPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffPhoneExtension(String value) {
        this.staffPhoneExtension = value;
    }

    /**
     * Gets the value of the staffPhonePrimaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaffPhonePrimaryIndicator() {
        return staffPhonePrimaryIndicator;
    }

    /**
     * Sets the value of the staffPhonePrimaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaffPhonePrimaryIndicator(Boolean value) {
        this.staffPhonePrimaryIndicator = value;
    }

    /**
     * Gets the value of the staffPhoneTextMessageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaffPhoneTextMessageIndicator() {
        return staffPhoneTextMessageIndicator;
    }

    /**
     * Sets the value of the staffPhoneTextMessageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaffPhoneTextMessageIndicator(Boolean value) {
        this.staffPhoneTextMessageIndicator = value;
    }

}
