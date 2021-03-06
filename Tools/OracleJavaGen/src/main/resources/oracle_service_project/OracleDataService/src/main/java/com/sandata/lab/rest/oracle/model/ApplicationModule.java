//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 10:25:43 PM EDT 
//


package com.sandata.lab.rest.oracle.model;

import com.sandata.lab.data.model.*;
import com.google.gson.annotations.SerializedName;
import com.sandata.lab.data.model.base.BaseObject;
import com.sandata.lab.data.model.dl.annotation.Mapping;
import com.sandata.lab.data.model.dl.annotation.OracleMetadata;


import com.sandata.lab.data.model.*;
import com.google.gson.annotations.SerializedName;
import com.sandata.lab.data.model.base.BaseObject;
import com.sandata.lab.data.model.dl.annotation.Mapping;
import com.sandata.lab.data.model.dl.annotation.OracleMetadata;


import com.sandata.lab.data.model.*;
import com.google.gson.annotations.SerializedName;
import com.sandata.lab.data.model.base.BaseObject;
import com.sandata.lab.data.model.dl.annotation.Mapping;
import com.sandata.lab.data.model.dl.annotation.OracleMetadata;


import com.sandata.lab.data.model.*;
import com.google.gson.annotations.SerializedName;
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
 * A collection of application functions logically combined  into an application module.
 * 
 * Entity Purpose: The Application Module entity registers functional module within the application.
 * 
 * 
 * <p>Java class for Application_Module complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_Module">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Application_Module" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Application_Secure_Element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Application_Function" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Application_Function_Element" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_Module", propOrder = {
    "applicationModule",
    "applicationSecureElement",
    "applicationFunction",
    "applicationFunctionElement"
})
@OracleMetadata(
        packageName = "PKG_APP",
        insertMethod = "insertAppMod",
        updateMethod = "updateAppMod",
        deleteMethod = "deleteAppMod",
        getMethod = "getAppMod",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AppModT",
        primaryKeys = {})
public class ApplicationModule extends BaseObject extends BaseObject extends BaseObject extends BaseObject {

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Application_Module")
    @SerializedName("ApplicationModule")
    @SerializedName("ApplicationModule")
    @SerializedName("ApplicationModule")
    @SerializedName("ApplicationModule")
    protected List<ApplicationModule> applicationModule;
    @XmlElement(name = "Application_Secure_Element")
    @SerializedName("ApplicationSecureElement")
    @SerializedName("ApplicationSecureElement")
    @SerializedName("ApplicationSecureElement")
    @SerializedName("ApplicationSecureElement")
    protected List<ApplicationSecureElement> applicationSecureElement;
    @XmlElement(name = "Application_Function")
    @SerializedName("ApplicationFunction")
    @SerializedName("ApplicationFunction")
    @SerializedName("ApplicationFunction")
    @SerializedName("ApplicationFunction")
    protected List<ApplicationFunction> applicationFunction;
    @XmlElement(name = "Application_Function_Element")
    @SerializedName("ApplicationFunctionElement")
    @SerializedName("ApplicationFunctionElement")
    @SerializedName("ApplicationFunctionElement")
    @SerializedName("ApplicationFunctionElement")
    protected List<ApplicationFunctionElement> applicationFunctionElement;
    @XmlAttribute(name = "Application_Module_SK", required = true)
    @SerializedName("ApplicationModuleSK")
    @SerializedName("ApplicationModuleSK")
    @SerializedName("ApplicationModuleSK")
    @SerializedName("ApplicationModuleSK")
	@Mapping(getter = "getAppModSk", setter = "setAppModSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger applicationModuleSK;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecCreateTmstp", setter = "setRecCreateTmstp", type = "java.sql.Timestamp", index = 1)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecUpdateTmstp", setter = "setRecUpdateTmstp", type = "java.sql.Timestamp", index = 2)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Application_Module_Parent_SK")
    @SerializedName("ApplicationModuleParentSK")
    @SerializedName("ApplicationModuleParentSK")
    @SerializedName("ApplicationModuleParentSK")
    @SerializedName("ApplicationModuleParentSK")
	@Mapping(getter = "getAppModParSk", setter = "setAppModParSk", type = "java.math.BigDecimal", index = 3)
    protected BigInteger applicationModuleParentSK;
    @XmlAttribute(name = "Module_Name")
    @SerializedName("ModuleName")
    @SerializedName("ModuleName")
    @SerializedName("ModuleName")
    @SerializedName("ModuleName")
	@Mapping(getter = "getModName", setter = "setModName", type = "String", index = 4)
    protected String moduleName;
    @XmlAttribute(name = "Module_Type_Name")
    @SerializedName("ModuleTypeName")
    @SerializedName("ModuleTypeName")
    @SerializedName("ModuleTypeName")
    @SerializedName("ModuleTypeName")
	@Mapping(getter = "getModTypName", setter = "setModTypName", type = "String", index = 5)
    protected String moduleTypeName;

    /**
     * Gets the value of the applicationModule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationModule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationModule }
     * 
     * 
     */
    public List<ApplicationModule> getApplicationModule() {
        if (applicationModule == null) {
            applicationModule = new ArrayList<ApplicationModule>();
        }
        return this.applicationModule;
    }

    /**
     * Gets the value of the applicationSecureElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationSecureElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationSecureElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationSecureElement }
     * 
     * 
     */
    public List<ApplicationSecureElement> getApplicationSecureElement() {
        if (applicationSecureElement == null) {
            applicationSecureElement = new ArrayList<ApplicationSecureElement>();
        }
        return this.applicationSecureElement;
    }

    /**
     * Gets the value of the applicationFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationFunction }
     * 
     * 
     */
    public List<ApplicationFunction> getApplicationFunction() {
        if (applicationFunction == null) {
            applicationFunction = new ArrayList<ApplicationFunction>();
        }
        return this.applicationFunction;
    }

    /**
     * Gets the value of the applicationFunctionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationFunctionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationFunctionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationFunctionElement }
     * 
     * 
     */
    public List<ApplicationFunctionElement> getApplicationFunctionElement() {
        if (applicationFunctionElement == null) {
            applicationFunctionElement = new ArrayList<ApplicationFunctionElement>();
        }
        return this.applicationFunctionElement;
    }

    /**
     * Gets the value of the applicationModuleSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationModuleSK() {
        return applicationModuleSK;
    }

    /**
     * Sets the value of the applicationModuleSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationModuleSK(BigInteger value) {
        this.applicationModuleSK = value;
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
     * Gets the value of the applicationModuleParentSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationModuleParentSK() {
        return applicationModuleParentSK;
    }

    /**
     * Sets the value of the applicationModuleParentSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationModuleParentSK(BigInteger value) {
        this.applicationModuleParentSK = value;
    }

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the moduleTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleTypeName() {
        return moduleTypeName;
    }

    /**
     * Sets the value of the moduleTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleTypeName(String value) {
        this.moduleTypeName = value;
    }

}
