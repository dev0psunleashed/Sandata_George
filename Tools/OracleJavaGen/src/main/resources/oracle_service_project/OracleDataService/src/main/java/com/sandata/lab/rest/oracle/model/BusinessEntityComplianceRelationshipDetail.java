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
 * <p>Java class for Business_Entity_Compliance_Relationship_Detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Business_Entity_Compliance_Relationship_Detail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Business_Entity_Compliance_Relationship_Detail_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Code" type="{}Change_Reason_Code" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" type="{}ID" />
 *       &lt;attribute name="Business_Entity_Compliance_Relationship_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Compliance_Result_Reading_Value" use="required" type="{}Reading_Value" />
 *       &lt;attribute name="Compliant_Indicator" use="required" type="{}Indicator" />
 *       &lt;attribute name="Compliance_Stop_Recurring_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Compliance_Mandatory_Completion_Threshold" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Compliance_Mandatory_Completion_Threshold_Unit_Of_Measure" type="{}Compliance_Mandatory_Completion_Threshold_Unit_of_Measure" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Business_Entity_Compliance_Relationship_Detail")
@OracleMetadata(
        packageName = "PKG_BSN",
        insertMethod = "insertBeCompRelDet",
        updateMethod = "updateBeCompRelDet",
        deleteMethod = "deleteBeCompRelDet",
        getMethod = "getBeCompRelDet",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.BeCompRelDetT",
        primaryKeys = {})
