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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * Wiki: A session  is a semi-permanent interactive information interchange, also known as a dialogue, a conversation or a meeting, between two or more communicating devices, or between a computer and user (see Login session). A session is set up or established at a certain point in time, and then torn down at some later point. An established communication session may involve more than one message in each direction. A session is typically, but not always, stateful, meaning that at least one of the communicating parts needs to save information about the session history in order to be able to communicate, as opposed to stateless communication, where the communication consists of independent requests with responses.
 * 
 * 
 * 
 * <p>Java class for Application_Session complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_Session">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Report_Request" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Application_Audit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Application_Log" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Application_Session_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="User_Globally_Unique_Identifier" type="{}Computing_Globally_Unique_Identifier" />
 *       &lt;attribute name="Last_Renewed_Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_Session", propOrder = {
    "reportRequest",
    "applicationAudit",
    "applicationLog"
})
@OracleMetadata(
        packageName = "PKG_APP",
        insertMethod = "insertAppSess",
        updateMethod = "updateAppSess",
        deleteMethod = "deleteAppSess",
        getMethod = "getAppSess",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AppSessT",
        primaryKeys = {})
public class ApplicationSession extends BaseObject extends BaseObject extends BaseObject extends BaseObject {

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Report_Request")
    @SerializedName("ReportRequest")
    @SerializedName("ReportRequest")
    @SerializedName("ReportRequest")
    @SerializedName("ReportRequest")
    protected List<ReportRequest> reportRequest;
    @XmlElement(name = "Application_Audit")
    @SerializedName("ApplicationAudit")
    @SerializedName("ApplicationAudit")
    @SerializedName("ApplicationAudit")
    @SerializedName("ApplicationAudit")
    protected List<ApplicationAudit> applicationAudit;
    @XmlElement(name = "Application_Log")
    @SerializedName("ApplicationLog")
    @SerializedName("ApplicationLog")
    @SerializedName("ApplicationLog")
    @SerializedName("ApplicationLog")
    protected List<ApplicationLog> applicationLog;
    @XmlAttribute(name = "Application_Session_SK", required = true)
    @SerializedName("ApplicationSessionSK")
    @SerializedName("ApplicationSessionSK")
    @SerializedName("ApplicationSessionSK")
    @SerializedName("ApplicationSessionSK")
	@Mapping(getter = "getAppSessSk", setter = "setAppSessSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger applicationSessionSK;
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
    @XmlJavaTypeAdapter(com.sandata.lab.data.model.Adapter1.class)
	@Mapping(getter = "getRecUpdateTmstp", setter = "setRecUpdateTmstp", type = "java.sql.Timestamp", index = 2)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "User_Globally_Unique_Identifier")
    @SerializedName("UserGloballyUniqueIdentifier")
    @SerializedName("UserGloballyUniqueIdentifier")
    @SerializedName("UserGloballyUniqueIdentifier")
    @SerializedName("UserGloballyUniqueIdentifier")
	@Mapping(getter = "getUserGuid", setter = "setUserGuid", type = "String", index = 3)
    protected String userGloballyUniqueIdentifier;
    @XmlAttribute(name = "Last_Renewed_Timestamp")
    @SerializedName("LastRenewedTimestamp")
    @SerializedName("LastRenewedTimestamp")
    @SerializedName("LastRenewedTimestamp")
    @SerializedName("LastRenewedTimestamp")
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
	@Mapping(getter = "getLastRenewedTmstp", setter = "setLastRenewedTmstp", type = "java.sql.Timestamp", index = 4)
    protected Date lastRenewedTimestamp;

    /**
     * Gets the value of the reportRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportRequest }
     * 
     * 
     */
    public List<ReportRequest> getReportRequest() {
        if (reportRequest == null) {
            reportRequest = new ArrayList<ReportRequest>();
        }
        return this.reportRequest;
    }

    /**
     * Gets the value of the applicationAudit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationAudit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationAudit }
     * 
     * 
     */
    public List<ApplicationAudit> getApplicationAudit() {
        if (applicationAudit == null) {
            applicationAudit = new ArrayList<ApplicationAudit>();
        }
        return this.applicationAudit;
    }

    /**
     * Gets the value of the applicationLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationLog }
     * 
     * 
     */
    public List<ApplicationLog> getApplicationLog() {
        if (applicationLog == null) {
            applicationLog = new ArrayList<ApplicationLog>();
        }
        return this.applicationLog;
    }

    /**
     * Gets the value of the applicationSessionSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationSessionSK() {
        return applicationSessionSK;
    }

    /**
     * Sets the value of the applicationSessionSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationSessionSK(BigInteger value) {
        this.applicationSessionSK = value;
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
     * Gets the value of the userGloballyUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGloballyUniqueIdentifier() {
        return userGloballyUniqueIdentifier;
    }

    /**
     * Sets the value of the userGloballyUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGloballyUniqueIdentifier(String value) {
        this.userGloballyUniqueIdentifier = value;
    }

    /**
     * Gets the value of the lastRenewedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLastRenewedTimestamp() {
        return lastRenewedTimestamp;
    }

    /**
     * Sets the value of the lastRenewedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRenewedTimestamp(Date value) {
        this.lastRenewedTimestamp = value;
    }

}
