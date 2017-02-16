CREATE OR REPLACE AND COMPILE JAVA SOURCE NAMED "VendorLkup" AS 
import com.sandata.lab.db.oracle.common.handler.OracleQueryHandler;
import oracle.sql.STRUCT;
import oracle.sql.ARRAY;
import java.sql.ResultSet;
import java.sql.SQLException;


public class VendorLkup {

	private static String TABLE_NAME = "VENDOR_LKUP";

	private static String SEQUENCE_KEY_COLUMN_NAME = "VENDOR_LKUP_SK";

	private static int PRIMARY_KEY_INDEX = 1;

	private static int REC_TERM_TMSTP_INDEX = 5;

	private static int CURR_REC_IND_INDEX = 9;

	private static int TABLE_ID_COLUMN_INDEX = -1;

	private static int CHANGE_VERSION_ID_INDEX = 10;

	private static String INSERT_STATEMENT = "INSERT INTO VENDOR_LKUP(VENDOR_LKUP_SK,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,REC_EFF_TMSTP,REC_TERM_TMSTP,REC_CREATED_BY,REC_UPDATED_BY,CHANGE_REASON_MEMO,CURR_REC_IND,CHANGE_VERSION_ID,VENDOR_ID,VENDOR_NAME,VENDOR_EFF_DATE,VENDOR_TERM_DATE,VENDOR_ADDR1,VENDOR_ADDR2,VENDOR_CITY,VENDOR_STATE,VENDOR_PSTL_CODE,VENDOR_ZIP4,PRMY_CONT_NAME,PRMY_CONT_PHONE,PRMY_CONT_PHONE_EXT,PRMY_CONT_EMAIL,SCNDRY_CONT_NAME,SCNDRY_CONT_PHONE,SCNDRY_CONT_PHONE_EXT,SCNDRY_CONT_EMAIL,VENDOR_FEDERAL_TAX_ID) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public static ResultSet getVendorLkup() throws SQLException {

			StringBuilder errLog = new StringBuilder("VendorLkup: getVendorLkup: ");

			try {

					String sql = String.format("SELECT VENDOR_LKUP_SK,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,REC_EFF_TMSTP,REC_TERM_TMSTP,REC_CREATED_BY,REC_UPDATED_BY,CHANGE_REASON_MEMO,CURR_REC_IND,CHANGE_VERSION_ID,VENDOR_ID,VENDOR_NAME,VENDOR_EFF_DATE,VENDOR_TERM_DATE,VENDOR_ADDR1,VENDOR_ADDR2,VENDOR_CITY,VENDOR_STATE,VENDOR_PSTL_CODE,VENDOR_ZIP4,PRMY_CONT_NAME,PRMY_CONT_PHONE,PRMY_CONT_PHONE_EXT,PRMY_CONT_EMAIL,SCNDRY_CONT_NAME,SCNDRY_CONT_PHONE,SCNDRY_CONT_PHONE_EXT,SCNDRY_CONT_EMAIL,VENDOR_FEDERAL_TAX_ID FROM %s WHERE (TO_CHAR(REC_TERM_TMSTP, 'YYYY-MM-DD') = '9999-12-31' AND CURR_REC_IND = '1')", TABLE_NAME);

					return new OracleQueryHandler().execute(sql);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static ResultSet getVendorLkup(long primaryKey) throws SQLException {

			StringBuilder errLog = new StringBuilder("VendorLkup: getVendorLkup: ");

			try {

					String sql = String.format("SELECT VENDOR_LKUP_SK,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,REC_EFF_TMSTP,REC_TERM_TMSTP,REC_CREATED_BY,REC_UPDATED_BY,CHANGE_REASON_MEMO,CURR_REC_IND,CHANGE_VERSION_ID,VENDOR_ID,VENDOR_NAME,VENDOR_EFF_DATE,VENDOR_TERM_DATE,VENDOR_ADDR1,VENDOR_ADDR2,VENDOR_CITY,VENDOR_STATE,VENDOR_PSTL_CODE,VENDOR_ZIP4,PRMY_CONT_NAME,PRMY_CONT_PHONE,PRMY_CONT_PHONE_EXT,PRMY_CONT_EMAIL,SCNDRY_CONT_NAME,SCNDRY_CONT_PHONE,SCNDRY_CONT_PHONE_EXT,SCNDRY_CONT_EMAIL,VENDOR_FEDERAL_TAX_ID FROM %s WHERE %s=? AND (TO_CHAR(REC_TERM_TMSTP, 'YYYY-MM-DD') = '9999-12-31' AND CURR_REC_IND = '1')", TABLE_NAME, SEQUENCE_KEY_COLUMN_NAME);

					return new OracleQueryHandler().execute(sql, new Object[]{primaryKey});

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long insertVendorLkup(STRUCT struct) throws SQLException {

			StringBuilder errLog = new StringBuilder("VendorLkup: insertVendorLkup: ");

			try {

					return new OracleQueryHandler().executeInsert(TABLE_NAME, INSERT_STATEMENT, PRIMARY_KEY_INDEX, REC_TERM_TMSTP_INDEX, CURR_REC_IND_INDEX, TABLE_ID_COLUMN_INDEX, CHANGE_VERSION_ID_INDEX, struct);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long updateVendorLkup(STRUCT struct) throws SQLException {

			StringBuilder errLog = new StringBuilder("VendorLkup: updateVendorLkup: ");

			try {

					return new OracleQueryHandler().executeUpdate(TABLE_NAME, SEQUENCE_KEY_COLUMN_NAME, CHANGE_VERSION_ID_INDEX, struct);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long deleteVendorLkup(long primaryKey) throws SQLException {

			StringBuilder errLog = new StringBuilder("VendorLkup: deleteVendorLkup: ");

			try {

					return  new OracleQueryHandler().executeDelete(TABLE_NAME, SEQUENCE_KEY_COLUMN_NAME, primaryKey, true);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}



}
;
/