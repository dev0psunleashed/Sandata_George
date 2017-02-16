//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.27 at 10:53:27 PM EST 
//


package com.sandata.lab.rest.oracle.model;

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
 * Stores information related to the various Activites that a Business Entity is allowed to have their Staff member's perform
 * 
 * <p>Java class for Activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Activity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Visit_Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Schedule_Event_Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Plan_Of_Care_Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Service_Activity_Billing_Code" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Activity_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Activity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Payer_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Activity_Name" type="{}Name_Generic" />
 *       &lt;attribute name="Activity_Description" type="{}Description_Short" />
 *       &lt;attribute name="Activity_Payable_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Activity_Billable_Indicator" type="{}Indicator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activity", propOrder = {
    "visitActivity",
    "scheduleActivity",
    "scheduleEventActivity",
    "planOfCareActivity",
    "serviceActivityBillingCode"
})
public class Activity extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlElement(name = "Visit_Activity")
    @SerializedName("VisitActivity")
    protected List<VisitActivity> visitActivity;
    @XmlElement(name = "Schedule_Activity")
    @SerializedName("ScheduleActivity")
    protected List<ScheduleActivity> scheduleActivity;
    @XmlElement(name = "Schedule_Event_Activity")
    @SerializedName("ScheduleEventActivity")
    protected List<ScheduleEventActivity> scheduleEventActivity;
    @XmlElement(name = "Plan_Of_Care_Activity")
    @SerializedName("PlanOfCareActivity")
    protected List<PlanOfCareActivity> planOfCareActivity;
    @XmlElement(name = "Service_Activity_Billing_Code")
    @SerializedName("ServiceActivityBillingCode")
    protected List<ServiceActivityBillingCode> serviceActivityBillingCode;
    @XmlAttribute(name = "Activity_SK", required = true)
    @SerializedName("ActivitySK")
    protected BigInteger activitySK;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Change_Version_ID", required = true)
    @SerializedName("ChangeVersionID")
    protected BigInteger changeVersionID;
    @XmlAttribute(name = "Business_Entity_ID", required = true)
    @SerializedName("BusinessEntityID")
    protected String businessEntityID;
    @XmlAttribute(name = "Activity_ID", required = true)
    @SerializedName("ActivityID")
    protected String activityID;
    @XmlAttribute(name = "Payer_SK", required = true)
    @SerializedName("PayerSK")
    protected BigInteger payerSK;
    @XmlAttribute(name = "Activity_Name")
    @SerializedName("ActivityName")
    protected String activityName;
    @XmlAttribute(name = "Activity_Description")
    @SerializedName("ActivityDescription")
    protected String activityDescription;
    @XmlAttribute(name = "Activity_Payable_Indicator")
    @SerializedName("ActivityPayableIndicator")
    protected Boolean activityPayableIndicator;
    @XmlAttribute(name = "Activity_Billable_Indicator")
    @SerializedName("ActivityBillableIndicator")
    protected Boolean activityBillableIndicator;

    /**
     * Gets the value of the visitActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visitActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisitActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisitActivity }
     * 
     * 
     */
    public List<VisitActivity> getVisitActivity() {
        if (visitActivity == null) {
            visitActivity = new ArrayList<VisitActivity>();
        }
        return this.visitActivity;
    }

    /**
     * Gets the value of the scheduleActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleActivity }
     * 
     * 
     */
    public List<ScheduleActivity> getScheduleActivity() {
        if (scheduleActivity == null) {
            scheduleActivity = new ArrayList<ScheduleActivity>();
        }
        return this.scheduleActivity;
    }

    /**
     * Gets the value of the scheduleEventActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleEventActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleEventActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleEventActivity }
     * 
     * 
     */
    public List<ScheduleEventActivity> getScheduleEventActivity() {
        if (scheduleEventActivity == null) {
            scheduleEventActivity = new ArrayList<ScheduleEventActivity>();
        }
        return this.scheduleEventActivity;
    }

    /**
     * Gets the value of the planOfCareActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planOfCareActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanOfCareActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanOfCareActivity }
     * 
     * 
     */
    public List<PlanOfCareActivity> getPlanOfCareActivity() {
        if (planOfCareActivity == null) {
            planOfCareActivity = new ArrayList<PlanOfCareActivity>();
        }
        return this.planOfCareActivity;
    }

    /**
     * Gets the value of the serviceActivityBillingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceActivityBillingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceActivityBillingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceActivityBillingCode }
     * 
     * 
     */
    public List<ServiceActivityBillingCode> getServiceActivityBillingCode() {
        if (serviceActivityBillingCode == null) {
            serviceActivityBillingCode = new ArrayList<ServiceActivityBillingCode>();
        }
        return this.serviceActivityBillingCode;
    }

    /**
     * Gets the value of the activitySK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActivitySK() {
        return activitySK;
    }

    /**
     * Sets the value of the activitySK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActivitySK(BigInteger value) {
        this.activitySK = value;
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
     * Gets the value of the changeVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChangeVersionID() {
        return changeVersionID;
    }

    /**
     * Sets the value of the changeVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChangeVersionID(BigInteger value) {
        this.changeVersionID = value;
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

    /**
     * Gets the value of the activityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityID() {
        return activityID;
    }

    /**
     * Sets the value of the activityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityID(String value) {
        this.activityID = value;
    }

    /**
     * Gets the value of the payerSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPayerSK() {
        return payerSK;
    }

    /**
     * Sets the value of the payerSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPayerSK(BigInteger value) {
        this.payerSK = value;
    }

    /**
     * Gets the value of the activityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

    /**
     * Gets the value of the activityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityDescription() {
        return activityDescription;
    }

    /**
     * Sets the value of the activityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityDescription(String value) {
        this.activityDescription = value;
    }

    /**
     * Gets the value of the activityPayableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivityPayableIndicator() {
        return activityPayableIndicator;
    }

    /**
     * Sets the value of the activityPayableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivityPayableIndicator(Boolean value) {
        this.activityPayableIndicator = value;
    }

    /**
     * Gets the value of the activityBillableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivityBillableIndicator() {
        return activityBillableIndicator;
    }

    /**
     * Sets the value of the activityBillableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivityBillableIndicator(Boolean value) {
        this.activityBillableIndicator = value;
    }

}
