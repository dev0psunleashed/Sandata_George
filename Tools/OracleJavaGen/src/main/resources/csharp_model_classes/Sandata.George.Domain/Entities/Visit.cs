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
 * A visit occurs when a Staff member performs Services, Activites or Tasks for a Patient.
 * 
 * <p>Java class for Visit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Visit_Event" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Service_Visit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Visit_Document_Crosswalk" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Visit_Authorization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Visit_Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Visit_Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Visit_Exception" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Timesheet_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Visit_Task_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Billing_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Visit_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Code" type="{}Change_Reason_Code" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" type="{}ID" />
 *       &lt;attribute name="Patient_ID" type="{}ID" />
 *       &lt;attribute name="Staff_ID" type="{}ID" />
 *       &lt;attribute name="Schedule_Event_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Visit_Actual_Start_Timestamp" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="Visit_Actual_End_Timestamp" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="Visit_Adjusted_Start_Timestamp" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="Visit_Adjusted_End_Timestamp" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="Visit_Cancelled_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Visit_Cancellation_Reason">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="100"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Visit_Approved_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Visit_Verified_By_Schedule_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Visit_Pay_By_Schedule_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Visit_Do_Not_Bill_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Visit_Do_Not_Pay_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Visit_Pay_Hours" type="{}Hours" />
 *       &lt;attribute name="Visit_Bill_Hours" type="{}Hours" />
 *       &lt;attribute name="Visit_Overtime_Absence_Hours" type="{}Hours" />
 *       &lt;attribute name="User_Name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="64"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="User_Globally_Unique_Identifier" type="{}Computing_Globally_Unique_Identifier" />
 *       &lt;attribute name="Resolution_Code" type="{}Change_Reason_Code" />
 *       &lt;attribute name="Memo" type="{}Comment_Long" />
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
	public class Visit
	{

			[DataMember]
			public List<VisitEvent> VisitEventCollection { get; set; }

			[DataMember]
			public List<ServiceVisit> ServiceVisitCollection { get; set; }

			[DataMember]
			public List<VisitDocumentCrosswalk> VisitDocumentCrosswalkCollection { get; set; }

			[DataMember]
			public List<VisitAuthorization> VisitAuthorizationCollection { get; set; }

			[DataMember]
			public List<VisitNote> VisitNoteCollection { get; set; }

			[DataMember]
			public List<VisitActivity> VisitActivityCollection { get; set; }

			[DataMember]
			public List<VisitException> VisitExceptionCollection { get; set; }

			[DataMember]
			public List<TimesheetDetail> TimesheetDetailCollection { get; set; }

			[DataMember]
			public List<VisitTaskList> VisitTaskListCollection { get; set; }

			[DataMember]
			public List<BillingDetail> BillingDetailCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long VisitSK { get; set; }

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
			public String BusinessEntityID { get; set; }

			[DataMember]
			public String PatientID { get; set; }

			[DataMember]
			public String StaffID { get; set; }

			[DataMember]
			public long? ScheduleEventSK { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> VisitActualStartTimestamp { get; set; }

			[DataMember(Name = "VisitActualStartTimestamp")]
			public string VisitActualStartTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(VisitActualStartTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						VisitActualStartTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> VisitActualEndTimestamp { get; set; }

			[DataMember(Name = "VisitActualEndTimestamp")]
			public string VisitActualEndTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(VisitActualEndTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						VisitActualEndTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> VisitAdjustedStartTimestamp { get; set; }

			[DataMember(Name = "VisitAdjustedStartTimestamp")]
			public string VisitAdjustedStartTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(VisitAdjustedStartTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						VisitAdjustedStartTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> VisitAdjustedEndTimestamp { get; set; }

			[DataMember(Name = "VisitAdjustedEndTimestamp")]
			public string VisitAdjustedEndTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(VisitAdjustedEndTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						VisitAdjustedEndTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public bool? VisitCancelledIndicator { get; set; }

			[DataMember]
			public String VisitCancellationReason { get; set; }

			[DataMember]
			public bool? VisitApprovedIndicator { get; set; }

			[DataMember]
			public bool? VisitVerifiedByScheduleIndicator { get; set; }

			[DataMember]
			public bool? VisitPayByScheduleIndicator { get; set; }

			[DataMember]
			public bool? VisitDoNotBillIndicator { get; set; }

			[DataMember]
			public bool? VisitDoNotPayIndicator { get; set; }

			[DataMember]
			public decimal? VisitPayHours { get; set; }

			[DataMember]
			public decimal? VisitBillHours { get; set; }

			[DataMember]
			public decimal? VisitOvertimeAbsenceHours { get; set; }

			[DataMember]
			public String UserName { get; set; }

			[DataMember]
			public String UserGloballyUniqueIdentifier { get; set; }

			[DataMember]
			public String ResolutionCode { get; set; }

			[DataMember]
			public String Memo { get; set; }


	}
}
