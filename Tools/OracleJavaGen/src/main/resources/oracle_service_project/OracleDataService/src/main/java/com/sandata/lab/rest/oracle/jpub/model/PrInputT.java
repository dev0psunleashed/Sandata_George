package com.sandata.lab.data.model.jpub.model;

import java.sql.SQLException;
import java.sql.Connection;
import oracle.jdbc.OracleTypes;
import oracle.sql.ORAData;
import oracle.sql.ORADataFactory;
import oracle.sql.Datum;
import oracle.sql.STRUCT;
import oracle.jpub.runtime.MutableStruct;

public class PrInputT implements ORAData, ORADataFactory
{
  public static final String _SQL_NAME = "COREDATA.PR_INPUT_T";
  public static final int _SQL_TYPECODE = OracleTypes.STRUCT;

  protected MutableStruct _struct;

  protected static int[] _sqlType =  { 2,12,91,91,91,91,12,12,12,2,2,12,12,12,91,2,2,12,91,2,12,12,12 };
  protected static ORADataFactory[] _factory = new ORADataFactory[23];
  protected static final PrInputT _PrInputTFactory = new PrInputT();

  public static ORADataFactory getORADataFactory()
  { return _PrInputTFactory; }
  /* constructors */
  protected void _init_struct(boolean init)
  { if (init) _struct = new MutableStruct(new Object[23], _sqlType, _factory); }
  public PrInputT()
  { _init_struct(true); }
  public PrInputT(java.math.BigDecimal prInputSk, String prInputId, java.sql.Timestamp recCreateTmstp, java.sql.Timestamp recUpdateTmstp, java.sql.Timestamp recEffTmstp, java.sql.Timestamp recTermTmstp, String recCreatedBy, String recUpdatedBy, String changeReasonMemo, java.math.BigDecimal currRecInd, java.math.BigDecimal changeVersionId, String beId, String staffId, String intfId, java.sql.Timestamp weekEndDate, java.math.BigDecimal netPayAmt, java.math.BigDecimal grossPayAmt, String checkNum, java.sql.Timestamp checkDate, java.math.BigDecimal checkInd, String eftTxnId, String bankRoutingNum, String bankAccountNum) throws SQLException
  { _init_struct(true);
    setPrInputSk(prInputSk);
    setPrInputId(prInputId);
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
    setIntfId(intfId);
    setWeekEndDate(weekEndDate);
    setNetPayAmt(netPayAmt);
    setGrossPayAmt(grossPayAmt);
    setCheckNum(checkNum);
    setCheckDate(checkDate);
    setCheckInd(checkInd);
    setEftTxnId(eftTxnId);
    setBankRoutingNum(bankRoutingNum);
    setBankAccountNum(bankAccountNum);
  }

  /* ORAData interface */
  public Datum toDatum(Connection c) throws SQLException
  {
    return _struct.toDatum(c, _SQL_NAME);
  }


  /* ORADataFactory interface */
  public ORAData create(Datum d, int sqlType) throws SQLException
  { return create(null, d, sqlType); }
  protected ORAData create(PrInputT o, Datum d, int sqlType) throws SQLException
  {
    if (d == null) return null; 
    if (o == null) o = new PrInputT();
    o._struct = new MutableStruct((STRUCT) d, _sqlType, _factory);
    return o;
  }
  /* accessor methods */
  public java.math.BigDecimal getPrInputSk() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(0); }

  public void setPrInputSk(java.math.BigDecimal prInputSk) throws SQLException
  { _struct.setAttribute(0, prInputSk); }


  public String getPrInputId() throws SQLException
  { return (String) _struct.getAttribute(1); }

  public void setPrInputId(String prInputId) throws SQLException
  { _struct.setAttribute(1, prInputId); }


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


  public String getStaffId() throws SQLException
  { return (String) _struct.getAttribute(12); }

  public void setStaffId(String staffId) throws SQLException
  { _struct.setAttribute(12, staffId); }


  public String getIntfId() throws SQLException
  { return (String) _struct.getAttribute(13); }

  public void setIntfId(String intfId) throws SQLException
  { _struct.setAttribute(13, intfId); }


  public java.sql.Timestamp getWeekEndDate() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(14); }

  public void setWeekEndDate(java.sql.Timestamp weekEndDate) throws SQLException
  { _struct.setAttribute(14, weekEndDate); }


  public java.math.BigDecimal getNetPayAmt() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(15); }

  public void setNetPayAmt(java.math.BigDecimal netPayAmt) throws SQLException
  { _struct.setAttribute(15, netPayAmt); }


  public java.math.BigDecimal getGrossPayAmt() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(16); }

  public void setGrossPayAmt(java.math.BigDecimal grossPayAmt) throws SQLException
  { _struct.setAttribute(16, grossPayAmt); }


  public String getCheckNum() throws SQLException
  { return (String) _struct.getAttribute(17); }

  public void setCheckNum(String checkNum) throws SQLException
  { _struct.setAttribute(17, checkNum); }


  public java.sql.Timestamp getCheckDate() throws SQLException
  { return (java.sql.Timestamp) _struct.getAttribute(18); }

  public void setCheckDate(java.sql.Timestamp checkDate) throws SQLException
  { _struct.setAttribute(18, checkDate); }


  public java.math.BigDecimal getCheckInd() throws SQLException
  { return (java.math.BigDecimal) _struct.getAttribute(19); }

  public void setCheckInd(java.math.BigDecimal checkInd) throws SQLException
  { _struct.setAttribute(19, checkInd); }


  public String getEftTxnId() throws SQLException
  { return (String) _struct.getAttribute(20); }

  public void setEftTxnId(String eftTxnId) throws SQLException
  { _struct.setAttribute(20, eftTxnId); }


  public String getBankRoutingNum() throws SQLException
  { return (String) _struct.getAttribute(21); }

  public void setBankRoutingNum(String bankRoutingNum) throws SQLException
  { _struct.setAttribute(21, bankRoutingNum); }


  public String getBankAccountNum() throws SQLException
  { return (String) _struct.getAttribute(22); }

  public void setBankAccountNum(String bankAccountNum) throws SQLException
  { _struct.setAttribute(22, bankAccountNum); }

}
