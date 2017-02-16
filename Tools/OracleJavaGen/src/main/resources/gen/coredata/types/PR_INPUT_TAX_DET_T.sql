CREATE OR REPLACE TYPE PR_INPUT_TAX_DET_T AS OBJECT (
PR_INPUT_TAX_DET_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
CHANGE_VERSION_ID	NUMBER(38),
PR_INPUT_SK	NUMBER(38),
BE_ID	VARCHAR2(50 BYTE),
TAX_CODE	VARCHAR2(20 BYTE),
TAX_AMT	NUMBER(7, 2)
);
/
