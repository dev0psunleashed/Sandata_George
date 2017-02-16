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
 * The Payroll Input table holds information that is recieved from the payroll vendor about staff payroll
 * 
 * <p>Java class for Payroll_Input complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payroll_Input">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Payroll_Input_Earning_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Payroll_Input_Tax_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Payroll_Input_Deduction_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Payroll_Input_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Payroll_Input_ID" use="required" type="{}ID" />
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
 *       &lt;attribute name="Staff_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Interface_ID" use="required" type="{}Interface_ID" />
 *       &lt;attribute name="Week_End_Date" type="{}Week_End_Date" />
 *       &lt;attribute name="Net_Pay_Amount" type="{}Money" />
 *       &lt;attribute name="Gross_Pay_Amount" type="{}Money" />
 *       &lt;attribute name="Check_Number" type="{}ID" />
 *       &lt;attribute name="Check_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Check_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Electronic_Funds_Transfer_Transaction_Identifier" type="{}ID" />
 *       &lt;attribute name="Bank_Routing_Number" type="{}ID" />
 *       &lt;attribute name="Bank_Account_Number" type="{}ID" />
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
	public class PayrollInput
	{

			[DataMember]
			public List<PayrollInputEarningDetail> PayrollInputEarningDetailCollection { get; set; }

			[DataMember]
			public List<PayrollInputTaxDetail> PayrollInputTaxDetailCollection { get; set; }

			[DataMember]
			public List<PayrollInputDeductionDetail> PayrollInputDeductionDetailCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long PayrollInputSK { get; set; }

			[DataMember(IsRequired = true)]
			public String PayrollInputID { get; set; }

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

			[DataMember(IsRequired = true)]
			public String StaffID { get; set; }

			[DataMember(IsRequired = true)]
			public String InterfaceID { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> WeekEndDate { get; set; }

			[DataMember(Name = "WeekEndDate")]
			public string WeekEndDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(WeekEndDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						WeekEndDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public decimal? NetPayAmount { get; set; }

			[DataMember]
			public decimal? GrossPayAmount { get; set; }

			[DataMember]
			public String CheckNumber { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> CheckDate { get; set; }

			[DataMember(Name = "CheckDate")]
			public string CheckDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(CheckDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						CheckDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public bool? CheckIndicator { get; set; }

			[DataMember]
			public String ElectronicFundsTransferTransactionIdentifier { get; set; }

			[DataMember]
			public String BankRoutingNumber { get; set; }

			[DataMember]
			public String BankAccountNumber { get; set; }


	}
}
