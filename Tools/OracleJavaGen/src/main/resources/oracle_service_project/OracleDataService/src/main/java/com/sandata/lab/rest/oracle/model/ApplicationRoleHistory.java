//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.28 at 03:44:22 PM EDT 
//


package com.sandata.lab.data.model.dl.model;

import com.sandata.lab.data.model.*;
import com.google.gson.annotations.SerializedName;
import com.sandata.lab.data.model.Adapter1;
import com.sandata.lab.data.model.base.BaseObject;
import com.sandata.lab.data.model.dl.annotation.Mapping;
import com.sandata.lab.data.model.dl.annotation.OracleMetadata;


import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Entity Purpose: The Application Role entity maps Application Role(s) (and therefore users) to the Application Privilege(s) they have within the application.
 * 
 * The entity stores historical data of the main/operationl entity.
 * 
 * 
 * <p>Java class for Application_Role_History complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_Role_History">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Application_Role_History_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Change_Timestamp" use="required" type="{}Record_Change_Timestamp" />
 *       &lt;attribute name="Record_Change_Code" use="required" type="{}Record_Change_Code" />
 *       &lt;attribute name="Application_Role_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Application_Tenant_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Role_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Can_Impersonate_Indicator" type="{}Indicator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_Role_History")
@OracleMetadata(
        packageName = "PKG_APP",
        insertMethod = "insertAppRoleHist",
        updateMethod = "updateAppRoleHist",
        deleteMethod = "deleteAppRoleHist",
        getMethod = "getAppRoleHist",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AppRoleHistT",
        primaryKeys = {})
public class ApplicationRoleHistory extends BaseObject extends BaseObject extends BaseObject extends BaseObject {

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Application_Role_History_SK", required = true)
    @SerializedName("ApplicationRoleHistorySK")
    @SerializedName("ApplicationRoleHistorySK")
    @SerializedName("ApplicationRoleHistorySK")
    @SerializedName("ApplicationRoleHistorySK")
	@Mapping(getter = "getAppRoleHistSk", setter = "setAppRoleHistSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger applicationRoleHistorySK;
    @XmlAttribute(name = "Record_Change_Timestamp", required = true)
    @SerializedName("RecordChangeTimestamp")
    @SerializedName("RecordChangeTimestamp")
    @SerializedName("RecordChangeTimestamp")
    @SerializedName("RecordChangeTimestamp")
    @XmlJavaTypeAdapter(com.sandata.lab.data.model.Adapter1.class)
	@Mapping(getter = "getRecChangeTmstp", setter = "setRecChangeTmstp", type = "java.sql.Timestamp", index = 1)
    protected Date recordChangeTimestamp;
    @XmlAttribute(name = "Record_Change_Code", required = true)
    @SerializedName("RecordChangeCode")
    @SerializedName("RecordChangeCode")
    @SerializedName("RecordChangeCode")
    @SerializedName("RecordChangeCode")
	@Mapping(getter = "getRecChangeCode", setter = "setRecChangeCode", type = "String", index = 2)
    protected RecordChangeCode recordChangeCode;
    @XmlAttribute(name = "Application_Role_SK", required = true)
    @SerializedName("ApplicationRoleSK")
    @SerializedName("ApplicationRoleSK")
    @SerializedName("ApplicationRoleSK")
    @SerializedName("ApplicationRoleSK")
	@Mapping(getter = "getAppRoleSk", setter = "setAppRoleSk", type = "java.math.BigDecimal", index = 3)
    protected BigInteger applicationRoleSK;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(com.sandata.lab.data.model.Adapter1.class)
	@Mapping(getter = "getRecCreateTmstp", setter = "setRecCreateTmstp", type = "java.sql.Timestamp", index = 4)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1.class)
	@Mapping(getter = "getRecUpdateTmstp", setter = "setRecUpdateTmstp", type = "java.sql.Timestamp", index = 5)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Application_Tenant_SK", required = true)
    @SerializedName("ApplicationTenantSK")
    @SerializedName("ApplicationTenantSK")
    @SerializedName("ApplicationTenantSK")
    @SerializedName("ApplicationTenantSK")
	@Mapping(getter = "getAppTenantSk", setter = "setAppTenantSk", type = "java.math.BigDecimal", index = 6)
    protected BigInteger applicationTenantSK;
    @XmlAttribute(name = "Role_Name")
    @SerializedName("RoleName")
    @SerializedName("RoleName")
    @SerializedName("RoleName")
    @SerializedName("RoleName")
	@Mapping(getter = "getRoleName", setter = "setRoleName", type = "String", index = 7)
    protected String roleName;
    @XmlAttribute(name = "Can_Impersonate_Indicator")
    @SerializedName("CanImpersonateIndicator")
    @SerializedName("CanImpersonateIndicator")
    @SerializedName("CanImpersonateIndicator")
    @SerializedName("CanImpersonateIndicator")
	@Mapping(getter = "getCanImpersInd", setter = "setCanImpersInd", type = "java.math.BigDecimal", index = 8)
    protected Boolean canImpersonateIndicator;

    /**
     * Gets the value of the applicationRoleHistorySK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationRoleHistorySK() {
        return applicationRoleHistorySK;
    }

    /**
     * Sets the value of the applicationRoleHistorySK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationRoleHistorySK(BigInteger value) {
        this.applicationRoleHistorySK = value;
    }

    /**
     * Gets the value of the recordChangeTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRecordChangeTimestamp() {
        return recordChangeTimestamp;
    }

    /**
     * Sets the value of the recordChangeTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordChangeTimestamp(Date value) {
        this.recordChangeTimestamp = value;
    }

    /**
     * Gets the value of the recordChangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordChangeCode }
     *     
     */
    public RecordChangeCode getRecordChangeCode() {
        return recordChangeCode;
    }

    /**
     * Sets the value of the recordChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordChangeCode }
     *     
     */
    public void setRecordChangeCode(RecordChangeCode value) {
        this.recordChangeCode = value;
    }

    /**
     * Gets the value of the applicationRoleSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationRoleSK() {
        return applicationRoleSK;
    }

    /**
     * Sets the value of the applicationRoleSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationRoleSK(BigInteger value) {
        this.applicationRoleSK = value;
    }

    /**
     * Gets the value of the recordCreateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRecordCreateTimestamp() {
        return recordCreateTimestamp;
    }

    /**
     * Sets the value of the recordCreateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCreateTimestamp(Date value) {
        this.recordCreateTimestamp = value;
    }

    /**
     * Gets the value of the recordUpdateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRecordUpdateTimestamp() {
        return recordUpdateTimestamp;
    }

    /**
     * Sets the value of the recordUpdateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordUpdateTimestamp(Date value) {
        this.recordUpdateTimestamp = value;
    }

    /**
     * Gets the value of the applicationTenantSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationTenantSK() {
        return applicationTenantSK;
    }

    /**
     * Sets the value of the applicationTenantSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationTenantSK(BigInteger value) {
        this.applicationTenantSK = value;
    }

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the canImpersonateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanImpersonateIndicator() {
        return canImpersonateIndicator;
    }

    /**
     * Sets the value of the canImpersonateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanImpersonateIndicator(Boolean value) {
        this.canImpersonateIndicator = value;
    }

}
