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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identification of application secure group in the system
 * 
 * Entity Purpose: The Application Security Group entity registers secure group within the application.
 * 
 * 
 * <p>Java class for Application_Secure_Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_Secure_Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Application_Privilege" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Application_Data_Structure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Application_Secure_Group_Role_Mapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Application_Secure_Group_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Secure_Group_Name" type="{}Name_Generic" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_Secure_Group", propOrder = {
    "applicationPrivilege",
    "applicationDataStructure",
    "applicationSecureGroupRoleMapping"
})
@OracleMetadata(
        packageName = "PKG_APP",
        insertMethod = "insertAppSecrGrp",
        updateMethod = "updateAppSecrGrp",
        deleteMethod = "deleteAppSecrGrp",
        getMethod = "getAppSecrGrp",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AppSecrGrpT",
        primaryKeys = {})
public class ApplicationSecureGroup extends BaseObject extends BaseObject extends BaseObject extends BaseObject {

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Application_Privilege")
    @SerializedName("ApplicationPrivilege")
    @SerializedName("ApplicationPrivilege")
    @SerializedName("ApplicationPrivilege")
    @SerializedName("ApplicationPrivilege")
    protected List<ApplicationPrivilege> applicationPrivilege;
    @XmlElement(name = "Application_Data_Structure")
    @SerializedName("ApplicationDataStructure")
    @SerializedName("ApplicationDataStructure")
    @SerializedName("ApplicationDataStructure")
    @SerializedName("ApplicationDataStructure")
    protected List<ApplicationDataStructure> applicationDataStructure;
    @XmlElement(name = "Application_Secure_Group_Role_Mapping")
    @SerializedName("ApplicationSecureGroupRoleMapping")
    @SerializedName("ApplicationSecureGroupRoleMapping")
    @SerializedName("ApplicationSecureGroupRoleMapping")
    @SerializedName("ApplicationSecureGroupRoleMapping")
    protected List<ApplicationSecureGroupRoleMapping> applicationSecureGroupRoleMapping;
    @XmlAttribute(name = "Application_Secure_Group_SK", required = true)
    @SerializedName("ApplicationSecureGroupSK")
    @SerializedName("ApplicationSecureGroupSK")
    @SerializedName("ApplicationSecureGroupSK")
    @SerializedName("ApplicationSecureGroupSK")
	@Mapping(getter = "getAppSecrGrpSk", setter = "setAppSecrGrpSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger applicationSecureGroupSK;
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
    @XmlAttribute(name = "Secure_Group_Name")
    @SerializedName("SecureGroupName")
    @SerializedName("SecureGroupName")
    @SerializedName("SecureGroupName")
    @SerializedName("SecureGroupName")
	@Mapping(getter = "getSecrGrpName", setter = "setSecrGrpName", type = "String", index = 3)
    protected String secureGroupName;

    /**
     * Gets the value of the applicationPrivilege property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationPrivilege property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationPrivilege().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationPrivilege }
     * 
     * 
     */
    public List<ApplicationPrivilege> getApplicationPrivilege() {
        if (applicationPrivilege == null) {
            applicationPrivilege = new ArrayList<ApplicationPrivilege>();
        }
        return this.applicationPrivilege;
    }

    /**
     * Gets the value of the applicationDataStructure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationDataStructure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationDataStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationDataStructure }
     * 
     * 
     */
    public List<ApplicationDataStructure> getApplicationDataStructure() {
        if (applicationDataStructure == null) {
            applicationDataStructure = new ArrayList<ApplicationDataStructure>();
        }
        return this.applicationDataStructure;
    }

    /**
     * Gets the value of the applicationSecureGroupRoleMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationSecureGroupRoleMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationSecureGroupRoleMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationSecureGroupRoleMapping }
     * 
     * 
     */
    public List<ApplicationSecureGroupRoleMapping> getApplicationSecureGroupRoleMapping() {
        if (applicationSecureGroupRoleMapping == null) {
            applicationSecureGroupRoleMapping = new ArrayList<ApplicationSecureGroupRoleMapping>();
        }
        return this.applicationSecureGroupRoleMapping;
    }

    /**
     * Gets the value of the applicationSecureGroupSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationSecureGroupSK() {
        return applicationSecureGroupSK;
    }

    /**
     * Sets the value of the applicationSecureGroupSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationSecureGroupSK(BigInteger value) {
        this.applicationSecureGroupSK = value;
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
     * Gets the value of the secureGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureGroupName() {
        return secureGroupName;
    }

    /**
     * Sets the value of the secureGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureGroupName(String value) {
        this.secureGroupName = value;
    }

}
