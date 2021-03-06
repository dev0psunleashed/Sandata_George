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
 * Defines the various categories of services performed by the Business Entity
 * 
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Service_Task" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Event_Service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Service_Visit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Staff_Patient_Cross_Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Authorization_Service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Service_Activity_Billing_Code" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Payer_Service_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Contract_Service_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Patient_Diagnosis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Staff_Credential" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Invoice_Detail" type="{}Invoice_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Accounts_Receivable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Patient_Payer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Plan_Of_Care_Service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Staff" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Claim_Line" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Service_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Service_Name" type="{}Service_Name" />
 *       &lt;attribute name="Service_Description" type="{}Description_Short" />
 *       &lt;attribute name="Billing_Code" type="{}Billing_Code" />
 *       &lt;attribute name="Service_Effective_Date" type="{}Attribute_Effective_Date" />
 *       &lt;attribute name="Service_Termination_Date" type="{}Attribute_Termination_Date" />
 *       &lt;attribute name="Payer_ID" type="{}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "serviceTask",
    "scheduleEventService",
    "serviceVisit",
    "scheduleService",
    "staffPatientCrossReference",
    "authorizationService",
    "serviceActivityBillingCode",
    "payerServiceList",
    "contractServiceList",
    "patientDiagnosis",
    "staffCredential",
    "invoiceDetail",
    "accountsReceivable",
    "patientPayer",
    "planOfCareService",
    "staff",
    "claimLine"
})
@OracleMetadata(
        packageName = "PKG_SERVICE",
        insertMethod = "insertSvc",
        updateMethod = "updateSvc",
        deleteMethod = "deleteSvc",
        getMethod = "getSvc",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.SvcT",
        primaryKeys = {})
