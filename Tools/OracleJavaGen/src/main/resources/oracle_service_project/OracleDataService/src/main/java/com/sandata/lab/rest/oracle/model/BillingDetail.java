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
 * An invoice detail line defines the billable service that is identified for a service or task, has a specific data of service, and may or may not have a payer that provides some level (if not all) of reimbursement for the service.
 *  Each individual Invoice Detail Line is submitted as a claim, or a set of claims, to the defined payer
 * 
 * <p>Java class for Billing_Detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Billing_Detail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Claim_Payment_Advice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Billing_Detail_Exception" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Billing_Detail_History" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Billing_Detail_Invoice_Detail_Crosswalk" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Billing_Detail_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Code" type="{}Change_Reason_Code" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Patient_ID" type="{}ID" />
 *       &lt;attribute name="Contract_ID" type="{}ID" />
 *       &lt;attribute name="Payer_ID" type="{}ID" />
 *       &lt;attribute name="Timesheet_Detail_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Timesheet_Summary_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Vendor_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Billing_Detail_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Billing_Detail_Status_Code" type="{}Invoice_Detail_Status_Code" />
 *       &lt;attribute name="Billing_Detail_Submission_Status_Name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Service_Name" type="{}Service_Name" />
 *       &lt;attribute name="Billing_Code" type="{}Billing_Code" />
 *       &lt;attribute name="Modifier_1_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_2_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_3_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_4_Code" type="{}Code" />
 *       &lt;attribute name="Revenue_Code" type="{}Revenue_Code" />
 *       &lt;attribute name="Rendering_Healthcare_Professional_National_Provider_Identifier" type="{}National_Provider_Identifier" />
 *       &lt;attribute name="Rate_Type_Name" type="{}Rate_Type_Name" />
 *       &lt;attribute name="Rate_Qualifier_Code" type="{}Rate_Qualifier_Code" />
 *       &lt;attribute name="Service_Unit_Name" type="{}Service_Unit_Name" />
 *       &lt;attribute name="Billing_Detail_Rate_Amount" type="{}Money" />
 *       &lt;attribute name="Billing_Detail_Total_Amount" type="{}Money" />
 *       &lt;attribute name="Billing_Detail_Total_Unit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Split_Billing_Allowed_Indicator" type="{}Indicator" />
 *       &lt;attribute name="User_Name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="64"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="User_Globally_Unique_Identifier" type="{}Computing_Globally_Unique_Identifier" />
 *       &lt;attribute name="Memo" type="{}Comment_Long" />
 *       &lt;attribute name="Visit_SK" type="{}Surrogate_Key" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Billing_Detail", propOrder = {
    "payment",
    "claimPaymentAdvice",
    "billingDetailException",
    "billingDetailHistory",
    "billingDetailInvoiceDetailCrosswalk"
})
public class BillingDetail extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Payment")
    @SerializedName("Payment")
    protected List<Payment> payment;
    @XmlElement(name = "Claim_Payment_Advice")
    @SerializedName("ClaimPaymentAdvice")
    protected List<ClaimPaymentAdvice> claimPaymentAdvice;
    @XmlElement(name = "Billing_Detail_Exception")
    @SerializedName("BillingDetailException")
    protected List<BillingDetailException> billingDetailException;
    @XmlElement(name = "Billing_Detail_History")
    @SerializedName("BillingDetailHistory")
    protected List<BillingDetailHistory> billingDetailHistory;
    @XmlElement(name = "Billing_Detail_Invoice_Detail_Crosswalk")
    @SerializedName("BillingDetailInvoiceDetailCrosswalk")
    protected List<BillingDetailInvoiceDetailCrosswalk> billingDetailInvoiceDetailCrosswalk;
    @XmlAttribute(name = "Billing_Detail_SK", required = true)
    @SerializedName("BillingDetailSK")
    protected BigInteger billingDetailSK;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Record_Created_By")
    @SerializedName("RecordCreatedBy")
    protected String recordCreatedBy;
    @XmlAttribute(name = "Record_Updated_By")
    @SerializedName("RecordUpdatedBy")
    protected String recordUpdatedBy;
    @XmlAttribute(name = "Change_Reason_Code")
    @SerializedName("ChangeReasonCode")
    protected String changeReasonCode;
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
    @XmlAttribute(name = "Patient_ID")
    @SerializedName("PatientID")
    protected String patientID;
    @XmlAttribute(name = "Contract_ID")
    @SerializedName("ContractID")
    protected String contractID;
    @XmlAttribute(name = "Payer_ID")
    @SerializedName("PayerID")
    protected String payerID;
    @XmlAttribute(name = "Timesheet_Detail_SK")
    @SerializedName("TimesheetDetailSK")
    protected BigInteger timesheetDetailSK;
    @XmlAttribute(name = "Timesheet_Summary_SK")
    @SerializedName("TimesheetSummarySK")
    protected BigInteger timesheetSummarySK;
    @XmlAttribute(name = "Vendor_Name")
    @SerializedName("VendorName")
    protected String vendorName;
    @XmlAttribute(name = "Billing_Detail_Date")
    @SerializedName("BillingDetailDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date billingDetailDate;
    @XmlAttribute(name = "Billing_Detail_Status_Code")
    @SerializedName("BillingDetailStatusCode")
    protected String billingDetailStatusCode;
    @XmlAttribute(name = "Billing_Detail_Submission_Status_Name")
    @SerializedName("BillingDetailSubmissionStatusName")
    protected String billingDetailSubmissionStatusName;
    @XmlAttribute(name = "Service_Name")
    @SerializedName("ServiceName")
    protected ServiceName serviceName;
    @XmlAttribute(name = "Billing_Code")
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
    @XmlAttribute(name = "Rendering_Healthcare_Professional_National_Provider_Identifier")
    @SerializedName("RenderingHealthcareProfessionalNationalProviderIdentifier")
    protected String renderingHealthcareProfessionalNationalProviderIdentifier;
    @XmlAttribute(name = "Rate_Type_Name")
    @SerializedName("RateTypeName")
    protected String rateTypeName;
    @XmlAttribute(name = "Rate_Qualifier_Code")
    @SerializedName("RateQualifierCode")
    protected RateQualifierCode rateQualifierCode;
    @XmlAttribute(name = "Service_Unit_Name")
    @SerializedName("ServiceUnitName")
    protected ServiceUnitName serviceUnitName;
    @XmlAttribute(name = "Billing_Detail_Rate_Amount")
    @SerializedName("BillingDetailRateAmount")
    protected BigDecimal billingDetailRateAmount;
    @XmlAttribute(name = "Billing_Detail_Total_Amount")
    @SerializedName("BillingDetailTotalAmount")
    protected BigDecimal billingDetailTotalAmount;
    @XmlAttribute(name = "Billing_Detail_Total_Unit")
    @SerializedName("BillingDetailTotalUnit")
    protected BigDecimal billingDetailTotalUnit;
    @XmlAttribute(name = "Split_Billing_Allowed_Indicator")
    @SerializedName("SplitBillingAllowedIndicator")
    protected Boolean splitBillingAllowedIndicator;
    @XmlAttribute(name = "User_Name")
    @SerializedName("UserName")
    protected String userName;
    @XmlAttribute(name = "User_Globally_Unique_Identifier")
    @SerializedName("UserGloballyUniqueIdentifier")
    protected String userGloballyUniqueIdentifier;
    @XmlAttribute(name = "Memo")
    @SerializedName("Memo")
    protected String memo;
    @XmlAttribute(name = "Visit_SK")
    @SerializedName("VisitSK")
    protected BigInteger visitSK;

    /**
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<Payment>();
        }
        return this.payment;
    }

    /**
     * Gets the value of the claimPaymentAdvice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimPaymentAdvice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimPaymentAdvice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimPaymentAdvice }
     * 
     * 
     */
    public List<ClaimPaymentAdvice> getClaimPaymentAdvice() {
        if (claimPaymentAdvice == null) {
            claimPaymentAdvice = new ArrayList<ClaimPaymentAdvice>();
        }
        return this.claimPaymentAdvice;
    }

    /**
     * Gets the value of the billingDetailException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingDetailException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingDetailException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDetailException }
     * 
     * 
     */
    public List<BillingDetailException> getBillingDetailException() {
        if (billingDetailException == null) {
            billingDetailException = new ArrayList<BillingDetailException>();
        }
        return this.billingDetailException;
    }

    /**
     * Gets the value of the billingDetailHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingDetailHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingDetailHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDetailHistory }
     * 
     * 
     */
    public List<BillingDetailHistory> getBillingDetailHistory() {
        if (billingDetailHistory == null) {
            billingDetailHistory = new ArrayList<BillingDetailHistory>();
        }
        return this.billingDetailHistory;
    }

    /**
     * Gets the value of the billingDetailInvoiceDetailCrosswalk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingDetailInvoiceDetailCrosswalk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingDetailInvoiceDetailCrosswalk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDetailInvoiceDetailCrosswalk }
     * 
     * 
     */
    public List<BillingDetailInvoiceDetailCrosswalk> getBillingDetailInvoiceDetailCrosswalk() {
        if (billingDetailInvoiceDetailCrosswalk == null) {
            billingDetailInvoiceDetailCrosswalk = new ArrayList<BillingDetailInvoiceDetailCrosswalk>();
        }
        return this.billingDetailInvoiceDetailCrosswalk;
    }

    /**
     * Gets the value of the billingDetailSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBillingDetailSK() {
        return billingDetailSK;
    }

    /**
     * Sets the value of the billingDetailSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBillingDetailSK(BigInteger value) {
        this.billingDetailSK = value;
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
     * Gets the value of the timesheetDetailSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimesheetDetailSK() {
        return timesheetDetailSK;
    }

    /**
     * Sets the value of the timesheetDetailSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimesheetDetailSK(BigInteger value) {
        this.timesheetDetailSK = value;
    }

    /**
     * Gets the value of the timesheetSummarySK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimesheetSummarySK() {
        return timesheetSummarySK;
    }

    /**
     * Sets the value of the timesheetSummarySK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimesheetSummarySK(BigInteger value) {
        this.timesheetSummarySK = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the billingDetailDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBillingDetailDate() {
        return billingDetailDate;
    }

    /**
     * Sets the value of the billingDetailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDetailDate(Date value) {
        this.billingDetailDate = value;
    }

    /**
     * Gets the value of the billingDetailStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDetailStatusCode() {
        return billingDetailStatusCode;
    }

    /**
     * Sets the value of the billingDetailStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDetailStatusCode(String value) {
        this.billingDetailStatusCode = value;
    }

    /**
     * Gets the value of the billingDetailSubmissionStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDetailSubmissionStatusName() {
        return billingDetailSubmissionStatusName;
    }

    /**
     * Sets the value of the billingDetailSubmissionStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDetailSubmissionStatusName(String value) {
        this.billingDetailSubmissionStatusName = value;
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

    /**
     * Gets the value of the renderingHealthcareProfessionalNationalProviderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingHealthcareProfessionalNationalProviderIdentifier() {
        return renderingHealthcareProfessionalNationalProviderIdentifier;
    }

    /**
     * Sets the value of the renderingHealthcareProfessionalNationalProviderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingHealthcareProfessionalNationalProviderIdentifier(String value) {
        this.renderingHealthcareProfessionalNationalProviderIdentifier = value;
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
     * Gets the value of the billingDetailRateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillingDetailRateAmount() {
        return billingDetailRateAmount;
    }

    /**
     * Sets the value of the billingDetailRateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillingDetailRateAmount(BigDecimal value) {
        this.billingDetailRateAmount = value;
    }

    /**
     * Gets the value of the billingDetailTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillingDetailTotalAmount() {
        return billingDetailTotalAmount;
    }

    /**
     * Sets the value of the billingDetailTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillingDetailTotalAmount(BigDecimal value) {
        this.billingDetailTotalAmount = value;
    }

    /**
     * Gets the value of the billingDetailTotalUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillingDetailTotalUnit() {
        return billingDetailTotalUnit;
    }

    /**
     * Sets the value of the billingDetailTotalUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillingDetailTotalUnit(BigDecimal value) {
        this.billingDetailTotalUnit = value;
    }

    /**
     * Gets the value of the splitBillingAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitBillingAllowedIndicator() {
        return splitBillingAllowedIndicator;
    }

    /**
     * Sets the value of the splitBillingAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitBillingAllowedIndicator(Boolean value) {
        this.splitBillingAllowedIndicator = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userGloballyUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGloballyUniqueIdentifier() {
        return userGloballyUniqueIdentifier;
    }

    /**
     * Sets the value of the userGloballyUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGloballyUniqueIdentifier(String value) {
        this.userGloballyUniqueIdentifier = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the visitSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitSK() {
        return visitSK;
    }

    /**
     * Sets the value of the visitSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisitSK(BigInteger value) {
        this.visitSK = value;
    }

}
