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
 * Stores information of on individual planned events where a Staff member is supposed to perform specified Services, Activities and/or Events for a patient.
 * 
 * <p>Java class for Schedule_Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schedule_Event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Schedule_Event_Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Event_Service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Event_Authorization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Visit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Schedule_Event_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Schedule_Event_ID" use="required" type="{}ID" />
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
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Patient_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Authorization_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Authorization_Qualifier" type="{}Authorization_Qualifier" />
 *       &lt;attribute name="Staff_ID" type="{}ID" />
 *       &lt;attribute name="Payer_ID" type="{}ID" />
 *       &lt;attribute name="Referral_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Business_Entity_Calendar_Lookup_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Schedule_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Plan_Of_Care_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Timezone_Name" type="{}Timezone_Name" />
 *       &lt;attribute name="Schedule_Event_Bill_Rate" type="{}Money" />
 *       &lt;attribute name="Master_Rate_ID" type="{}ID" />
 *       &lt;attribute name="Day_Of_Month">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Schedule_Event_Start_Datetime" type="{}Start_Datetime" />
 *       &lt;attribute name="Schedule_Event_End_Datetime" type="{}End_Datetime" />
 *       &lt;attribute name="Schedule_Event_Total_Hours" type="{}Hours" />
 *       &lt;attribute name="Schedule_Event_Status" type="{}Schedule_Event_Status" />
 *       &lt;attribute name="Schedule_Event_Pay_Rate" type="{}Money" />
 *       &lt;attribute name="Schedule_Event_Unit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Schedule_Event_Restriction" type="{}Comment_Long" />
 *       &lt;attribute name="Schedule_Event_Comment" type="{}Comment_Long" />
 *       &lt;attribute name="Schedule_Event_Manually_Override_Indicator" type="{}Indicator" />
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
	public class ScheduleEvent
	{

			[DataMember]
			public List<ScheduleEventActivity> ScheduleEventActivityCollection { get; set; }

			[DataMember]
			public List<ScheduleEventService> ScheduleEventServiceCollection { get; set; }

			[DataMember]
			public List<ScheduleEventAuthorization> ScheduleEventAuthorizationCollection { get; set; }

			[DataMember]
			public List<Visit> VisitCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long ScheduleEventSK { get; set; }

			[DataMember(IsRequired = true)]
			public String ScheduleEventID { get; set; }

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

			[DataMember(IsRequired = true)]
			public String BusinessEntityID { get; set; }

			[DataMember(IsRequired = true)]
			public String PatientID { get; set; }

			[DataMember]
			public long? AuthorizationSK { get; set; }

			[DataMember]
			public AuthorizationQualifier AuthorizationQualifier { get; set; }

			[DataMember]
			public String StaffID { get; set; }

			[DataMember]
			public String PayerID { get; set; }

			[DataMember]
			public long? ReferralSK { get; set; }

			[DataMember]
			public long? BusinessEntityCalendarLookupSK { get; set; }

			[DataMember]
			public long? ScheduleSK { get; set; }

			[DataMember]
			public long? PlanOfCareSK { get; set; }

			[DataMember]
			public String TimezoneName { get; set; }

			[DataMember]
			public decimal? ScheduleEventBillRate { get; set; }

			[DataMember]
			public String MasterRateID { get; set; }

			[DataMember]
			public String DayOfMonth { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> ScheduleEventStartDatetime { get; set; }

			[DataMember(Name = "ScheduleEventStartDatetime")]
			public string ScheduleEventStartDatetimeStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(ScheduleEventStartDatetime);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						ScheduleEventStartDatetime = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> ScheduleEventEndDatetime { get; set; }

			[DataMember(Name = "ScheduleEventEndDatetime")]
			public string ScheduleEventEndDatetimeStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(ScheduleEventEndDatetime);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						ScheduleEventEndDatetime = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public decimal? ScheduleEventTotalHours { get; set; }

			[DataMember]
			public ScheduleEventStatus ScheduleEventStatus { get; set; }

			[DataMember]
			public decimal? ScheduleEventPayRate { get; set; }

			[DataMember]
			public String ScheduleEventUnit { get; set; }

			[DataMember]
			public String ScheduleEventRestriction { get; set; }

			[DataMember]
			public String ScheduleEventComment { get; set; }

			[DataMember]
			public bool? ScheduleEventManuallyOverrideIndicator { get; set; }


	}
}