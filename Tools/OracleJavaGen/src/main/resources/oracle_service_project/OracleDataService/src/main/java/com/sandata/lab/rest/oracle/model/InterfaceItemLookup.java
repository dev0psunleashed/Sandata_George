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
 * Stores definition of data attributes that are being handled by a given interface.
 * 
 * <p>Java class for Interface_Item_Lookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interface_Item_Lookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Medical_Examination_Item_Crosswalk" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Interface_Item_Lookup_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Interface_ID" use="required" type="{}Interface_ID" />
 *       &lt;attribute name="Interface_Item_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Interface_Item_Type_Qualifier" type="{}Interface_Item_Type_Qualifier" />
 *       &lt;attribute name="Interface_Item_Description" type="{}Description_Long" />
 *       &lt;attribute name="Interface_Item_Definition">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="100"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Interface_Item_Validation_Rule">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="100"/>
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
@XmlType(name = "Interface_Item_Lookup", propOrder = {
    "medicalExaminationItemCrosswalk"
})
@OracleMetadata(
        packageName = "PKG_LOOKUP",
        insertMethod = "insertIntfItemLkup",
        updateMethod = "updateIntfItemLkup",
        deleteMethod = "deleteIntfItemLkup",
        getMethod = "getIntfItemLkup",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.IntfItemLkupT",
        primaryKeys = {})
public class InterfaceItemLookup extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Medical_Examination_Item_Crosswalk")
    @SerializedName("MedicalExaminationItemCrosswalk")
    protected List<MedicalExaminationItemCrosswalk> medicalExaminationItemCrosswalk;
    @XmlAttribute(name = "Interface_Item_Lookup_SK", required = true)
    @SerializedName("InterfaceItemLookupSK")
	@Mapping(getter = "getIntfItemLkupSk", setter = "setIntfItemLkupSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger interfaceItemLookupSK;
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
    @XmlAttribute(name = "Interface_ID", required = true)
    @SerializedName("InterfaceID")
	@Mapping(getter = "getIntfId", setter = "setIntfId", type = "String", index = 10)
    protected String interfaceID;
    @XmlAttribute(name = "Interface_Item_Name")
    @SerializedName("InterfaceItemName")
	@Mapping(getter = "getIntfItemName", setter = "setIntfItemName", type = "String", index = 11)
    protected String interfaceItemName;
    @XmlAttribute(name = "Interface_Item_Type_Qualifier")
    @SerializedName("InterfaceItemTypeQualifier")
	@Mapping(getter = "getIntfItemTypQlfr", setter = "setIntfItemTypQlfr", type = "String", index = 12)
    protected InterfaceItemTypeQualifier interfaceItemTypeQualifier;
    @XmlAttribute(name = "Interface_Item_Description")
    @SerializedName("InterfaceItemDescription")
	@Mapping(getter = "getIntfItemDesc", setter = "setIntfItemDesc", type = "String", index = 13)
    protected String interfaceItemDescription;
    @XmlAttribute(name = "Interface_Item_Definition")
    @SerializedName("InterfaceItemDefinition")
	@Mapping(getter = "getIntfItemDef", setter = "setIntfItemDef", type = "String", index = 14)
    protected String interfaceItemDefinition;
    @XmlAttribute(name = "Interface_Item_Validation_Rule")
    @SerializedName("InterfaceItemValidationRule")
	@Mapping(getter = "getIntfItemValidRule", setter = "setIntfItemValidRule", type = "String", index = 15)
    protected String interfaceItemValidationRule;

    /**
     * Gets the value of the medicalExaminationItemCrosswalk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicalExaminationItemCrosswalk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicalExaminationItemCrosswalk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalExaminationItemCrosswalk }
     * 
     * 
     */
    public List<MedicalExaminationItemCrosswalk> getMedicalExaminationItemCrosswalk() {
        if (medicalExaminationItemCrosswalk == null) {
            medicalExaminationItemCrosswalk = new ArrayList<MedicalExaminationItemCrosswalk>();
        }
        return this.medicalExaminationItemCrosswalk;
    }

    /**
     * Gets the value of the interfaceItemLookupSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInterfaceItemLookupSK() {
        return interfaceItemLookupSK;
    }

    /**
     * Sets the value of the interfaceItemLookupSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInterfaceItemLookupSK(BigInteger value) {
        this.interfaceItemLookupSK = value;
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
     * Gets the value of the interfaceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceID() {
        return interfaceID;
    }

    /**
     * Sets the value of the interfaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceID(String value) {
        this.interfaceID = value;
    }

    /**
     * Gets the value of the interfaceItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceItemName() {
        return interfaceItemName;
    }

    /**
     * Sets the value of the interfaceItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceItemName(String value) {
        this.interfaceItemName = value;
    }

    /**
     * Gets the value of the interfaceItemTypeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceItemTypeQualifier }
     *     
     */
    public InterfaceItemTypeQualifier getInterfaceItemTypeQualifier() {
        return interfaceItemTypeQualifier;
    }

    /**
     * Sets the value of the interfaceItemTypeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceItemTypeQualifier }
     *     
     */
    public void setInterfaceItemTypeQualifier(InterfaceItemTypeQualifier value) {
        this.interfaceItemTypeQualifier = value;
    }

    /**
     * Gets the value of the interfaceItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceItemDescription() {
        return interfaceItemDescription;
    }

    /**
     * Sets the value of the interfaceItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceItemDescription(String value) {
        this.interfaceItemDescription = value;
    }

    /**
     * Gets the value of the interfaceItemDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceItemDefinition() {
        return interfaceItemDefinition;
    }

    /**
     * Sets the value of the interfaceItemDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceItemDefinition(String value) {
        this.interfaceItemDefinition = value;
    }

    /**
     * Gets the value of the interfaceItemValidationRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceItemValidationRule() {
        return interfaceItemValidationRule;
    }

    /**
     * Sets the value of the interfaceItemValidationRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceItemValidationRule(String value) {
        this.interfaceItemValidationRule = value;
    }

}
