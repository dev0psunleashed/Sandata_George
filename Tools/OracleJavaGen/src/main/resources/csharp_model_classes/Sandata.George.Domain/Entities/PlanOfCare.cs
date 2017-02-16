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
 * Details the various services, activities and tasks that need to be peformed during visits to a patient
 * 
 * <p>Java class for Plan_Of_Care complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Plan_Of_Care">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Plan_Of_Care_Service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Plan_Of_Care_Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Event" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Plan_Of_Care_Task_List" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Plan_Of_Care_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Plan_Of_Care_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Patient_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Authorization_ID" type="{}ID" />
 *       &lt;attribute name="Frequency_Type_Lookup_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Plan_Of_Care_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Plan_Of_Care_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Plan_Of_Treatment_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Plan_Of_Care_Days_Per_Week">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Plan_Of_Care_Day_1_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Plan_Of_Care_Day_2_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Plan_Of_Care_Day_3_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Plan_Of_Care_Day_4_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Plan_Of_Care_Day_5_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Plan_Of_Care_Day_6_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Plan_Of_Care_Day_7_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Plan_Of_Care_Hours_Per_Day">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
	public class PlanOfCare
	{

			[DataMember]
			public List<PlanOfCareService> PlanOfCareServiceCollection { get; set; }

			[DataMember]
			public List<PlanOfCareActivity> PlanOfCareActivityCollection { get; set; }

			[DataMember]
			public List<ScheduleEvent> ScheduleEventCollection { get; set; }

			[DataMember]
			public List<PlanOfCareTaskList> PlanOfCareTaskListCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long PlanOfCareSK { get; set; }

			[DataMember(IsRequired = true)]
			public String PlanOfCareID { get; set; }

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

			[DataMember(IsRequired = true)]
			public bool CurrentRecordIndicator { get; set; }

			[DataMember(IsRequired = true)]
			public long ChangeVersionID { get; set; }

			[DataMember(IsRequired = true)]
			public String BusinessEntityID { get; set; }

			[DataMember(IsRequired = true)]
			public String PatientID { get; set; }

			[DataMember]
			public String AuthorizationID { get; set; }

			[DataMember]
			public long? FrequencyTypeLookupSK { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> PlanOfCareStartDate { get; set; }

			[DataMember(Name = "PlanOfCareStartDate")]
			public string PlanOfCareStartDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(PlanOfCareStartDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						PlanOfCareStartDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> PlanOfCareEndDate { get; set; }

			[DataMember(Name = "PlanOfCareEndDate")]
			public string PlanOfCareEndDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(PlanOfCareEndDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						PlanOfCareEndDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public bool? PlanOfTreatmentIndicator { get; set; }

			[DataMember]
			public decimal? PlanOfCareDaysPerWeek { get; set; }

			[DataMember]
			public bool? PlanOfCareDay1Indicator { get; set; }

			[DataMember]
			public bool? PlanOfCareDay2Indicator { get; set; }

			[DataMember]
			public bool? PlanOfCareDay3Indicator { get; set; }

			[DataMember]
			public bool? PlanOfCareDay4Indicator { get; set; }

			[DataMember]
			public bool? PlanOfCareDay5Indicator { get; set; }

			[DataMember]
			public bool? PlanOfCareDay6Indicator { get; set; }

			[DataMember]
			public bool? PlanOfCareDay7Indicator { get; set; }

			[DataMember]
			public decimal? PlanOfCareHoursPerDay { get; set; }


	}
}