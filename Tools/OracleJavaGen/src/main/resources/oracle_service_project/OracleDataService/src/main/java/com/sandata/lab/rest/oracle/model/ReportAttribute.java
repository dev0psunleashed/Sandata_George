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
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The entitiy is used to store all report characteristics (Report Attributes), and their values.
 * 
 * <p>Java class for Report_Attribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Report_Attribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Report_Attribute_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Report_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Report_Attribute_Key_Name" use="required" type="{}Key_Name" />
 *       &lt;attribute name="Report_Attribute_Key_Value" type="{}Key_Value" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report_Attribute")
public class ReportAttribute extends BaseObject extends BaseObject extends BaseObject extends BaseObject {

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Report_Attribute_SK", required = true)
    @SerializedName("ReportAttributeSK")
    @SerializedName("ReportAttributeSK")
    @SerializedName("ReportAttributeSK")
    @SerializedName("ReportAttributeSK")
    protected BigInteger reportAttributeSK;
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
    @XmlAttribute(name = "Report_ID", required = true)
    @SerializedName("ReportID")
    @SerializedName("ReportID")
    @SerializedName("ReportID")
    @SerializedName("ReportID")
    protected String reportID;
    @XmlAttribute(name = "Report_Attribute_Key_Name", required = true)
    @SerializedName("ReportAttributeKeyName")
    @SerializedName("ReportAttributeKeyName")
    @SerializedName("ReportAttributeKeyName")
    @SerializedName("ReportAttributeKeyName")
    protected String reportAttributeKeyName;
    @XmlAttribute(name = "Report_Attribute_Key_Value")
    @SerializedName("ReportAttributeKeyValue")
    @SerializedName("ReportAttributeKeyValue")
    @SerializedName("ReportAttributeKeyValue")
    @SerializedName("ReportAttributeKeyValue")
    protected String reportAttributeKeyValue;

    /**
     * Gets the value of the reportAttributeSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReportAttributeSK() {
        return reportAttributeSK;
    }

    /**
     * Sets the value of the reportAttributeSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReportAttributeSK(BigInteger value) {
        this.reportAttributeSK = value;
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
     * Gets the value of the reportAttributeKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportAttributeKeyName() {
        return reportAttributeKeyName;
    }

    /**
     * Sets the value of the reportAttributeKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportAttributeKeyName(String value) {
        this.reportAttributeKeyName = value;
    }

    /**
     * Gets the value of the reportAttributeKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportAttributeKeyValue() {
        return reportAttributeKeyValue;
    }

    /**
     * Sets the value of the reportAttributeKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportAttributeKeyValue(String value) {
        this.reportAttributeKeyValue = value;
    }

}
