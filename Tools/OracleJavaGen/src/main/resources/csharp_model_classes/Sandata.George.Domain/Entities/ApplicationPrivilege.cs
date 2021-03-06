//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.28 at 03:44:22 PM EDT 
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
 * Entity Purpose: Identifies Application Privilege(s) mapped between Application Role(s) and Application Secure Element(s). The privilege may be a grant, denial, or exclusion from an otherwise defined list
 * 
 * 
 * <p>Java class for Application_Privilege complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_Privilege">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Application_Audit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Application_Privilege_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Application_Secure_Element_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Application_Tenant_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Application_User_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Application_Secure_Group_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Include_Inheritance_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Privilege_Access_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Privilege_No_Access_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Privilege_Create_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Privilege_No_Create_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Privilege_Update_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Privilege_No_Update_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Privilege_Delete_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Privilege_No_Delete_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Exclusion_Indicator" type="{}Indicator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@OracleMetadata(
        packageName = "PKG_APP",
        insertMethod = "insertAppPriv",
        updateMethod = "updateAppPriv",
        deleteMethod = "deleteAppPriv",
        getMethod = "getAppPriv",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AppPrivT",
        primaryKeys = {})
namespace Sandata.George.Domain.Entities
{
	[DataContract]
	public class ApplicationPrivilege
	{




			[DataMember]
			public List<ApplicationAudit> ApplicationAuditCollection { get; set; }

			[DataMember(IsRequired = true)]
			public = "getAppPrivSk", setter = "setAppPrivSk", type = "java.math.BigDecimal", index = ApplicationPrivilegeSK { get; set; }

    protected BigInteger applicationPrivilegeSK;
			[DataMember(IsRequired = true)]
			public = "getRecCreateTmstp", setter = "setRecCreateTmstp", type = "java.sql.Timestamp", index = RecordCreateTimestamp { get; set; }

    protected Date recordCreateTimestamp;
			[DataMember(IsRequired = true)]
			public = "getRecUpdateTmstp", setter = "setRecUpdateTmstp", type = "java.sql.Timestamp", index = RecordUpdateTimestamp { get; set; }

    protected Date recordUpdateTimestamp;
			[DataMember]
			public = "getAppSecrEltSk", setter = "setAppSecrEltSk", type = "java.math.BigDecimal", index = ApplicationSecureElementSK { get; set; }

    protected BigInteger applicationSecureElementSK;
			[DataMember(IsRequired = true)]
			public = "getAppTenantSk", setter = "setAppTenantSk", type = "java.math.BigDecimal", index = ApplicationTenantSK { get; set; }

    protected BigInteger applicationTenantSK;
			[DataMember]
			public = "getAppUserSk", setter = "setAppUserSk", type = "java.math.BigDecimal", index = ApplicationUserSK { get; set; }

    protected BigInteger applicationUserSK;
			[DataMember]
			public = "getAppSecrGrpSk", setter = "setAppSecrGrpSk", type = "java.math.BigDecimal", index = ApplicationSecureGroupSK { get; set; }

    protected BigInteger applicationSecureGroupSK;
			[DataMember]
			public = "getInclInhcInd", setter = "setInclInhcInd", type = "java.math.BigDecimal", index = IncludeInheritanceIndicator { get; set; }

    protected Boolean includeInheritanceIndicator;
			[DataMember]
			public = "getPrivAccessInd", setter = "setPrivAccessInd", type = "java.math.BigDecimal", index = PrivilegeAccessIndicator { get; set; }

    protected Boolean privilegeAccessIndicator;
			[DataMember]
			public = "getPrivNoAccessInd", setter = "setPrivNoAccessInd", type = "java.math.BigDecimal", index = PrivilegeNoAccessIndicator { get; set; }

    protected Boolean privilegeNoAccessIndicator;
			[DataMember]
			public = "getPrivCreateInd", setter = "setPrivCreateInd", type = "java.math.BigDecimal", index = PrivilegeCreateIndicator { get; set; }

    protected Boolean privilegeCreateIndicator;
			[DataMember]
			public = "getPrivNoCreateInd", setter = "setPrivNoCreateInd", type = "java.math.BigDecimal", index = PrivilegeNoCreateIndicator { get; set; }

    protected Boolean privilegeNoCreateIndicator;
			[DataMember]
			public = "getPrivUpdateInd", setter = "setPrivUpdateInd", type = "java.math.BigDecimal", index = PrivilegeUpdateIndicator { get; set; }

    protected Boolean privilegeUpdateIndicator;
			[DataMember]
			public = "getPrivNoUpdateInd", setter = "setPrivNoUpdateInd", type = "java.math.BigDecimal", index = PrivilegeNoUpdateIndicator { get; set; }

    protected Boolean privilegeNoUpdateIndicator;
			[DataMember]
			public = "getPrivDeleteInd", setter = "setPrivDeleteInd", type = "java.math.BigDecimal", index = PrivilegeDeleteIndicator { get; set; }

    protected Boolean privilegeDeleteIndicator;
			[DataMember]
			public = "getPrivNoDeleteInd", setter = "setPrivNoDeleteInd", type = "java.math.BigDecimal", index = PrivilegeNoDeleteIndicator { get; set; }

    protected Boolean privilegeNoDeleteIndicator;
			[DataMember]
			public = "getExclInd", setter = "setExclInd", type = "java.math.BigDecimal", index = ExclusionIndicator { get; set; }

    protected Boolean exclusionIndicator;

	}
}
