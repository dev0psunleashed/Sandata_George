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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Personnel working at an agency, who is not a field worker, rather a coordinator/supervisor, unit coordinator or manager.
 * 
 * <p>Java class for Administrative_Staff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Administrative_Staff">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Administrative_Staff_Relationship" type="{}Administrative_Staff_Relationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Administrative_Staff_Role_Cross_Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Administrative_Staff_Staff_Crosswalk" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Administrative_Staff_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Administrative_Staff_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Administrative_Staff_First_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Administrative_Staff_Middle_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Administrative_Staff_Last_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Administrative_Staff_Date_Of_Birth" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Administrative_Staff_Home_Phone" type="{}Phone" />
 *       &lt;attribute name="Administrative_Staff_Mobile_Phone" type="{}Phone" />
 *       &lt;attribute name="Administrative_Staff_Address_Line_1" type="{}Address_Line" />
 *       &lt;attribute name="Administrative_Staff_Address_Line_2" type="{}Address_Line" />
 *       &lt;attribute name="Administrative_Staff_City" type="{}City" />
 *       &lt;attribute name="Administrative_Staff_State" type="{}State_Name" />
 *       &lt;attribute name="Administrative_Staff_Postal_Code" type="{}Postal_Code" />
 *       &lt;attribute name="Administrative_Staff_Zip4" type="{}Zip4" />
 *       &lt;attribute name="Administrative_Staff_Email_Address" type="{}Email" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Administrative_Staff", propOrder = {
    "administrativeStaffRelationship",
    "administrativeStaffRoleCrossReference",
    "administrativeStaffStaffCrosswalk"
})
@OracleMetadata(
        packageName = "PKG_ADMIN",
        insertMethod = "insertAdminStaff",
        updateMethod = "updateAdminStaff",
        deleteMethod = "deleteAdminStaff",
        getMethod = "getAdminStaff",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AdminStaffT",
        primaryKeys = {})
