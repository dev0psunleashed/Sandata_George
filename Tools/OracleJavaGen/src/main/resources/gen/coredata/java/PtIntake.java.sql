CREATE OR REPLACE AND COMPILE JAVA SOURCE NAMED "PtIntake" AS 
import com.sandata.lab.db.oracle.common.handler.OracleQueryHandler;
import oracle.sql.STRUCT;
import oracle.sql.ARRAY;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PtIntake {

	private static String TABLE_NAME = "PT_INTAKE";

	private static String SEQUENCE_KEY_COLUMN_NAME = "PT_INTAKE_SK";

	private static int PRIMARY_KEY_INDEX = 1;

	private static int REC_TERM_TMSTP_INDEX = 6;

	private static int CURR_REC_IND_INDEX = 10;

	private static int TABLE_ID_COLUMN_INDEX = -1;

	private static int CHANGE_VERSION_ID_INDEX = 11;

	private static String INSERT_STATEMENT = "INSERT INTO PT_INTAKE(PT_INTAKE_SK,ADM_ID,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,REC_EFF_TMSTP,REC_TERM_TMSTP,REC_CREATED_BY,REC_UPDATED_BY,CHANGE_REASON_MEMO,CURR_REC_IND,CHANGE_VERSION_ID,PT_INTAKE_CREATION_DATE,BE_ID,PT_ID,ELIG_SK,AUTH_SK,AUTH_QLFR,PROVIDER_SK,PT_INTAKE_UPDATE_DATE,PAYER_TYP) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public static ResultSet getPtIntake(ARRAY params) throws SQLException {

			StringBuilder errLog = new StringBuilder("PtIntake: getPtIntake: ");

			try {

					String selectPattern = "SELECT PT_INTAKE_SK,ADM_ID,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,REC_EFF_TMSTP,REC_TERM_TMSTP,REC_CREATED_BY,REC_UPDATED_BY,CHANGE_REASON_MEMO,CURR_REC_IND,CHANGE_VERSION_ID,PT_INTAKE_CREATION_DATE,BE_ID,PT_ID,ELIG_SK,AUTH_SK,AUTH_QLFR,PROVIDER_SK,PT_INTAKE_UPDATE_DATE,PAYER_TYP FROM PT_INTAKE %s";

					String whereClause = "WHERE PT_ID=? AND BE_ID=? AND (TO_CHAR(REC_TERM_TMSTP, 'YYYY-MM-DD') = '9999-12-31' AND CURR_REC_IND = '1')";

					return new OracleQueryHandler().execute(selectPattern, whereClause, params);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static ResultSet getPtIntake(long primaryKey) throws SQLException {

			StringBuilder errLog = new StringBuilder("PtIntake: getPtIntake: ");

			try {

					String sql = String.format("SELECT PT_INTAKE_SK,ADM_ID,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,REC_EFF_TMSTP,REC_TERM_TMSTP,REC_CREATED_BY,REC_UPDATED_BY,CHANGE_REASON_MEMO,CURR_REC_IND,CHANGE_VERSION_ID,PT_INTAKE_CREATION_DATE,BE_ID,PT_ID,ELIG_SK,AUTH_SK,AUTH_QLFR,PROVIDER_SK,PT_INTAKE_UPDATE_DATE,PAYER_TYP FROM %s WHERE %s=? AND (TO_CHAR(REC_TERM_TMSTP, 'YYYY-MM-DD') = '9999-12-31' AND CURR_REC_IND = '1')", TABLE_NAME, SEQUENCE_KEY_COLUMN_NAME);

					return new OracleQueryHandler().execute(sql, new Object[]{primaryKey});

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long insertPtIntake(STRUCT struct) throws SQLException {

			StringBuilder errLog = new StringBuilder("PtIntake: insertPtIntake: ");

			try {

					return new OracleQueryHandler().executeInsert(TABLE_NAME, INSERT_STATEMENT, PRIMARY_KEY_INDEX, REC_TERM_TMSTP_INDEX, CURR_REC_IND_INDEX, TABLE_ID_COLUMN_INDEX, CHANGE_VERSION_ID_INDEX, struct);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long updatePtIntake(STRUCT struct) throws SQLException {

			StringBuilder errLog = new StringBuilder("PtIntake: updatePtIntake: ");

			try {

					return new OracleQueryHandler().executeUpdate(TABLE_NAME, SEQUENCE_KEY_COLUMN_NAME, CHANGE_VERSION_ID_INDEX, struct);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long deletePtIntake(long primaryKey) throws SQLException {

			StringBuilder errLog = new StringBuilder("PtIntake: deletePtIntake: ");

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
