//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 10:25:43 PM EDT 
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
 * Identification of application functional module to the system
 * 
 * Entity Purpose: The Application Module entity registers functionall module within the application.
 * 
 * The entity stores historical data of the main/operationl entity.
 * 
 * 
 * <p>Java class for Application_Module_History complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_Module_History">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Application_Module_History_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Change_Timestamp" use="required" type="{}Record_Change_Timestamp" />
 *       &lt;attribute name="Record_Change_Code" use="required" type="{}Record_Change_Code" />
 *       &lt;attribute name="Application_Module_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Application_Module_Parent_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Module_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Module_Type_Name" type="{}Type_Name" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@OracleMetadata(
        packageName = "PKG_APP",
        insertMethod = "insertAppModHist",
        updateMethod = "updateAppModHist",
        deleteMethod = "deleteAppModHist",
        getMethod = "getAppModHist",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AppModHistT",
        primaryKeys = {})
namespace Sandata.George.Domain.Entities
{
	[DataContract]
	public class ApplicationModuleHistory
	{




			[DataMember(IsRequired = true)]
			public = "getAppModHistSk", setter = "setAppModHistSk", type = "java.math.BigDecimal", index = ApplicationModuleHistorySK { get; set; }

    protected BigInteger applicationModuleHistorySK;
			[DataMember(IsRequired = true)]
			public = "getRecChangeTmstp", setter = "setRecChangeTmstp", type = "java.sql.Timestamp", index = RecordChangeTimestamp { get; set; }

    protected Date recordChangeTimestamp;
			[DataMember(IsRequired = true)]
			public = "getRecChangeCode", setter = "setRecChangeCode", type = "String", index = RecordChangeCode { get; set; }

    protected RecordChangeCode recordChangeCode;
			[DataMember(IsRequired = true)]
			public = "getAppModSk", setter = "setAppModSk", type = "java.math.BigDecimal", index = ApplicationModuleSK { get; set; }

    protected BigInteger applicationModuleSK;
			[DataMember(IsRequired = true)]
			public = "getRecCreateTmstp", setter = "setRecCreateTmstp", type = "java.sql.Timestamp", index = RecordCreateTimestamp { get; set; }

    protected Date recordCreateTimestamp;
			[DataMember(IsRequired = true)]
			public = "getRecUpdateTmstp", setter = "setRecUpdateTmstp", type = "java.sql.Timestamp", index = RecordUpdateTimestamp { get; set; }

    protected Date recordUpdateTimestamp;
			[DataMember]
			public = "getAppModParSk", setter = "setAppModParSk", type = "java.math.BigDecimal", index = ApplicationModuleParentSK { get; set; }

    protected BigInteger applicationModuleParentSK;
			[DataMember]
			public = "getModName", setter = "setModName", type = "String", index = ModuleName { get; set; }

    protected String moduleName;
			[DataMember]
			public = "getModTypName", setter = "setModTypName", type = "String", index = ModuleTypeName { get; set; }

    protected String moduleTypeName;

	}
}
