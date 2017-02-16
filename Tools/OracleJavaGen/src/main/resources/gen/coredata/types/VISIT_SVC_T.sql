CREATE OR REPLACE TYPE VISIT_SVC_T AS OBJECT (
VISIT_SVC_SK	NUMBER(38),
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
VISIT_SK	NUMBER(38),
SVC_NAME	VARCHAR2(20 BYTE),
RATE_TYP_NAME	VARCHAR2(20 BYTE),
RATE_QLFR_CODE	VARCHAR2(4 BYTE),
VISIT_SVC_CNFRM_QLFR	VARCHAR2(50 BYTE)
);
/
