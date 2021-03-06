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
 * Information identifying the availability of a staff member for scheduling
 * 
 * <p>Java class for Staff_Availability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Staff_Availability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Staff_Availability_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Staff_Availability_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Staff_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Staff_Is_Available_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Availability_Day">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Availability_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Availability_Start_Hour" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="Availability_End_Hour" type="{http://www.w3.org/2001/XMLSchema}time" />
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
	public class StaffAvailability
	{

			[DataMember(IsRequired = true)]
			public long StaffAvailabilitySK { get; set; }

			[DataMember(IsRequired = true)]
			public String StaffAvailabilityID { get; set; }

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

			[DataMember(IsRequired = true)]
			public String BusinessEntityID { get; set; }

			[DataMember(IsRequired = true)]
			public String StaffID { get; set; }

			[DataMember]
			public bool? StaffIsAvailableIndicator { get; set; }

			[DataMember]
			public String AvailabilityDay { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> AvailabilityDate { get; set; }

			[DataMember(Name = "AvailabilityDate")]
			public string AvailabilityDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(AvailabilityDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						AvailabilityDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> AvailabilityStartHour { get; set; }

			[DataMember(Name = "AvailabilityStartHour")]
			public string AvailabilityStartHourStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(AvailabilityStartHour);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						AvailabilityStartHour = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> AvailabilityEndHour { get; set; }

			[DataMember(Name = "AvailabilityEndHour")]
			public string AvailabilityEndHourStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(AvailabilityEndHour);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						AvailabilityEndHour = DateTimeHelper.ToDateTime(value);
					}
				}
			}


	}
}
