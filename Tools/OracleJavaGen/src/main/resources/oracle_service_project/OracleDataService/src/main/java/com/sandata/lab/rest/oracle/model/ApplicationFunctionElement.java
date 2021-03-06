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
 * Granular identification of sub-functionality
 * 
 * Entity Purpose: The Application Function Element entity registers granular functionality within the application. This is intended to be a specific control or field in an interface, process step, data element, or piece of data content.
 * 
 * 
 * <p>Java class for Application_Function_Element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_Function_Element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Application_Secure_Element" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Application_Function_Element_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Application_Data_Structure_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Application_Data_Content_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Application_Function_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Application_Module_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Function_Element_Name" type="{}Name_Generic" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_Function_Element", propOrder = {
    "applicationSecureElement"
})
@OracleMetadata(
        packageName = "PKG_APP",
        insertMethod = "insertAppFunElt",
        updateMethod = "updateAppFunElt",
        deleteMethod = "deleteAppFunElt",
        getMethod = "getAppFunElt",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AppFunEltT",
        primaryKeys = {})
public class ApplicationFunctionElement extends BaseObject extends BaseObject extends BaseObject extends BaseObject {

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Application_Secure_Element")
    @SerializedName("ApplicationSecureElement")
    @SerializedName("ApplicationSecureElement")
    @SerializedName("ApplicationSecureElement")
    @SerializedName("ApplicationSecureElement")
    protected List<ApplicationSecureElement> applicationSecureElement;
    @XmlAttribute(name = "Application_Function_Element_SK", required = true)
    @SerializedName("ApplicationFunctionElementSK")
    @SerializedName("ApplicationFunctionElementSK")
    @SerializedName("ApplicationFunctionElementSK")
    @SerializedName("ApplicationFunctionElementSK")
	@Mapping(getter = "getAppFunEltSk", setter = "setAppFunEltSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger applicationFunctionElementSK;
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
    @XmlAttribute(name = "Application_Data_Structure_SK")
    @SerializedName("ApplicationDataStructureSK")
    @SerializedName("ApplicationDataStructureSK")
    @SerializedName("ApplicationDataStructureSK")
    @SerializedName("ApplicationDataStructureSK")
	@Mapping(getter = "getAppDataStrucSk", setter = "setAppDataStrucSk", type = "java.math.BigDecimal", index = 3)
    protected BigInteger applicationDataStructureSK;
    @XmlAttribute(name = "Application_Data_Content_SK")
    @SerializedName("ApplicationDataContentSK")
    @SerializedName("ApplicationDataContentSK")
    @SerializedName("ApplicationDataContentSK")
    @SerializedName("ApplicationDataContentSK")
	@Mapping(getter = "getAppDataContentSk", setter = "setAppDataContentSk", type = "java.math.BigDecimal", index = 4)
    protected BigInteger applicationDataContentSK;
    @XmlAttribute(name = "Application_Function_SK")
    @SerializedName("ApplicationFunctionSK")
    @SerializedName("ApplicationFunctionSK")
    @SerializedName("ApplicationFunctionSK")
    @SerializedName("ApplicationFunctionSK")
	@Mapping(getter = "getAppFunSk", setter = "setAppFunSk", type = "java.math.BigDecimal", index = 5)
    protected BigInteger applicationFunctionSK;
    @XmlAttribute(name = "Application_Module_SK")
    @SerializedName("ApplicationModuleSK")
    @SerializedName("ApplicationModuleSK")
    @SerializedName("ApplicationModuleSK")
    @SerializedName("ApplicationModuleSK")
	@Mapping(getter = "getAppModSk", setter = "setAppModSk", type = "java.math.BigDecimal", index = 6)
    protected BigInteger applicationModuleSK;
    @XmlAttribute(name = "Function_Element_Name")
    @SerializedName("FunctionElementName")
    @SerializedName("FunctionElementName")
    @SerializedName("FunctionElementName")
    @SerializedName("FunctionElementName")
	@Mapping(getter = "getFunEltName", setter = "setFunEltName", type = "String", index = 7)
    protected String functionElementName;

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
     * Gets the value of the applicationFunctionElementSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationFunctionElementSK() {
        return applicationFunctionElementSK;
    }

    /**
     * Sets the value of the applicationFunctionElementSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationFunctionElementSK(BigInteger value) {
        this.applicationFunctionElementSK = value;
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
     * Gets the value of the applicationDataStructureSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationDataStructureSK() {
        return applicationDataStructureSK;
    }

    /**
     * Sets the value of the applicationDataStructureSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationDataStructureSK(BigInteger value) {
        this.applicationDataStructureSK = value;
    }

    /**
     * Gets the value of the applicationDataContentSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationDataContentSK() {
        return applicationDataContentSK;
    }

    /**
     * Sets the value of the applicationDataContentSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationDataContentSK(BigInteger value) {
        this.applicationDataContentSK = value;
    }

    /**
     * Gets the value of the applicationFunctionSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationFunctionSK() {
        return applicationFunctionSK;
    }

    /**
     * Sets the value of the applicationFunctionSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationFunctionSK(BigInteger value) {
        this.applicationFunctionSK = value;
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
     * Gets the value of the functionElementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionElementName() {
        return functionElementName;
    }

    /**
     * Sets the value of the functionElementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionElementName(String value) {
        this.functionElementName = value;
    }

}
