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
 * Defines a many-to-many relationship between the Authorization and Service entities.
 * 
 * <p>Java class for Authorization_Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Authorization_Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Authorization_Service_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Record_Create_Timestamp" use="required" type="{}Record_Create_Timestamp" />
 *       &lt;attribute name="Record_Update_Timestamp" use="required" type="{}Record_Update_Timestamp" />
 *       &lt;attribute name="Change_Version_ID" use="required" type="{}Change_Version_ID" />
 *       &lt;attribute name="Authorization_SK" use="required" type="{}Surrogate_Key" />
 *       &lt;attribute name="Business_Entity_ID" use="required" type="{}ID" />
 *       &lt;attribute name="Service_Name" use="required" type="{}Service_Name" />
 *       &lt;attribute name="Billing_Code" type="{}Billing_Code" />
 *       &lt;attribute name="Rate_Type_Name" type="{}Rate_Type_Name" />
 *       &lt;attribute name="Rate_Qualifier_Code" type="{}Rate_Qualifier_Code" />
 *       &lt;attribute name="Authorization_Service_Rate_Amount" type="{}Money" />
 *       &lt;attribute name="Authorization_Service_Start_Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Authorization_Service_End_Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Authorization_Limit_Type_Name" type="{}Authorization_Limit_Type_Name" />
 *       &lt;attribute name="Authorization_Service_Unit_Name" use="required" type="{}Authorization_Service_Unit_Name" />
 *       &lt;attribute name="Authorization_Service_Limit" type="{}Authorization_Limit" />
 *       &lt;attribute name="Authorization_Service_Limit_Day_1" type="{}Authorization_Limit" />
 *       &lt;attribute name="Authorization_Service_Limit_Start_Time_Day_1" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_End_Time_Day_1" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_Day_2" type="{}Authorization_Limit" />
 *       &lt;attribute name="Authorization_Service_Limit_Start_Time_Day_2" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_End_Time_Day_2" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_Day_3" type="{}Authorization_Limit" />
 *       &lt;attribute name="Authorization_Service_Limit_Start_Time_Day_3" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_End_Time_Day_3" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_Day_4" type="{}Authorization_Limit" />
 *       &lt;attribute name="Authorization_Service_Limit_Start_Time_Day_4" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_End_Time_Day_4" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_Day_5" type="{}Authorization_Limit" />
 *       &lt;attribute name="Authorization_Service_Limit_Start_Time_Day_5" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_End_Time_Day_5" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_Day_6" type="{}Authorization_Limit" />
 *       &lt;attribute name="Authorization_Service_Limit_Start_Time_Day_6" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_End_Time_Day_6" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_Day_7" type="{}Authorization_Limit" />
 *       &lt;attribute name="Authorization_Service_Limit_Start_Time_Day_7" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Authorization_Service_Limit_End_Time_Day_7" type="{}Authorization_Limit_Time" />
 *       &lt;attribute name="Payer_ID" type="{}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authorization_Service")
@OracleMetadata(
        packageName = "PKG_AUTH",
        insertMethod = "insertAuthSvc",
        updateMethod = "updateAuthSvc",
        deleteMethod = "deleteAuthSvc",
        getMethod = "getAuthSvc",
        findMethod = "NotDefined_FindMethod",
        jpubClass = "com.sandata.lab.data.model.jpub.model.AuthSvcT",
        primaryKeys = {})
public class AuthorizationService extends BaseObject {

