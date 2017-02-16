CREATE OR REPLACE PACKAGE PKG_TIMESHEET IS

TYPE REF_CURSOR IS REF CURSOR;
FUNCTION getTimesheetSummary(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getTimesheetSummary(TIMESHEETSUMMARY_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getTimesheetSummary(TIMESHEETSUMMARY_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertTimesheetSummary(TIMESHEET_SUMMARY_VAR TIMESHEET_SUMMARY_T) RETURN NUMBER;
FUNCTION updateTimesheetSummary(TIMESHEET_SUMMARY_VAR TIMESHEET_SUMMARY_T) RETURN NUMBER;
FUNCTION deleteTimesheetSummary(TIMESHEET_SUMMARY_KEY NUMBER) RETURN NUMBER;
FUNCTION getTimesheetDet(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getTimesheetDet(TIMESHEETDET_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getTimesheetDet(TIMESHEETDET_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertTimesheetDet(TIMESHEET_DET_VAR TIMESHEET_DET_T) RETURN NUMBER;
FUNCTION updateTimesheetDet(TIMESHEET_DET_VAR TIMESHEET_DET_T) RETURN NUMBER;
FUNCTION deleteTimesheetDet(TIMESHEET_DET_KEY NUMBER) RETURN NUMBER;

END PKG_TIMESHEET;
/

CREATE OR REPLACE PACKAGE BODY PKG_TIMESHEET IS

FUNCTION getTimesheetSummary(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'TimesheetSummary.getTimesheetSummary(java.lang.String) return java.sql.ResultSet';
FUNCTION getTimesheetSummary(TIMESHEETSUMMARY_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'TimesheetSummary.getTimesheetSummary(long) return java.sql.ResultSet';
FUNCTION getTimesheetSummary(TIMESHEETSUMMARY_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'TimesheetSummary.getTimesheetSummary(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertTimesheetSummary(TIMESHEET_SUMMARY_VAR TIMESHEET_SUMMARY_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'TimesheetSummary.insertTimesheetSummary(oracle.sql.STRUCT) return long';
FUNCTION updateTimesheetSummary(TIMESHEET_SUMMARY_VAR TIMESHEET_SUMMARY_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'TimesheetSummary.updateTimesheetSummary(oracle.sql.STRUCT) return long';
FUNCTION deleteTimesheetSummary(TIMESHEET_SUMMARY_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'TimesheetSummary.deleteTimesheetSummary(long) return long';
FUNCTION getTimesheetDet(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'TimesheetDet.getTimesheetDet(java.lang.String) return java.sql.ResultSet';
FUNCTION getTimesheetDet(TIMESHEETDET_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'TimesheetDet.getTimesheetDet(long) return java.sql.ResultSet';
FUNCTION getTimesheetDet(TIMESHEETDET_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'TimesheetDet.getTimesheetDet(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertTimesheetDet(TIMESHEET_DET_VAR TIMESHEET_DET_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'TimesheetDet.insertTimesheetDet(oracle.sql.STRUCT) return long';
FUNCTION updateTimesheetDet(TIMESHEET_DET_VAR TIMESHEET_DET_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'TimesheetDet.updateTimesheetDet(oracle.sql.STRUCT) return long';
FUNCTION deleteTimesheetDet(TIMESHEET_DET_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'TimesheetDet.deleteTimesheetDet(long) return long';

END PKG_TIMESHEET;
/

