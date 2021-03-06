package com.sandata.lab.data.model.jpub.model;

import java.sql.SQLException;
import java.sql.Connection;
import oracle.jdbc.OracleTypes;
import oracle.sql.ORAData;
import oracle.sql.ORADataFactory;
import oracle.sql.Datum;
import oracle.sql.STRUCT;
import oracle.jpub.runtime.MutableStruct;

public class PtDxT implements ORAData, ORADataFactory
{
  public static final String _SQL_NAME = "COREDATA.PT_DX_T";
  public static final int _SQL_TYPECODE = OracleTypes.STRUCT;

  protected MutableStruct _struct;

  protected static int[] _sqlType =  { 2,91,91,91,91,12,12,12,2,2,12,12,12,12,12,2,91,91,91 };
  protected static ORADataFactory[] _factory = new ORADataFactory[19];
  protected static final PtDxT _PtDxTFactory = new PtDxT();

  public static ORADataFactory getORADataFactory()
  { return _PtDxTFactory; }
  /* constructors */
  protected void _init_struct(boolean init)
  { if (init) _struct = new MutableStruct(new Object[19], _sqlType, _factory); }
  public PtDxT()
  { _init_struct(true); }
  public PtDxT(java.math.BigDecimal ptDxSk, java.sql.Timestamp recCreateTmstp, java.sql.Timestamp recUpdateTmstp, java.sql.Timestamp recEffTmstp, java.sql.Timestamp recTermTmstp, String recCreatedBy, String recUpdatedBy, String changeReasonMemo, java.math.BigDecimal currRecInd, java.math.BigDecimal changeVersionId, String beId, String ptId, String icdDxCode, String icdDxCodeRevisionQlfr, String svcName, java.math.BigDecimal icdDxRank, java.sql.Timestamp icdDxFirstOnsetDate, java.sql.Timestamp ptDxEffDate, java.sql.Timestamp ptDxTermDate) throws SQLException
  { _init_struct(true);
    setPtDxSk(ptDxSk);
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
    setIcdDxCode(icdDxCode);
    setIcdDxCodeRevisionQlfr(icdDxCodeRevisionQlfr);
    setSvcName(svcName);
    setIcdDxRank(icdDxRank);
    setIcdDxFirstOnsetDate(icdDxFirstOnsetDate);
    setPtDxEffDate(ptDxEffDate);
    setPtDxTermDate(ptDxTermDate);
  }

  /* ORAData interface */
  public Datum toDatum(Connection c) throws SQLException
  {
    return _struct.toDatum(c, _SQL_NAME);
  }


  /* ORADataFactory interface */
  public ORAData create(Datum d, int sqlType) throws SQLException
  { return create(null, d, sqlType); }
  protected ORAData create(PtDxT o, Datum d, int sqlType) throws SQLException
  {
    if (d == null) return null; 
    if (o == null) o = new PtDxT();
    o._struct = new MutableStruct((STRUCT) d, _sqlType, _factory);
    return o;
  }
  /* accessor methods */
  public java.math.BigDecimal getPtDxSk() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(0); }

  public void setPtDxSk(java.math.BigDecimal ptDxSk) throws SQLException
  { _struct.setAttribute(0, ptDxSk); }


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


  public String getPtId() throws SQLException
  { return (String) _struct.getAttribute(11); }

  public void setPtId(String ptId) throws SQLException
  { _struct.setAttribute(11, ptId); }


  public String getIcdDxCode() throws SQLException
  { return (String) _struct.getAttribute(12); }

  public void setIcdDxCode(String icdDxCode) throws SQLException
  { _struct.setAttribute(12, icdDxCode); }


  public String getIcdDxCodeRevisionQlfr() throws SQLException
  { return (String) _struct.getAttribute(13); }

  public void setIcdDxCodeRevisionQlfr(String icdDxCodeRevisionQlfr) throws SQLException
  { _struct.setAttribute(13, icdDxCodeRevisionQlfr); }


  public String getSvcName() throws SQLException
  { return (String) _struct.getAttribute(14); }

  public void setSvcName(String svcName) throws SQLException
  { _struct.setAttribute(14, svcName); }


  public java.math.BigDecimal getIcdDxRank() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(15); }

  public void setIcdDxRank(java.math.BigDecimal icdDxRank) throws SQLException
  { _struct.setAttribute(15, icdDxRank); }


  public java.sql.Timestamp getIcdDxFirstOnsetDate() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(16); }

  public void setIcdDxFirstOnsetDate(java.sql.Timestamp icdDxFirstOnsetDate) throws SQLException
  { _struct.setAttribute(16, icdDxFirstOnsetDate); }


  public java.sql.Timestamp getPtDxEffDate() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(17); }

  public void setPtDxEffDate(java.sql.Timestamp ptDxEffDate) throws SQLException
  { _struct.setAttribute(17, ptDxEffDate); }


  public java.sql.Timestamp getPtDxTermDate() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(18); }

  public void setPtDxTermDate(java.sql.Timestamp ptDxTermDate) throws SQLException
  { _struct.setAttribute(18, ptDxTermDate); }

}
