package com.sandata.lab.data.model.jpub.model;

import java.sql.SQLException;
import java.sql.Connection;
import oracle.jdbc.OracleTypes;
import oracle.sql.ORAData;
import oracle.sql.ORADataFactory;
import oracle.sql.Datum;
import oracle.sql.STRUCT;
import oracle.jpub.runtime.MutableStruct;

public class StaffTrngClsEvntEnrolT implements ORAData, ORADataFactory
{
  public static final String _SQL_NAME = "COREDATA.STAFF_TRNG_CLS_EVNT_ENROL_T";
  public static final int _SQL_TYPECODE = OracleTypes.STRUCT;

  protected MutableStruct _struct;

  protected static int[] _sqlType =  { 2,91,91,91,91,12,12,12,12,2,2,12,12,12,12,91,12,2 };
  protected static ORADataFactory[] _factory = new ORADataFactory[18];
  protected static final StaffTrngClsEvntEnrolT _StaffTrngClsEvntEnrolTFactory = new StaffTrngClsEvntEnrolT();

  public static ORADataFactory getORADataFactory()
  { return _StaffTrngClsEvntEnrolTFactory; }
  /* constructors */
  protected void _init_struct(boolean init)
  { if (init) _struct = new MutableStruct(new Object[18], _sqlType, _factory); }
  public StaffTrngClsEvntEnrolT()
  { _init_struct(true); }
  public StaffTrngClsEvntEnrolT(java.math.BigDecimal staffTrngClsEvntEnrolSk, java.sql.Timestamp recCreateTmstp, java.sql.Timestamp recUpdateTmstp, java.sql.Timestamp recEffTmstp, java.sql.Timestamp recTermTmstp, String recCreatedBy, String recUpdatedBy, String changeReasonCode, String changeReasonMemo, java.math.BigDecimal currRecInd, java.math.BigDecimal changeVersionId, String beId, String staffId, String staffTrngLocName, String staffTrngCode, java.sql.Timestamp staffTrngStartDtime, String staffTrngQlfr, java.math.BigDecimal staffTrngDropInd) throws SQLException
  { _init_struct(true);
    setStaffTrngClsEvntEnrolSk(staffTrngClsEvntEnrolSk);
    setRecCreateTmstp(recCreateTmstp);
    setRecUpdateTmstp(recUpdateTmstp);
    setRecEffTmstp(recEffTmstp);
    setRecTermTmstp(recTermTmstp);
    setRecCreatedBy(recCreatedBy);
    setRecUpdatedBy(recUpdatedBy);
    setChangeReasonCode(changeReasonCode);
    setChangeReasonMemo(changeReasonMemo);
    setCurrRecInd(currRecInd);
    setChangeVersionId(changeVersionId);
    setBeId(beId);
    setStaffId(staffId);
    setStaffTrngLocName(staffTrngLocName);
    setStaffTrngCode(staffTrngCode);
    setStaffTrngStartDtime(staffTrngStartDtime);
    setStaffTrngQlfr(staffTrngQlfr);
    setStaffTrngDropInd(staffTrngDropInd);
  }

  /* ORAData interface */
  public Datum toDatum(Connection c) throws SQLException
  {
    return _struct.toDatum(c, _SQL_NAME);
  }


  /* ORADataFactory interface */
  public ORAData create(Datum d, int sqlType) throws SQLException
  { return create(null, d, sqlType); }
  protected ORAData create(StaffTrngClsEvntEnrolT o, Datum d, int sqlType) throws SQLException
  {
    if (d == null) return null; 
    if (o == null) o = new StaffTrngClsEvntEnrolT();
    o._struct = new MutableStruct((STRUCT) d, _sqlType, _factory);
    return o;
  }
  /* accessor methods */
  public java.math.BigDecimal getStaffTrngClsEvntEnrolSk() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(0); }

  public void setStaffTrngClsEvntEnrolSk(java.math.BigDecimal staffTrngClsEvntEnrolSk) throws SQLException
  { _struct.setAttribute(0, staffTrngClsEvntEnrolSk); }


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


  public String getChangeReasonCode() throws SQLException
  { return (String) _struct.getAttribute(7); }

  public void setChangeReasonCode(String changeReasonCode) throws SQLException
  { _struct.setAttribute(7, changeReasonCode); }


  public String getChangeReasonMemo() throws SQLException
  { return (String) _struct.getAttribute(8); }

  public void setChangeReasonMemo(String changeReasonMemo) throws SQLException
  { _struct.setAttribute(8, changeReasonMemo); }


  public java.math.BigDecimal getCurrRecInd() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(9); }

  public void setCurrRecInd(java.math.BigDecimal currRecInd) throws SQLException
  { _struct.setAttribute(9, currRecInd); }


  public java.math.BigDecimal getChangeVersionId() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(10); }

  public void setChangeVersionId(java.math.BigDecimal changeVersionId) throws SQLException
  { _struct.setAttribute(10, changeVersionId); }


  public String getBeId() throws SQLException
  { return (String) _struct.getAttribute(11); }

  public void setBeId(String beId) throws SQLException
  { _struct.setAttribute(11, beId); }


  public String getStaffId() throws SQLException
  { return (String) _struct.getAttribute(12); }

  public void setStaffId(String staffId) throws SQLException
  { _struct.setAttribute(12, staffId); }


  public String getStaffTrngLocName() throws SQLException
  { return (String) _struct.getAttribute(13); }

  public void setStaffTrngLocName(String staffTrngLocName) throws SQLException
  { _struct.setAttribute(13, staffTrngLocName); }


  public String getStaffTrngCode() throws SQLException
  { return (String) _struct.getAttribute(14); }

  public void setStaffTrngCode(String staffTrngCode) throws SQLException
  { _struct.setAttribute(14, staffTrngCode); }


  public java.sql.Timestamp getStaffTrngStartDtime() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(15); }

  public void setStaffTrngStartDtime(java.sql.Timestamp staffTrngStartDtime) throws SQLException
  { _struct.setAttribute(15, staffTrngStartDtime); }


  public String getStaffTrngQlfr() throws SQLException
  { return (String) _struct.getAttribute(16); }

  public void setStaffTrngQlfr(String staffTrngQlfr) throws SQLException
  { _struct.setAttribute(16, staffTrngQlfr); }


  public java.math.BigDecimal getStaffTrngDropInd() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(17); }

  public void setStaffTrngDropInd(java.math.BigDecimal staffTrngDropInd) throws SQLException
  { _struct.setAttribute(17, staffTrngDropInd); }

}
