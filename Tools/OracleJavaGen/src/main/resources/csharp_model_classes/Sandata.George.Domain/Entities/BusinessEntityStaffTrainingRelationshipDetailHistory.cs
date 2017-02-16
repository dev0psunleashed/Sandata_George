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
 * <p>Java class for Business_Entity_Staff_Training_Relationship_Detail_History complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Business_Entity_Staff_Training_Relationship_Detail_History">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Business_Entity_Staff_Training_Relationship_Detail_History_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp_History" use="required" type="{}Record_Create_Timestamp_History" />
 *       &lt;attribute name="Action_Code" use="required" type="{}Action_Code" />
 *       &lt;attribute name="Business_Entity_Staff_Training_Relationship_Detail_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Business_Entity_Staff_Training_Relationship_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Staff_Training_Result_Value" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Staff_Training_Compliant_Indicator" use="required" type="{}Indicator" />
 *       &lt;attribute name="Staff_Training_Schedule_Permission_Qualifier" use="required" type="{}Schedule_Permission_Qualifier" />
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
	public class BusinessEntityStaffTrainingRelationshipDetailHistory
	{

			[DataMember(IsRequired = true)]
			public long BusinessEntityStaffTrainingRelationshipDetailHistorySK { get; set; }

			[IgnoreDataMember]
			public DateTime RecordCreateTimestampHistory { get; set; }

			[DataMember(Name = "RecordCreateTimestampHistory", IsRequired = true)]
			public string RecordCreateTimestampHistoryStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(RecordCreateTimestampHistory);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						RecordCreateTimestampHistory = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember(IsRequired = true)]
			public ActionCode ActionCode { get; set; }

			[DataMember(IsRequired = true)]
			public long BusinessEntityStaffTrainingRelationshipDetailSK { get; set; }

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
			public String ChangeReasonMemo { get; set; }

			[DataMember(IsRequired = true)]
			public long ChangeVersionID { get; set; }

			[DataMember(IsRequired = true)]
			public String BusinessEntityID { get; set; }

			[DataMember(IsRequired = true)]
			public long BusinessEntityStaffTrainingRelationshipSK { get; set; }

			[DataMember(IsRequired = true)]
			public String StaffTrainingResultValue { get; set; }

			[DataMember(IsRequired = true)]
			public bool StaffTrainingCompliantIndicator { get; set; }

			[DataMember(IsRequired = true)]
			public SchedulePermissionQualifier StaffTrainingSchedulePermissionQualifier { get; set; }


	}
}