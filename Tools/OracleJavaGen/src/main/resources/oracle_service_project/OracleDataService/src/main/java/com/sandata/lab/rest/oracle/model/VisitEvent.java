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


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Visit_Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visit_Event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Visit_Event_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Visit_SK" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Visit_Event_Type_Code" use="required" type="{}Visit_Event_Type_Code" />
 *       &lt;attribute name="Visit_Event_Datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Timezone_Name" type="{}Timezone_Name" />
 *       &lt;attribute name="Automatic_Number_Identification" type="{}Automatic_Number_Identification" />
 *       &lt;attribute name="Information_Digits" type="{}Information_Digits" />
 *       &lt;attribute name="Dialed_Number_Identification_Service" type="{}Dialed_Number_Identification_Service" />
 *       &lt;attribute name="Equipment_ID" type="{}ID" />
 *       &lt;attribute name="Staff_ID" type="{}ID" />
 *       &lt;attribute name="Patient_ID" type="{}ID" />
 *       &lt;attribute name="Coordinate_Latitude" type="{}Coordinate_Latitude" />
 *       &lt;attribute name="Coordinate_Longitide" type="{}Coordinate_Longitide" />
 *       &lt;attribute name="Coordinate_Accuracy" type="{}Coordinate_Accuracy" />
 *       &lt;attribute name="Coordinate_Altitude" type="{}Coordinate_Altitude" />
 *       &lt;attribute name="Coordinate_Altitude_Accuracy" type="{}Coordinate_Altitude_Accuracy" />
 *       &lt;attribute name="Coordinate_Heading" type="{}Coordinate_Heading" />
 *       &lt;attribute name="Coordinate_Speed" type="{}Coordinate_Speed" />
 *       &lt;attribute name="Coordinate_Timestamp" type="{}Coordinate_Timestamp" />
 *       &lt;attribute name="International_Mobile_Station_Equipment_Identity" type="{}International_Mobile_Station_Equipment_Identity" />
 *       &lt;attribute name="Call_In_Indicator" type="{}Indicator" />
 *       &lt;attribute name="Call_Out_Indicator" type="{}Indicator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visit_Event")
@OracleMetadata(
        packageName = "PKG_VISIT",
        insertMethod = "insertVisitEvnt",
        updateMethod = "updateVisitEvnt",
        deleteMethod = "deleteVisitEvnt",
        getMethod = "getVisitEvnt",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.VisitEvntT",
        primaryKeys = {})
