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
 * The Payroll Output table holds records that are generated (extracted) then sent to the payroll vendor.
 * 
 * <p>Java class for Payroll_Output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payroll_Output">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Payroll_Output_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Payroll_Output_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Record_Termination_Timestamp" use="required" type="{}Record_Termination_Timestamp" />
 *       &lt;attribute name="Record_Effective_Timestamp" use="required" type="{}Record_Effective_Timestamp" />
 *       &lt;attribute name="Record_Created_By" type="{}Record_Created_By" />
 *       &lt;attribute name="Record_Updated_By" type="{}Record_Updated_By" />
 *       &lt;attribute name="Change_Reason_Memo" type="{}Change_Reason_Memo" />
 *       &lt;attribute name="Current_Record_Indicator" use="required" type="{}Current_Record_Indicator" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Business_Entity_Line_of_Business_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Staff_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Interface_ID" use="required" type="{}Interface_ID" />
 *       &lt;attribute name="Timesheet_Summary_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Week_End_Date" type="{}Week_End_Date" />
 *       &lt;attribute name="Payroll_Export_Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Payroll_Code" type="{}Payroll_Code" />
 *       &lt;attribute name="Payroll_Hours" type="{}Hours" />
 *       &lt;attribute name="Payroll_Rate" type="{}Money" />
 *       &lt;attribute name="Payroll_Amount" type="{}Money" />
 *       &lt;attribute name="Check_Memo" type="{}Comment_Short" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payroll_Output")
@OracleMetadata(
        packageName = "PKG_PAYROLL",
        insertMethod = "insertPrOutput",
        updateMethod = "updatePrOutput",
        deleteMethod = "deletePrOutput",
        getMethod = "getPrOutput",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.PrOutputT",
        primaryKeys = {})
