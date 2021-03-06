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
 * <p>Java class for Report_Lookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Report_Lookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Report_Request_Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Report_Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Report_Request" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Report_Lookup_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Report_Type_Name" type="{}Report_Type_Name" />
 *       &lt;attribute name="Report_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Report_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Report_Description" type="{}Description_Short" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report_Lookup", propOrder = {
    "reportRequestDetail",
    "reportAttribute",
    "reportRequest"
})
public class ReportLookup extends BaseObject extends BaseObject extends BaseObject extends BaseObject {

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Report_Request_Detail")
    @SerializedName("ReportRequestDetail")
    @SerializedName("ReportRequestDetail")
    @SerializedName("ReportRequestDetail")
    @SerializedName("ReportRequestDetail")
    protected List<ReportRequestDetail> reportRequestDetail;
    @XmlElement(name = "Report_Attribute")
    @SerializedName("ReportAttribute")
    @SerializedName("ReportAttribute")
    @SerializedName("ReportAttribute")
    @SerializedName("ReportAttribute")
    protected List<ReportAttribute> reportAttribute;
    @XmlElement(name = "Report_Request")
    @SerializedName("ReportRequest")
    @SerializedName("ReportRequest")
    @SerializedName("ReportRequest")
    @SerializedName("ReportRequest")
    protected List<ReportRequest> reportRequest;
    @XmlAttribute(name = "Report_Lookup_SK", required = true)
    @SerializedName("ReportLookupSK")
    @SerializedName("ReportLookupSK")
    @SerializedName("ReportLookupSK")
    @SerializedName("ReportLookupSK")
    protected BigInteger reportLookupSK;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Report_Type_Name")
    @SerializedName("ReportTypeName")
    @SerializedName("ReportTypeName")
    @SerializedName("ReportTypeName")
    @SerializedName("ReportTypeName")
    protected String reportTypeName;
    @XmlAttribute(name = "Report_ID", required = true)
    @SerializedName("ReportID")
    @SerializedName("ReportID")
    @SerializedName("ReportID")
    @SerializedName("ReportID")
    protected String reportID;
    @XmlAttribute(name = "Report_Name")
    @SerializedName("ReportName")
    @SerializedName("ReportName")
    @SerializedName("ReportName")
    @SerializedName("ReportName")
    protected String reportName;
    @XmlAttribute(name = "Report_Description")
    @SerializedName("ReportDescription")
    @SerializedName("ReportDescription")
    @SerializedName("ReportDescription")
    @SerializedName("ReportDescription")
    protected String reportDescription;

    /**
     * Gets the value of the reportRequestDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportRequestDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportRequestDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportRequestDetail }
     * 
     * 
     */
    public List<ReportRequestDetail> getReportRequestDetail() {
        if (reportRequestDetail == null) {
            reportRequestDetail = new ArrayList<ReportRequestDetail>();
        }
        return this.reportRequestDetail;
    }

    /**
     * Gets the value of the reportAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportAttribute }
     * 
     * 
     */
    public List<ReportAttribute> getReportAttribute() {
        if (reportAttribute == null) {
            reportAttribute = new ArrayList<ReportAttribute>();
        }
        return this.reportAttribute;
    }

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
     * Gets the value of the reportLookupSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReportLookupSK() {
        return reportLookupSK;
    }

    /**
     * Sets the value of the reportLookupSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReportLookupSK(BigInteger value) {
        this.reportLookupSK = value;
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
     * Gets the value of the reportTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportTypeName() {
        return reportTypeName;
    }

    /**
     * Sets the value of the reportTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportTypeName(String value) {
        this.reportTypeName = value;
    }

    /**
     * Gets the value of the reportID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportID() {
        return reportID;
    }

    /**
     * Sets the value of the reportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportID(String value) {
        this.reportID = value;
    }

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the reportDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDescription() {
        return reportDescription;
    }

    /**
     * Sets the value of the reportDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDescription(String value) {
        this.reportDescription = value;
    }

}