public class AdministrativeStaff extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Administrative_Staff_Relationship")
    @SerializedName("AdministrativeStaffRelationship")
    protected List<AdministrativeStaffRelationship> administrativeStaffRelationship;
    @XmlElement(name = "Administrative_Staff_Role_Cross_Reference")
    @SerializedName("AdministrativeStaffRoleCrossReference")
    protected List<AdministrativeStaffRoleCrossReference> administrativeStaffRoleCrossReference;
    @XmlElement(name = "Administrative_Staff_Staff_Crosswalk")
    @SerializedName("AdministrativeStaffStaffCrosswalk")
    protected List<AdministrativeStaffStaffCrosswalk> administrativeStaffStaffCrosswalk;
    @XmlAttribute(name = "Administrative_Staff_SK", required = true)
    @SerializedName("AdministrativeStaffSK")
	@Mapping(getter = "getAdminStaffSk", setter = "setAdminStaffSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger administrativeStaffSK;
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
    @XmlAttribute(name = "Administrative_Staff_ID", required = true)
    @SerializedName("AdministrativeStaffID")
	@Mapping(getter = "getAdminStaffId", setter = "setAdminStaffId", type = "String", index = 11)
    protected String administrativeStaffID;
    @XmlAttribute(name = "Administrative_Staff_First_Name")
    @SerializedName("AdministrativeStaffFirstName")
	@Mapping(getter = "getAdminStaffFirstName", setter = "setAdminStaffFirstName", type = "String", index = 12)
    protected String administrativeStaffFirstName;
    @XmlAttribute(name = "Administrative_Staff_Middle_Name")
    @SerializedName("AdministrativeStaffMiddleName")
	@Mapping(getter = "getAdminStaffMiddleName", setter = "setAdminStaffMiddleName", type = "String", index = 13)
    protected String administrativeStaffMiddleName;
    @XmlAttribute(name = "Administrative_Staff_Last_Name")
    @SerializedName("AdministrativeStaffLastName")
	@Mapping(getter = "getAdminStaffLastName", setter = "setAdminStaffLastName", type = "String", index = 14)
    protected String administrativeStaffLastName;
    @XmlAttribute(name = "Administrative_Staff_Date_Of_Birth")
    @SerializedName("AdministrativeStaffDateOfBirth")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
	@Mapping(getter = "getAdminStaffDob", setter = "setAdminStaffDob", type = "java.sql.Timestamp", index = 15)
    protected Date administrativeStaffDateOfBirth;
    @XmlAttribute(name = "Administrative_Staff_Home_Phone")
    @SerializedName("AdministrativeStaffHomePhone")
	@Mapping(getter = "getAdminStaffHomePhone", setter = "setAdminStaffHomePhone", type = "String", index = 16)
    protected String administrativeStaffHomePhone;
    @XmlAttribute(name = "Administrative_Staff_Mobile_Phone")
    @SerializedName("AdministrativeStaffMobilePhone")
	@Mapping(getter = "getAdminStaffMobilePhone", setter = "setAdminStaffMobilePhone", type = "String", index = 17)
    protected String administrativeStaffMobilePhone;
    @XmlAttribute(name = "Administrative_Staff_Address_Line_1")
    @SerializedName("AdministrativeStaffAddressLine1")
	@Mapping(getter = "getAdminStaffAddr1", setter = "setAdminStaffAddr1", type = "String", index = 18)
    protected String administrativeStaffAddressLine1;
    @XmlAttribute(name = "Administrative_Staff_Address_Line_2")
    @SerializedName("AdministrativeStaffAddressLine2")
	@Mapping(getter = "getAdminStaffAddr2", setter = "setAdminStaffAddr2", type = "String", index = 19)
    protected String administrativeStaffAddressLine2;
    @XmlAttribute(name = "Administrative_Staff_City")
    @SerializedName("AdministrativeStaffCity")
	@Mapping(getter = "getAdminStaffCity", setter = "setAdminStaffCity", type = "String", index = 20)
    protected String administrativeStaffCity;
    @XmlAttribute(name = "Administrative_Staff_State")
    @SerializedName("AdministrativeStaffState")
	@Mapping(getter = "getAdminStaffState", setter = "setAdminStaffState", type = "String", index = 21)
    protected String administrativeStaffState;
    @XmlAttribute(name = "Administrative_Staff_Postal_Code")
    @SerializedName("AdministrativeStaffPostalCode")
	@Mapping(getter = "getAdminStaffPstlCode", setter = "setAdminStaffPstlCode", type = "String", index = 22)
    protected String administrativeStaffPostalCode;
    @XmlAttribute(name = "Administrative_Staff_Zip4")
    @SerializedName("AdministrativeStaffZip4")
	@Mapping(getter = "getAdminStaffZip4", setter = "setAdminStaffZip4", type = "String", index = 23)
    protected String administrativeStaffZip4;
    @XmlAttribute(name = "Administrative_Staff_Email_Address")
    @SerializedName("AdministrativeStaffEmailAddress")
	@Mapping(getter = "getAdminStaffEmailAddr", setter = "setAdminStaffEmailAddr", type = "String", index = 24)
    protected String administrativeStaffEmailAddress;

    /**
     * Gets the value of the administrativeStaffRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrativeStaffRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrativeStaffRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrativeStaffRelationship }
     * 
     * 
     */
    public List<AdministrativeStaffRelationship> getAdministrativeStaffRelationship() {
        if (administrativeStaffRelationship == null) {
            administrativeStaffRelationship = new ArrayList<AdministrativeStaffRelationship>();
        }
        return this.administrativeStaffRelationship;
    }

    /**
     * Gets the value of the administrativeStaffRoleCrossReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrativeStaffRoleCrossReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrativeStaffRoleCrossReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrativeStaffRoleCrossReference }
     * 
     * 
     */
    public List<AdministrativeStaffRoleCrossReference> getAdministrativeStaffRoleCrossReference() {
        if (administrativeStaffRoleCrossReference == null) {
            administrativeStaffRoleCrossReference = new ArrayList<AdministrativeStaffRoleCrossReference>();
        }
        return this.administrativeStaffRoleCrossReference;
    }

    /**
     * Gets the value of the administrativeStaffStaffCrosswalk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrativeStaffStaffCrosswalk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrativeStaffStaffCrosswalk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrativeStaffStaffCrosswalk }
     * 
     * 
     */
    public List<AdministrativeStaffStaffCrosswalk> getAdministrativeStaffStaffCrosswalk() {
        if (administrativeStaffStaffCrosswalk == null) {
            administrativeStaffStaffCrosswalk = new ArrayList<AdministrativeStaffStaffCrosswalk>();
        }
        return this.administrativeStaffStaffCrosswalk;
    }

    /**
     * Gets the value of the administrativeStaffSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdministrativeStaffSK() {
        return administrativeStaffSK;
    }

    /**
     * Sets the value of the administrativeStaffSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdministrativeStaffSK(BigInteger value) {
        this.administrativeStaffSK = value;
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
     * Gets the value of the administrativeStaffID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffID() {
        return administrativeStaffID;
    }

    /**
     * Sets the value of the administrativeStaffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffID(String value) {
        this.administrativeStaffID = value;
    }

    /**
     * Gets the value of the administrativeStaffFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffFirstName() {
        return administrativeStaffFirstName;
    }

    /**
     * Sets the value of the administrativeStaffFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffFirstName(String value) {
        this.administrativeStaffFirstName = value;
    }

    /**
     * Gets the value of the administrativeStaffMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffMiddleName() {
        return administrativeStaffMiddleName;
    }

    /**
     * Sets the value of the administrativeStaffMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffMiddleName(String value) {
        this.administrativeStaffMiddleName = value;
    }

    /**
     * Gets the value of the administrativeStaffLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffLastName() {
        return administrativeStaffLastName;
    }

    /**
     * Sets the value of the administrativeStaffLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffLastName(String value) {
        this.administrativeStaffLastName = value;
    }

    /**
     * Gets the value of the administrativeStaffDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAdministrativeStaffDateOfBirth() {
        return administrativeStaffDateOfBirth;
    }

    /**
     * Sets the value of the administrativeStaffDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffDateOfBirth(Date value) {
        this.administrativeStaffDateOfBirth = value;
    }

    /**
     * Gets the value of the administrativeStaffHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffHomePhone() {
        return administrativeStaffHomePhone;
    }

    /**
     * Sets the value of the administrativeStaffHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffHomePhone(String value) {
        this.administrativeStaffHomePhone = value;
    }

    /**
     * Gets the value of the administrativeStaffMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffMobilePhone() {
        return administrativeStaffMobilePhone;
    }

    /**
     * Sets the value of the administrativeStaffMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffMobilePhone(String value) {
        this.administrativeStaffMobilePhone = value;
    }

    /**
     * Gets the value of the administrativeStaffAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffAddressLine1() {
        return administrativeStaffAddressLine1;
    }

    /**
     * Sets the value of the administrativeStaffAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffAddressLine1(String value) {
        this.administrativeStaffAddressLine1 = value;
    }

    /**
     * Gets the value of the administrativeStaffAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffAddressLine2() {
        return administrativeStaffAddressLine2;
    }

    /**
     * Sets the value of the administrativeStaffAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffAddressLine2(String value) {
        this.administrativeStaffAddressLine2 = value;
    }

    /**
     * Gets the value of the administrativeStaffCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffCity() {
        return administrativeStaffCity;
    }

    /**
     * Sets the value of the administrativeStaffCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffCity(String value) {
        this.administrativeStaffCity = value;
    }

    /**
     * Gets the value of the administrativeStaffState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffState() {
        return administrativeStaffState;
    }

    /**
     * Sets the value of the administrativeStaffState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffState(String value) {
        this.administrativeStaffState = value;
    }

    /**
     * Gets the value of the administrativeStaffPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffPostalCode() {
        return administrativeStaffPostalCode;
    }

    /**
     * Sets the value of the administrativeStaffPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffPostalCode(String value) {
        this.administrativeStaffPostalCode = value;
    }

    /**
     * Gets the value of the administrativeStaffZip4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffZip4() {
        return administrativeStaffZip4;
    }

    /**
     * Sets the value of the administrativeStaffZip4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffZip4(String value) {
        this.administrativeStaffZip4 = value;
    }

    /**
     * Gets the value of the administrativeStaffEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffEmailAddress() {
        return administrativeStaffEmailAddress;
    }

    /**
     * Sets the value of the administrativeStaffEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffEmailAddress(String value) {
        this.administrativeStaffEmailAddress = value;
    }

}
