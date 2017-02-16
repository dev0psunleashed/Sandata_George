CREATE OR REPLACE PACKAGE PKG_PAYER IS

TYPE REF_CURSOR IS REF CURSOR;
FUNCTION getPayerRateMdfr(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getPayerRateMdfr(PAYERRATEMDFR_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getPayerRateMdfr(PAYERRATEMDFR_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertPayerRateMdfr(PAYER_RATE_MDFR_VAR PAYER_RATE_MDFR_T) RETURN NUMBER;
FUNCTION updatePayerRateMdfr(PAYER_RATE_MDFR_VAR PAYER_RATE_MDFR_T) RETURN NUMBER;
FUNCTION deletePayerRateMdfr(PAYER_RATE_MDFR_KEY NUMBER) RETURN NUMBER;
FUNCTION getPayer(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getPayer(PAYER_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getPayer(PAYER_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertPayer(PAYER_VAR PAYER_T) RETURN NUMBER;
FUNCTION updatePayer(PAYER_VAR PAYER_T) RETURN NUMBER;
FUNCTION deletePayer(PAYER_KEY NUMBER) RETURN NUMBER;

END PKG_PAYER;
/

CREATE OR REPLACE PACKAGE BODY PKG_PAYER IS

FUNCTION getPayerRateMdfr(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PayerRateMdfr.getPayerRateMdfr(java.lang.String) return java.sql.ResultSet';
FUNCTION getPayerRateMdfr(PAYERRATEMDFR_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PayerRateMdfr.getPayerRateMdfr(long) return java.sql.ResultSet';
FUNCTION getPayerRateMdfr(PAYERRATEMDFR_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PayerRateMdfr.getPayerRateMdfr(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertPayerRateMdfr(PAYER_RATE_MDFR_VAR PAYER_RATE_MDFR_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PayerRateMdfr.insertPayerRateMdfr(oracle.sql.STRUCT) return long';
FUNCTION updatePayerRateMdfr(PAYER_RATE_MDFR_VAR PAYER_RATE_MDFR_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PayerRateMdfr.updatePayerRateMdfr(oracle.sql.STRUCT) return long';
FUNCTION deletePayerRateMdfr(PAYER_RATE_MDFR_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PayerRateMdfr.deletePayerRateMdfr(long) return long';
FUNCTION getPayer(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'Payer.getPayer(java.lang.String) return java.sql.ResultSet';
FUNCTION getPayer(PAYER_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'Payer.getPayer(long) return java.sql.ResultSet';
FUNCTION getPayer(PAYER_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'Payer.getPayer(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertPayer(PAYER_VAR PAYER_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'Payer.insertPayer(oracle.sql.STRUCT) return long';
FUNCTION updatePayer(PAYER_VAR PAYER_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'Payer.updatePayer(oracle.sql.STRUCT) return long';
FUNCTION deletePayer(PAYER_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'Payer.deletePayer(long) return long';

END PKG_PAYER;
/
