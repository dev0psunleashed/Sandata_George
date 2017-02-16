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
 * Allows to link an Application Tenant to a Business Entity
 * 
 * Entity Purpose: Stores cross-walk information between Application Tenant and Business Entity (coredata data store)
 * 
 * 
 * 
 * <p>Java class for Application_Tenant_Business_Entity_Crosswalk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_Tenant_Business_Entity_Crosswalk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Application_Tenant_Business_Entity_Crosswalk_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Application_Tenant_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_Tenant_Business_Entity_Crosswalk")
@OracleMetadata(
        packageName = "PKG_APP",
        insertMethod = "insertAppTenantBeXwalk",
        updateMethod = "updateAppTenantBeXwalk",
        deleteMethod = "deleteAppTenantBeXwalk",
        getMethod = "getAppTenantBeXwalk",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AppTenantBeXwalkT",
        primaryKeys = {})
public class ApplicationTenantBusinessEntityCrosswalk extends BaseObject extends BaseObject extends BaseObject extends BaseObject {

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Application_Tenant_Business_Entity_Crosswalk_SK", required = true)
    @SerializedName("ApplicationTenantBusinessEntityCrosswalkSK")
    @SerializedName("ApplicationTenantBusinessEntityCrosswalkSK")
    @SerializedName("ApplicationTenantBusinessEntityCrosswalkSK")
    @SerializedName("ApplicationTenantBusinessEntityCrosswalkSK")
	@Mapping(getter = "getAppTenantBeXwalkSk", setter = "setAppTenantBeXwalkSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger applicationTenantBusinessEntityCrosswalkSK;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(com.sandata.lab.data.model.Adapter1.class)
	@Mapping(getter = "getRecCreateTmstp", setter = "setRecCreateTmstp", type = "java.sql.Timestamp", index = 1)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1.class)
	@Mapping(getter = "getRecUpdateTmstp", setter = "setRecUpdateTmstp", type = "java.sql.Timestamp", index = 2)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Application_Tenant_SK", required = true)
    @SerializedName("ApplicationTenantSK")
    @SerializedName("ApplicationTenantSK")
    @SerializedName("ApplicationTenantSK")
    @SerializedName("ApplicationTenantSK")
	@Mapping(getter = "getAppTenantSk", setter = "setAppTenantSk", type = "java.math.BigDecimal", index = 3)
    protected BigInteger applicationTenantSK;
    @XmlAttribute(name = "Business_Entity_ID", required = true)
    @SerializedName("BusinessEntityID")
    @SerializedName("BusinessEntityID")
    @SerializedName("BusinessEntityID")
    @SerializedName("BusinessEntityID")
	@Mapping(getter = "getBeId", setter = "setBeId", type = "String", index = 4)
    protected String businessEntityID;

    /**
     * Gets the value of the applicationTenantBusinessEntityCrosswalkSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationTenantBusinessEntityCrosswalkSK() {
        return applicationTenantBusinessEntityCrosswalkSK;
    }

    /**
     * Sets the value of the applicationTenantBusinessEntityCrosswalkSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationTenantBusinessEntityCrosswalkSK(BigInteger value) {
        this.applicationTenantBusinessEntityCrosswalkSK = value;
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
     * Gets the value of the businessEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEntityID() {
        return businessEntityID;
    }

    /**
     * Sets the value of the businessEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEntityID(String value) {
        this.businessEntityID = value;
    }

}