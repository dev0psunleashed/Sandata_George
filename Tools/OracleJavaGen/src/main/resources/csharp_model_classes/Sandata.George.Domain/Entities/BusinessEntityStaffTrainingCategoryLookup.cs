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
 * A reference table used to define the unique list of Staff Training Type values for use within the system.  Used to group Staff Trainings into different categories.
 * 
 * State approved education or training program means a program that provides education or training for persons to meet any requirement established by the Department for providing home health aide services or personal care services, which program is approved by the Department or the New York State Education Department. (NY State Dept of Health)
 * 
 * <p>Java class for Business_Entity_Staff_Training_Category_Lookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Business_Entity_Staff_Training_Category_Lookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Staff_Training_Category_Service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Staff_Training_Category_List" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Business_Entity_Staff_Training_Category_Lookup_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Staff_Training_Category_Code" use="required" type="{}Code" />
 *       &lt;attribute name="Staff_Training_Category_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Staff_Training_Category_Description" type="{}Description_Short" />
 *       &lt;attribute name="Staff_Training_Category_Required_Hours" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="6"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Staff_Training_Category_Recurring_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Staff_Training_Category_Required_By_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Staff_Training_Category_Recurring_Frequency" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Staff_Training_Category_Recurring_Frequency_Unit_of_Measure">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Staff_Training_Category_Required_From_Qualifier" type="{}Staff_Item_Required_From_Qualifier" />
 *       &lt;attribute name="Non_Compliance_Alert_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Non_Compliance_Alert_Threshold" type="{}Non_Compliance_Alert_Threshold" />
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
	public class BusinessEntityStaffTrainingCategoryLookup
	{

			[DataMember]
			public List<StaffTrainingCategoryService> StaffTrainingCategoryServiceCollection { get; set; }

			[DataMember]
			public List<BusinessEntityStaffTrainingCategoryList> BusinessEntityStaffTrainingCategoryListCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long BusinessEntityStaffTrainingCategoryLookupSK { get; set; }

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
			public String StaffTrainingCategoryCode { get; set; }

			[DataMember]
			public String StaffTrainingCategoryName { get; set; }

			[DataMember]
			public String StaffTrainingCategoryDescription { get; set; }

			[DataMember(IsRequired = true)]
			public decimal StaffTrainingCategoryRequiredHours { get; set; }

			[DataMember]
			public bool? StaffTrainingCategoryRecurringIndicator { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> StaffTrainingCategoryRequiredByDate { get; set; }

			[DataMember(Name = "StaffTrainingCategoryRequiredByDate")]
			public string StaffTrainingCategoryRequiredByDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(StaffTrainingCategoryRequiredByDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						StaffTrainingCategoryRequiredByDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public long? StaffTrainingCategoryRecurringFrequency { get; set; }

			[DataMember]
			public String StaffTrainingCategoryRecurringFrequencyUnitofMeasure { get; set; }

			[DataMember]
			public StaffItemRequiredFromQualifier StaffTrainingCategoryRequiredFromQualifier { get; set; }

			[DataMember]
			public bool? NonComplianceAlertIndicator { get; set; }

			[DataMember]
			public long? NonComplianceAlertThreshold { get; set; }

			[DataMember(IsRequired = true)]
			public SchedulePermissionQualifier StaffTrainingSchedulePermissionQualifier { get; set; }


	}
}
