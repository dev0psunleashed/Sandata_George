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
 * Reference table for storing the unique list of services within the system
 * 
 * <p>Java class for Business_Entity_Healthcare_Professional_Lookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Business_Entity_Healthcare_Professional_Lookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accounts_Receivable" type="{}Accounts_Receivable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Invoice" type="{}Invoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Billing" type="{}Billing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Invoice_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Referral" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Claim" type="{}Claim" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Patient_Healthcare_Professional" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Billing_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Business_Entity_Healthcare_Professional_Lookup_SK" use="required" type="{}Surrogate_Key" />
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
 *       &lt;attribute name="Healthcare_Professional_First_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Healthcare_Professional_Last_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Healthcare_Professional_Specialty_Qualifier">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Healthcare_Professional_Phone" type="{}Phone" />
 *       &lt;attribute name="Healthcare_Professional_Phone_Extension" type="{}Phone_Extension" />
 *       &lt;attribute name="Healthcare_Professional_Fax" type="{}Phone" />
 *       &lt;attribute name="Healthcare_Professional_Address_Line_1" type="{}Address_Line" />
 *       &lt;attribute name="Healthcare_Professional_Address_Line_2" type="{}Address_Line" />
 *       &lt;attribute name="Healthcare_Professional_City" type="{}City" />
 *       &lt;attribute name="Healthcare_Professional_State" type="{}State_Name" />
 *       &lt;attribute name="Healthcare_Professional_Postal_Code" type="{}Postal_Code" />
 *       &lt;attribute name="Healthcare_Professional_Zip4">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Healthcare_Professional_Email_Address" type="{}Email" />
 *       &lt;attribute name="Healthcare_Professional_Atypical_Provider_Identifier" type="{}Atypical_Provider_Identifier" />
 *       &lt;attribute name="Healthcare_Professional_National_Provider_Identifier" use="required" type="{}National_Provider_Identifier" />
 *       &lt;attribute name="Healthcare_Professional_Taxpayer_Identification_Number" type="{}Taxpayer_Identification_Number" />
 *       &lt;attribute name="Healthcare_Professional_Taxpayer_Identification_Number_Qualifier" type="{}Taxpayer_Identification_Number_Qualifier" />
 *       &lt;attribute name="Healthcare_Professional_License_Number" type="{}ID" />
 *       &lt;attribute name="Healthcare_Professional_Effective_Date" type="{}Attribute_Effective_Date" />
 *       &lt;attribute name="Healthcare_Professional_Termination_Date" type="{}Attribute_Termination_Date" />
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
	public class BusinessEntityHealthcareProfessionalLookup
	{

			[DataMember]
			public List<AccountsReceivable> AccountsReceivableCollection { get; set; }

			[DataMember]
			public List<Invoice> InvoiceCollection { get; set; }

			[DataMember]
			public List<Billing> BillingCollection { get; set; }

			[DataMember]
			public List<InvoiceDetail> InvoiceDetailCollection { get; set; }

			[DataMember]
			public List<Referral> ReferralCollection { get; set; }

			[DataMember]
			public List<Claim> ClaimCollection { get; set; }

			[DataMember]
			public List<PatientHealthcareProfessional> PatientHealthcareProfessionalCollection { get; set; }

			[DataMember]
			public List<BillingDetail> BillingDetailCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long BusinessEntityHealthcareProfessionalLookupSK { get; set; }

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
			public String HealthcareProfessionalFirstName { get; set; }

			[DataMember]
			public String HealthcareProfessionalLastName { get; set; }

			[DataMember]
			public String HealthcareProfessionalSpecialtyQualifier { get; set; }

			[DataMember]
			public String HealthcareProfessionalPhone { get; set; }

			[DataMember]
			public String HealthcareProfessionalPhoneExtension { get; set; }

			[DataMember]
			public String HealthcareProfessionalFax { get; set; }

			[DataMember]
			public String HealthcareProfessionalAddressLine1 { get; set; }

			[DataMember]
			public String HealthcareProfessionalAddressLine2 { get; set; }

			[DataMember]
			public String HealthcareProfessionalCity { get; set; }

			[DataMember]
			public String HealthcareProfessionalState { get; set; }

			[DataMember]
			public String HealthcareProfessionalPostalCode { get; set; }

			[DataMember]
			public String HealthcareProfessionalZip4 { get; set; }

			[DataMember]
			public String HealthcareProfessionalEmailAddress { get; set; }

			[DataMember]
			public String HealthcareProfessionalAtypicalProviderIdentifier { get; set; }

			[DataMember(IsRequired = true)]
			public String HealthcareProfessionalNationalProviderIdentifier { get; set; }

			[DataMember]
			public String HealthcareProfessionalTaxpayerIdentificationNumber { get; set; }

			[DataMember]
			public TaxpayerIdentificationNumberQualifier HealthcareProfessionalTaxpayerIdentificationNumberQualifier { get; set; }

			[DataMember]
			public String HealthcareProfessionalLicenseNumber { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> HealthcareProfessionalEffectiveDate { get; set; }

			[DataMember(Name = "HealthcareProfessionalEffectiveDate")]
			public string HealthcareProfessionalEffectiveDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(HealthcareProfessionalEffectiveDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						HealthcareProfessionalEffectiveDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[IgnoreDataMember]
			public Nullable<DateTime> HealthcareProfessionalTerminationDate { get; set; }

			[DataMember(Name = "HealthcareProfessionalTerminationDate")]
			public string HealthcareProfessionalTerminationDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(HealthcareProfessionalTerminationDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						HealthcareProfessionalTerminationDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}


	}
}