package com.sandata.lab.data.model.jpub.model;

import java.sql.SQLException;
import java.sql.Connection;
import oracle.jdbc.OracleTypes;
import oracle.sql.ORAData;
import oracle.sql.ORADataFactory;
import oracle.sql.Datum;
import oracle.sql.STRUCT;
import oracle.jpub.runtime.MutableStruct;

public class ContrExcpLstT implements ORAData, ORADataFactory
{
  public static final String _SQL_NAME = "COREDATA.CONTR_EXCP_LST_T";
  public static final int _SQL_TYPECODE = OracleTypes.STRUCT;

  protected MutableStruct _struct;

  protected static int[] _sqlType =  { 2,91,91,91,91,12,12,12,2,2,12,12,12,2,2,2 };
  protected static ORADataFactory[] _factory = new ORADataFactory[16];
  protected static final ContrExcpLstT _ContrExcpLstTFactory = new ContrExcpLstT();

  public static ORADataFactory getORADataFactory()
  { return _ContrExcpLstTFactory; }
  /* constructors */
  protected void _init_struct(boolean init)
  { if (init) _struct = new MutableStruct(new Object[16], _sqlType, _factory); }
  public ContrExcpLstT()
  { _init_struct(true); }
  public ContrExcpLstT(java.math.BigDecimal contrExcpLstSk, java.sql.Timestamp recCreateTmstp, java.sql.Timestamp recUpdateTmstp, java.sql.Timestamp recEffTmstp, java.sql.Timestamp recTermTmstp, String recCreatedBy, String recUpdatedBy, String changeReasonMemo, java.math.BigDecimal currRecInd, java.math.BigDecimal changeVersionId, String payerId, String contrId, String appModName, java.math.BigDecimal excpId, java.math.BigDecimal excpNonFixableInd, java.math.BigDecimal excpAckInd) throws SQLException
  { _init_struct(true);
    setContrExcpLstSk(contrExcpLstSk);
    setRecCreateTmstp(recCreateTmstp);
    setRecUpdateTmstp(recUpdateTmstp);
    setRecEffTmstp(recEffTmstp);
    setRecTermTmstp(recTermTmstp);
    setRecCreatedBy(recCreatedBy);
    setRecUpdatedBy(recUpdatedBy);
    setChangeReasonMemo(changeReasonMemo);
    setCurrRecInd(currRecInd);
    setChangeVersionId(changeVersionId);
    setPayerId(payerId);
    setContrId(contrId);
    setAppModName(appModName);
    setExcpId(excpId);
    setExcpNonFixableInd(excpNonFixableInd);
    setExcpAckInd(excpAckInd);
  }

  /* ORAData interface */
  public Datum toDatum(Connection c) throws SQLException
  {
    return _struct.toDatum(c, _SQL_NAME);
  }


  /* ORADataFactory interface */
  public ORAData create(Datum d, int sqlType) throws SQLException
  { return create(null, d, sqlType); }
  protected ORAData create(ContrExcpLstT o, Datum d, int sqlType) throws SQLException
  {
    if (d == null) return null; 
    if (o == null) o = new ContrExcpLstT();
    o._struct = new MutableStruct((STRUCT) d, _sqlType, _factory);
    return o;
  }
  /* accessor methods */
  public java.math.BigDecimal getContrExcpLstSk() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(0); }

  public void setContrExcpLstSk(java.math.BigDecimal contrExcpLstSk) throws SQLException
  { _struct.setAttribute(0, contrExcpLstSk); }


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


  public String getPayerId() throws SQLException
  { return (String) _struct.getAttribute(10); }

  public void setPayerId(String payerId) throws SQLException
  { _struct.setAttribute(10, payerId); }


  public String getContrId() throws SQLException
  { return (String) _struct.getAttribute(11); }

  public void setContrId(String contrId) throws SQLException
  { _struct.setAttribute(11, contrId); }


  public String getAppModName() throws SQLException
  { return (String) _struct.getAttribute(12); }

  public void setAppModName(String appModName) throws SQLException
  { _struct.setAttribute(12, appModName); }


  public java.math.BigDecimal getExcpId() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(13); }

  public void setExcpId(java.math.BigDecimal excpId) throws SQLException
  { _struct.setAttribute(13, excpId); }


  public java.math.BigDecimal getExcpNonFixableInd() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(14); }

  public void setExcpNonFixableInd(java.math.BigDecimal excpNonFixableInd) throws SQLException
  { _struct.setAttribute(14, excpNonFixableInd); }


  public java.math.BigDecimal getExcpAckInd() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(15); }

  public void setExcpAckInd(java.math.BigDecimal excpAckInd) throws SQLException
  { _struct.setAttribute(15, excpAckInd); }

}
