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
 * An invoice detail line defines the billable service that is identified for a service or task, has a specific data of service, and may or may not have a payer that provides some level (if not all) of reimbursement for the service.
 *  Each individual Invoice Detail Line is submitted as a claim, or a set of claims, to the defined payer
 * 
 * <p>Java class for Invoice_Detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice_Detail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Billing_Detail_Invoice_Detail_Crosswalk" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Invoice_Detail_Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Accounts_Receivable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Claim_Line" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Invoice_Detail_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Code" type="{}Change_Reason_Code" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" type="{}ID" />
 *       &lt;attribute name="Invoice_Number" use="required" type="{}ID" />
 *       &lt;attribute name="Invoice_Detail_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Timesheet_Detail_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Timesheet_Summary_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Vendor_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Invoice_Detail_Service_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Invoice_Detail_Status_Code" use="required" type="{}Invoice_Detail_Status_Code" />
 *       &lt;attribute name="Invoice_Detail_Submission_Status_Name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Payer_ID" type="{}ID" />
 *       &lt;attribute name="Revenue_Code" type="{}Revenue_Code" />
 *       &lt;attribute name="Billing_Code" type="{}Billing_Code" />
 *       &lt;attribute name="Modifier_4_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_3_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_2_Code" type="{}Code" />
 *       &lt;attribute name="Modifier_1_Code" type="{}Code" />
 *       &lt;attribute name="Rendering_Professional_National_Provider_Identifier" type="{}National_Provider_Identifier" />
 *       &lt;attribute name="Service_Name" type="{}Service_Name" />
 *       &lt;attribute name="Rate_Type_Name" type="{}Rate_Type_Name" />
 *       &lt;attribute name="Rate_Qualifier_Code" type="{}Rate_Qualifier_Code" />
 *       &lt;attribute name="Invoice_Detail_Rate_Amount" type="{}Money" />
 *       &lt;attribute name="Invoice_Detail_Total_Amount" type="{}Money" />
 *       &lt;attribute name="Invoice_Detail_Total_Unit">
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
 *       &lt;attribute name="Claim_Reference_Number">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Invoice_Detail_Service_Line_Item_Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
	public class InvoiceDetail
	{

			[DataMember]
			public List<BillingDetailInvoiceDetailCrosswalk> BillingDetailInvoiceDetailCrosswalkCollection { get; set; }

			[DataMember]
			public List<InvoiceDetailNote> InvoiceDetailNoteCollection { get; set; }

			[DataMember]
			public List<AccountsReceivable> AccountsReceivableCollection { get; set; }

			[DataMember]
			public List<ClaimLine> ClaimLineCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long InvoiceDetailSK { get; set; }

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
			public String ChangeReasonCode { get; set; }

			[DataMember]
			public String ChangeReasonMemo { get; set; }

			[DataMember(IsRequired = true)]
			public bool CurrentRecordIndicator { get; set; }

			[DataMember(IsRequired = true)]
			public long ChangeVersionID { get; set; }

			[DataMember]
			public String BusinessEntityID { get; set; }

			[DataMember(IsRequired = true)]
			public String InvoiceNumber { get; set; }

			[DataMember(IsRequired = true)]
			public String InvoiceDetailID { get; set; }

			[DataMember]
			public long? TimesheetDetailSK { get; set; }

			[DataMember]
			public long? TimesheetSummarySK { get; set; }

			[DataMember]
			public String VendorName { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> InvoiceDetailServiceDate { get; set; }

			[DataMember(Name = "InvoiceDetailServiceDate")]
			public string InvoiceDetailServiceDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(InvoiceDetailServiceDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						InvoiceDetailServiceDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember(IsRequired = true)]
			public String InvoiceDetailStatusCode { get; set; }

			[DataMember]
			public String InvoiceDetailSubmissionStatusName { get; set; }

			[DataMember]
			public String PayerID { get; set; }

			[DataMember]
			public String RevenueCode { get; set; }

			[DataMember]
			public String BillingCode { get; set; }

			[DataMember]
			public String Modifier4Code { get; set; }

			[DataMember]
			public String Modifier3Code { get; set; }

			[DataMember]
			public String Modifier2Code { get; set; }

			[DataMember]
			public String Modifier1Code { get; set; }

			[DataMember]
			public String RenderingProfessionalNationalProviderIdentifier { get; set; }

			[DataMember]
			public ServiceName ServiceName { get; set; }

			[DataMember]
			public String RateTypeName { get; set; }

			[DataMember]
			public RateQualifierCode RateQualifierCode { get; set; }

			[DataMember]
			public decimal? InvoiceDetailRateAmount { get; set; }

			[DataMember]
			public decimal? InvoiceDetailTotalAmount { get; set; }

			[DataMember]
			public decimal? InvoiceDetailTotalUnit { get; set; }

			[DataMember]
			public bool? SplitBillingAllowedIndicator { get; set; }

			[DataMember]
			public String UserName { get; set; }

			[DataMember]
			public String UserGloballyUniqueIdentifier { get; set; }

			[DataMember]
			public String Memo { get; set; }

			[DataMember]
			public String ClaimReferenceNumber { get; set; }

			[DataMember]
			public long? InvoiceDetailServiceLineItemNumber { get; set; }


	}
}