public class PayrollOutput extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Payroll_Output_SK", required = true)
    @SerializedName("PayrollOutputSK")
	@Mapping(getter = "getPrOutputSk", setter = "setPrOutputSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger payrollOutputSK;
    @XmlAttribute(name = "Payroll_Output_ID", required = true)
    @SerializedName("PayrollOutputID")
	@Mapping(getter = "getPrOutputId", setter = "setPrOutputId", type = "String", index = 1)
    protected String payrollOutputID;
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
    @XmlAttribute(name = "Record_Termination_Timestamp", required = true)
    @SerializedName("RecordTerminationTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecTermTmstp", setter = "setRecTermTmstp", type = "java.sql.Timestamp", index = 4)
    protected Date recordTerminationTimestamp;
    @XmlAttribute(name = "Record_Effective_Timestamp", required = true)
    @SerializedName("RecordEffectiveTimestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
	@Mapping(getter = "getRecEffTmstp", setter = "setRecEffTmstp", type = "java.sql.Timestamp", index = 5)
    protected Date recordEffectiveTimestamp;
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
    @XmlAttribute(name = "Business_Entity_ID", required = true)
    @SerializedName("BusinessEntityID")
	@Mapping(getter = "getBeId", setter = "setBeId", type = "String", index = 11)
    protected String businessEntityID;
    @XmlAttribute(name = "Business_Entity_Line_of_Business_ID", required = true)
    @SerializedName("BusinessEntityLineofBusinessID")
	@Mapping(getter = "getBeLobId", setter = "setBeLobId", type = "String", index = 12)
    protected String businessEntityLineOfBusinessID;
    @XmlAttribute(name = "Staff_ID", required = true)
    @SerializedName("StaffID")
	@Mapping(getter = "getStaffId", setter = "setStaffId", type = "String", index = 13)
    protected String staffID;
    @XmlAttribute(name = "Interface_ID", required = true)
    @SerializedName("InterfaceID")
	@Mapping(getter = "getIntfId", setter = "setIntfId", type = "String", index = 14)
    protected String interfaceID;
    @XmlAttribute(name = "Timesheet_Summary_SK", required = true)
    @SerializedName("TimesheetSummarySK")
	@Mapping(getter = "getTimesheetSummarySk", setter = "setTimesheetSummarySk", type = "java.math.BigDecimal", index = 15)
    protected BigInteger timesheetSummarySK;
    @XmlAttribute(name = "Week_End_Date")
    @SerializedName("WeekEndDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
	@Mapping(getter = "getWeekEndDate", setter = "setWeekEndDate", type = "java.sql.Timestamp", index = 16)
    protected Date weekEndDate;
    @XmlAttribute(name = "Payroll_Export_Date", required = true)
    @SerializedName("PayrollExportDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
	@Mapping(getter = "getPrExportDate", setter = "setPrExportDate", type = "java.sql.Timestamp", index = 17)
    protected Date payrollExportDate;
    @XmlAttribute(name = "Payroll_Code")
    @SerializedName("PayrollCode")
	@Mapping(getter = "getPrCode", setter = "setPrCode", type = "String", index = 18)
    protected String payrollCode;
    @XmlAttribute(name = "Payroll_Hours")
    @SerializedName("PayrollHours")
	@Mapping(getter = "getPrHrs", setter = "setPrHrs", type = "java.math.BigDecimal", index = 19)
    protected BigDecimal payrollHours;
    @XmlAttribute(name = "Payroll_Rate")
    @SerializedName("PayrollRate")
	@Mapping(getter = "getPrRate", setter = "setPrRate", type = "java.math.BigDecimal", index = 20)
    protected BigDecimal payrollRate;
    @XmlAttribute(name = "Payroll_Amount")
    @SerializedName("PayrollAmount")
	@Mapping(getter = "getPrAmt", setter = "setPrAmt", type = "java.math.BigDecimal", index = 21)
    protected BigDecimal payrollAmount;
    @XmlAttribute(name = "Check_Memo")
    @SerializedName("CheckMemo")
	@Mapping(getter = "getCheckMemo", setter = "setCheckMemo", type = "String", index = 22)
    protected String checkMemo;

    /**
     * Gets the value of the payrollOutputSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPayrollOutputSK() {
        return payrollOutputSK;
    }

    /**
     * Sets the value of the payrollOutputSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPayrollOutputSK(BigInteger value) {
        this.payrollOutputSK = value;
    }

    /**
     * Gets the value of the payrollOutputID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollOutputID() {
        return payrollOutputID;
    }

    /**
     * Sets the value of the payrollOutputID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollOutputID(String value) {
        this.payrollOutputID = value;
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
     * Gets the value of the businessEntityLineOfBusinessID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEntityLineOfBusinessID() {
        return businessEntityLineOfBusinessID;
    }

    /**
     * Sets the value of the businessEntityLineOfBusinessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEntityLineOfBusinessID(String value) {
        this.businessEntityLineOfBusinessID = value;
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
     * Gets the value of the interfaceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceID() {
        return interfaceID;
    }

    /**
     * Sets the value of the interfaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceID(String value) {
        this.interfaceID = value;
    }

    /**
     * Gets the value of the timesheetSummarySK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimesheetSummarySK() {
        return timesheetSummarySK;
    }

    /**
     * Sets the value of the timesheetSummarySK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimesheetSummarySK(BigInteger value) {
        this.timesheetSummarySK = value;
    }

    /**
     * Gets the value of the weekEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getWeekEndDate() {
        return weekEndDate;
    }

    /**
     * Sets the value of the weekEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekEndDate(Date value) {
        this.weekEndDate = value;
    }

    /**
     * Gets the value of the payrollExportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPayrollExportDate() {
        return payrollExportDate;
    }

    /**
     * Sets the value of the payrollExportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollExportDate(Date value) {
        this.payrollExportDate = value;
    }

    /**
     * Gets the value of the payrollCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollCode() {
        return payrollCode;
    }

    /**
     * Sets the value of the payrollCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollCode(String value) {
        this.payrollCode = value;
    }

    /**
     * Gets the value of the payrollHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayrollHours() {
        return payrollHours;
    }

    /**
     * Sets the value of the payrollHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayrollHours(BigDecimal value) {
        this.payrollHours = value;
    }

    /**
     * Gets the value of the payrollRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayrollRate() {
        return payrollRate;
    }

    /**
     * Sets the value of the payrollRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayrollRate(BigDecimal value) {
        this.payrollRate = value;
    }

    /**
     * Gets the value of the payrollAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayrollAmount() {
        return payrollAmount;
    }

    /**
     * Sets the value of the payrollAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayrollAmount(BigDecimal value) {
        this.payrollAmount = value;
    }

    /**
     * Gets the value of the checkMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckMemo() {
        return checkMemo;
    }

    /**
     * Sets the value of the checkMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckMemo(String value) {
        this.checkMemo = value;
    }

}
