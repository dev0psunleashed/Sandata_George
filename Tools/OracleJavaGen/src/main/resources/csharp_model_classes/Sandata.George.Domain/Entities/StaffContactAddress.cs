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
 * Master Rate Crosswalk
 * 
 * <p>Java class for Staff_Contact_Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Staff_Contact_Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Staff_Contact_Phone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Staff_Contact_Address_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Staff_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Address_Priority_Name" use="required" type="{}Address_Priority_Name" />
 *       &lt;attribute name="Staff_Address_Type_Name" type="{}Address_Type_Name" />
 *       &lt;attribute name="Staff_Address_Use_For_Mail_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Staff_Address_Line_1" type="{}Address_Line" />
 *       &lt;attribute name="Staff_Address_Line_2" type="{}Address_Line" />
 *       &lt;attribute name="Staff_Apartment_Number" type="{}Apartment_Number" />
 *       &lt;attribute name="Staff_City" type="{}City" />
 *       &lt;attribute name="Staff_State" type="{}State_Code" />
 *       &lt;attribute name="Staff_Postal_Code" type="{}Postal_Code" />
 *       &lt;attribute name="Staff_Zip4" type="{}Zip4" />
 *       &lt;attribute name="Staff_County">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Staff_Region">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Staff_Borough">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Staff_Coordinate_Latitude" type="{}Coordinate_Latitude" />
 *       &lt;attribute name="Staff_Coordinate_Longitude" type="{}Coordinate_Longitide" />
 *       &lt;attribute name="Staff_Coordinate_Altitude" type="{}Coordinate_Altitude" />
 *       &lt;attribute name="Staff_Coordinate_Timestamp" type="{}Coordinate_Timestamp" />
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
	public class StaffContactAddress
	{

			[DataMember]
			public List<StaffContactPhone> StaffContactPhoneCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long StaffContactAddressSK { get; set; }

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

			[DataMember(IsRequired = true)]
			public bool CurrentRecordIndicator { get; set; }

			[DataMember]
			public String ChangeReasonMemo { get; set; }

			[DataMember(IsRequired = true)]
			public long ChangeVersionID { get; set; }

			[DataMember(IsRequired = true)]
			public String BusinessEntityID { get; set; }

			[DataMember(IsRequired = true)]
			public String StaffID { get; set; }

			[DataMember(IsRequired = true)]
			public AddressPriorityName AddressPriorityName { get; set; }

			[DataMember]
			public AddressTypeName StaffAddressTypeName { get; set; }

			[DataMember]
			public bool? StaffAddressUseForMailIndicator { get; set; }

			[DataMember]
			public String StaffAddressLine1 { get; set; }

			[DataMember]
			public String StaffAddressLine2 { get; set; }

			[DataMember]
			public String StaffApartmentNumber { get; set; }

			[DataMember]
			public String StaffCity { get; set; }

			[DataMember]
			public StateCode StaffState { get; set; }

			[DataMember]
			public String StaffPostalCode { get; set; }

			[DataMember]
			public String StaffZip4 { get; set; }

			[DataMember]
			public String StaffCounty { get; set; }

			[DataMember]
			public String StaffRegion { get; set; }

			[DataMember]
			public String StaffBorough { get; set; }

			[DataMember]
			public decimal? StaffCoordinateLatitude { get; set; }

			[DataMember]
			public decimal? StaffCoordinateLongitude { get; set; }

			[DataMember]
			public decimal? StaffCoordinateAltitude { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> StaffCoordinateTimestamp { get; set; }

			[DataMember(Name = "StaffCoordinateTimestamp")]
			public string StaffCoordinateTimestampStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(StaffCoordinateTimestamp);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						StaffCoordinateTimestamp = DateTimeHelper.ToDateTime(value);
					}
				}
			}


	}
}
