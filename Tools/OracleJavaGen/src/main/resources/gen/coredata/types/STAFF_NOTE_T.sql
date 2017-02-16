CREATE OR REPLACE TYPE STAFF_NOTE_T AS OBJECT (
STAFF_NOTE_SK	NUMBER(38),
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
STAFF_NOTE_TYP_NAME	VARCHAR2(100 BYTE),
STAFF_NOTE	VARCHAR2(2000 BYTE),
STAFF_NOTE_PRMY_IND	NUMBER(1)
);
/