public class Service extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Service_Task")
    @SerializedName("ServiceTask")
    protected List<ServiceTask> serviceTask;
    @XmlElement(name = "Schedule_Event_Service")
    @SerializedName("ScheduleEventService")
    protected List<ScheduleEventService> scheduleEventService;
    @XmlElement(name = "Service_Visit")
    @SerializedName("ServiceVisit")
    protected List<ServiceVisit> serviceVisit;
    @XmlElement(name = "Schedule_Service")
    @SerializedName("ScheduleService")
    protected List<ScheduleService> scheduleService;
    @XmlElement(name = "Staff_Patient_Cross_Reference")
    @SerializedName("StaffPatientCrossReference")
    protected List<StaffPatientCrossReference> staffPatientCrossReference;
    @XmlElement(name = "Authorization_Service")
    @SerializedName("AuthorizationService")
    protected List<AuthorizationService> authorizationService;
    @XmlElement(name = "Service_Activity_Billing_Code")
    @SerializedName("ServiceActivityBillingCode")
    protected List<ServiceActivityBillingCode> serviceActivityBillingCode;
    @XmlElement(name = "Payer_Service_List")
    @SerializedName("PayerServiceList")
    protected List<PayerServiceList> payerServiceList;
    @XmlElement(name = "Contract_Service_List")
    @SerializedName("ContractServiceList")
    protected List<ContractServiceList> contractServiceList;
    @XmlElement(name = "Patient_Diagnosis")
    @SerializedName("PatientDiagnosis")
    protected List<PatientDiagnosis> patientDiagnosis;
    @XmlElement(name = "Staff_Credential")
    @SerializedName("StaffCredential")
    protected List<StaffCredential> staffCredential;
    @XmlElement(name = "Invoice_Detail")
    @SerializedName("InvoiceDetail")
    protected List<InvoiceDetail> invoiceDetail;
    @XmlElement(name = "Accounts_Receivable")
    @SerializedName("AccountsReceivable")
    protected List<AccountsReceivable> accountsReceivable;
    @XmlElement(name = "Patient_Payer")
    @SerializedName("PatientPayer")
    protected List<PatientPayer> patientPayer;
    @XmlElement(name = "Plan_Of_Care_Service")
    @SerializedName("PlanOfCareService")
    protected List<PlanOfCareService> planOfCareService;
    @XmlElement(name = "Staff")
    @SerializedName("Staff")
    protected List<Staff> staff;
    @XmlElement(name = "Claim_Line")
    @SerializedName("ClaimLine")
    protected List<ClaimLine> claimLine;
    @XmlAttribute(name = "Service_SK", required = true)
    @SerializedName("ServiceSK")
	@Mapping(getter = "getSvcSk", setter = "setSvcSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger serviceSK;
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
    @XmlAttribute(name = "Service_Name")
    @SerializedName("ServiceName")
	@Mapping(getter = "getSvcName", setter = "setSvcName", type = "String", index = 11)
    protected ServiceName serviceName;
    @XmlAttribute(name = "Service_Description")
    @SerializedName("ServiceDescription")
	@Mapping(getter = "getSvcDesc", setter = "setSvcDesc", type = "String", index = 12)
    protected String serviceDescription;
    @XmlAttribute(name = "Billing_Code")
    @SerializedName("BillingCode")
	@Mapping(getter = "getBillingCode", setter = "setBillingCode", type = "String", index = 13)
    protected String billingCode;
    @XmlAttribute(name = "Service_Effective_Date")
    @SerializedName("ServiceEffectiveDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getSvcEffDate", setter = "setSvcEffDate", type = "java.sql.Timestamp", index = 14)
    protected Date serviceEffectiveDate;
    @XmlAttribute(name = "Service_Termination_Date")
    @SerializedName("ServiceTerminationDate")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getSvcTermDate", setter = "setSvcTermDate", type = "java.sql.Timestamp", index = 15)
    protected Date serviceTerminationDate;
    @XmlAttribute(name = "Payer_ID")
    @SerializedName("PayerID")
	@Mapping(getter = "getPayerId", setter = "setPayerId", type = "String", index = 16)
    protected String payerID;

    /**
     * Gets the value of the serviceTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTask }
     * 
     * 
     */
    public List<ServiceTask> getServiceTask() {
        if (serviceTask == null) {
            serviceTask = new ArrayList<ServiceTask>();
        }
        return this.serviceTask;
    }

    /**
     * Gets the value of the scheduleEventService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleEventService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleEventService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleEventService }
     * 
     * 
     */
    public List<ScheduleEventService> getScheduleEventService() {
        if (scheduleEventService == null) {
            scheduleEventService = new ArrayList<ScheduleEventService>();
        }
        return this.scheduleEventService;
    }

    /**
     * Gets the value of the serviceVisit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceVisit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceVisit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceVisit }
     * 
     * 
     */
    public List<ServiceVisit> getServiceVisit() {
        if (serviceVisit == null) {
            serviceVisit = new ArrayList<ServiceVisit>();
        }
        return this.serviceVisit;
    }

    /**
     * Gets the value of the scheduleService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleService }
     * 
     * 
     */
    public List<ScheduleService> getScheduleService() {
        if (scheduleService == null) {
            scheduleService = new ArrayList<ScheduleService>();
        }
        return this.scheduleService;
    }

    /**
     * Gets the value of the staffPatientCrossReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffPatientCrossReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffPatientCrossReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffPatientCrossReference }
     * 
     * 
     */
    public List<StaffPatientCrossReference> getStaffPatientCrossReference() {
        if (staffPatientCrossReference == null) {
            staffPatientCrossReference = new ArrayList<StaffPatientCrossReference>();
        }
        return this.staffPatientCrossReference;
    }

    /**
     * Gets the value of the authorizationService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorizationService }
     * 
     * 
     */
    public List<AuthorizationService> getAuthorizationService() {
        if (authorizationService == null) {
            authorizationService = new ArrayList<AuthorizationService>();
        }
        return this.authorizationService;
    }

    /**
     * Gets the value of the serviceActivityBillingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceActivityBillingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceActivityBillingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceActivityBillingCode }
     * 
     * 
     */
    public List<ServiceActivityBillingCode> getServiceActivityBillingCode() {
        if (serviceActivityBillingCode == null) {
            serviceActivityBillingCode = new ArrayList<ServiceActivityBillingCode>();
        }
        return this.serviceActivityBillingCode;
    }

    /**
     * Gets the value of the payerServiceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payerServiceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayerServiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayerServiceList }
     * 
     * 
     */
    public List<PayerServiceList> getPayerServiceList() {
        if (payerServiceList == null) {
            payerServiceList = new ArrayList<PayerServiceList>();
        }
        return this.payerServiceList;
    }

    /**
     * Gets the value of the contractServiceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractServiceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractServiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractServiceList }
     * 
     * 
     */
    public List<ContractServiceList> getContractServiceList() {
        if (contractServiceList == null) {
            contractServiceList = new ArrayList<ContractServiceList>();
        }
        return this.contractServiceList;
    }

    /**
     * Gets the value of the patientDiagnosis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientDiagnosis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientDiagnosis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientDiagnosis }
     * 
     * 
     */
    public List<PatientDiagnosis> getPatientDiagnosis() {
        if (patientDiagnosis == null) {
            patientDiagnosis = new ArrayList<PatientDiagnosis>();
        }
        return this.patientDiagnosis;
    }

    /**
     * Gets the value of the staffCredential property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffCredential property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffCredential().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffCredential }
     * 
     * 
     */
    public List<StaffCredential> getStaffCredential() {
        if (staffCredential == null) {
            staffCredential = new ArrayList<StaffCredential>();
        }
        return this.staffCredential;
    }

    /**
     * Gets the value of the invoiceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceDetail }
     * 
     * 
     */
    public List<InvoiceDetail> getInvoiceDetail() {
        if (invoiceDetail == null) {
            invoiceDetail = new ArrayList<InvoiceDetail>();
        }
        return this.invoiceDetail;
    }

    /**
     * Gets the value of the accountsReceivable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountsReceivable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountsReceivable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountsReceivable }
     * 
     * 
     */
    public List<AccountsReceivable> getAccountsReceivable() {
        if (accountsReceivable == null) {
            accountsReceivable = new ArrayList<AccountsReceivable>();
        }
        return this.accountsReceivable;
    }

    /**
     * Gets the value of the patientPayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientPayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientPayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientPayer }
     * 
     * 
     */
    public List<PatientPayer> getPatientPayer() {
        if (patientPayer == null) {
            patientPayer = new ArrayList<PatientPayer>();
        }
        return this.patientPayer;
    }

    /**
     * Gets the value of the planOfCareService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planOfCareService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanOfCareService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanOfCareService }
     * 
     * 
     */
    public List<PlanOfCareService> getPlanOfCareService() {
        if (planOfCareService == null) {
            planOfCareService = new ArrayList<PlanOfCareService>();
        }
        return this.planOfCareService;
    }

    /**
     * Gets the value of the staff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Staff }
     * 
     * 
     */
    public List<Staff> getStaff() {
        if (staff == null) {
            staff = new ArrayList<Staff>();
        }
        return this.staff;
    }

    /**
     * Gets the value of the claimLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimLine }
     * 
     * 
     */
    public List<ClaimLine> getClaimLine() {
        if (claimLine == null) {
            claimLine = new ArrayList<ClaimLine>();
        }
        return this.claimLine;
    }

    /**
     * Gets the value of the serviceSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceSK() {
        return serviceSK;
    }

    /**
     * Sets the value of the serviceSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceSK(BigInteger value) {
        this.serviceSK = value;
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
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
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
     * Gets the value of the serviceEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getServiceEffectiveDate() {
        return serviceEffectiveDate;
    }

    /**
     * Sets the value of the serviceEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceEffectiveDate(Date value) {
        this.serviceEffectiveDate = value;
    }

    /**
     * Gets the value of the serviceTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getServiceTerminationDate() {
        return serviceTerminationDate;
    }

    /**
     * Sets the value of the serviceTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTerminationDate(Date value) {
        this.serviceTerminationDate = value;
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

}
