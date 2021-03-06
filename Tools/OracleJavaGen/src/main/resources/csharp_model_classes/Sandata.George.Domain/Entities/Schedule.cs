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
 * Defines a series of planned events where a Staff member is supposed to perform specified Services, Activities and/or Events for a patient.
 * 
 * <p>Java class for Schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Schedule_Service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Repeat_Day_Of_Week" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Repeat_Day_Of_Month" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Repeat_Month" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Task_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Repeat_Week" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Authorization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Event" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Schedule_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Schedule_ID" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Payer_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Referral_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Patient_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Staff_ID" type="{}ID" />
 *       &lt;attribute name="Timezone_Name" type="{}Timezone_Name" />
 *       &lt;attribute name="Schedule_Start_Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Schedule_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Number_Of_Occurences" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Schedule_Pay_Rate" type="{}Money" />
 *       &lt;attribute name="Schedule_Bill_Rate" type="{}Money" />
 *       &lt;attribute name="Schedule_Unit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Schedule_Frequency_ID">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Schedule_Restrictions" type="{}Comment_Long" />
 *       &lt;attribute name="Schedule_Comments" type="{}Comment_Long" />
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
	public class Schedule
	{

			[DataMember]
			public List<ScheduleService> ScheduleServiceCollection { get; set; }

			[DataMember]
			public List<ScheduleRepeatDayOfWeek> ScheduleRepeatDayOfWeekCollection { get; set; }

			[DataMember]
			public List<ScheduleActivity> ScheduleActivityCollection { get; set; }

			[DataMember]
			public List<ScheduleRepeatDayOfMonth> ScheduleRepeatDayOfMonthCollection { get; set; }

			[DataMember]
			public List<ScheduleRepeatMonth> ScheduleRepeatMonthCollection { get; set; }

			[DataMember]
			public List<ScheduleTaskList> ScheduleTaskListCollection { get; set; }

			[DataMember]
			public List<ScheduleRepeatWeek> ScheduleRepeatWeekCollection { get; set; }

			[DataMember]
			public List<ScheduleAuthorization> ScheduleAuthorizationCollection { get; set; }

			[DataMember]
			public List<ScheduleEvent> ScheduleEventCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long ScheduleSK { get; set; }

			[DataMember(IsRequired = true)]
			public String ScheduleID { get; set; }

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

			[DataMember(IsRequired = true)]
			public long ChangeVersionID { get; set; }

			[DataMember]
			public long? PayerSK { get; set; }

			[DataMember]
			public long? ReferralSK { get; set; }

			[DataMember(IsRequired = true)]
			public String BusinessEntityID { get; set; }

			[DataMember(IsRequired = true)]
			public String PatientID { get; set; }

			[DataMember]
			public String StaffID { get; set; }

			[DataMember]
			public String TimezoneName { get; set; }

			[IgnoreDataMember]
			public DateTime ScheduleStartDate { get; set; }

			[DataMember(Name = "ScheduleStartDate", IsRequired = true)]
			public string ScheduleStartDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(ScheduleStartDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						ScheduleStartDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> ScheduleEndDate { get; set; }

			[DataMember(Name = "ScheduleEndDate")]
			public string ScheduleEndDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(ScheduleEndDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						ScheduleEndDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public long? NumberOfOccurences { get; set; }

			[DataMember]
			public decimal? SchedulePayRate { get; set; }

			[DataMember]
			public decimal? ScheduleBillRate { get; set; }

			[DataMember]
			public String ScheduleUnit { get; set; }

			[DataMember]
			public String ScheduleFrequencyID { get; set; }

			[DataMember]
			public String ScheduleRestrictions { get; set; }

			[DataMember]
			public String ScheduleComments { get; set; }


	}
}
