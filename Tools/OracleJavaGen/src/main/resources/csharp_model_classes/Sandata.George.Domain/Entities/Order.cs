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
 * Authorization for services to be rendered from the payer. 
 * Triggered when an actual insurance carrier is selected. 
 * If it is Private Pay no authorization is required.
 * 
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Order_Service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Order" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Authorization" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Order_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Order_Parent_SK" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Patient_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Payer_ID" type="{}ID" />
 *       &lt;attribute name="Order_Issued_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Order_Start_Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Order_End_Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Order_Comment" type="{}Comment_Long" />
 *       &lt;attribute name="Order_Limit_Type_Name" type="{}Authorization_Limit_Type_Name" />
 *       &lt;attribute name="Order_Service_Unit_Name" use="required" type="{}Authorization_Service_Unit_Name" />
 *       &lt;attribute name="Order_Limit" type="{}Authorization_Limit" />
 *       &lt;attribute name="Order_Limit_Total" type="{}Authorization_Limit" />
 *       &lt;attribute name="Order_Limit_Day_1" type="{}Authorization_Limit" />
 *       &lt;attribute name="Order_Limit_Start_Time_Day_1" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_End_Time_Day_1" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_Day_2" type="{}Authorization_Limit" />
 *       &lt;attribute name="Order_Limit_Start_Time_Day_2" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_End_Time_Day_2" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_Day_3" type="{}Authorization_Limit" />
 *       &lt;attribute name="Order_Limit_Start_Time_Day_3" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_End_Time_Day_3" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_Day_4" type="{}Authorization_Limit" />
 *       &lt;attribute name="Order_Limit_Start_Time_Day_4" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_End_Time_Day_4" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_Day_5" type="{}Authorization_Limit" />
 *       &lt;attribute name="Order_Limit_Start_Time_Day_5" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_End_Time_Day_5" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_Day_6" type="{}Authorization_Limit" />
 *       &lt;attribute name="Order_Limit_Start_Time_Day_6" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_End_Time_Day_6" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_Day_7" type="{}Authorization_Limit" />
 *       &lt;attribute name="Order_Limit_Start_Time_Day_7" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Order_Limit_End_Time_Day_7" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Contract_ID" type="{}ID" />
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
	public class Order
	{

			[DataMember]
			public List<OrderService> OrderServiceCollection { get; set; }

			[DataMember]
			public List<Order> OrderPropertyCollection { get; set; }

			[DataMember]
			public List<Authorization> AuthorizationCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long OrderSK { get; set; }

			[DataMember]
			public long? OrderParentSK { get; set; }

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
			public String PatientID { get; set; }

			[DataMember]
			public String PayerID { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> OrderIssuedDate { get; set; }

			[DataMember(Name = "OrderIssuedDate")]
			public string OrderIssuedDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderIssuedDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderIssuedDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> OrderStartTimestamp { get; set; }

			[DataMember(Name = "OrderStartTimestamp")]
			public string OrderStartTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderStartTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderStartTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> OrderEndTimestamp { get; set; }

			[DataMember(Name = "OrderEndTimestamp")]
			public string OrderEndTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderEndTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderEndTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public String OrderComment { get; set; }

			[DataMember]
			public AuthorizationLimitTypeName OrderLimitTypeName { get; set; }

			[DataMember(IsRequired = true)]
			public AuthorizationServiceUnitName OrderServiceUnitName { get; set; }

			[DataMember]
			public decimal? OrderLimit { get; set; }

			[DataMember]
			public decimal? OrderLimitTotal { get; set; }

			[DataMember]
			public decimal? OrderLimitDay1 { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitStartTimeDay1 { get; set; }

			[DataMember(Name = "OrderLimitStartTimeDay1")]
			public string OrderLimitStartTimeDay1Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitStartTimeDay1);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitStartTimeDay1 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitEndTimeDay1 { get; set; }

			[DataMember(Name = "OrderLimitEndTimeDay1")]
			public string OrderLimitEndTimeDay1Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitEndTimeDay1);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitEndTimeDay1 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public decimal? OrderLimitDay2 { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitStartTimeDay2 { get; set; }

			[DataMember(Name = "OrderLimitStartTimeDay2")]
			public string OrderLimitStartTimeDay2Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitStartTimeDay2);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitStartTimeDay2 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitEndTimeDay2 { get; set; }

			[DataMember(Name = "OrderLimitEndTimeDay2")]
			public string OrderLimitEndTimeDay2Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitEndTimeDay2);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitEndTimeDay2 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public decimal? OrderLimitDay3 { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitStartTimeDay3 { get; set; }

			[DataMember(Name = "OrderLimitStartTimeDay3")]
			public string OrderLimitStartTimeDay3Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitStartTimeDay3);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitStartTimeDay3 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitEndTimeDay3 { get; set; }

			[DataMember(Name = "OrderLimitEndTimeDay3")]
			public string OrderLimitEndTimeDay3Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitEndTimeDay3);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitEndTimeDay3 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public decimal? OrderLimitDay4 { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitStartTimeDay4 { get; set; }

			[DataMember(Name = "OrderLimitStartTimeDay4")]
			public string OrderLimitStartTimeDay4Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitStartTimeDay4);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitStartTimeDay4 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitEndTimeDay4 { get; set; }

			[DataMember(Name = "OrderLimitEndTimeDay4")]
			public string OrderLimitEndTimeDay4Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitEndTimeDay4);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitEndTimeDay4 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public decimal? OrderLimitDay5 { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitStartTimeDay5 { get; set; }

			[DataMember(Name = "OrderLimitStartTimeDay5")]
			public string OrderLimitStartTimeDay5Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitStartTimeDay5);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitStartTimeDay5 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitEndTimeDay5 { get; set; }

			[DataMember(Name = "OrderLimitEndTimeDay5")]
			public string OrderLimitEndTimeDay5Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitEndTimeDay5);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitEndTimeDay5 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public decimal? OrderLimitDay6 { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitStartTimeDay6 { get; set; }

			[DataMember(Name = "OrderLimitStartTimeDay6")]
			public string OrderLimitStartTimeDay6Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitStartTimeDay6);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitStartTimeDay6 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitEndTimeDay6 { get; set; }

			[DataMember(Name = "OrderLimitEndTimeDay6")]
			public string OrderLimitEndTimeDay6Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitEndTimeDay6);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitEndTimeDay6 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public decimal? OrderLimitDay7 { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitStartTimeDay7 { get; set; }

			[DataMember(Name = "OrderLimitStartTimeDay7")]
			public string OrderLimitStartTimeDay7Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitStartTimeDay7);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitStartTimeDay7 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> OrderLimitEndTimeDay7 { get; set; }

			[DataMember(Name = "OrderLimitEndTimeDay7")]
			public string OrderLimitEndTimeDay7Str
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(OrderLimitEndTimeDay7);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						OrderLimitEndTimeDay7 = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public String ContractID { get; set; }


	}
}
