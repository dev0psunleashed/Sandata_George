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
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Indicates the days of the month when occurences within a series of events are supposed to happen.
 * 
 * <p>Java class for Schedule_Repeat_Day_Of_Month complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schedule_Repeat_Day_Of_Month">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Schedule_Repeat_Day_Of_Month_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Day_Of_Month_Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Schedule_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Schedule_Start_Time" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="Schedule_End_Time" type="{http://www.w3.org/2001/XMLSchema}time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule_Repeat_Day_Of_Month")
@OracleMetadata(
        packageName = "PKG_SCHEDULE",
        insertMethod = "insertSchedRptDayOfMonth",
        updateMethod = "updateSchedRptDayOfMonth",
        deleteMethod = "deleteSchedRptDayOfMonth",
        getMethod = "getSchedRptDayOfMonth",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.SchedRptDayOfMonthT",
        primaryKeys = {})
public class ScheduleRepeatDayOfMonth extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Schedule_Repeat_Day_Of_Month_SK", required = true)
    @SerializedName("ScheduleRepeatDayOfMonthSK")
	@Mapping(getter = "getSchedRptDayOfMonthSk", setter = "setSchedRptDayOfMonthSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger scheduleRepeatDayOfMonthSK;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecCreateTmstp", setter = "setRecCreateTmstp", type = "java.sql.Timestamp", index = 1)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecUpdateTmstp", setter = "setRecUpdateTmstp", type = "java.sql.Timestamp", index = 2)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Change_Version_ID", required = true)
    @SerializedName("ChangeVersionID")
	@Mapping(getter = "getChangeVersionId", setter = "setChangeVersionId", type = "java.math.BigDecimal", index = 3)
    protected BigInteger changeVersionID;
    @XmlAttribute(name = "Day_Of_Month_Number", required = true)
    @SerializedName("DayOfMonthNumber")
	@Mapping(getter = "getDayOfMonthNum", setter = "setDayOfMonthNum", type = "java.math.BigDecimal", index = 4)
    protected BigInteger dayOfMonthNumber;
    @XmlAttribute(name = "Schedule_SK", required = true)
    @SerializedName("ScheduleSK")
	@Mapping(getter = "getSchedSk", setter = "setSchedSk", type = "java.math.BigDecimal", index = 5)
    protected BigInteger scheduleSK;
    @XmlAttribute(name = "Schedule_Start_Time")
    @SerializedName("ScheduleStartTime")
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "time")
	@Mapping(getter = "getSchedStartTime", setter = "setSchedStartTime", type = "java.sql.Timestamp", index = 6)
    protected Date scheduleStartTime;
    @XmlAttribute(name = "Schedule_End_Time")
    @SerializedName("ScheduleEndTime")
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "time")
	@Mapping(getter = "getSchedEndTime", setter = "setSchedEndTime", type = "java.sql.Timestamp", index = 7)
    protected Date scheduleEndTime;

    /**
     * Gets the value of the scheduleRepeatDayOfMonthSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScheduleRepeatDayOfMonthSK() {
        return scheduleRepeatDayOfMonthSK;
    }

    /**
     * Sets the value of the scheduleRepeatDayOfMonthSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScheduleRepeatDayOfMonthSK(BigInteger value) {
        this.scheduleRepeatDayOfMonthSK = value;
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
     * Gets the value of the dayOfMonthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayOfMonthNumber() {
        return dayOfMonthNumber;
    }

    /**
     * Sets the value of the dayOfMonthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayOfMonthNumber(BigInteger value) {
        this.dayOfMonthNumber = value;
    }

    /**
     * Gets the value of the scheduleSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScheduleSK() {
        return scheduleSK;
    }

    /**
     * Sets the value of the scheduleSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScheduleSK(BigInteger value) {
        this.scheduleSK = value;
    }

    /**
     * Gets the value of the scheduleStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getScheduleStartTime() {
        return scheduleStartTime;
    }

    /**
     * Sets the value of the scheduleStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleStartTime(Date value) {
        this.scheduleStartTime = value;
    }

    /**
     * Gets the value of the scheduleEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getScheduleEndTime() {
        return scheduleEndTime;
    }

    /**
     * Sets the value of the scheduleEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleEndTime(Date value) {
        this.scheduleEndTime = value;
    }

}