	private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "Authorization_Service_SK", required = true)
    @SerializedName("AuthorizationServiceSK")
	@Mapping(getter = "getAuthSvcSk", setter = "setAuthSvcSk", type = "java.math.BigDecimal", index = 0)
    protected BigInteger authorizationServiceSK;
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
    @XmlAttribute(name = "Authorization_SK", required = true)
    @SerializedName("AuthorizationSK")
	@Mapping(getter = "getAuthSk", setter = "setAuthSk", type = "java.math.BigDecimal", index = 4)
    protected BigInteger authorizationSK;
    @XmlAttribute(name = "Business_Entity_ID", required = true)
    @SerializedName("BusinessEntityID")
	@Mapping(getter = "getBeId", setter = "setBeId", type = "String", index = 5)
    protected String businessEntityID;
    @XmlAttribute(name = "Service_Name", required = true)
    @SerializedName("ServiceName")
	@Mapping(getter = "getSvcName", setter = "setSvcName", type = "String", index = 6)
    protected ServiceName serviceName;
    @XmlAttribute(name = "Billing_Code")
    @SerializedName("BillingCode")
	@Mapping(getter = "getBillingCode", setter = "setBillingCode", type = "String", index = 7)
    protected String billingCode;
    @XmlAttribute(name = "Rate_Type_Name")
    @SerializedName("RateTypeName")
	@Mapping(getter = "getRateTypName", setter = "setRateTypName", type = "String", index = 8)
    protected String rateTypeName;
    @XmlAttribute(name = "Rate_Qualifier_Code")
    @SerializedName("RateQualifierCode")
	@Mapping(getter = "getRateQlfrCode", setter = "setRateQlfrCode", type = "String", index = 9)
    protected RateQualifierCode rateQualifierCode;
    @XmlAttribute(name = "Authorization_Service_Rate_Amount")
    @SerializedName("AuthorizationServiceRateAmount")
	@Mapping(getter = "getAuthSvcRateAmt", setter = "setAuthSvcRateAmt", type = "java.math.BigDecimal", index = 10)
    protected BigDecimal authorizationServiceRateAmount;
    @XmlAttribute(name = "Authorization_Service_Start_Date", required = true)
    @SerializedName("AuthorizationServiceStartDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
	@Mapping(getter = "getAuthSvcStartDate", setter = "setAuthSvcStartDate", type = "java.sql.Timestamp", index = 11)
    protected Date authorizationServiceStartDate;
    @XmlAttribute(name = "Authorization_Service_End_Date", required = true)
    @SerializedName("AuthorizationServiceEndDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
	@Mapping(getter = "getAuthSvcEndDate", setter = "setAuthSvcEndDate", type = "java.sql.Timestamp", index = 12)
    protected Date authorizationServiceEndDate;
    @XmlAttribute(name = "Authorization_Limit_Type_Name")
    @SerializedName("AuthorizationLimitTypeName")
	@Mapping(getter = "getAuthLmtTypName", setter = "setAuthLmtTypName", type = "String", index = 13)
    protected AuthorizationLimitTypeName authorizationLimitTypeName;
    @XmlAttribute(name = "Authorization_Service_Unit_Name", required = true)
    @SerializedName("AuthorizationServiceUnitName")
	@Mapping(getter = "getAuthSvcUnitName", setter = "setAuthSvcUnitName", type = "String", index = 14)
    protected AuthorizationServiceUnitName authorizationServiceUnitName;
    @XmlAttribute(name = "Authorization_Service_Limit")
    @SerializedName("AuthorizationServiceLimit")
	@Mapping(getter = "getAuthSvcLmt", setter = "setAuthSvcLmt", type = "java.math.BigDecimal", index = 15)
    protected BigDecimal authorizationServiceLimit;
    @XmlAttribute(name = "Authorization_Service_Limit_Day_1")
    @SerializedName("AuthorizationServiceLimitDay1")
	@Mapping(getter = "getAuthSvcLmtDay1", setter = "setAuthSvcLmtDay1", type = "java.math.BigDecimal", index = 16)
    protected BigDecimal authorizationServiceLimitDay1;
    @XmlAttribute(name = "Authorization_Service_Limit_Start_Time_Day_1")
    @SerializedName("AuthorizationServiceLimitStartTimeDay1")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtStartTimeDay1", setter = "setAuthSvcLmtStartTimeDay1", type = "java.sql.Timestamp", index = 17)
    protected Date authorizationServiceLimitStartTimeDay1;
    @XmlAttribute(name = "Authorization_Service_Limit_End_Time_Day_1")
    @SerializedName("AuthorizationServiceLimitEndTimeDay1")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtEndTimeDay1", setter = "setAuthSvcLmtEndTimeDay1", type = "java.sql.Timestamp", index = 18)
    protected Date authorizationServiceLimitEndTimeDay1;
    @XmlAttribute(name = "Authorization_Service_Limit_Day_2")
    @SerializedName("AuthorizationServiceLimitDay2")
	@Mapping(getter = "getAuthSvcLmtDay2", setter = "setAuthSvcLmtDay2", type = "java.math.BigDecimal", index = 19)
    protected BigDecimal authorizationServiceLimitDay2;
    @XmlAttribute(name = "Authorization_Service_Limit_Start_Time_Day_2")
    @SerializedName("AuthorizationServiceLimitStartTimeDay2")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtStartTimeDay2", setter = "setAuthSvcLmtStartTimeDay2", type = "java.sql.Timestamp", index = 20)
    protected Date authorizationServiceLimitStartTimeDay2;
    @XmlAttribute(name = "Authorization_Service_Limit_End_Time_Day_2")
    @SerializedName("AuthorizationServiceLimitEndTimeDay2")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtEndTimeDay2", setter = "setAuthSvcLmtEndTimeDay2", type = "java.sql.Timestamp", index = 21)
    protected Date authorizationServiceLimitEndTimeDay2;
    @XmlAttribute(name = "Authorization_Service_Limit_Day_3")
    @SerializedName("AuthorizationServiceLimitDay3")
	@Mapping(getter = "getAuthSvcLmtDay3", setter = "setAuthSvcLmtDay3", type = "java.math.BigDecimal", index = 22)
    protected BigDecimal authorizationServiceLimitDay3;
    @XmlAttribute(name = "Authorization_Service_Limit_Start_Time_Day_3")
    @SerializedName("AuthorizationServiceLimitStartTimeDay3")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtStartTimeDay3", setter = "setAuthSvcLmtStartTimeDay3", type = "java.sql.Timestamp", index = 23)
    protected Date authorizationServiceLimitStartTimeDay3;
    @XmlAttribute(name = "Authorization_Service_Limit_End_Time_Day_3")
    @SerializedName("AuthorizationServiceLimitEndTimeDay3")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtEndTimeDay3", setter = "setAuthSvcLmtEndTimeDay3", type = "java.sql.Timestamp", index = 24)
    protected Date authorizationServiceLimitEndTimeDay3;
    @XmlAttribute(name = "Authorization_Service_Limit_Day_4")
    @SerializedName("AuthorizationServiceLimitDay4")
	@Mapping(getter = "getAuthSvcLmtDay4", setter = "setAuthSvcLmtDay4", type = "java.math.BigDecimal", index = 25)
    protected BigDecimal authorizationServiceLimitDay4;
    @XmlAttribute(name = "Authorization_Service_Limit_Start_Time_Day_4")
    @SerializedName("AuthorizationServiceLimitStartTimeDay4")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtStartTimeDay4", setter = "setAuthSvcLmtStartTimeDay4", type = "java.sql.Timestamp", index = 26)
    protected Date authorizationServiceLimitStartTimeDay4;
    @XmlAttribute(name = "Authorization_Service_Limit_End_Time_Day_4")
    @SerializedName("AuthorizationServiceLimitEndTimeDay4")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtEndTimeDay4", setter = "setAuthSvcLmtEndTimeDay4", type = "java.sql.Timestamp", index = 27)
    protected Date authorizationServiceLimitEndTimeDay4;
    @XmlAttribute(name = "Authorization_Service_Limit_Day_5")
    @SerializedName("AuthorizationServiceLimitDay5")
	@Mapping(getter = "getAuthSvcLmtDay5", setter = "setAuthSvcLmtDay5", type = "java.math.BigDecimal", index = 28)
    protected BigDecimal authorizationServiceLimitDay5;
    @XmlAttribute(name = "Authorization_Service_Limit_Start_Time_Day_5")
    @SerializedName("AuthorizationServiceLimitStartTimeDay5")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtStartTimeDay5", setter = "setAuthSvcLmtStartTimeDay5", type = "java.sql.Timestamp", index = 29)
    protected Date authorizationServiceLimitStartTimeDay5;
    @XmlAttribute(name = "Authorization_Service_Limit_End_Time_Day_5")
    @SerializedName("AuthorizationServiceLimitEndTimeDay5")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtEndTimeDay5", setter = "setAuthSvcLmtEndTimeDay5", type = "java.sql.Timestamp", index = 30)
    protected Date authorizationServiceLimitEndTimeDay5;
    @XmlAttribute(name = "Authorization_Service_Limit_Day_6")
    @SerializedName("AuthorizationServiceLimitDay6")
	@Mapping(getter = "getAuthSvcLmtDay6", setter = "setAuthSvcLmtDay6", type = "java.math.BigDecimal", index = 31)
    protected BigDecimal authorizationServiceLimitDay6;
    @XmlAttribute(name = "Authorization_Service_Limit_Start_Time_Day_6")
    @SerializedName("AuthorizationServiceLimitStartTimeDay6")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtStartTimeDay6", setter = "setAuthSvcLmtStartTimeDay6", type = "java.sql.Timestamp", index = 32)
    protected Date authorizationServiceLimitStartTimeDay6;
    @XmlAttribute(name = "Authorization_Service_Limit_End_Time_Day_6")
    @SerializedName("AuthorizationServiceLimitEndTimeDay6")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtEndTimeDay6", setter = "setAuthSvcLmtEndTimeDay6", type = "java.sql.Timestamp", index = 33)
    protected Date authorizationServiceLimitEndTimeDay6;
    @XmlAttribute(name = "Authorization_Service_Limit_Day_7")
    @SerializedName("AuthorizationServiceLimitDay7")
	@Mapping(getter = "getAuthSvcLmtDay7", setter = "setAuthSvcLmtDay7", type = "java.math.BigDecimal", index = 34)
    protected BigDecimal authorizationServiceLimitDay7;
    @XmlAttribute(name = "Authorization_Service_Limit_Start_Time_Day_7")
    @SerializedName("AuthorizationServiceLimitStartTimeDay7")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtStartTimeDay7", setter = "setAuthSvcLmtStartTimeDay7", type = "java.sql.Timestamp", index = 35)
    protected Date authorizationServiceLimitStartTimeDay7;
    @XmlAttribute(name = "Authorization_Service_Limit_End_Time_Day_7")
    @SerializedName("AuthorizationServiceLimitEndTimeDay7")
    @XmlJavaTypeAdapter(Adapter3 .class)
	@Mapping(getter = "getAuthSvcLmtEndTimeDay7", setter = "setAuthSvcLmtEndTimeDay7", type = "java.sql.Timestamp", index = 36)
    protected Date authorizationServiceLimitEndTimeDay7;
    @XmlAttribute(name = "Payer_ID")
    @SerializedName("PayerID")
	@Mapping(getter = "getPayerId", setter = "setPayerId", type = "String", index = 37)
    protected String payerID;

    /**
     * Gets the value of the authorizationServiceSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthorizationServiceSK() {
        return authorizationServiceSK;
    }

    /**
     * Sets the value of the authorizationServiceSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthorizationServiceSK(BigInteger value) {
        this.authorizationServiceSK = value;
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
     * Gets the value of the authorizationSK property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthorizationSK() {
        return authorizationSK;
    }

    /**
     * Sets the value of the authorizationSK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthorizationSK(BigInteger value) {
        this.authorizationSK = value;
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
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceName }
     *     
     */
    public ServiceName getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceName }
     *     
     */
    public void setServiceName(ServiceName value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the billingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCode() {
        return billingCode;
    }

    /**
     * Sets the value of the billingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCode(String value) {
        this.billingCode = value;
    }

    /**
     * Gets the value of the rateTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTypeName() {
        return rateTypeName;
    }

    /**
     * Sets the value of the rateTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTypeName(String value) {
        this.rateTypeName = value;
    }

    /**
     * Gets the value of the rateQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateQualifierCode }
     *     
     */
    public RateQualifierCode getRateQualifierCode() {
        return rateQualifierCode;
    }

    /**
     * Sets the value of the rateQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateQualifierCode }
     *     
     */
    public void setRateQualifierCode(RateQualifierCode value) {
        this.rateQualifierCode = value;
    }

    /**
     * Gets the value of the authorizationServiceRateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizationServiceRateAmount() {
        return authorizationServiceRateAmount;
    }

    /**
     * Sets the value of the authorizationServiceRateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizationServiceRateAmount(BigDecimal value) {
        this.authorizationServiceRateAmount = value;
    }

    /**
     * Gets the value of the authorizationServiceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceStartDate() {
        return authorizationServiceStartDate;
    }

    /**
     * Sets the value of the authorizationServiceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceStartDate(Date value) {
        this.authorizationServiceStartDate = value;
    }

    /**
     * Gets the value of the authorizationServiceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceEndDate() {
        return authorizationServiceEndDate;
    }

    /**
     * Sets the value of the authorizationServiceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceEndDate(Date value) {
        this.authorizationServiceEndDate = value;
    }

    /**
     * Gets the value of the authorizationLimitTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationLimitTypeName }
     *     
     */
    public AuthorizationLimitTypeName getAuthorizationLimitTypeName() {
        return authorizationLimitTypeName;
    }

    /**
     * Sets the value of the authorizationLimitTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationLimitTypeName }
     *     
     */
    public void setAuthorizationLimitTypeName(AuthorizationLimitTypeName value) {
        this.authorizationLimitTypeName = value;
    }

    /**
     * Gets the value of the authorizationServiceUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationServiceUnitName }
     *     
     */
    public AuthorizationServiceUnitName getAuthorizationServiceUnitName() {
        return authorizationServiceUnitName;
    }

    /**
     * Sets the value of the authorizationServiceUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationServiceUnitName }
     *     
     */
    public void setAuthorizationServiceUnitName(AuthorizationServiceUnitName value) {
        this.authorizationServiceUnitName = value;
    }

    /**
     * Gets the value of the authorizationServiceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizationServiceLimit() {
        return authorizationServiceLimit;
    }

    /**
     * Sets the value of the authorizationServiceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizationServiceLimit(BigDecimal value) {
        this.authorizationServiceLimit = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizationServiceLimitDay1() {
        return authorizationServiceLimitDay1;
    }

    /**
     * Sets the value of the authorizationServiceLimitDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizationServiceLimitDay1(BigDecimal value) {
        this.authorizationServiceLimitDay1 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitStartTimeDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitStartTimeDay1() {
        return authorizationServiceLimitStartTimeDay1;
    }

    /**
     * Sets the value of the authorizationServiceLimitStartTimeDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitStartTimeDay1(Date value) {
        this.authorizationServiceLimitStartTimeDay1 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitEndTimeDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitEndTimeDay1() {
        return authorizationServiceLimitEndTimeDay1;
    }

    /**
     * Sets the value of the authorizationServiceLimitEndTimeDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitEndTimeDay1(Date value) {
        this.authorizationServiceLimitEndTimeDay1 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizationServiceLimitDay2() {
        return authorizationServiceLimitDay2;
    }

    /**
     * Sets the value of the authorizationServiceLimitDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizationServiceLimitDay2(BigDecimal value) {
        this.authorizationServiceLimitDay2 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitStartTimeDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitStartTimeDay2() {
        return authorizationServiceLimitStartTimeDay2;
    }

    /**
     * Sets the value of the authorizationServiceLimitStartTimeDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitStartTimeDay2(Date value) {
        this.authorizationServiceLimitStartTimeDay2 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitEndTimeDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitEndTimeDay2() {
        return authorizationServiceLimitEndTimeDay2;
    }

    /**
     * Sets the value of the authorizationServiceLimitEndTimeDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitEndTimeDay2(Date value) {
        this.authorizationServiceLimitEndTimeDay2 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitDay3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizationServiceLimitDay3() {
        return authorizationServiceLimitDay3;
    }

    /**
     * Sets the value of the authorizationServiceLimitDay3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizationServiceLimitDay3(BigDecimal value) {
        this.authorizationServiceLimitDay3 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitStartTimeDay3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitStartTimeDay3() {
        return authorizationServiceLimitStartTimeDay3;
    }

    /**
     * Sets the value of the authorizationServiceLimitStartTimeDay3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitStartTimeDay3(Date value) {
        this.authorizationServiceLimitStartTimeDay3 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitEndTimeDay3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitEndTimeDay3() {
        return authorizationServiceLimitEndTimeDay3;
    }

    /**
     * Sets the value of the authorizationServiceLimitEndTimeDay3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitEndTimeDay3(Date value) {
        this.authorizationServiceLimitEndTimeDay3 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitDay4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizationServiceLimitDay4() {
        return authorizationServiceLimitDay4;
    }

    /**
     * Sets the value of the authorizationServiceLimitDay4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizationServiceLimitDay4(BigDecimal value) {
        this.authorizationServiceLimitDay4 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitStartTimeDay4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitStartTimeDay4() {
        return authorizationServiceLimitStartTimeDay4;
    }

    /**
     * Sets the value of the authorizationServiceLimitStartTimeDay4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitStartTimeDay4(Date value) {
        this.authorizationServiceLimitStartTimeDay4 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitEndTimeDay4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitEndTimeDay4() {
        return authorizationServiceLimitEndTimeDay4;
    }

    /**
     * Sets the value of the authorizationServiceLimitEndTimeDay4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitEndTimeDay4(Date value) {
        this.authorizationServiceLimitEndTimeDay4 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitDay5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizationServiceLimitDay5() {
        return authorizationServiceLimitDay5;
    }

    /**
     * Sets the value of the authorizationServiceLimitDay5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizationServiceLimitDay5(BigDecimal value) {
        this.authorizationServiceLimitDay5 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitStartTimeDay5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitStartTimeDay5() {
        return authorizationServiceLimitStartTimeDay5;
    }

    /**
     * Sets the value of the authorizationServiceLimitStartTimeDay5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitStartTimeDay5(Date value) {
        this.authorizationServiceLimitStartTimeDay5 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitEndTimeDay5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitEndTimeDay5() {
        return authorizationServiceLimitEndTimeDay5;
    }

    /**
     * Sets the value of the authorizationServiceLimitEndTimeDay5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitEndTimeDay5(Date value) {
        this.authorizationServiceLimitEndTimeDay5 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitDay6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizationServiceLimitDay6() {
        return authorizationServiceLimitDay6;
    }

    /**
     * Sets the value of the authorizationServiceLimitDay6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizationServiceLimitDay6(BigDecimal value) {
        this.authorizationServiceLimitDay6 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitStartTimeDay6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitStartTimeDay6() {
        return authorizationServiceLimitStartTimeDay6;
    }

    /**
     * Sets the value of the authorizationServiceLimitStartTimeDay6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitStartTimeDay6(Date value) {
        this.authorizationServiceLimitStartTimeDay6 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitEndTimeDay6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitEndTimeDay6() {
        return authorizationServiceLimitEndTimeDay6;
    }

    /**
     * Sets the value of the authorizationServiceLimitEndTimeDay6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitEndTimeDay6(Date value) {
        this.authorizationServiceLimitEndTimeDay6 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitDay7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizationServiceLimitDay7() {
        return authorizationServiceLimitDay7;
    }

    /**
     * Sets the value of the authorizationServiceLimitDay7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizationServiceLimitDay7(BigDecimal value) {
        this.authorizationServiceLimitDay7 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitStartTimeDay7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitStartTimeDay7() {
        return authorizationServiceLimitStartTimeDay7;
    }

    /**
     * Sets the value of the authorizationServiceLimitStartTimeDay7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitStartTimeDay7(Date value) {
        this.authorizationServiceLimitStartTimeDay7 = value;
    }

    /**
     * Gets the value of the authorizationServiceLimitEndTimeDay7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAuthorizationServiceLimitEndTimeDay7() {
        return authorizationServiceLimitEndTimeDay7;
    }

    /**
     * Sets the value of the authorizationServiceLimitEndTimeDay7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationServiceLimitEndTimeDay7(Date value) {
        this.authorizationServiceLimitEndTimeDay7 = value;
    }

    /**
     * Gets the value of the payerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerID() {
        return payerID;
    }

    /**
     * Sets the value of the payerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerID(String value) {
        this.payerID = value;
    }

}
