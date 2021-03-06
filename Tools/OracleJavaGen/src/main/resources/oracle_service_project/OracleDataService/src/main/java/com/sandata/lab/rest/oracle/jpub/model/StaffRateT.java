package com.sandata.lab.data.model.jpub.model;

import java.sql.SQLException;
import java.sql.Connection;
import oracle.jdbc.OracleTypes;
import oracle.sql.ORAData;
import oracle.sql.ORADataFactory;
import oracle.sql.Datum;
import oracle.sql.STRUCT;
import oracle.jpub.runtime.MutableStruct;

public class StaffRateT implements ORAData, ORADataFactory
{
  public static final String _SQL_NAME = "COREDATA.STAFF_RATE_T";
  public static final int _SQL_TYPECODE = OracleTypes.STRUCT;

  protected MutableStruct _struct;

  protected static int[] _sqlType =  { 2,91,91,91,91,12,12,12,2,2,12,12,91,91,12,12,12,12,2 };
  protected static ORADataFactory[] _factory = new ORADataFactory[19];
  protected static final StaffRateT _StaffRateTFactory = new StaffRateT();

  public static ORADataFactory getORADataFactory()
  { return _StaffRateTFactory; }
  /* constructors */
  protected void _init_struct(boolean init)
  { if (init) _struct = new MutableStruct(new Object[19], _sqlType, _factory); }
  public StaffRateT()
  { _init_struct(true); }
  public StaffRateT(java.math.BigDecimal staffRateSk, java.sql.Timestamp recCreateTmstp, java.sql.Timestamp recUpdateTmstp, java.sql.Timestamp recEffTmstp, java.sql.Timestamp recTermTmstp, String recCreatedBy, String recUpdatedBy, String changeReasonMemo, java.math.BigDecimal currRecInd, java.math.BigDecimal changeVersionId, String beId, String staffId, java.sql.Timestamp staffRateEffDate, java.sql.Timestamp staffRateTermDate, String svcName, String rateSubTypName, String rateTypName, String rateQlfrCode, java.math.BigDecimal staffRateAmt) throws SQLException
  { _init_struct(true);
    setStaffRateSk(staffRateSk);
    setRecCreateTmstp(recCreateTmstp);
    setRecUpdateTmstp(recUpdateTmstp);
    setRecEffTmstp(recEffTmstp);
    setRecTermTmstp(recTermTmstp);
    setRecCreatedBy(recCreatedBy);
    setRecUpdatedBy(recUpdatedBy);
    setChangeReasonMemo(changeReasonMemo);
    setCurrRecInd(currRecInd);
    setChangeVersionId(changeVersionId);
    setBeId(beId);
    setStaffId(staffId);
    setStaffRateEffDate(staffRateEffDate);
    setStaffRateTermDate(staffRateTermDate);
    setSvcName(svcName);
    setRateSubTypName(rateSubTypName);
    setRateTypName(rateTypName);
    setRateQlfrCode(rateQlfrCode);
    setStaffRateAmt(staffRateAmt);
  }

  /* ORAData interface */
  public Datum toDatum(Connection c) throws SQLException
  {
    return _struct.toDatum(c, _SQL_NAME);
  }


