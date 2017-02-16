CREATE OR REPLACE AND COMPILE JAVA SOURCE NAMED "BeHcpLkup" AS 
import com.sandata.lab.db.oracle.common.handler.OracleQueryHandler;
import oracle.sql.STRUCT;
import oracle.sql.ARRAY;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BeHcpLkup {

	private static String TABLE_NAME = "BE_HCP_LKUP";

	private static String SEQUENCE_KEY_COLUMN_NAME = "BE_HCP_LKUP_SK";

	private static int PRIMARY_KEY_INDEX = 1;

	private static int REC_TERM_TMSTP_INDEX = 5;

	private static int CURR_REC_IND_INDEX = 9;

	private static int TABLE_ID_COLUMN_INDEX = -1;

	private static int CHANGE_VERSION_ID_INDEX = 10;

	private static String INSERT_STATEMENT = "INSERT INTO BE_HCP_LKUP(BE_HCP_LKUP_SK,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,REC_EFF_TMSTP,REC_TERM_TMSTP,REC_CREATED_BY,REC_UPDATED_BY,CHANGE_REASON_MEMO,CURR_REC_IND,CHANGE_VERSION_ID,BE_ID,HCP_FIRST_NAME,HCP_LAST_NAME,HCP_SPECIALTY_QLFR,HCP_PHONE,HCP_PHONE_EXT,HCP_FAX,HCP_ADDR1,HCP_ADDR2,HCP_CITY,HCP_STATE,HCP_PSTL_CODE,HCP_ZIP4,HCP_EMAIL_ADDR,HCP_API,HCP_NPI,HCP_TIN,HCP_TIN_QLFR,HCP_LICENSE_NUM,HCP_EFF_DATE,HCP_TERM_DATE) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public static ResultSet getBeHcpLkup() throws SQLException {

			StringBuilder errLog = new StringBuilder("BeHcpLkup: getBeHcpLkup: ");

			try {

					String sql = String.format("SELECT BE_HCP_LKUP_SK,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,REC_EFF_TMSTP,REC_TERM_TMSTP,REC_CREATED_BY,REC_UPDATED_BY,CHANGE_REASON_MEMO,CURR_REC_IND,CHANGE_VERSION_ID,BE_ID,HCP_FIRST_NAME,HCP_LAST_NAME,HCP_SPECIALTY_QLFR,HCP_PHONE,HCP_PHONE_EXT,HCP_FAX,HCP_ADDR1,HCP_ADDR2,HCP_CITY,HCP_STATE,HCP_PSTL_CODE,HCP_ZIP4,HCP_EMAIL_ADDR,HCP_API,HCP_NPI,HCP_TIN,HCP_TIN_QLFR,HCP_LICENSE_NUM,HCP_EFF_DATE,HCP_TERM_DATE FROM %s WHERE (TO_CHAR(REC_TERM_TMSTP, 'YYYY-MM-DD') = '9999-12-31' AND CURR_REC_IND = '1')", TABLE_NAME);

					return new OracleQueryHandler().execute(sql);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static ResultSet getBeHcpLkup(ARRAY params) throws SQLException {

			StringBuilder errLog = new StringBuilder("BeHcpLkup: getBeHcpLkup: ");

			try {

					String selectPattern = "SELECT BE_HCP_LKUP_SK,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,REC_EFF_TMSTP,REC_TERM_TMSTP,REC_CREATED_BY,REC_UPDATED_BY,CHANGE_REASON_MEMO,CURR_REC_IND,CHANGE_VERSION_ID,BE_ID,HCP_FIRST_NAME,HCP_LAST_NAME,HCP_SPECIALTY_QLFR,HCP_PHONE,HCP_PHONE_EXT,HCP_FAX,HCP_ADDR1,HCP_ADDR2,HCP_CITY,HCP_STATE,HCP_PSTL_CODE,HCP_ZIP4,HCP_EMAIL_ADDR,HCP_API,HCP_NPI,HCP_TIN,HCP_TIN_QLFR,HCP_LICENSE_NUM,HCP_EFF_DATE,HCP_TERM_DATE FROM BE_HCP_LKUP %s";

					String whereClause = "WHERE BE_ID=? AND (TO_CHAR(REC_TERM_TMSTP, 'YYYY-MM-DD') = '9999-12-31' AND CURR_REC_IND = '1')";

					return new OracleQueryHandler().execute(selectPattern, whereClause, params);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static ResultSet getBeHcpLkup(long primaryKey) throws SQLException {

			StringBuilder errLog = new StringBuilder("BeHcpLkup: getBeHcpLkup: ");

			try {

					String sql = String.format("SELECT BE_HCP_LKUP_SK,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,REC_EFF_TMSTP,REC_TERM_TMSTP,REC_CREATED_BY,REC_UPDATED_BY,CHANGE_REASON_MEMO,CURR_REC_IND,CHANGE_VERSION_ID,BE_ID,HCP_FIRST_NAME,HCP_LAST_NAME,HCP_SPECIALTY_QLFR,HCP_PHONE,HCP_PHONE_EXT,HCP_FAX,HCP_ADDR1,HCP_ADDR2,HCP_CITY,HCP_STATE,HCP_PSTL_CODE,HCP_ZIP4,HCP_EMAIL_ADDR,HCP_API,HCP_NPI,HCP_TIN,HCP_TIN_QLFR,HCP_LICENSE_NUM,HCP_EFF_DATE,HCP_TERM_DATE FROM %s WHERE %s=? AND (TO_CHAR(REC_TERM_TMSTP, 'YYYY-MM-DD') = '9999-12-31' AND CURR_REC_IND = '1')", TABLE_NAME, SEQUENCE_KEY_COLUMN_NAME);

					return new OracleQueryHandler().execute(sql, new Object[]{primaryKey});

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long insertBeHcpLkup(STRUCT struct) throws SQLException {

			StringBuilder errLog = new StringBuilder("BeHcpLkup: insertBeHcpLkup: ");

			try {

					return new OracleQueryHandler().executeInsert(TABLE_NAME, INSERT_STATEMENT, PRIMARY_KEY_INDEX, REC_TERM_TMSTP_INDEX, CURR_REC_IND_INDEX, TABLE_ID_COLUMN_INDEX, CHANGE_VERSION_ID_INDEX, struct);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long updateBeHcpLkup(STRUCT struct) throws SQLException {

			StringBuilder errLog = new StringBuilder("BeHcpLkup: updateBeHcpLkup: ");

			try {

					return new OracleQueryHandler().executeUpdate(TABLE_NAME, SEQUENCE_KEY_COLUMN_NAME, CHANGE_VERSION_ID_INDEX, struct);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long deleteBeHcpLkup(long primaryKey) throws SQLException {

			StringBuilder errLog = new StringBuilder("BeHcpLkup: deleteBeHcpLkup: ");

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
