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
 * An invoice is the highest level of a billing component.  
 * An invoice consists of one or more invoice detail lines, they are used to identify the individual billable line items for a given period of time, and is also used to generate billing statements for patients.
 * List services provided, with a statement of the sum due for these services (a bill)
 * 
 * <p>Java class for Accounts_Receivable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accounts_Receivable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Accounts_Receivable_History" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Accounts_Receivable_Document_Crosswalk" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Accounts_Receivable_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Code" type="{}Change_Reason_Code" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_Line_of_Business_ID" type="{}ID" />
 *       &lt;attribute name="Business_Entity_Location_ID" type="{}ID" />
 *       &lt;attribute name="Accounts_Receivable_Transaction_Batch_Detail_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Accounts_Receivable_Transaction_Code" type="{}Code" />
 *       &lt;attribute name="Accounts_Receivable_Remit_Code" type="{}Code" />
 *       &lt;attribute name="Accounts_Receivable_Transaction_Amount" type="{}Money" />
 *       &lt;attribute name="Accounts_Receivable_Transaction_Total_Unit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Accounts_Receivable_Transaction_Unit_Rate" type="{}Money" />
 *       &lt;attribute name="Business_Entity_ID" type="{}ID" />
 *       &lt;attribute name="Payer_ID" type="{}ID" />
 *       &lt;attribute name="Contract_ID" type="{}ID" />
 *       &lt;attribute name="Authorization_ID" type="{}ID" />
 *       &lt;attribute name="Patient_ID" type="{}ID" />
 *       &lt;attribute name="Patient_Insurance_ID_Number" type="{}ID" />
 *       &lt;attribute name="Invoice_Number" type="{}ID" />
 *       &lt;attribute name="Invoice_Status_Code" type="{}Invoice_Status_Code" />
 *       &lt;attribute name="Invoice_Submission_Type_Code" type="{}Invoice_Submission_Type_Code" />
 *       &lt;attribute name="Invoice_Start_Date" type="{}Attribute_Start_Date" />
 *       &lt;attribute name="Invoice_End_Date" type="{}Attribute_End_Date" />
 *       &lt;attribute name="Invoice_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Invoice_Type_Qualifier" type="{}Invoice_Type_Qualifier" />
 *       &lt;attribute name="Invoice_Format_Type_Name" type="{}Invoice_Format_Type_Name" />
 *       &lt;attribute name="ICD_Diagnosis_Code_Revision_Qualifier" type="{}ICD_Diagnosis_Code_Revision_Qualifier" />
 *       &lt;attribute name="ICD_Diagnosis_Code_Primary" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_2" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_3" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_4" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_5" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_6" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_7" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_8" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_9" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_10" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_11" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="ICD_Diagnosis_Code_12" type="{}ICD_Diagnosis_Code" />
 *       &lt;attribute name="Referring_Healthcare_Professional_National_Provider_Identifier" type="{}National_Provider_Identifier" />
 *       &lt;attribute name="Rendering_Professional_National_Provider_Identifier" type="{}National_Provider_Identifier" />
 *       &lt;attribute name="Invoice_Total_Amount" type="{}Money" />
 *       &lt;attribute name="Invoice_Total_Unit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Invoice_Bill_Type_Code">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Invoice_Manually_Override_Indicator" type="{}Indicator" />
 *       &lt;attribute name="User_Name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="64"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="User_Globally_Unique_Identifier" type="{}Computing_Globally_Unique_Identifier" />
 *       &lt;attribute name="Memo" type="{}Comment_Long" />
 *       &lt;attribute name="Service_Unit_Name" type="{}Service_Unit_Name" />
 *       &lt;attribute name="Rate_Amount" type="{}Money" />
 *       &lt;attribute name="Invoice_Detail_ID" type="{}ID" />
 *       &lt;attribute name="Invoice_Detail_Total_Unit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Invoice_Detail_Total_Amount" type="{}Money" />
 *       &lt;attribute name="Invoice_Detail_Split_Billing_Allowed_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Vendor_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Service_Name" type="{}Service_Name" />
 *       &lt;attribute name="Billing_Code" type="{}Billing_Code" />
 *       &lt;attribute name="Modifier_1_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_2_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_3_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_4_Code" type="{}Code" />
 *       &lt;attribute name="Revenue_Code" type="{}Revenue_Code" />
 *       &lt;attribute name="Invoice_Detail_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Invoice_Submission_Status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Invoice_Detail_Status_Code" type="{}Invoice_Detail_Status_Code" />
 *       &lt;attribute name="Rate_Type_Name" type="{}Rate_Type_Name" />
 *       &lt;attribute name="Rate_Qualifier_Code" type="{}Rate_Qualifier_Code" />
 *       &lt;attribute name="Accounts_Receivable_Note_Type_Code" type="{}Name_Generic" />
 *       &lt;attribute name="Accounts_Receivable_Note" type="{}Comment_Long" />
 *       &lt;attribute name="Claim_Reference_Number">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Accounts_Receivable_Unapplied_Balance_Indicator" type="{}Indicator" />
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
	public class AccountsReceivable
	{

			[DataMember]
			public List<AccountsReceivableHistory> AccountsReceivableHistoryCollection { get; set; }

			[DataMember]
			public List<AccountsReceivableDocumentCrosswalk> AccountsReceivableDocumentCrosswalkCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long AccountsReceivableSK { get; set; }

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

			[DataMember]
			public String RecordCreatedBy { get; set; }

			[DataMember]
			public String RecordUpdatedBy { get; set; }

			[DataMember]
			public String ChangeReasonCode { get; set; }

			[DataMember]
			public String ChangeReasonMemo { get; set; }

			[DataMember(IsRequired = true)]
			public long ChangeVersionID { get; set; }

			[DataMember]
			public String BusinessEntityLineofBusinessID { get; set; }

			[DataMember]
			public String BusinessEntityLocationID { get; set; }

			[DataMember]
			public long? AccountsReceivableTransactionBatchDetailSK { get; set; }

			[DataMember]
			public String AccountsReceivableTransactionCode { get; set; }

			[DataMember]
			public String AccountsReceivableRemitCode { get; set; }

			[DataMember]
			public decimal? AccountsReceivableTransactionAmount { get; set; }

			[DataMember]
			public decimal? AccountsReceivableTransactionTotalUnit { get; set; }

			[DataMember]
			public decimal? AccountsReceivableTransactionUnitRate { get; set; }

			[DataMember]
			public String BusinessEntityID { get; set; }

			[DataMember]
			public String PayerID { get; set; }

			[DataMember]
			public String ContractID { get; set; }

			[DataMember]
			public String AuthorizationID { get; set; }

			[DataMember]
			public String PatientID { get; set; }

			[DataMember]
			public String PatientInsuranceIDNumber { get; set; }

			[DataMember]
			public String InvoiceNumber { get; set; }

			[DataMember]
			public String InvoiceStatusCode { get; set; }

			[DataMember]
			public String InvoiceSubmissionTypeCode { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> InvoiceStartDate { get; set; }

			[DataMember(Name = "InvoiceStartDate")]
			public string InvoiceStartDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(InvoiceStartDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						InvoiceStartDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> InvoiceEndDate { get; set; }

			[DataMember(Name = "InvoiceEndDate")]
			public string InvoiceEndDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(InvoiceEndDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						InvoiceEndDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> InvoiceDate { get; set; }

			[DataMember(Name = "InvoiceDate")]
			public string InvoiceDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(InvoiceDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						InvoiceDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public InvoiceTypeQualifier InvoiceTypeQualifier { get; set; }

			[DataMember]
			public String InvoiceFormatTypeName { get; set; }

			[DataMember]
			public ICDDiagnosisCodeRevisionQualifier ICDDiagnosisCodeRevisionQualifier { get; set; }

			[DataMember]
			public String ICDDiagnosisCodePrimary { get; set; }

			[DataMember]
			public String ICDDiagnosisCode2 { get; set; }

			[DataMember]
			public String ICDDiagnosisCode3 { get; set; }

			[DataMember]
			public String ICDDiagnosisCode4 { get; set; }

			[DataMember]
			public String ICDDiagnosisCode5 { get; set; }

			[DataMember]
			public String ICDDiagnosisCode6 { get; set; }

			[DataMember]
			public String ICDDiagnosisCode7 { get; set; }

			[DataMember]
			public String ICDDiagnosisCode8 { get; set; }

			[DataMember]
			public String ICDDiagnosisCode9 { get; set; }

			[DataMember]
			public String ICDDiagnosisCode10 { get; set; }

			[DataMember]
			public String ICDDiagnosisCode11 { get; set; }

			[DataMember]
			public String ICDDiagnosisCode12 { get; set; }

			[DataMember]
			public String ReferringHealthcareProfessionalNationalProviderIdentifier { get; set; }

			[DataMember]
			public String RenderingProfessionalNationalProviderIdentifier { get; set; }

			[DataMember]
			public decimal? InvoiceTotalAmount { get; set; }

			[DataMember]
			public decimal? InvoiceTotalUnit { get; set; }

			[DataMember]
			public String InvoiceBillTypeCode { get; set; }

			[DataMember]
			public bool? InvoiceManuallyOverrideIndicator { get; set; }

			[DataMember]
			public String UserName { get; set; }

			[DataMember]
			public String UserGloballyUniqueIdentifier { get; set; }

			[DataMember]
			public String Memo { get; set; }

			[DataMember]
			public ServiceUnitName ServiceUnitName { get; set; }

			[DataMember]
			public decimal? RateAmount { get; set; }

			[DataMember]
			public String InvoiceDetailID { get; set; }

			[DataMember]
			public decimal? InvoiceDetailTotalUnit { get; set; }

			[DataMember]
			public decimal? InvoiceDetailTotalAmount { get; set; }

			[DataMember]
			public bool? InvoiceDetailSplitBillingAllowedIndicator { get; set; }

			[DataMember]
			public String VendorName { get; set; }

			[DataMember]
			public ServiceName ServiceName { get; set; }

			[DataMember]
			public String BillingCode { get; set; }

			[DataMember]
			public String Modifier1Code { get; set; }

			[DataMember]
			public String Modifier2Code { get; set; }

			[DataMember]
			public String Modifier3Code { get; set; }

			[DataMember]
			public String Modifier4Code { get; set; }

			[DataMember]
			public String RevenueCode { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> InvoiceDetailDate { get; set; }

			[DataMember(Name = "InvoiceDetailDate")]
			public string InvoiceDetailDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(InvoiceDetailDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						InvoiceDetailDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public String InvoiceSubmissionStatus { get; set; }

			[DataMember]
			public String InvoiceDetailStatusCode { get; set; }

			[DataMember]
			public String RateTypeName { get; set; }

			[DataMember]
			public RateQualifierCode RateQualifierCode { get; set; }

			[DataMember]
			public String AccountsReceivableNoteTypeCode { get; set; }

			[DataMember]
			public String AccountsReceivableNote { get; set; }

			[DataMember]
			public String ClaimReferenceNumber { get; set; }

			[DataMember]
			public bool? AccountsReceivableUnappliedBalanceIndicator { get; set; }


	}
}
