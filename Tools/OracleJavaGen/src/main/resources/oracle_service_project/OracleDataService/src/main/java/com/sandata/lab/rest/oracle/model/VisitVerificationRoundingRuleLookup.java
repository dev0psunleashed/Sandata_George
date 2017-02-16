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
 * A lookup table which stores the default rounding rules for billing and payroll
 * 
 * <p>Java class for Visit_Verification_Rounding_Rule_Lookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visit_Verification_Rounding_Rule_Lookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Contract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Visit_Verification_Rounding_Rule_Lookup_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Visit_Verification_Rounding_Rule_ID" use="required" type="{}Visit_Verification_Rounding_Rule_ID" />
 *       &lt;attribute name="Visit_Verification_Rounding_Rule_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Visit_Verification_Rounding_Rule_Description" type="{}Description_Long" />
 *       &lt;attribute name="Visit_Verification_Rounding_Rule_Qualifier" type="{}Visit_Verification_Rounding_Rule_Qualifier" />
 *       &lt;attribute name="Visit_Verification_Rounding_Rule_Effective_Date" type="{}Attribute_Effective_Date" />
 *       &lt;attribute name="Visit_Verification_Rounding_Rule_Termination_Date" type="{}Attribute_Termination_Date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visit_Verification_Rounding_Rule_Lookup", propOrder = {
    "contract",
    "businessEntity"
})
@OracleMetadata(
        packageName = "PKG_LOOKUP",
        insertMethod = "insertVvRndingRuleLkup",
        updateMethod = "updateVvRndingRuleLkup",
        deleteMethod = "deleteVvRndingRuleLkup",
        getMethod = "getVvRndingRuleLkup",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.VvRndingRuleLkupT",
        primaryKeys = {})
