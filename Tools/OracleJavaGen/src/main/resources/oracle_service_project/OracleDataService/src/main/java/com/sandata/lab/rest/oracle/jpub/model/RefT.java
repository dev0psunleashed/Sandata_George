package com.sandata.lab.data.model.jpub.model;

import java.sql.SQLException;
import java.sql.Connection;
import oracle.jdbc.OracleTypes;
import oracle.sql.ORAData;
import oracle.sql.ORADataFactory;
import oracle.sql.Datum;
import oracle.sql.STRUCT;
import oracle.jpub.runtime.MutableStruct;

public class RefT implements ORAData, ORADataFactory
{
  public static final String _SQL_NAME = "COREDATA.REF_T";
  public static final int _SQL_TYPECODE = OracleTypes.STRUCT;

  protected MutableStruct _struct;

  protected static int[] _sqlType =  { 2,12,91,91,91,91,12,12,12,2,2,12,12,12,12,12,12,12,12,12 };
  protected static ORADataFactory[] _factory = new ORADataFactory[20];
  protected static final RefT _RefTFactory = new RefT();

  public static ORADataFactory getORADataFactory()
  { return _RefTFactory; }
  /* constructors */
  protected void _init_struct(boolean init)
  { if (init) _struct = new MutableStruct(new Object[20], _sqlType, _factory); }
  public RefT()
  { _init_struct(true); }
  public RefT(java.math.BigDecimal refSk, String refId, java.sql.Timestamp recCreateTmstp, java.sql.Timestamp recUpdateTmstp, java.sql.Timestamp recEffTmstp, java.sql.Timestamp recTermTmstp, String recCreatedBy, String recUpdatedBy, String changeReasonMemo, java.math.BigDecimal currRecInd, java.math.BigDecimal changeVersionId, String beId, String ptId, String refNum, String refFmtId, String refMaximum, String refMdfr1, String refMdfr2, String refMdfr3, String refMdfr4) throws SQLException
  { _init_struct(true);
    setRefSk(refSk);
    setRefId(refId);
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
    setPtId(ptId);
    setRefNum(refNum);
    setRefFmtId(refFmtId);
    setRefMaximum(refMaximum);
    setRefMdfr1(refMdfr1);
    setRefMdfr2(refMdfr2);
    setRefMdfr3(refMdfr3);
    setRefMdfr4(refMdfr4);
  }

  /* ORAData interface */
  public Datum toDatum(Connection c) throws SQLException
  {
    return _struct.toDatum(c, _SQL_NAME);
  }


  /* ORADataFactory interface */
  public ORAData create(Datum d, int sqlType) throws SQLException
  { return create(null, d, sqlType); }
  protected ORAData create(RefT o, Datum d, int sqlType) throws SQLException
  {
    if (d == null) return null; 
    if (o == null) o = new RefT();
    o._struct = new MutableStruct((STRUCT) d, _sqlType, _factory);
    return o;
  }
  /* accessor methods */
  public java.math.BigDecimal getRefSk() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(0); }

  public void setRefSk(java.math.BigDecimal refSk) throws SQLException
  { _struct.setAttribute(0, refSk); }


  public String getRefId() throws SQLException
  { return (String) _struct.getAttribute(1); }

  public void setRefId(String refId) throws SQLException
  { _struct.setAttribute(1, refId); }


  public java.sql.Timestamp getRecCreateTmstp() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(2); }

  public void setRecCreateTmstp(java.sql.Timestamp recCreateTmstp) throws SQLException
  { _struct.setAttribute(2, recCreateTmstp); }


  public java.sql.Timestamp getRecUpdateTmstp() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(3); }

  public void setRecUpdateTmstp(java.sql.Timestamp recUpdateTmstp) throws SQLException
  { _struct.setAttribute(3, recUpdateTmstp); }


  public java.sql.Timestamp getRecEffTmstp() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(4); }

  public void setRecEffTmstp(java.sql.Timestamp recEffTmstp) throws SQLException
  { _struct.setAttribute(4, recEffTmstp); }


  public java.sql.Timestamp getRecTermTmstp() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(5); }

  public void setRecTermTmstp(java.sql.Timestamp recTermTmstp) throws SQLException
  { _struct.setAttribute(5, recTermTmstp); }


  public String getRecCreatedBy() throws SQLException
  { return (String) _struct.getAttribute(6); }

  public void setRecCreatedBy(String recCreatedBy) throws SQLException
  { _struct.setAttribute(6, recCreatedBy); }


  public String getRecUpdatedBy() throws SQLException
  { return (String) _struct.getAttribute(7); }

  public void setRecUpdatedBy(String recUpdatedBy) throws SQLException
  { _struct.setAttribute(7, recUpdatedBy); }


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


  public String getPtId() throws SQLException
  { return (String) _struct.getAttribute(12); }

  public void setPtId(String ptId) throws SQLException
  { _struct.setAttribute(12, ptId); }


  public String getRefNum() throws SQLException
  { return (String) _struct.getAttribute(13); }

  public void setRefNum(String refNum) throws SQLException
  { _struct.setAttribute(13, refNum); }


  public String getRefFmtId() throws SQLException
  { return (String) _struct.getAttribute(14); }

  public void setRefFmtId(String refFmtId) throws SQLException
  { _struct.setAttribute(14, refFmtId); }


  public String getRefMaximum() throws SQLException
  { return (String) _struct.getAttribute(15); }

  public void setRefMaximum(String refMaximum) throws SQLException
  { _struct.setAttribute(15, refMaximum); }


  public String getRefMdfr1() throws SQLException
  { return (String) _struct.getAttribute(16); }

  public void setRefMdfr1(String refMdfr1) throws SQLException
  { _struct.setAttribute(16, refMdfr1); }


  public String getRefMdfr2() throws SQLException
  { return (String) _struct.getAttribute(17); }

  public void setRefMdfr2(String refMdfr2) throws SQLException
  { _struct.setAttribute(17, refMdfr2); }


  public String getRefMdfr3() throws SQLException
  { return (String) _struct.getAttribute(18); }

  public void setRefMdfr3(String refMdfr3) throws SQLException
  { _struct.setAttribute(18, refMdfr3); }


  public String getRefMdfr4() throws SQLException
  { return (String) _struct.getAttribute(19); }

  public void setRefMdfr4(String refMdfr4) throws SQLException
  { _struct.setAttribute(19, refMdfr4); }

}