public class BusinessEntityComplianceRelationshipDetail extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Business_Entity_Compliance_Relationship_Detail_SK", required = true)
    @SerializedName("BusinessEntityComplianceRelationshipDetailSK")
	@Mapping(getter = "getBeCompRelDetSk", setter = "setBeCompRelDetSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger businessEntityComplianceRelationshipDetailSK;
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
    @XmlAttribute(name = "Record_Created_By")
    @SerializedName("RecordCreatedBy")
	@Mapping(getter = "getRecCreatedBy", setter = "setRecCreatedBy", type = "String", index = 3)
    protected String recordCreatedBy;
    @XmlAttribute(name = "Record_Updated_By")
    @SerializedName("RecordUpdatedBy")
	@Mapping(getter = "getRecUpdatedBy", setter = "setRecUpdatedBy", type = "String", index = 4)
    protected String recordUpdatedBy;
    @XmlAttribute(name = "Change_Reason_Code")
    @SerializedName("ChangeReasonCode")
	@Mapping(getter = "getChangeReasonCode", setter = "setChangeReasonCode", type = "String", index = 5)
    protected String changeReasonCode;
    @XmlAttribute(name = "Change_Reason_Memo")
    @SerializedName("ChangeReasonMemo")
	@Mapping(getter = "getChangeReasonMemo", setter = "setChangeReasonMemo", type = "String", index = 6)
    protected String changeReasonMemo;
    @XmlAttribute(name = "Change_Version_ID", required = true)
    @SerializedName("ChangeVersionID")
	@Mapping(getter = "getChangeVersionId", setter = "setChangeVersionId", type = "java.math.BigDecimal", index = 7)
    protected BigInteger changeVersionID;
    @XmlAttribute(name = "Business_Entity_ID")
    @SerializedName("BusinessEntityID")
	@Mapping(getter = "getBeId", setter = "setBeId", type = "String", index = 8)
    protected String businessEntityID;
    @XmlAttribute(name = "Business_Entity_Compliance_Relationship_SK", required = true)
    @SerializedName("BusinessEntityComplianceRelationshipSK")
	@Mapping(getter = "getBeCompRelSk", setter = "setBeCompRelSk", type = "java.math.BigDecimal", index = 9)
    protected BigInteger businessEntityComplianceRelationshipSK;
    @XmlAttribute(name = "Compliance_Result_Reading_Value", required = true)
    @SerializedName("ComplianceResultReadingValue")
	@Mapping(getter = "getCompResultRdngVal", setter = "setCompResultRdngVal", type = "String", index = 10)
    protected String complianceResultReadingValue;
    @XmlAttribute(name = "Compliant_Indicator", required = true)
    @SerializedName("CompliantIndicator")
	@Mapping(getter = "getCompliantInd", setter = "setCompliantInd", type = "java.math.BigDecimal", index = 11)
    protected boolean compliantIndicator;
    @XmlAttribute(name = "Compliance_Stop_Recurring_Indicator")
    @SerializedName("ComplianceStopRecurringIndicator")
	@Mapping(getter = "getCompMandComplThreshold", setter = "setCompMandComplThreshold", type = "java.math.BigDecimal", index = 12)
    protected Boolean complianceStopRecurringIndicator;
    @XmlAttribute(name = "Compliance_Mandatory_Completion_Threshold")
    @SerializedName("ComplianceMandatoryCompletionThreshold")
	@Mapping(getter = "getCompStopRecurInd", setter = "setCompStopRecurInd", type = "java.math.BigDecimal", index = 13)
    protected BigInteger complianceMandatoryCompletionThreshold;
    @XmlAttribute(name = "Compliance_Mandatory_Completion_Threshold_Unit_Of_Measure")
    @SerializedName("ComplianceMandatoryCompletionThresholdUnitOfMeasure")
	@Mapping(getter = "getCompMandComplThresholdUom", setter = "setCompMandComplThresholdUom", type = "String", index = 14)
    protected ComplianceMandatoryCompletionThresholdUnitOfMeasure complianceMandatoryCompletionThresholdUnitOfMeasure;

    /**
     * Gets the value of the businessEntityComplianceRelationshipDetailSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessEntityComplianceRelationshipDetailSK() {
        return businessEntityComplianceRelationshipDetailSK;
    }

    /**
     * Sets the value of the businessEntityComplianceRelationshipDetailSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessEntityComplianceRelationshipDetailSK(BigInteger value) {
        this.businessEntityComplianceRelationshipDetailSK = value;
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
     * Gets the value of the businessEntityComplianceRelationshipSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessEntityComplianceRelationshipSK() {
        return businessEntityComplianceRelationshipSK;
    }

    /**
     * Sets the value of the businessEntityComplianceRelationshipSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessEntityComplianceRelationshipSK(BigInteger value) {
        this.businessEntityComplianceRelationshipSK = value;
    }

    /**
     * Gets the value of the complianceResultReadingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceResultReadingValue() {
        return complianceResultReadingValue;
    }

    /**
     * Sets the value of the complianceResultReadingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceResultReadingValue(String value) {
        this.complianceResultReadingValue = value;
    }

    /**
     * Gets the value of the compliantIndicator property.
     * 
     */
    public boolean isCompliantIndicator() {
        return compliantIndicator;
    }

    /**
     * Sets the value of the compliantIndicator property.
     * 
     */
    public void setCompliantIndicator(boolean value) {
        this.compliantIndicator = value;
    }

    /**
     * Gets the value of the complianceStopRecurringIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplianceStopRecurringIndicator() {
        return complianceStopRecurringIndicator;
    }

    /**
     * Sets the value of the complianceStopRecurringIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplianceStopRecurringIndicator(Boolean value) {
        this.complianceStopRecurringIndicator = value;
    }

    /**
     * Gets the value of the complianceMandatoryCompletionThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComplianceMandatoryCompletionThreshold() {
        return complianceMandatoryCompletionThreshold;
    }

    /**
     * Sets the value of the complianceMandatoryCompletionThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComplianceMandatoryCompletionThreshold(BigInteger value) {
        this.complianceMandatoryCompletionThreshold = value;
    }

    /**
     * Gets the value of the complianceMandatoryCompletionThresholdUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceMandatoryCompletionThresholdUnitOfMeasure }
     *     
     */
    public ComplianceMandatoryCompletionThresholdUnitOfMeasure getComplianceMandatoryCompletionThresholdUnitOfMeasure() {
        return complianceMandatoryCompletionThresholdUnitOfMeasure;
    }

    /**
     * Sets the value of the complianceMandatoryCompletionThresholdUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceMandatoryCompletionThresholdUnitOfMeasure }
     *     
     */
    public void setComplianceMandatoryCompletionThresholdUnitOfMeasure(ComplianceMandatoryCompletionThresholdUnitOfMeasure value) {
        this.complianceMandatoryCompletionThresholdUnitOfMeasure = value;
    }

}
