CREATE OR REPLACE TYPE STAFF_MEDCL_HIST_T AS OBJECT (
STAFF_MEDCL_HIST_SK	NUMBER(38),
STAFF_MEDCL_HIST_ID	VARCHAR2(50 BYTE),
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
STAFF_ID	VARCHAR2(50 BYTE),
MEDCL_EXAM_ITEM_NAME	VARCHAR2(100 BYTE),
STAFF_MEDCL_ITEM_DATE DATE,
STAFF_MEDCL_ITEM_EXPR_DATE DATE,
STAFF_MEDCL_RESULT	VARCHAR2(50 BYTE),
STAFF_MEDCL_RESULT_RDNG	VARCHAR2(50 BYTE),
STAFF_MEDCL_HIST_NOTE	VARCHAR2(1000 BYTE)
);
/
