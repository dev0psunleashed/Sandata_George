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
 * Stores the unique list of disaster levels as defined by the individual Business Entity.
 * Every Business Entity has its own way of coding the Disaster Level
 * 
 * <p>Java class for Business_Entity_Evacuation_Level_Lookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Business_Entity_Evacuation_Level_Lookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Business_Entity_Evacuation_Level_Lookup_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Evacuation_Level_Code">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *             &lt;enumeration value="5"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Evacuation_Level_Description" type="{}Description_Short" />
 *       &lt;attribute name="Evacuation_Level_Effective_Date" type="{}Attribute_Effective_Date" />
 *       &lt;attribute name="Evacuation_Level_Termination_Date" type="{}Attribute_Termination_Date" />
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
	public class BusinessEntityEvacuationLevelLookup
	{

			[DataMember(IsRequired = true)]
			public long BusinessEntityEvacuationLevelLookupSK { get; set; }

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
			public String EvacuationLevelCode { get; set; }

			[DataMember]
			public String EvacuationLevelDescription { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> EvacuationLevelEffectiveDate { get; set; }

			[DataMember(Name = "EvacuationLevelEffectiveDate")]
			public string EvacuationLevelEffectiveDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(EvacuationLevelEffectiveDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						EvacuationLevelEffectiveDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> EvacuationLevelTerminationDate { get; set; }

			[DataMember(Name = "EvacuationLevelTerminationDate")]
			public string EvacuationLevelTerminationDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(EvacuationLevelTerminationDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						EvacuationLevelTerminationDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}


	}
}