public class VisitVerificationRoundingRuleLookup extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Contract")
    @SerializedName("Contract")
    protected List<Contract> contract;
    @XmlElement(name = "Business_Entity")
    @SerializedName("BusinessEntity")
    protected List<BusinessEntity> businessEntity;
    @XmlAttribute(name = "Visit_Verification_Rounding_Rule_Lookup_SK", required = true)
    @SerializedName("VisitVerificationRoundingRuleLookupSK")
	@Mapping(getter = "getVvRndingRuleLkupSk", setter = "setVvRndingRuleLkupSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger visitVerificationRoundingRuleLookupSK;
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
    @XmlAttribute(name = "Visit_Verification_Rounding_Rule_ID", required = true)
    @SerializedName("VisitVerificationRoundingRuleID")
	@Mapping(getter = "getVvRndingRuleId", setter = "setVvRndingRuleId", type = "String", index = 10)
    protected VisitVerificationRoundingRuleID visitVerificationRoundingRuleID;
    @XmlAttribute(name = "Visit_Verification_Rounding_Rule_Name")
    @SerializedName("VisitVerificationRoundingRuleName")
	@Mapping(getter = "getVvRndingRuleName", setter = "setVvRndingRuleName", type = "String", index = 11)
    protected String visitVerificationRoundingRuleName;
    @XmlAttribute(name = "Visit_Verification_Rounding_Rule_Description")
    @SerializedName("VisitVerificationRoundingRuleDescription")
	@Mapping(getter = "getVvRndingRuleDesc", setter = "setVvRndingRuleDesc", type = "String", index = 12)
    protected String visitVerificationRoundingRuleDescription;
    @XmlAttribute(name = "Visit_Verification_Rounding_Rule_Qualifier")
    @SerializedName("VisitVerificationRoundingRuleQualifier")
	@Mapping(getter = "getVvRndingRuleQlfr", setter = "setVvRndingRuleQlfr", type = "String", index = 13)
    protected VisitVerificationRoundingRuleQualifier visitVerificationRoundingRuleQualifier;
    @XmlAttribute(name = "Visit_Verification_Rounding_Rule_Effective_Date")
    @SerializedName("VisitVerificationRoundingRuleEffectiveDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getVvRndingRuleEffDate", setter = "setVvRndingRuleEffDate", type = "java.sql.Timestamp", index = 14)
    protected Date visitVerificationRoundingRuleEffectiveDate;
    @XmlAttribute(name = "Visit_Verification_Rounding_Rule_Termination_Date")
    @SerializedName("VisitVerificationRoundingRuleTerminationDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getVvRndingRuleTermDate", setter = "setVvRndingRuleTermDate", type = "java.sql.Timestamp", index = 15)
    protected Date visitVerificationRoundingRuleTerminationDate;

    /**
     * Gets the value of the contract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contract }
     * 
     * 
     */
    public List<Contract> getContract() {
        if (contract == null) {
            contract = new ArrayList<Contract>();
        }
        return this.contract;
    }

    /**
     * Gets the value of the businessEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessEntity }
     * 
     * 
     */
    public List<BusinessEntity> getBusinessEntity() {
        if (businessEntity == null) {
            businessEntity = new ArrayList<BusinessEntity>();
        }
        return this.businessEntity;
    }

    /**
     * Gets the value of the visitVerificationRoundingRuleLookupSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitVerificationRoundingRuleLookupSK() {
        return visitVerificationRoundingRuleLookupSK;
    }

    /**
     * Sets the value of the visitVerificationRoundingRuleLookupSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisitVerificationRoundingRuleLookupSK(BigInteger value) {
        this.visitVerificationRoundingRuleLookupSK = value;
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
     * Gets the value of the visitVerificationRoundingRuleID property.
     * 
     * @return
     *     possible object is
     *     {@link VisitVerificationRoundingRuleID }
     *     
     */
    public VisitVerificationRoundingRuleID getVisitVerificationRoundingRuleID() {
        return visitVerificationRoundingRuleID;
    }

    /**
     * Sets the value of the visitVerificationRoundingRuleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisitVerificationRoundingRuleID }
     *     
     */
    public void setVisitVerificationRoundingRuleID(VisitVerificationRoundingRuleID value) {
        this.visitVerificationRoundingRuleID = value;
    }

    /**
     * Gets the value of the visitVerificationRoundingRuleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitVerificationRoundingRuleName() {
        return visitVerificationRoundingRuleName;
    }

    /**
     * Sets the value of the visitVerificationRoundingRuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitVerificationRoundingRuleName(String value) {
        this.visitVerificationRoundingRuleName = value;
    }

    /**
     * Gets the value of the visitVerificationRoundingRuleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitVerificationRoundingRuleDescription() {
        return visitVerificationRoundingRuleDescription;
    }

    /**
     * Sets the value of the visitVerificationRoundingRuleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitVerificationRoundingRuleDescription(String value) {
        this.visitVerificationRoundingRuleDescription = value;
    }

    /**
     * Gets the value of the visitVerificationRoundingRuleQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link VisitVerificationRoundingRuleQualifier }
     *     
     */
    public VisitVerificationRoundingRuleQualifier getVisitVerificationRoundingRuleQualifier() {
        return visitVerificationRoundingRuleQualifier;
    }

    /**
     * Sets the value of the visitVerificationRoundingRuleQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisitVerificationRoundingRuleQualifier }
     *     
     */
    public void setVisitVerificationRoundingRuleQualifier(VisitVerificationRoundingRuleQualifier value) {
        this.visitVerificationRoundingRuleQualifier = value;
    }

    /**
     * Gets the value of the visitVerificationRoundingRuleEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getVisitVerificationRoundingRuleEffectiveDate() {
        return visitVerificationRoundingRuleEffectiveDate;
    }

    /**
     * Sets the value of the visitVerificationRoundingRuleEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitVerificationRoundingRuleEffectiveDate(Date value) {
        this.visitVerificationRoundingRuleEffectiveDate = value;
    }

    /**
     * Gets the value of the visitVerificationRoundingRuleTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getVisitVerificationRoundingRuleTerminationDate() {
        return visitVerificationRoundingRuleTerminationDate;
    }

    /**
     * Sets the value of the visitVerificationRoundingRuleTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitVerificationRoundingRuleTerminationDate(Date value) {
        this.visitVerificationRoundingRuleTerminationDate = value;
    }

}
