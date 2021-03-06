CREATE OR REPLACE AND COMPILE JAVA SOURCE NAMED "AppUserRole" AS 
import com.sandata.lab.db.oracle.common.handler.OracleQueryHandler;
import oracle.sql.STRUCT;
import oracle.sql.ARRAY;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AppUserRole {

	private static String TABLE_NAME = "APP_USER_ROLE";

	private static String SEQUENCE_KEY_COLUMN_NAME = "APP_USER_ROLE_SK";

	private static int PRIMARY_KEY_INDEX = 1;

	private static int REC_TERM_TMSTP_INDEX = -1;

	private static int CURR_REC_IND_INDEX = -1;

	private static int TABLE_ID_COLUMN_INDEX = -1;

	private static int CHANGE_VERSION_ID_INDEX = -1;

	private static String INSERT_STATEMENT = "INSERT INTO APP_USER_ROLE(APP_USER_ROLE_SK,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,APP_TENANT_SK,APP_USER_SK,APP_ROLE_SK,ACTIVE_ROLE_IND) VALUES (?,?,?,?,?,?,?)";

	public static ResultSet getAppUserRole(long primaryKey) throws SQLException {

			StringBuilder errLog = new StringBuilder("AppUserRole: getAppUserRole: ");

			try {

					String sql = String.format("SELECT APP_USER_ROLE_SK,REC_CREATE_TMSTP,REC_UPDATE_TMSTP,APP_TENANT_SK,APP_USER_SK,APP_ROLE_SK,ACTIVE_ROLE_IND FROM %s WHERE %s=?", TABLE_NAME, SEQUENCE_KEY_COLUMN_NAME);

					return new OracleQueryHandler().execute(sql, new Object[]{primaryKey});

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long insertAppUserRole(STRUCT struct) throws SQLException {

			StringBuilder errLog = new StringBuilder("AppUserRole: insertAppUserRole: ");

			try {

					return new OracleQueryHandler().executeInsert(TABLE_NAME, INSERT_STATEMENT, PRIMARY_KEY_INDEX, REC_TERM_TMSTP_INDEX, CURR_REC_IND_INDEX, TABLE_ID_COLUMN_INDEX, CHANGE_VERSION_ID_INDEX, struct);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long updateAppUserRole(STRUCT struct) throws SQLException {

			StringBuilder errLog = new StringBuilder("AppUserRole: updateAppUserRole: ");

			try {

					return new OracleQueryHandler().executeUpdate(TABLE_NAME, SEQUENCE_KEY_COLUMN_NAME, CHANGE_VERSION_ID_INDEX, struct);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}

	public static long deleteAppUserRole(long primaryKey) throws SQLException {

			StringBuilder errLog = new StringBuilder("AppUserRole: deleteAppUserRole: ");

			try {

					return  new OracleQueryHandler().executeDelete(TABLE_NAME, SEQUENCE_KEY_COLUMN_NAME, primaryKey, false);

			} catch (Exception e) {
					errLog.append("[Exception: " + e.getClass().getName() + ": [Message: " + e.getMessage() + "]");
					throw new SQLException(errLog.toString());

			}
	}



}
;
/