public class VisitEvent extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Visit_Event_SK", required = true)
    @SerializedName("VisitEventSK")
	@Mapping(getter = "getVisitEvntSk", setter = "setVisitEvntSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger visitEventSK;
    @XmlAttribute(name = "Visit_SK")
    @SerializedName("VisitSK")
	@Mapping(getter = "getVisitSk", setter = "setVisitSk", type = "java.math.BigDecimal", index = 1)
    protected BigInteger visitSK;
    @XmlAttribute(name = "Record_Create_Timestamp", required = true)
    @SerializedName("RecordCreateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecCreateTmstp", setter = "setRecCreateTmstp", type = "java.sql.Timestamp", index = 2)
    protected Date recordCreateTimestamp;
    @XmlAttribute(name = "Record_Update_Timestamp", required = true)
    @SerializedName("RecordUpdateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecUpdateTmstp", setter = "setRecUpdateTmstp", type = "java.sql.Timestamp", index = 3)
    protected Date recordUpdateTimestamp;
    @XmlAttribute(name = "Record_Effective_Timestamp", required = true)
    @SerializedName("RecordEffectiveTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecEffTmstp", setter = "setRecEffTmstp", type = "java.sql.Timestamp", index = 4)
    protected Date recordEffectiveTimestamp;
    @XmlAttribute(name = "Record_Termination_Timestamp", required = true)
    @SerializedName("RecordTerminationTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecTermTmstp", setter = "setRecTermTmstp", type = "java.sql.Timestamp", index = 5)
    protected Date recordTerminationTimestamp;
    @XmlAttribute(name = "Record_Created_By")
    @SerializedName("RecordCreatedBy")
	@Mapping(getter = "getRecCreatedBy", setter = "setRecCreatedBy", type = "String", index = 6)
    protected String recordCreatedBy;
    @XmlAttribute(name = "Record_Updated_By")
    @SerializedName("RecordUpdatedBy")
	@Mapping(getter = "getRecUpdatedBy", setter = "setRecUpdatedBy", type = "String", index = 7)
    protected String recordUpdatedBy;
    @XmlAttribute(name = "Change_Reason_Memo")
    @SerializedName("ChangeReasonMemo")
	@Mapping(getter = "getChangeReasonMemo", setter = "setChangeReasonMemo", type = "String", index = 8)
    protected String changeReasonMemo;
    @XmlAttribute(name = "Current_Record_Indicator", required = true)
    @SerializedName("CurrentRecordIndicator")
	@Mapping(getter = "getCurrRecInd", setter = "setCurrRecInd", type = "java.math.BigDecimal", index = 9)
    protected boolean currentRecordIndicator;
    @XmlAttribute(name = "Change_Version_ID", required = true)
    @SerializedName("ChangeVersionID")
	@Mapping(getter = "getChangeVersionId", setter = "setChangeVersionId", type = "java.math.BigDecimal", index = 10)
    protected BigInteger changeVersionID;
    @XmlAttribute(name = "Visit_Event_Type_Code", required = true)
    @SerializedName("VisitEventTypeCode")
	@Mapping(getter = "getVisitEvntTypCode", setter = "setVisitEvntTypCode", type = "String", index = 11)
    protected VisitEventTypeCode visitEventTypeCode;
    @XmlAttribute(name = "Visit_Event_Datetime")
    @SerializedName("VisitEventDatetime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
	@Mapping(getter = "getVisitEvntDtime", setter = "setVisitEvntDtime", type = "java.sql.Timestamp", index = 12)
    protected Date visitEventDatetime;
    @XmlAttribute(name = "Timezone_Name")
    @SerializedName("TimezoneName")
	@Mapping(getter = "getTzName", setter = "setTzName", type = "String", index = 13)
    protected String timezoneName;
    @XmlAttribute(name = "Automatic_Number_Identification")
    @SerializedName("AutomaticNumberIdentification")
	@Mapping(getter = "getAni", setter = "setAni", type = "String", index = 14)
    protected String automaticNumberIdentification;
    @XmlAttribute(name = "Information_Digits")
    @SerializedName("InformationDigits")
	@Mapping(getter = "getInfoDigits", setter = "setInfoDigits", type = "String", index = 15)
    protected String informationDigits;
    @XmlAttribute(name = "Dialed_Number_Identification_Service")
    @SerializedName("DialedNumberIdentificationService")
	@Mapping(getter = "getDnis", setter = "setDnis", type = "String", index = 16)
    protected String dialedNumberIdentificationService;
    @XmlAttribute(name = "Equipment_ID")
    @SerializedName("EquipmentID")
	@Mapping(getter = "getEquipmentId", setter = "setEquipmentId", type = "String", index = 17)
    protected String equipmentID;
    @XmlAttribute(name = "Staff_ID")
    @SerializedName("StaffID")
	@Mapping(getter = "getStaffId", setter = "setStaffId", type = "String", index = 18)
    protected String staffID;
    @XmlAttribute(name = "Patient_ID")
    @SerializedName("PatientID")
	@Mapping(getter = "getPtId", setter = "setPtId", type = "String", index = 19)
    protected String patientID;
    @XmlAttribute(name = "Coordinate_Latitude")
    @SerializedName("CoordinateLatitude")
	@Mapping(getter = "getCoordLatitude", setter = "setCoordLatitude", type = "java.math.BigDecimal", index = 20)
    protected BigDecimal coordinateLatitude;
    @XmlAttribute(name = "Coordinate_Longitide")
    @SerializedName("CoordinateLongitide")
	@Mapping(getter = "getCoordLongitide", setter = "setCoordLongitide", type = "java.math.BigDecimal", index = 21)
    protected BigDecimal coordinateLongitide;
    @XmlAttribute(name = "Coordinate_Accuracy")
    @SerializedName("CoordinateAccuracy")
	@Mapping(getter = "getCoordAccuracy", setter = "setCoordAccuracy", type = "java.math.BigDecimal", index = 22)
    protected BigDecimal coordinateAccuracy;
    @XmlAttribute(name = "Coordinate_Altitude")
    @SerializedName("CoordinateAltitude")
	@Mapping(getter = "getCoordAltitude", setter = "setCoordAltitude", type = "java.math.BigDecimal", index = 23)
    protected BigDecimal coordinateAltitude;
    @XmlAttribute(name = "Coordinate_Altitude_Accuracy")
    @SerializedName("CoordinateAltitudeAccuracy")
	@Mapping(getter = "getCoordAltitudeAccuracy", setter = "setCoordAltitudeAccuracy", type = "java.math.BigDecimal", index = 24)
    protected BigDecimal coordinateAltitudeAccuracy;
    @XmlAttribute(name = "Coordinate_Heading")
    @SerializedName("CoordinateHeading")
	@Mapping(getter = "getCoordHeading", setter = "setCoordHeading", type = "oracle.sql.BINARY_DOUBLE", index = 25)
    protected Double coordinateHeading;
    @XmlAttribute(name = "Coordinate_Speed")
    @SerializedName("CoordinateSpeed")
	@Mapping(getter = "getCoordSpeed", setter = "setCoordSpeed", type = "oracle.sql.BINARY_DOUBLE", index = 26)
    protected Double coordinateSpeed;
    @XmlAttribute(name = "Coordinate_Timestamp")
    @SerializedName("CoordinateTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getCoordTmstp", setter = "setCoordTmstp", type = "java.sql.Timestamp", index = 27)
    protected Date coordinateTimestamp;
    @XmlAttribute(name = "International_Mobile_Station_Equipment_Identity")
    @SerializedName("InternationalMobileStationEquipmentIdentity")
	@Mapping(getter = "getImei", setter = "setImei", type = "String", index = 28)
    protected String internationalMobileStationEquipmentIdentity;
    @XmlAttribute(name = "Call_In_Indicator")
    @SerializedName("CallInIndicator")
	@Mapping(getter = "getCallInInd", setter = "setCallInInd", type = "java.math.BigDecimal", index = 29)
    protected Boolean callInIndicator;
    @XmlAttribute(name = "Call_Out_Indicator")
    @SerializedName("CallOutIndicator")
	@Mapping(getter = "getCallOutInd", setter = "setCallOutInd", type = "java.math.BigDecimal", index = 30)
    protected Boolean callOutIndicator;

    /**
     * Gets the value of the visitEventSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitEventSK() {
        return visitEventSK;
    }

    /**
     * Sets the value of the visitEventSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisitEventSK(BigInteger value) {
        this.visitEventSK = value;
    }

    /**
     * Gets the value of the visitSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitSK() {
        return visitSK;
    }

    /**
     * Sets the value of the visitSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisitSK(BigInteger value) {
        this.visitSK = value;
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
     * Gets the value of the recordEffectiveTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRecordEffectiveTimestamp() {
        return recordEffectiveTimestamp;
    }

    /**
     * Sets the value of the recordEffectiveTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordEffectiveTimestamp(Date value) {
        this.recordEffectiveTimestamp = value;
    }

    /**
     * Gets the value of the recordTerminationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRecordTerminationTimestamp() {
        return recordTerminationTimestamp;
    }

    /**
     * Sets the value of the recordTerminationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTerminationTimestamp(Date value) {
        this.recordTerminationTimestamp = value;
    }

    /**
     * Gets the value of the recordCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordCreatedBy() {
        return recordCreatedBy;
    }

    /**
     * Sets the value of the recordCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCreatedBy(String value) {
        this.recordCreatedBy = value;
    }

    /**
     * Gets the value of the recordUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordUpdatedBy() {
        return recordUpdatedBy;
    }

    /**
     * Sets the value of the recordUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordUpdatedBy(String value) {
        this.recordUpdatedBy = value;
    }

    /**
     * Gets the value of the changeReasonMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeReasonMemo() {
        return changeReasonMemo;
    }

    /**
     * Sets the value of the changeReasonMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeReasonMemo(String value) {
        this.changeReasonMemo = value;
    }

    /**
     * Gets the value of the currentRecordIndicator property.
     * 
     */
    public boolean isCurrentRecordIndicator() {
        return currentRecordIndicator;
    }

    /**
     * Sets the value of the currentRecordIndicator property.
     * 
     */
    public void setCurrentRecordIndicator(boolean value) {
        this.currentRecordIndicator = value;
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
     * Gets the value of the visitEventTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link VisitEventTypeCode }
     *     
     */
    public VisitEventTypeCode getVisitEventTypeCode() {
        return visitEventTypeCode;
    }

    /**
     * Sets the value of the visitEventTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisitEventTypeCode }
     *     
     */
    public void setVisitEventTypeCode(VisitEventTypeCode value) {
        this.visitEventTypeCode = value;
    }

    /**
     * Gets the value of the visitEventDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getVisitEventDatetime() {
        return visitEventDatetime;
    }

    /**
     * Sets the value of the visitEventDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitEventDatetime(Date value) {
        this.visitEventDatetime = value;
    }

    /**
     * Gets the value of the timezoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezoneName() {
        return timezoneName;
    }

    /**
     * Sets the value of the timezoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneName(String value) {
        this.timezoneName = value;
    }

    /**
     * Gets the value of the automaticNumberIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticNumberIdentification() {
        return automaticNumberIdentification;
    }

    /**
     * Sets the value of the automaticNumberIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticNumberIdentification(String value) {
        this.automaticNumberIdentification = value;
    }

    /**
     * Gets the value of the informationDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationDigits() {
        return informationDigits;
    }

    /**
     * Sets the value of the informationDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationDigits(String value) {
        this.informationDigits = value;
    }

    /**
     * Gets the value of the dialedNumberIdentificationService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialedNumberIdentificationService() {
        return dialedNumberIdentificationService;
    }

    /**
     * Sets the value of the dialedNumberIdentificationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialedNumberIdentificationService(String value) {
        this.dialedNumberIdentificationService = value;
    }

    /**
     * Gets the value of the equipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentID() {
        return equipmentID;
    }

    /**
     * Sets the value of the equipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentID(String value) {
        this.equipmentID = value;
    }

    /**
     * Gets the value of the staffID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffID() {
        return staffID;
    }

    /**
     * Sets the value of the staffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffID(String value) {
        this.staffID = value;
    }

    /**
     * Gets the value of the patientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * Sets the value of the patientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientID(String value) {
        this.patientID = value;
    }

    /**
     * Gets the value of the coordinateLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoordinateLatitude() {
        return coordinateLatitude;
    }

    /**
     * Sets the value of the coordinateLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoordinateLatitude(BigDecimal value) {
        this.coordinateLatitude = value;
    }

    /**
     * Gets the value of the coordinateLongitide property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoordinateLongitide() {
        return coordinateLongitide;
    }

    /**
     * Sets the value of the coordinateLongitide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoordinateLongitide(BigDecimal value) {
        this.coordinateLongitide = value;
    }

    /**
     * Gets the value of the coordinateAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoordinateAccuracy() {
        return coordinateAccuracy;
    }

    /**
     * Sets the value of the coordinateAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoordinateAccuracy(BigDecimal value) {
        this.coordinateAccuracy = value;
    }

    /**
     * Gets the value of the coordinateAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoordinateAltitude() {
        return coordinateAltitude;
    }

    /**
     * Sets the value of the coordinateAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoordinateAltitude(BigDecimal value) {
        this.coordinateAltitude = value;
    }

    /**
     * Gets the value of the coordinateAltitudeAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoordinateAltitudeAccuracy() {
        return coordinateAltitudeAccuracy;
    }

    /**
     * Sets the value of the coordinateAltitudeAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoordinateAltitudeAccuracy(BigDecimal value) {
        this.coordinateAltitudeAccuracy = value;
    }

    /**
     * Gets the value of the coordinateHeading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoordinateHeading() {
        return coordinateHeading;
    }

    /**
     * Sets the value of the coordinateHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoordinateHeading(Double value) {
        this.coordinateHeading = value;
    }

    /**
     * Gets the value of the coordinateSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoordinateSpeed() {
        return coordinateSpeed;
    }

    /**
     * Sets the value of the coordinateSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoordinateSpeed(Double value) {
        this.coordinateSpeed = value;
    }

    /**
     * Gets the value of the coordinateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCoordinateTimestamp() {
        return coordinateTimestamp;
    }

    /**
     * Sets the value of the coordinateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateTimestamp(Date value) {
        this.coordinateTimestamp = value;
    }

    /**
     * Gets the value of the internationalMobileStationEquipmentIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalMobileStationEquipmentIdentity() {
        return internationalMobileStationEquipmentIdentity;
    }

    /**
     * Sets the value of the internationalMobileStationEquipmentIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalMobileStationEquipmentIdentity(String value) {
        this.internationalMobileStationEquipmentIdentity = value;
    }

    /**
     * Gets the value of the callInIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallInIndicator() {
        return callInIndicator;
    }

    /**
     * Sets the value of the callInIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallInIndicator(Boolean value) {
        this.callInIndicator = value;
    }

    /**
     * Gets the value of the callOutIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallOutIndicator() {
        return callOutIndicator;
    }

    /**
     * Sets the value of the callOutIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallOutIndicator(Boolean value) {
        this.callOutIndicator = value;
    }

}
