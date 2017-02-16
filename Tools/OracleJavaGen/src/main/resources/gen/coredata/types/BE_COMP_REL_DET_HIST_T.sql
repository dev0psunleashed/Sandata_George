CREATE OR REPLACE TYPE BE_COMP_REL_DET_HIST_T AS OBJECT (
BE_COMP_REL_DET_HIST_SK	NUMBER(38),
REC_CREATE_TMSTP_HIST DATE,
ACTION_CODE	VARCHAR2(8 BYTE),
BE_COMP_REL_DET_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
REC_CREATED_BY	VARCHAR2(50 BYTE),
REC_UPDATED_BY	VARCHAR2(50 BYTE),
CHANGE_REASON_MEMO	VARCHAR2(255 BYTE),
CHANGE_VERSION_ID	NUMBER(38),
BE_ID	VARCHAR2(50 BYTE),
BE_COMP_REL_SK	NUMBER(38),
COMP_RESULT_RDNG_VAL	VARCHAR2(50 BYTE),
COMPLIANT_IND	NUMBER(1),
COMP_MAND_COMPL_THRESHOLD	NUMBER(38),
COMP_STOP_RECUR_IND	NUMBER(1),
COMP_MAND_COMPL_THRESHOLD_UOM	VARCHAR2(50 BYTE)
);
/
