CREATE OR REPLACE TYPE PT_RATE_T AS OBJECT (
PT_RATE_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
REC_EFF_TMSTP DATE,
REC_TERM_TMSTP DATE,
REC_CREATED_BY	VARCHAR2(50 BYTE),
REC_UPDATED_BY	VARCHAR2(50 BYTE),
CHANGE_REASON_MEMO	VARCHAR2(255 BYTE),
CURR_REC_IND	NUMBER(1),
CHANGE_VERSION_ID	NUMBER(38),
BE_ID	VARCHAR2(50 BYTE),
PT_ID	VARCHAR2(50 BYTE),
PT_RATE_START_DATE DATE,
PT_RATE_END_DATE DATE,
SVC_NAME	VARCHAR2(20 BYTE),
RATE_SUB_TYP_NAME	VARCHAR2(50 BYTE),
RATE_TYP_NAME	VARCHAR2(20 BYTE),
RATE_QLFR_CODE	VARCHAR2(4 BYTE),
PT_RATE_AMT	NUMBER(7, 2)
);
/