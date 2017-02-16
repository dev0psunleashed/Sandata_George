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
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Billing_Rate_Matrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Billing_Rate_Matrix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Billing_Rate_Matrix_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Business_Entity_Location_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Payer_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Contract_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Billing_Rate_Matrix_Effective_Date" use="required" type="{}Attribute_Effective_Date" />
 *       &lt;attribute name="Billing_Rate_Matrix_Termination_Date" type="{}Attribute_Termination_Date" />
 *       &lt;attribute name="Service_Name" use="required" type="{}Service_Name" />
 *       &lt;attribute name="Rate_Type_Name" use="required" type="{}Rate_Type_Name" />
 *       &lt;attribute name="Rate_Qualifier_Code" use="required" type="{}Rate_Qualifier_Code" />
 *       &lt;attribute name="Rate_Amount" use="required" type="{}Money" />
 *       &lt;attribute name="Service_Unit_Name" use="required" type="{}Service_Unit_Name" />
 *       &lt;attribute name="Billing_Code" use="required" type="{}Billing_Code" />
 *       &lt;attribute name="Modifier_1_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_2_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_3_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_4_Code" type="{}Code" />
 *       &lt;attribute name="Revenue_Code" type="{}Revenue_Code" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Billing_Rate_Matrix")
public class BillingRateMatrix extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Billing_Rate_Matrix_SK", required = true)
    @SerializedName("BillingRateMatrixSK")
    protected BigInteger billingRateMatrixSK;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Record_Effective_Timestamp", required = true)
    @SerializedName("RecordEffectiveTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date recordEffectiveTimestamp;
    @XmlAttribute(name = "Record_Termination_Timestamp", required = true)
    @SerializedName("RecordTerminationTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date recordTerminationTimestamp;
    @XmlAttribute(name = "Record_Created_By")
    @SerializedName("RecordCreatedBy")
    protected String recordCreatedBy;
    @XmlAttribute(name = "Record_Updated_By")
    @SerializedName("RecordUpdatedBy")
    protected String recordUpdatedBy;
    @XmlAttribute(name = "Change_Reason_Memo")
    @SerializedName("ChangeReasonMemo")
    protected String changeReasonMemo;
    @XmlAttribute(name = "Current_Record_Indicator", required = true)
    @SerializedName("CurrentRecordIndicator")
    protected boolean currentRecordIndicator;
    @XmlAttribute(name = "Change_Version_ID", required = true)
    @SerializedName("ChangeVersionID")
    protected BigInteger changeVersionID;
    @XmlAttribute(name = "Business_Entity_ID", required = true)
    @SerializedName("BusinessEntityID")
    protected String businessEntityID;
    @XmlAttribute(name = "Business_Entity_Location_ID", required = true)
    @SerializedName("BusinessEntityLocationID")
    protected String businessEntityLocationID;
    @XmlAttribute(name = "Payer_ID", required = true)
    @SerializedName("PayerID")
    protected String payerID;
    @XmlAttribute(name = "Contract_ID", required = true)
    @SerializedName("ContractID")
    protected String contractID;
    @XmlAttribute(name = "Billing_Rate_Matrix_Effective_Date", required = true)
    @SerializedName("BillingRateMatrixEffectiveDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date billingRateMatrixEffectiveDate;
    @XmlAttribute(name = "Billing_Rate_Matrix_Termination_Date")
    @SerializedName("BillingRateMatrixTerminationDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date billingRateMatrixTerminationDate;
    @XmlAttribute(name = "Service_Name", required = true)
    @SerializedName("ServiceName")
    protected ServiceName serviceName;
    @XmlAttribute(name = "Rate_Type_Name", required = true)
    @SerializedName("RateTypeName")
    protected String rateTypeName;
    @XmlAttribute(name = "Rate_Qualifier_Code", required = true)
    @SerializedName("RateQualifierCode")
    protected RateQualifierCode rateQualifierCode;
    @XmlAttribute(name = "Rate_Amount", required = true)
    @SerializedName("RateAmount")
    protected BigDecimal rateAmount;
    @XmlAttribute(name = "Service_Unit_Name", required = true)
    @SerializedName("ServiceUnitName")
    protected ServiceUnitName serviceUnitName;
    @XmlAttribute(name = "Billing_Code", required = true)
    @SerializedName("BillingCode")
    protected String billingCode;
    @XmlAttribute(name = "Modifier_1_Code")
    @SerializedName("Modifier1Code")
    protected String modifier1Code;
    @XmlAttribute(name = "Modifier_2_Code")
    @SerializedName("Modifier2Code")
    protected String modifier2Code;
    @XmlAttribute(name = "Modifier_3_Code")
    @SerializedName("Modifier3Code")
    protected String modifier3Code;
    @XmlAttribute(name = "Modifier_4_Code")
    @SerializedName("Modifier4Code")
    protected String modifier4Code;
    @XmlAttribute(name = "Revenue_Code")
    @SerializedName("RevenueCode")
    protected String revenueCode;

    /**
     * Gets the value of the billingRateMatrixSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBillingRateMatrixSK() {
        return billingRateMatrixSK;
    }

    /**
     * Sets the value of the billingRateMatrixSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBillingRateMatrixSK(BigInteger value) {
        this.billingRateMatrixSK = value;
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
     * Gets the value of the businessEntityLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEntityLocationID() {
        return businessEntityLocationID;
    }

    /**
     * Sets the value of the businessEntityLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEntityLocationID(String value) {
        this.businessEntityLocationID = value;
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
     * Gets the value of the billingRateMatrixEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBillingRateMatrixEffectiveDate() {
        return billingRateMatrixEffectiveDate;
    }

    /**
     * Sets the value of the billingRateMatrixEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingRateMatrixEffectiveDate(Date value) {
        this.billingRateMatrixEffectiveDate = value;
    }

    /**
     * Gets the value of the billingRateMatrixTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBillingRateMatrixTerminationDate() {
        return billingRateMatrixTerminationDate;
    }

    /**
     * Sets the value of the billingRateMatrixTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingRateMatrixTerminationDate(Date value) {
        this.billingRateMatrixTerminationDate = value;
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
     * Gets the value of the rateTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTypeName() {
        return rateTypeName;
    }

    /**
     * Sets the value of the rateTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTypeName(String value) {
        this.rateTypeName = value;
    }

    /**
     * Gets the value of the rateQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateQualifierCode }
     *     
     */
    public RateQualifierCode getRateQualifierCode() {
        return rateQualifierCode;
    }

    /**
     * Sets the value of the rateQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateQualifierCode }
     *     
     */
    public void setRateQualifierCode(RateQualifierCode value) {
        this.rateQualifierCode = value;
    }

    /**
     * Gets the value of the rateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateAmount() {
        return rateAmount;
    }

    /**
     * Sets the value of the rateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateAmount(BigDecimal value) {
        this.rateAmount = value;
    }

    /**
     * Gets the value of the serviceUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceUnitName }
     *     
     */
    public ServiceUnitName getServiceUnitName() {
        return serviceUnitName;
    }

    /**
     * Sets the value of the serviceUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceUnitName }
     *     
     */
    public void setServiceUnitName(ServiceUnitName value) {
        this.serviceUnitName = value;
    }

    /**
     * Gets the value of the billingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCode() {
        return billingCode;
    }

    /**
     * Sets the value of the billingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCode(String value) {
        this.billingCode = value;
    }

    /**
     * Gets the value of the modifier1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifier1Code() {
        return modifier1Code;
    }

    /**
     * Sets the value of the modifier1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier1Code(String value) {
        this.modifier1Code = value;
    }

    /**
     * Gets the value of the modifier2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifier2Code() {
        return modifier2Code;
    }

    /**
     * Sets the value of the modifier2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier2Code(String value) {
        this.modifier2Code = value;
    }

    /**
     * Gets the value of the modifier3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifier3Code() {
        return modifier3Code;
    }

    /**
     * Sets the value of the modifier3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier3Code(String value) {
        this.modifier3Code = value;
    }

    /**
     * Gets the value of the modifier4Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifier4Code() {
        return modifier4Code;
    }

    /**
     * Sets the value of the modifier4Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier4Code(String value) {
        this.modifier4Code = value;
    }

    /**
     * Gets the value of the revenueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueCode() {
        return revenueCode;
    }

    /**
     * Sets the value of the revenueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueCode(String value) {
        this.revenueCode = value;
    }

}