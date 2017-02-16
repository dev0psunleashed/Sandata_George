CREATE OR REPLACE PACKAGE PKG_PAYROLL IS

TYPE REF_CURSOR IS REF CURSOR;
FUNCTION getPrInput(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getPrInput(PRINPUT_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getPrInput(PRINPUT_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertPrInput(PR_INPUT_VAR PR_INPUT_T) RETURN NUMBER;
FUNCTION updatePrInput(PR_INPUT_VAR PR_INPUT_T) RETURN NUMBER;
FUNCTION deletePrInput(PR_INPUT_KEY NUMBER) RETURN NUMBER;
FUNCTION getPrInputDedDet(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getPrInputDedDet(PRINPUTDEDDET_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getPrInputDedDet(PRINPUTDEDDET_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertPrInputDedDet(PR_INPUT_DED_DET_VAR PR_INPUT_DED_DET_T) RETURN NUMBER;
FUNCTION updatePrInputDedDet(PR_INPUT_DED_DET_VAR PR_INPUT_DED_DET_T) RETURN NUMBER;
FUNCTION deletePrInputDedDet(PR_INPUT_DED_DET_KEY NUMBER) RETURN NUMBER;
FUNCTION getPrInputEarnDet(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getPrInputEarnDet(PRINPUTEARNDET_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getPrInputEarnDet(PRINPUTEARNDET_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertPrInputEarnDet(PR_INPUT_EARN_DET_VAR PR_INPUT_EARN_DET_T) RETURN NUMBER;
FUNCTION updatePrInputEarnDet(PR_INPUT_EARN_DET_VAR PR_INPUT_EARN_DET_T) RETURN NUMBER;
FUNCTION deletePrInputEarnDet(PR_INPUT_EARN_DET_KEY NUMBER) RETURN NUMBER;
FUNCTION getPrInputTaxDet(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getPrInputTaxDet(PRINPUTTAXDET_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getPrInputTaxDet(PRINPUTTAXDET_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertPrInputTaxDet(PR_INPUT_TAX_DET_VAR PR_INPUT_TAX_DET_T) RETURN NUMBER;
FUNCTION updatePrInputTaxDet(PR_INPUT_TAX_DET_VAR PR_INPUT_TAX_DET_T) RETURN NUMBER;
FUNCTION deletePrInputTaxDet(PR_INPUT_TAX_DET_KEY NUMBER) RETURN NUMBER;
FUNCTION getPrOutput(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getPrOutput(PROUTPUT_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getPrOutput(PROUTPUT_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertPrOutput(PR_OUTPUT_VAR PR_OUTPUT_T) RETURN NUMBER;
FUNCTION updatePrOutput(PR_OUTPUT_VAR PR_OUTPUT_T) RETURN NUMBER;
FUNCTION deletePrOutput(PR_OUTPUT_KEY NUMBER) RETURN NUMBER;
FUNCTION getPrRateMatrix(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getPrRateMatrix(PRRATEMATRIX_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getPrRateMatrix(PRRATEMATRIX_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertPrRateMatrix(PR_RATE_MATRIX_VAR PR_RATE_MATRIX_T) RETURN NUMBER;
FUNCTION updatePrRateMatrix(PR_RATE_MATRIX_VAR PR_RATE_MATRIX_T) RETURN NUMBER;
FUNCTION deletePrRateMatrix(PR_RATE_MATRIX_KEY NUMBER) RETURN NUMBER;

END PKG_PAYROLL;
/

CREATE OR REPLACE PACKAGE BODY PKG_PAYROLL IS

FUNCTION getPrInput(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInput.getPrInput(java.lang.String) return java.sql.ResultSet';
FUNCTION getPrInput(PRINPUT_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInput.getPrInput(long) return java.sql.ResultSet';
FUNCTION getPrInput(PRINPUT_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInput.getPrInput(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertPrInput(PR_INPUT_VAR PR_INPUT_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInput.insertPrInput(oracle.sql.STRUCT) return long';
FUNCTION updatePrInput(PR_INPUT_VAR PR_INPUT_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInput.updatePrInput(oracle.sql.STRUCT) return long';
FUNCTION deletePrInput(PR_INPUT_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInput.deletePrInput(long) return long';
FUNCTION getPrInputDedDet(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInputDedDet.getPrInputDedDet(java.lang.String) return java.sql.ResultSet';
FUNCTION getPrInputDedDet(PRINPUTDEDDET_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInputDedDet.getPrInputDedDet(long) return java.sql.ResultSet';
FUNCTION getPrInputDedDet(PRINPUTDEDDET_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInputDedDet.getPrInputDedDet(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertPrInputDedDet(PR_INPUT_DED_DET_VAR PR_INPUT_DED_DET_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInputDedDet.insertPrInputDedDet(oracle.sql.STRUCT) return long';
FUNCTION updatePrInputDedDet(PR_INPUT_DED_DET_VAR PR_INPUT_DED_DET_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInputDedDet.updatePrInputDedDet(oracle.sql.STRUCT) return long';
FUNCTION deletePrInputDedDet(PR_INPUT_DED_DET_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInputDedDet.deletePrInputDedDet(long) return long';
FUNCTION getPrInputEarnDet(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInputEarnDet.getPrInputEarnDet(java.lang.String) return java.sql.ResultSet';
FUNCTION getPrInputEarnDet(PRINPUTEARNDET_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInputEarnDet.getPrInputEarnDet(long) return java.sql.ResultSet';
FUNCTION getPrInputEarnDet(PRINPUTEARNDET_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInputEarnDet.getPrInputEarnDet(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertPrInputEarnDet(PR_INPUT_EARN_DET_VAR PR_INPUT_EARN_DET_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInputEarnDet.insertPrInputEarnDet(oracle.sql.STRUCT) return long';
FUNCTION updatePrInputEarnDet(PR_INPUT_EARN_DET_VAR PR_INPUT_EARN_DET_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInputEarnDet.updatePrInputEarnDet(oracle.sql.STRUCT) return long';
FUNCTION deletePrInputEarnDet(PR_INPUT_EARN_DET_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInputEarnDet.deletePrInputEarnDet(long) return long';
FUNCTION getPrInputTaxDet(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInputTaxDet.getPrInputTaxDet(java.lang.String) return java.sql.ResultSet';
FUNCTION getPrInputTaxDet(PRINPUTTAXDET_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInputTaxDet.getPrInputTaxDet(long) return java.sql.ResultSet';
FUNCTION getPrInputTaxDet(PRINPUTTAXDET_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrInputTaxDet.getPrInputTaxDet(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertPrInputTaxDet(PR_INPUT_TAX_DET_VAR PR_INPUT_TAX_DET_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInputTaxDet.insertPrInputTaxDet(oracle.sql.STRUCT) return long';
FUNCTION updatePrInputTaxDet(PR_INPUT_TAX_DET_VAR PR_INPUT_TAX_DET_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInputTaxDet.updatePrInputTaxDet(oracle.sql.STRUCT) return long';
FUNCTION deletePrInputTaxDet(PR_INPUT_TAX_DET_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrInputTaxDet.deletePrInputTaxDet(long) return long';
FUNCTION getPrOutput(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrOutput.getPrOutput(java.lang.String) return java.sql.ResultSet';
FUNCTION getPrOutput(PROUTPUT_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrOutput.getPrOutput(long) return java.sql.ResultSet';
FUNCTION getPrOutput(PROUTPUT_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrOutput.getPrOutput(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertPrOutput(PR_OUTPUT_VAR PR_OUTPUT_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrOutput.insertPrOutput(oracle.sql.STRUCT) return long';
FUNCTION updatePrOutput(PR_OUTPUT_VAR PR_OUTPUT_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrOutput.updatePrOutput(oracle.sql.STRUCT) return long';
FUNCTION deletePrOutput(PR_OUTPUT_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrOutput.deletePrOutput(long) return long';
FUNCTION getPrRateMatrix(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrRateMatrix.getPrRateMatrix(java.lang.String) return java.sql.ResultSet';
FUNCTION getPrRateMatrix(PRRATEMATRIX_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrRateMatrix.getPrRateMatrix(long) return java.sql.ResultSet';
FUNCTION getPrRateMatrix(PRRATEMATRIX_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'PrRateMatrix.getPrRateMatrix(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertPrRateMatrix(PR_RATE_MATRIX_VAR PR_RATE_MATRIX_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrRateMatrix.insertPrRateMatrix(oracle.sql.STRUCT) return long';
FUNCTION updatePrRateMatrix(PR_RATE_MATRIX_VAR PR_RATE_MATRIX_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrRateMatrix.updatePrRateMatrix(oracle.sql.STRUCT) return long';
FUNCTION deletePrRateMatrix(PR_RATE_MATRIX_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'PrRateMatrix.deletePrRateMatrix(long) return long';

END PKG_PAYROLL;
/

