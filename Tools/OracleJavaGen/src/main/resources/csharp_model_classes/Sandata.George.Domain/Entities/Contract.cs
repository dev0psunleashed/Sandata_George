//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.27 at 10:53:27 PM EST 
//


using Sandata.George.Common;
using Sandata.George.Common.Helpers;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;





/**
 * Payer contract holds specifics on a contract with a payer, including effective dates of the contract, services/procedures reimbursement/rates, etc.
 * 
 * 
 * <p>Java class for Contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Contract_Exception_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Contract_Modifier_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Contract_Rate_Type_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Contract_Service_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Contract_Billing_Code_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Payer_Rate_Modifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Accounts_Receivable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Invoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Contract_Rate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Patient_Payer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Billing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Billing_Rate_Matrix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Payroll_Rate_Matrix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Authorization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Contract_Change_Reason_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Order" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Contract_Task" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Contract_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Timezone_Name" type="{}Timezone_Name" />
 *       &lt;attribute name="Payer_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Contract_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Contract_Effective_Date" use="required" type="{}Attribute_Effective_Date" />
 *       &lt;attribute name="Contract_Termination_Date" use="required" type="{}Attribute_Termination_Date" />
 *       &lt;attribute name="Revenue_Code" type="{}Revenue_Code" />
 *       &lt;attribute name="Contract_Description" type="{}Description_Short" />
 *       &lt;attribute name="Contract_Contact_Name" type="{}Name" />
 *       &lt;attribute name="Contract_Contact_Title" type="{}Organizational_Contact_Title" />
 *       &lt;attribute name="Contract_Contact_Phone" type="{}Phone" />
 *       &lt;attribute name="Contract_Contact_Email" type="{}Email" />
 *       &lt;attribute name="Contract_Contact_Email_Qualifier" type="{}Email_Qualifier" />
 *       &lt;attribute name="Contract_Address_Line_1" type="{}Address_Line" />
 *       &lt;attribute name="Contract_Address_Line_2" type="{}Address_Line" />
 *       &lt;attribute name="Contract_City" type="{}City" />
 *       &lt;attribute name="Contract_County">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Contract_State" type="{}State_Code" />
 *       &lt;attribute name="Contract_Postal_Code" type="{}Postal_Code" />
 *       &lt;attribute name="Contract_Zip4" type="{}Zip4" />
 *       &lt;attribute name="Contract_Phone" type="{}Phone" />
 *       &lt;attribute name="Contract_Phone_Extension" type="{}Phone_Extension" />
 *       &lt;attribute name="Contract_Phone_Qualifier" type="{}Phone_Qualifier" />
 *       &lt;attribute name="Contract_Phone_1" type="{}Phone" />
 *       &lt;attribute name="Contract_Phone_1_Extension" type="{}Phone_Extension" />
 *       &lt;attribute name="Contract_Phone_1_Qualifier" type="{}Phone_Qualifier" />
 *       &lt;attribute name="Contract_Fax" type="{}Phone" />
 *       &lt;attribute name="Contract_Fax_Qualifier" type="{}Fax_Qualifier" />
 *       &lt;attribute name="Contract_Fax_1" type="{}Phone" />
 *       &lt;attribute name="Contract_Fax_1_Qualifier" type="{}Fax_Qualifier" />
 *       &lt;attribute name="Contract_Email" type="{}Email" />
 *       &lt;attribute name="Contract_Email_Qualifier" type="{}Email_Qualifier" />
 *       &lt;attribute name="Contract_Bill_To_Contact_Name" type="{}Name" />
 *       &lt;attribute name="Contract_Bill_To_Contact_Title" type="{}Organizational_Contact_Title" />
 *       &lt;attribute name="Contract_Bill_To_Address_Line_1" type="{}Address_Line" />
 *       &lt;attribute name="Contract_Bill_To_Address_Line_2" type="{}Address_Line" />
 *       &lt;attribute name="Contract_Bill_To_City" type="{}City" />
 *       &lt;attribute name="Contract_Bill_To_State" type="{}State_Code" />
 *       &lt;attribute name="Contract_Bill_To_Postal_Code" type="{}Postal_Code" />
 *       &lt;attribute name="Contract_Bill_To_Zip4" type="{}Zip4" />
 *       &lt;attribute name="Contract_Bill_To_Phone" type="{}Phone" />
 *       &lt;attribute name="Contract_Bill_To_Phone_Extension" type="{}Phone_Extension" />
 *       &lt;attribute name="Contract_Remit_To_Contact_Name" type="{}Name" />
 *       &lt;attribute name="Contract_Remit_To_Contact_Title" type="{}Organizational_Contact_Title" />
 *       &lt;attribute name="Contract_Remit_To_Address_Line_1" type="{}Address_Line" />
 *       &lt;attribute name="Contract_Remit_To_Address_Line_2" type="{}Address_Line" />
 *       &lt;attribute name="Contract_Remit_To_City" type="{}City" />
 *       &lt;attribute name="Contract_Remit_To_State" type="{}State_Code" />
 *       &lt;attribute name="Contract_Remit_To_Postal_Code" type="{}Postal_Code" />
 *       &lt;attribute name="Contract_Remit_To_Zip4" type="{}Zip4" />
 *       &lt;attribute name="Contract_Remit_To_Phone" type="{}Phone" />
 *       &lt;attribute name="Contract_Remit_To_Phone_Extension" type="{}Phone_Extension" />
 *       &lt;attribute name="Contract_Week_End_Day" type="{}Week_End_Day" />
 *       &lt;attribute name="Contract_Active_indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_Bill_Code" type="{}Code" />
 *       &lt;attribute name="Contract_Invoice_Format_Type_Name" type="{}Invoice_Format_Type_Name" />
 *       &lt;attribute name="Contract_Resubmit_Invoice_Format_Type_Name" type="{}Invoice_Format_Type_Name" />
 *       &lt;attribute name="Contract_Claim_Submission_Frequency_Type_Name" type="{}Billing_Frequency_Type_Name" />
 *       &lt;attribute name="Contract_Weekend_Start_Day" type="{}Weekend_Start_Day" />
 *       &lt;attribute name="Contract_Weekend_Start_Time">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Contract_Weekend_End_Day" type="{}Weekend_End_Day" />
 *       &lt;attribute name="Contract_Weekend_End_Time">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Contract_Service_Unit_Name" type="{}Service_Unit_Name" />
 *       &lt;attribute name="Contract_Service_Unit_Equivalence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Contract_Live_In_Equivalence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Contract_Electronic_Data_Interchange_Routing_ID" type="{}ID" />
 *       &lt;attribute name="Contract_Electronic_Data_Interchange_Submittable_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_Hold_Billing_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_Split_Billing_Allowed_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_No_Holiday_Pay_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_Eligibility_Check_Required_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_Consumer_Directed_Service_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_Billing_Unit_Round_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_Signature_Required_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_Patient_Insurance_ID_Required_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_Approval_Type" use="required" type="{}Authorization_Limit_Type_Name" />
 *       &lt;attribute name="Contract_Coverting_Copay_Amount" type="{}Money" />
 *       &lt;attribute name="Contract_Copay_Amount" type="{}Money" />
 *       &lt;attribute name="Contract_Patient_Assessment_Frequency" type="{}Patient_Assessment_Frequency" />
 *       &lt;attribute name="Contract_Patient_Supervisory_Visit_Frequency" type="{}Patient_Supervisory_Visit_Frequency" />
 *       &lt;attribute name="Contract_Electronic_Data_Interchange_Provider_Location_Code" type="{}Code" />
 *       &lt;attribute name="Contract_Electronic_Data_Interchange_Format_Qualifier">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Contract_Bill_Type_Code">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Prepaid_Capitation_Plan_Code" type="{}Code" />
 *       &lt;attribute name="Business_Entity_Line_Of_Business_ID" type="{}ID" />
 *       &lt;attribute name="Contract_Nurse_Note_Required_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Contract_Servicing_Location_Qualifier" type="{}Servicing_Location_Qualifier" />
 *       &lt;attribute name="Visit_Verification_Rounding_Rule_ID" type="{}Visit_Verification_Rounding_Rule_ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
namespace Sandata.George.Domain.Entities
{
	[DataContract]
	public class Contract
	{

			[DataMember]
			public List<ContractExceptionList> ContractExceptionListCollection { get; set; }

			[DataMember]
			public List<ContractModifierList> ContractModifierListCollection { get; set; }

			[DataMember]
			public List<ContractRateTypeList> ContractRateTypeListCollection { get; set; }

			[DataMember]
			public List<ContractServiceList> ContractServiceListCollection { get; set; }

			[DataMember]
			public List<ContractBillingCodeList> ContractBillingCodeListCollection { get; set; }

			[DataMember]
			public List<PayerRateModifier> PayerRateModifierCollection { get; set; }

			[DataMember]
			public List<AccountsReceivable> AccountsReceivableCollection { get; set; }

			[DataMember]
			public List<Invoice> InvoiceCollection { get; set; }

			[DataMember]
			public List<ContractRate> ContractRateCollection { get; set; }

			[DataMember]
			public List<PatientPayer> PatientPayerCollection { get; set; }

			[DataMember]
			public List<Billing> BillingCollection { get; set; }

			[DataMember]
			public List<BillingRateMatrix> BillingRateMatrixCollection { get; set; }

			[DataMember]
			public List<PayrollRateMatrix> PayrollRateMatrixCollection { get; set; }

			[DataMember]
			public List<Authorization> AuthorizationCollection { get; set; }

			[DataMember]
			public List<ContractChangeReasonLookup> ContractChangeReasonLookupCollection { get; set; }

			[DataMember]
			public List<Order> OrderCollection { get; set; }

			[DataMember]
			public List<ContractTask> ContractTaskCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long ContractSK { get; set; }

			[IgnoreDataMember]
			public DateTime RecordCreateTimestamp { get; set; }

			[DataMember(Name = "RecordCreateTimestamp", IsRequired = true)]
			public string RecordCreateTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(RecordCreateTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						RecordCreateTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public DateTime RecordUpdateTimestamp { get; set; }

			[DataMember(Name = "RecordUpdateTimestamp", IsRequired = true)]
			public string RecordUpdateTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(RecordUpdateTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						RecordUpdateTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public DateTime RecordEffectiveTimestamp { get; set; }

			[DataMember(Name = "RecordEffectiveTimestamp", IsRequired = true)]
			public string RecordEffectiveTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(RecordEffectiveTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						RecordEffectiveTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public DateTime RecordTerminationTimestamp { get; set; }

			[DataMember(Name = "RecordTerminationTimestamp", IsRequired = true)]
			public string RecordTerminationTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(RecordTerminationTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						RecordTerminationTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public String RecordCreatedBy { get; set; }

			[DataMember]
			public String RecordUpdatedBy { get; set; }

			[DataMember]
			public String ChangeReasonMemo { get; set; }

			[DataMember(IsRequired = true)]
			public bool CurrentRecordIndicator { get; set; }

			[DataMember(IsRequired = true)]
			public long ChangeVersionID { get; set; }

			[DataMember(IsRequired = true)]
			public String BusinessEntityID { get; set; }

			[DataMember]
			public String TimezoneName { get; set; }

			[DataMember(IsRequired = true)]
			public String PayerID { get; set; }

			[DataMember(IsRequired = true)]
			public String ContractID { get; set; }

			[IgnoreDataMember]
			public DateTime ContractEffectiveDate { get; set; }

			[DataMember(Name = "ContractEffectiveDate", IsRequired = true)]
			public string ContractEffectiveDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(ContractEffectiveDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						ContractEffectiveDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public DateTime ContractTerminationDate { get; set; }

			[DataMember(Name = "ContractTerminationDate", IsRequired = true)]
			public string ContractTerminationDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(ContractTerminationDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						ContractTerminationDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public String RevenueCode { get; set; }

			[DataMember]
			public String ContractDescription { get; set; }

			[DataMember]
			public String ContractContactName { get; set; }

			[DataMember]
			public String ContractContactTitle { get; set; }

			[DataMember]
			public String ContractContactPhone { get; set; }

			[DataMember]
			public String ContractContactEmail { get; set; }

			[DataMember]
			public EmailQualifier ContractContactEmailQualifier { get; set; }

			[DataMember]
			public String ContractAddressLine1 { get; set; }

			[DataMember]
			public String ContractAddressLine2 { get; set; }

			[DataMember]
			public String ContractCity { get; set; }

			[DataMember]
			public String ContractCounty { get; set; }

			[DataMember]
			public StateCode ContractState { get; set; }

			[DataMember]
			public String ContractPostalCode { get; set; }

			[DataMember]
			public String ContractZip4 { get; set; }

			[DataMember]
			public String ContractPhone { get; set; }

			[DataMember]
			public String ContractPhoneExtension { get; set; }

			[DataMember]
			public PhoneQualifier ContractPhoneQualifier { get; set; }

			[DataMember]
			public String ContractPhone1 { get; set; }

			[DataMember]
			public String ContractPhone1Extension { get; set; }

			[DataMember]
			public PhoneQualifier ContractPhone1Qualifier { get; set; }

			[DataMember]
			public String ContractFax { get; set; }

			[DataMember]
			public FaxQualifier ContractFaxQualifier { get; set; }

			[DataMember]
			public String ContractFax1 { get; set; }

			[DataMember]
			public FaxQualifier ContractFax1Qualifier { get; set; }

			[DataMember]
			public String ContractEmail { get; set; }

			[DataMember]
			public EmailQualifier ContractEmailQualifier { get; set; }

			[DataMember]
			public String ContractBillToContactName { get; set; }

			[DataMember]
			public String ContractBillToContactTitle { get; set; }

			[DataMember]
			public String ContractBillToAddressLine1 { get; set; }

			[DataMember]
			public String ContractBillToAddressLine2 { get; set; }

			[DataMember]
			public String ContractBillToCity { get; set; }

			[DataMember]
			public StateCode ContractBillToState { get; set; }

			[DataMember]
			public String ContractBillToPostalCode { get; set; }

			[DataMember]
			public String ContractBillToZip4 { get; set; }

			[DataMember]
			public String ContractBillToPhone { get; set; }

			[DataMember]
			public String ContractBillToPhoneExtension { get; set; }

			[DataMember]
			public String ContractRemitToContactName { get; set; }

			[DataMember]
			public String ContractRemitToContactTitle { get; set; }

			[DataMember]
			public String ContractRemitToAddressLine1 { get; set; }

			[DataMember]
			public String ContractRemitToAddressLine2 { get; set; }

			[DataMember]
			public String ContractRemitToCity { get; set; }

			[DataMember]
			public StateCode ContractRemitToState { get; set; }

			[DataMember]
			public String ContractRemitToPostalCode { get; set; }

			[DataMember]
			public String ContractRemitToZip4 { get; set; }

			[DataMember]
			public String ContractRemitToPhone { get; set; }

			[DataMember]
			public String ContractRemitToPhoneExtension { get; set; }

			[DataMember]
			public WeekEndDay ContractWeekEndDay { get; set; }

			[DataMember]
			public bool? ContractActiveindicator { get; set; }

			[DataMember]
			public String ContractBillCode { get; set; }

			[DataMember]
			public String ContractInvoiceFormatTypeName { get; set; }

			[DataMember]
			public String ContractResubmitInvoiceFormatTypeName { get; set; }

			[DataMember]
			public BillingFrequencyTypeName ContractClaimSubmissionFrequencyTypeName { get; set; }

			[DataMember]
			public WeekendStartDay ContractWeekendStartDay { get; set; }

			[DataMember]
			public String ContractWeekendStartTime { get; set; }

			[DataMember]
			public WeekendEndDay ContractWeekendEndDay { get; set; }

			[DataMember]
			public String ContractWeekendEndTime { get; set; }

			[DataMember]
			public ServiceUnitName ContractServiceUnitName { get; set; }

			[DataMember]
			public long? ContractServiceUnitEquivalence { get; set; }

			[DataMember]
			public long? ContractLiveInEquivalence { get; set; }

			[DataMember]
			public String ContractElectronicDataInterchangeRoutingID { get; set; }

			[DataMember]
			public bool? ContractElectronicDataInterchangeSubmittableIndicator { get; set; }

			[DataMember]
			public bool? ContractHoldBillingIndicator { get; set; }

			[DataMember]
			public bool? ContractSplitBillingAllowedIndicator { get; set; }

			[DataMember]
			public bool? ContractNoHolidayPayIndicator { get; set; }

			[DataMember]
			public bool? ContractEligibilityCheckRequiredIndicator { get; set; }

			[DataMember]
			public bool? ContractConsumerDirectedServiceIndicator { get; set; }

			[DataMember]
			public bool? ContractBillingUnitRoundIndicator { get; set; }

			[DataMember]
			public bool? ContractSignatureRequiredIndicator { get; set; }

			[DataMember]
			public bool? ContractPatientInsuranceIDRequiredIndicator { get; set; }

			[DataMember(IsRequired = true)]
			public AuthorizationLimitTypeName ContractApprovalType { get; set; }

			[DataMember]
			public decimal? ContractCovertingCopayAmount { get; set; }

			[DataMember]
			public decimal? ContractCopayAmount { get; set; }

			[DataMember]
			public PatientAssessmentFrequency ContractPatientAssessmentFrequency { get; set; }

			[DataMember]
			public PatientSupervisoryVisitFrequency ContractPatientSupervisoryVisitFrequency { get; set; }

			[DataMember]
			public String ContractElectronicDataInterchangeProviderLocationCode { get; set; }

			[DataMember]
			public String ContractElectronicDataInterchangeFormatQualifier { get; set; }

			[DataMember]
			public String ContractBillTypeCode { get; set; }

			[DataMember]
			public String PrepaidCapitationPlanCode { get; set; }

			[DataMember]
			public String BusinessEntityLineOfBusinessID { get; set; }

			[DataMember]
			public bool? ContractNurseNoteRequiredIndicator { get; set; }

			[DataMember]
			public ServicingLocationQualifier ContractServicingLocationQualifier { get; set; }

			[DataMember]
			public VisitVerificationRoundingRuleID VisitVerificationRoundingRuleID { get; set; }


	}
}