  /* ORADataFactory interface */
  public ORAData create(Datum d, int sqlType) throws SQLException
  { return create(null, d, sqlType); }
  protected ORAData create(StaffRateT o, Datum d, int sqlType) throws SQLException
  {
    if (d == null) return null; 
    if (o == null) o = new StaffRateT();
    o._struct = new MutableStruct((STRUCT) d, _sqlType, _factory);
    return o;
  }
  /* accessor methods */
  public java.math.BigDecimal getStaffRateSk() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(0); }

  public void setStaffRateSk(java.math.BigDecimal staffRateSk) throws SQLException
  { _struct.setAttribute(0, staffRateSk); }


  public java.sql.Timestamp getRecCreateTmstp() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(1); }

  public void setRecCreateTmstp(java.sql.Timestamp recCreateTmstp) throws SQLException
  { _struct.setAttribute(1, recCreateTmstp); }


  public java.sql.Timestamp getRecUpdateTmstp() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(2); }

  public void setRecUpdateTmstp(java.sql.Timestamp recUpdateTmstp) throws SQLException
  { _struct.setAttribute(2, recUpdateTmstp); }


  public java.sql.Timestamp getRecEffTmstp() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(3); }

  public void setRecEffTmstp(java.sql.Timestamp recEffTmstp) throws SQLException
  { _struct.setAttribute(3, recEffTmstp); }


  public java.sql.Timestamp getRecTermTmstp() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(4); }

  public void setRecTermTmstp(java.sql.Timestamp recTermTmstp) throws SQLException
  { _struct.setAttribute(4, recTermTmstp); }


  public String getRecCreatedBy() throws SQLException
  { return (String) _struct.getAttribute(5); }

  public void setRecCreatedBy(String recCreatedBy) throws SQLException
  { _struct.setAttribute(5, recCreatedBy); }


  public String getRecUpdatedBy() throws SQLException
  { return (String) _struct.getAttribute(6); }

  public void setRecUpdatedBy(String recUpdatedBy) throws SQLException
  { _struct.setAttribute(6, recUpdatedBy); }


  public String getChangeReasonMemo() throws SQLException
  { return (String) _struct.getAttribute(7); }

  public void setChangeReasonMemo(String changeReasonMemo) throws SQLException
  { _struct.setAttribute(7, changeReasonMemo); }


  public java.math.BigDecimal getCurrRecInd() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(8); }

  public void setCurrRecInd(java.math.BigDecimal currRecInd) throws SQLException
  { _struct.setAttribute(8, currRecInd); }


  public java.math.BigDecimal getChangeVersionId() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(9); }

  public void setChangeVersionId(java.math.BigDecimal changeVersionId) throws SQLException
  { _struct.setAttribute(9, changeVersionId); }


  public String getBeId() throws SQLException
  { return (String) _struct.getAttribute(10); }

  public void setBeId(String beId) throws SQLException
  { _struct.setAttribute(10, beId); }


  public String getStaffId() throws SQLException
  { return (String) _struct.getAttribute(11); }

  public void setStaffId(String staffId) throws SQLException
  { _struct.setAttribute(11, staffId); }


  public java.sql.Timestamp getStaffRateEffDate() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(12); }

  public void setStaffRateEffDate(java.sql.Timestamp staffRateEffDate) throws SQLException
  { _struct.setAttribute(12, staffRateEffDate); }


  public java.sql.Timestamp getStaffRateTermDate() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(13); }

  public void setStaffRateTermDate(java.sql.Timestamp staffRateTermDate) throws SQLException
  { _struct.setAttribute(13, staffRateTermDate); }


  public String getSvcName() throws SQLException
  { return (String) _struct.getAttribute(14); }

  public void setSvcName(String svcName) throws SQLException
  { _struct.setAttribute(14, svcName); }


  public String getRateSubTypName() throws SQLException
  { return (String) _struct.getAttribute(15); }

  public void setRateSubTypName(String rateSubTypName) throws SQLException
  { _struct.setAttribute(15, rateSubTypName); }


  public String getRateTypName() throws SQLException
  { return (String) _struct.getAttribute(16); }

  public void setRateTypName(String rateTypName) throws SQLException
  { _struct.setAttribute(16, rateTypName); }


  public String getRateQlfrCode() throws SQLException
  { return (String) _struct.getAttribute(17); }

  public void setRateQlfrCode(String rateQlfrCode) throws SQLException
  { _struct.setAttribute(17, rateQlfrCode); }


  public java.math.BigDecimal getStaffRateAmt() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(18); }

  public void setStaffRateAmt(java.math.BigDecimal staffRateAmt) throws SQLException
  { _struct.setAttribute(18, staffRateAmt); }

}
