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
 * Demographic and primary contact information about business entities (Business Entity's, Companies, Branches, etc) involved in providing home health care services
 * 
 * <p>Java class for Business_Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Business_Entity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Staff_Training_Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Medical_Examination_Item_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Compliance_Relationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Interface" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Billing_Rate_Matrix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Payroll_Rate_Matrix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Administrative_Staff_Role_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Holiday_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Exception_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Patient_Intake" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Referral" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Role" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Level" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Credential" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Task" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Payer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Contact_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Electronic_Funds_Transfer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Provider" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Document_Classification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Visit_Document_Crosswalk" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Payer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Claim" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Nutritional_Requirement_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Accounts_Receivable_Document_Crosswalk" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Durable_Medical_Equipment_And_Supply_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_ID_Crosswalk" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Document_Crosswalk" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Event" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Patient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Rate_Type_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Employment_Class_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Safety_Measure_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Evacuation_Level_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Race_Ethnicity_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Business_Entity_Relationship" type="{}Business_Entity_Relationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Religion_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Language_List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Allergy_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Patient_Priority_Level_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Referral_Type_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Healthcare_Professional_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Modifier_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Service" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Authorization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Payroll_Output" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Timesheet_Summary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Invoice" type="{}Invoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Administrative_Staff" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Billing_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Business_Entity_Line_of_Business_Lookup" type="{}Business_Entity_Line_of_Business_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Patient_Requirement_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Medication_Route_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Patient_Note_Type_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Payer_Type_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Type_Of_Care_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Staff_Referral_Type_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Skill_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Reference_Format_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Staff_Working_Preference_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Reference_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Staff" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Change_Reason_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Medication_Dosage_Strength_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Staff_Type_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Calendar_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Staff_Note_Type_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Medication_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Tax_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Medication_Dosage_Frequency_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Medication_Classification_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Staff_Payroll_Type_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Compliance_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Visit_Note_Type_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Day_Of_Week_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Payroll_Code_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract" type="{}Contract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Business_Entity_Rate" type="{}Business_Entity_Rate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Billing" type="{}Billing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Accounts_Receivable_Transaction_Batch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Staff_Training_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Business_Entity_Staff_Training_Category_Lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Billing_Rate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Plan_Of_Care" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Business_Entity_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Timezone_Name" type="{}Timezone_Name" />
 *       &lt;attribute name="Business_Entity_Logo_Pointer">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Business_Entity_Name" type="{}Organization_Name" />
 *       &lt;attribute name="Business_Entity_Legal_Name" type="{}Organization_Name" />
 *       &lt;attribute name="Business_Entity_FederalTax_Identifier" type="{}ID" />
 *       &lt;attribute name="Business_Entity_Medicare_Identifier" type="{}ID" />
 *       &lt;attribute name="Business_Entity_Medicaid_Identifier" type="{}ID" />
 *       &lt;attribute name="OASIS_Identifier" type="{}ID" />
 *       &lt;attribute name="Business_Entity_National_Provider_Identifier" type="{}National_Provider_Identifier" />
 *       &lt;attribute name="Business_Entity_Atypical_Provider_Identifier" type="{}Atypical_Provider_Identifier" />
 *       &lt;attribute name="Business_Entity_Taxonomy_Code" type="{}Taxonomy_Code" />
 *       &lt;attribute name="Business_Entity_Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Business_Entity_Primary_Contact_Name" type="{}Name" />
 *       &lt;attribute name="Business_Entity_Primary_Contact_Title" type="{}Organizational_Contact_Title" />
 *       &lt;attribute name="Business_Entity_Primary_Address_Use_For_Mail_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Business_Entity_Primary_Address_Line_1" type="{}Address_Line" />
 *       &lt;attribute name="Business_Entity_Primary_Address_Line_2" type="{}Address_Line" />
 *       &lt;attribute name="Business_Entity_Primary_City" type="{}City" />
 *       &lt;attribute name="Business_Entity_Primary_State" type="{}State_Code" />
 *       &lt;attribute name="Business_Entity_Primary_County">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Business_Entity_Primary_Postal_Code" type="{}Postal_Code" />
 *       &lt;attribute name="Business_Entity_Primary_Zip4" type="{}Zip4" />
 *       &lt;attribute name="Business_Entity_Primary_Phone" type="{}Phone" />
 *       &lt;attribute name="Business_Entity_Primary_Phone_Extension" type="{}Phone_Extension" />
 *       &lt;attribute name="Business_Entity_Primary_Phone_Qualifier" type="{}Phone_Qualifier" />
 *       &lt;attribute name="Business_Entity_Primary_Phone_1" type="{}Phone" />
 *       &lt;attribute name="Business_Entity_Primary_Phone_1_Extension" type="{}Phone_Extension" />
 *       &lt;attribute name="Business_Entity_Primary_Phone_1_Qualifier" type="{}Phone_Qualifier" />
 *       &lt;attribute name="Business_Entity_Primary_Phone_2" type="{}Phone" />
 *       &lt;attribute name="Business_Entity_Primary_Phone_2_Extension" type="{}Phone_Extension" />
 *       &lt;attribute name="Business_Entity_Primary_Phone_2_Qualifier" type="{}Phone_Qualifier" />
 *       &lt;attribute name="Business_Entity_Fax" type="{}Phone" />
 *       &lt;attribute name="Business_Entity_Fax_Qualifier" type="{}Fax_Qualifier" />
 *       &lt;attribute name="Business_Entity_Fax_1" type="{}Phone" />
 *       &lt;attribute name="Business_Entity_Fax_1_Qualifier" type="{}Fax_Qualifier" />
 *       &lt;attribute name="Business_Entity_Primary_Email" type="{}Email" />
 *       &lt;attribute name="Business_Entity_Payroll_Week_End_Day" type="{}Week_End_Day" />
 *       &lt;attribute name="Business_Entity_Hold_Billing_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Business_Entity_Split_Billing_Allowed_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Business_Entity_Include_Remit_Address_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Business_Entity_Weekend_Start_Day" type="{}Weekend_Start_Day" />
 *       &lt;attribute name="Business_Entity_Weekend_Start_Time">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Business_Entity_Weekend_End_Day" type="{}Weekend_End_Day" />
 *       &lt;attribute name="Business_Entity_Weekend_End_Time">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Business_Entity_Patient_Assessment_Frequency" type="{}Patient_Assessment_Frequency" />
 *       &lt;attribute name="Business_Entity_Patient_Supervisory_Visit_Frequency" type="{}Patient_Supervisory_Visit_Frequency" />
 *       &lt;attribute name="Business_Entity_Payroll_Frequency_Type_Name" type="{}Payroll_Frequency_Type_Name" />
 *       &lt;attribute name="Business_Entity_Billing_Frequency_Type_Name" type="{}Billing_Frequency_Type_Name" />
 *       &lt;attribute name="Business_Entity_Live_In_Equivalence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Business_Entity_First_Payroll_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Business_Entity_Payroll_Start_Day" type="{}Payroll_Start_Day" />
 *       &lt;attribute name="Visit_Verification_Rounding_Rule_ID" type="{}Visit_Verification_Rounding_Rule_ID" />
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
	public class BusinessEntity
	{

			[DataMember]
			public List<StaffTrainingLocation> StaffTrainingLocationCollection { get; set; }

			[DataMember]
			public List<BusinessEntityMedicalExaminationItemLookup> BusinessEntityMedicalExaminationItemLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityComplianceRelationship> BusinessEntityComplianceRelationshipCollection { get; set; }

			[DataMember]
			public List<BusinessEntityInterface> BusinessEntityInterfaceCollection { get; set; }

			[DataMember]
			public List<BillingRateMatrix> BillingRateMatrixCollection { get; set; }

			[DataMember]
			public List<PayrollRateMatrix> PayrollRateMatrixCollection { get; set; }

			[DataMember]
			public List<BusinessEntityAdministrativeStaffRoleLookup> BusinessEntityAdministrativeStaffRoleLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityHolidayLookup> BusinessEntityHolidayLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityExceptionList> BusinessEntityExceptionListCollection { get; set; }

			[DataMember]
			public List<PatientIntake> PatientIntakeCollection { get; set; }

			[DataMember]
			public List<Referral> ReferralCollection { get; set; }

			[DataMember]
			public List<BusinessEntityRole> BusinessEntityRoleCollection { get; set; }

			[DataMember]
			public List<BusinessEntityLevel> BusinessEntityLevelCollection { get; set; }

			[DataMember]
			public List<BusinessEntityCredential> BusinessEntityCredentialCollection { get; set; }

			[DataMember]
			public List<Task> TaskCollection { get; set; }

			[DataMember]
			public List<BusinessEntityPayer> BusinessEntityPayerCollection { get; set; }

			[DataMember]
			public List<BusinessEntityContactDetail> BusinessEntityContactDetailCollection { get; set; }

			[DataMember]
			public List<Activity> ActivityCollection { get; set; }

			[DataMember]
			public List<BusinessEntityElectronicFundsTransfer> BusinessEntityElectronicFundsTransferCollection { get; set; }

			[DataMember]
			public List<Provider> ProviderCollection { get; set; }

			[DataMember]
			public List<BusinessEntityDocumentClassification> BusinessEntityDocumentClassificationCollection { get; set; }

			[DataMember]
			public List<VisitDocumentCrosswalk> VisitDocumentCrosswalkCollection { get; set; }

			[DataMember]
			public List<Payer> PayerCollection { get; set; }

			[DataMember]
			public List<Claim> ClaimCollection { get; set; }

			[DataMember]
			public List<BusinessEntityNutritionalRequirementLookup> BusinessEntityNutritionalRequirementLookupCollection { get; set; }

			[DataMember]
			public List<AccountsReceivableDocumentCrosswalk> AccountsReceivableDocumentCrosswalkCollection { get; set; }

			[DataMember]
			public List<BusinessEntityDurableMedicalEquipmentAndSupplyLookup> BusinessEntityDurableMedicalEquipmentAndSupplyLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityIDCrosswalk> BusinessEntityIDCrosswalkCollection { get; set; }

			[DataMember]
			public List<BusinessEntityDocumentCrosswalk> BusinessEntityDocumentCrosswalkCollection { get; set; }

			[DataMember]
			public List<ScheduleEvent> ScheduleEventCollection { get; set; }

			[DataMember]
			public List<Patient> PatientCollection { get; set; }

			[DataMember]
			public List<BusinessEntityRateTypeLookup> BusinessEntityRateTypeLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityEmploymentClassLookup> BusinessEntityEmploymentClassLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntitySafetyMeasureLookup> BusinessEntitySafetyMeasureLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityEvacuationLevelLookup> BusinessEntityEvacuationLevelLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityRaceEthnicityList> BusinessEntityRaceEthnicityListCollection { get; set; }

			[DataMember]
			public List<BusinessEntityRelationship> BusinessEntityRelationshipCollection { get; set; }

			[DataMember]
			public List<BusinessEntityReligionList> BusinessEntityReligionListCollection { get; set; }

			[DataMember]
			public List<BusinessEntityLanguageList> BusinessEntityLanguageListCollection { get; set; }

			[DataMember]
			public List<BusinessEntityAllergyLookup> BusinessEntityAllergyLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityPatientPriorityLevelLookup> BusinessEntityPatientPriorityLevelLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityReferralTypeLookup> BusinessEntityReferralTypeLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityHealthcareProfessionalLookup> BusinessEntityHealthcareProfessionalLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityModifierLookup> BusinessEntityModifierLookupCollection { get; set; }

			[DataMember]
			public List<Service> ServiceCollection { get; set; }

			[DataMember]
			public List<Authorization> AuthorizationCollection { get; set; }

			[DataMember]
			public List<PayrollOutput> PayrollOutputCollection { get; set; }

			[DataMember]
			public List<TimesheetSummary> TimesheetSummaryCollection { get; set; }

			[DataMember]
			public List<Invoice> InvoiceCollection { get; set; }

			[DataMember]
			public List<AdministrativeStaff> AdministrativeStaffCollection { get; set; }

			[DataMember]
			public List<BillingDetail> BillingDetailCollection { get; set; }

			[DataMember]
			public List<BusinessEntityLineOfBusinessLookup> BusinessEntityLineofBusinessLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityPatientRequirementLookup> BusinessEntityPatientRequirementLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityMedicationRouteLookup> BusinessEntityMedicationRouteLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityPatientNoteTypeLookup> BusinessEntityPatientNoteTypeLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityPayerTypeLookup> BusinessEntityPayerTypeLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityTypeOfCareLookup> BusinessEntityTypeOfCareLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityStaffReferralTypeLookup> BusinessEntityStaffReferralTypeLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntitySkillLookup> BusinessEntitySkillLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityReferenceFormatLookup> BusinessEntityReferenceFormatLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityStaffWorkingPreferenceLookup> BusinessEntityStaffWorkingPreferenceLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityReferenceLookup> BusinessEntityReferenceLookupCollection { get; set; }

			[DataMember]
			public List<Staff> StaffCollection { get; set; }

			[DataMember]
			public List<BusinessEntityChangeReasonLookup> BusinessEntityChangeReasonLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityMedicationDosageStrengthLookup> BusinessEntityMedicationDosageStrengthLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityStaffTypeLookup> BusinessEntityStaffTypeLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityCalendarLookup> BusinessEntityCalendarLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityStaffNoteTypeLookup> BusinessEntityStaffNoteTypeLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityMedicationLookup> BusinessEntityMedicationLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityTaxLookup> BusinessEntityTaxLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityMedicationDosageFrequencyLookup> BusinessEntityMedicationDosageFrequencyLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityMedicationClassificationLookup> BusinessEntityMedicationClassificationLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityStaffPayrollTypeLookup> BusinessEntityStaffPayrollTypeLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityComplianceLookup> BusinessEntityComplianceLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityVisitNoteTypeLookup> BusinessEntityVisitNoteTypeLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityDayOfWeekLookup> BusinessEntityDayOfWeekLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityPayrollCodeLookup> BusinessEntityPayrollCodeLookupCollection { get; set; }

			[DataMember]
			public List<Contract> ContractCollection { get; set; }

			[DataMember]
			public List<BusinessEntityRate> BusinessEntityRateCollection { get; set; }

			[DataMember]
			public List<Billing> BillingCollection { get; set; }

			[DataMember]
			public List<AccountsReceivableTransactionBatch> AccountsReceivableTransactionBatchCollection { get; set; }

			[DataMember]
			public List<BusinessEntityStaffTrainingLookup> BusinessEntityStaffTrainingLookupCollection { get; set; }

			[DataMember]
			public List<BusinessEntityStaffTrainingCategoryLookup> BusinessEntityStaffTrainingCategoryLookupCollection { get; set; }

			[DataMember]
			public List<BillingRate> BillingRateCollection { get; set; }

			[DataMember]
			public List<PlanOfCare> PlanOfCareCollection { get; set; }

			[DataMember(IsRequired = true)]
			public long BusinessEntitySK { get; set; }

			[DataMember(IsRequired = true)]
			public String BusinessEntityID { get; set; }

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

			[DataMember]
			public String TimezoneName { get; set; }

			[DataMember]
			public String BusinessEntityLogoPointer { get; set; }

			[DataMember]
			public String BusinessEntityName { get; set; }

			[DataMember]
			public String BusinessEntityLegalName { get; set; }

			[DataMember]
			public String BusinessEntityFederalTaxIdentifier { get; set; }

			[DataMember]
			public String BusinessEntityMedicareIdentifier { get; set; }

			[DataMember]
			public String BusinessEntityMedicaidIdentifier { get; set; }

			[DataMember]
			public String OASISIdentifier { get; set; }

			[DataMember]
			public String BusinessEntityNationalProviderIdentifier { get; set; }

			[DataMember]
			public String BusinessEntityAtypicalProviderIdentifier { get; set; }

			[DataMember]
			public String BusinessEntityTaxonomyCode { get; set; }

			[DataMember]
			public String BusinessEntityType { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryContactName { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryContactTitle { get; set; }

			[DataMember]
			public bool? BusinessEntityPrimaryAddressUseForMailIndicator { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryAddressLine1 { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryAddressLine2 { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryCity { get; set; }

			[DataMember]
			public StateCode BusinessEntityPrimaryState { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryCounty { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryPostalCode { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryZip4 { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryPhone { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryPhoneExtension { get; set; }

			[DataMember]
			public PhoneQualifier BusinessEntityPrimaryPhoneQualifier { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryPhone1 { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryPhone1Extension { get; set; }

			[DataMember]
			public PhoneQualifier BusinessEntityPrimaryPhone1Qualifier { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryPhone2 { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryPhone2Extension { get; set; }

			[DataMember]
			public PhoneQualifier BusinessEntityPrimaryPhone2Qualifier { get; set; }

			[DataMember]
			public String BusinessEntityFax { get; set; }

			[DataMember]
			public FaxQualifier BusinessEntityFaxQualifier { get; set; }

			[DataMember]
			public String BusinessEntityFax1 { get; set; }

			[DataMember]
			public FaxQualifier BusinessEntityFax1Qualifier { get; set; }

			[DataMember]
			public String BusinessEntityPrimaryEmail { get; set; }

			[DataMember]
			public WeekEndDay BusinessEntityPayrollWeekEndDay { get; set; }

			[DataMember]
			public bool? BusinessEntityHoldBillingIndicator { get; set; }

			[DataMember]
			public bool? BusinessEntitySplitBillingAllowedIndicator { get; set; }

			[DataMember]
			public bool? BusinessEntityIncludeRemitAddressIndicator { get; set; }

			[DataMember]
			public WeekendStartDay BusinessEntityWeekendStartDay { get; set; }

			[DataMember]
			public String BusinessEntityWeekendStartTime { get; set; }

			[DataMember]
			public WeekendEndDay BusinessEntityWeekendEndDay { get; set; }

			[DataMember]
			public String BusinessEntityWeekendEndTime { get; set; }

			[DataMember]
			public PatientAssessmentFrequency BusinessEntityPatientAssessmentFrequency { get; set; }

			[DataMember]
			public PatientSupervisoryVisitFrequency BusinessEntityPatientSupervisoryVisitFrequency { get; set; }

			[DataMember]
			public PayrollFrequencyTypeName BusinessEntityPayrollFrequencyTypeName { get; set; }

			[DataMember]
			public BillingFrequencyTypeName BusinessEntityBillingFrequencyTypeName { get; set; }

			[DataMember]
			public long? BusinessEntityLiveInEquivalence { get; set; }

			[IgnoreDataMember]
			public Nullable<DateTime> BusinessEntityFirstPayrollDate { get; set; }

			[DataMember(Name = "BusinessEntityFirstPayrollDate")]
			public string BusinessEntityFirstPayrollDateStr
			{
				get
				{
					return DateTimeHelper.ToDateTimeString(BusinessEntityFirstPayrollDate);
				}
				set
				{
					if (!String.IsNullOrEmpty(value))
					{
						BusinessEntityFirstPayrollDate = DateTimeHelper.ToDateTime(value);
					}
				}
			}

			[DataMember]
			public PayrollStartDay BusinessEntityPayrollStartDay { get; set; }

			[DataMember]
			public VisitVerificationRoundingRuleID VisitVerificationRoundingRuleID { get; set; }


	}
}
