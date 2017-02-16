CREATE OR REPLACE TYPE GENDER_TYP_LKUP_T AS OBJECT (
GENDER_TYP_LKUP_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
REC_EFF_TMSTP DATE,
REC_TERM_TMSTP DATE,
REC_CREATED_BY	VARCHAR2(50 BYTE),
REC_UPDATED_BY	VARCHAR2(50 BYTE),
CHANGE_REASON_MEMO	VARCHAR2(255 BYTE),
CURR_REC_IND	NUMBER(1),
CHANGE_VERSION_ID	NUMBER(38),
GENDER_TYP_NAME	VARCHAR2(50 BYTE),
GENDER_TYP_DESC	VARCHAR2(250 BYTE)
);
/
