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
 * Personnel working at an agency, who is not a field worker, rather a coordinator/supervisor, unit coordinator or manager.
 * 
 * <p>Java class for Administrative_Staff_Role_Cross_Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Administrative_Staff_Role_Cross_Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Administrative_Staff_Patient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Administrative_Staff_Staff_Cross_Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Administrative_Staff_Role_Cross_Reference_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Administrative_Staff_Role_Name" use="required" type="{}Name" />
 *       &lt;attribute name="Administrative_Staff_Role_Effective_Date" use="required" type="{}Attribute_Effective_Date" />
 *       &lt;attribute name="Administrative_Staff_Role_Termination_Date" use="required" type="{}Attribute_Termination_Date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Administrative_Staff_Role_Cross_Reference", propOrder = {
    "administrativeStaffPatient",
    "administrativeStaffStaffCrossReference"
})
@OracleMetadata(
        packageName = "PKG_ADMIN",
        insertMethod = "insertAdminStaffRoleXref",
        updateMethod = "updateAdminStaffRoleXref",
        deleteMethod = "deleteAdminStaffRoleXref",
        getMethod = "getAdminStaffRoleXref",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AdminStaffRoleXrefT",
        primaryKeys = {})
public class AdministrativeStaffRoleCrossReference extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Administrative_Staff_Patient")
    @SerializedName("AdministrativeStaffPatient")
    protected List<AdministrativeStaffPatient> administrativeStaffPatient;
    @XmlElement(name = "Administrative_Staff_Staff_Cross_Reference")
    @SerializedName("AdministrativeStaffStaffCrossReference")
    protected List<AdministrativeStaffStaffCrossReference> administrativeStaffStaffCrossReference;
    @XmlAttribute(name = "Administrative_Staff_Role_Cross_Reference_SK", required = true)
    @SerializedName("AdministrativeStaffRoleCrossReferenceSK")
	@Mapping(getter = "getAdminStaffRoleXrefSk", setter = "setAdminStaffRoleXrefSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger administrativeStaffRoleCrossReferenceSK;
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
    @XmlAttribute(name = "Administrative_Staff_Role_Name", required = true)
    @SerializedName("AdministrativeStaffRoleName")
	@Mapping(getter = "getAdminStaffRoleName", setter = "setAdminStaffRoleName", type = "String", index = 12)
    protected String administrativeStaffRoleName;
    @XmlAttribute(name = "Administrative_Staff_Role_Effective_Date", required = true)
    @SerializedName("AdministrativeStaffRoleEffectiveDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getAdminStaffRoleEffDate", setter = "setAdminStaffRoleEffDate", type = "java.sql.Timestamp", index = 13)
    protected Date administrativeStaffRoleEffectiveDate;
    @XmlAttribute(name = "Administrative_Staff_Role_Termination_Date", required = true)
    @SerializedName("AdministrativeStaffRoleTerminationDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getAdminStaffRoleTermDate", setter = "setAdminStaffRoleTermDate", type = "java.sql.Timestamp", index = 14)
    protected Date administrativeStaffRoleTerminationDate;

    /**
     * Gets the value of the administrativeStaffPatient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrativeStaffPatient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrativeStaffPatient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrativeStaffPatient }
     * 
     * 
     */
    public List<AdministrativeStaffPatient> getAdministrativeStaffPatient() {
        if (administrativeStaffPatient == null) {
            administrativeStaffPatient = new ArrayList<AdministrativeStaffPatient>();
        }
        return this.administrativeStaffPatient;
    }

    /**
     * Gets the value of the administrativeStaffStaffCrossReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrativeStaffStaffCrossReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrativeStaffStaffCrossReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrativeStaffStaffCrossReference }
     * 
     * 
     */
    public List<AdministrativeStaffStaffCrossReference> getAdministrativeStaffStaffCrossReference() {
        if (administrativeStaffStaffCrossReference == null) {
            administrativeStaffStaffCrossReference = new ArrayList<AdministrativeStaffStaffCrossReference>();
        }
        return this.administrativeStaffStaffCrossReference;
    }

    /**
     * Gets the value of the administrativeStaffRoleCrossReferenceSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdministrativeStaffRoleCrossReferenceSK() {
        return administrativeStaffRoleCrossReferenceSK;
    }

    /**
     * Sets the value of the administrativeStaffRoleCrossReferenceSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdministrativeStaffRoleCrossReferenceSK(BigInteger value) {
        this.administrativeStaffRoleCrossReferenceSK = value;
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
     * Gets the value of the administrativeStaffRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeStaffRoleName() {
        return administrativeStaffRoleName;
    }

    /**
     * Sets the value of the administrativeStaffRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffRoleName(String value) {
        this.administrativeStaffRoleName = value;
    }

    /**
     * Gets the value of the administrativeStaffRoleEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAdministrativeStaffRoleEffectiveDate() {
        return administrativeStaffRoleEffectiveDate;
    }

    /**
     * Sets the value of the administrativeStaffRoleEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffRoleEffectiveDate(Date value) {
        this.administrativeStaffRoleEffectiveDate = value;
    }

    /**
     * Gets the value of the administrativeStaffRoleTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAdministrativeStaffRoleTerminationDate() {
        return administrativeStaffRoleTerminationDate;
    }

    /**
     * Sets the value of the administrativeStaffRoleTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeStaffRoleTerminationDate(Date value) {
        this.administrativeStaffRoleTerminationDate = value;
    }

}