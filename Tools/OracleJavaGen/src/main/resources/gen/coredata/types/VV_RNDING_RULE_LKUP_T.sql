CREATE OR REPLACE TYPE VV_RNDING_RULE_LKUP_T AS OBJECT (
VV_RNDING_RULE_LKUP_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
REC_EFF_TMSTP DATE,
REC_TERM_TMSTP DATE,
REC_CREATED_BY	VARCHAR2(50 BYTE),
REC_UPDATED_BY	VARCHAR2(50 BYTE),
CHANGE_REASON_MEMO	VARCHAR2(255 BYTE),
CURR_REC_IND	NUMBER(1),
CHANGE_VERSION_ID	NUMBER(38),
VV_RNDING_RULE_ID	VARCHAR2(50 BYTE),
VV_RNDING_RULE_NAME	VARCHAR2(100 BYTE),
VV_RNDING_RULE_DESC	VARCHAR2(1000 BYTE),
VV_RNDING_RULE_QLFR	VARCHAR2(50 BYTE),
VV_RNDING_RULE_EFF_DATE DATE,
VV_RNDING_RULE_TERM_DATE DATE
);
/
