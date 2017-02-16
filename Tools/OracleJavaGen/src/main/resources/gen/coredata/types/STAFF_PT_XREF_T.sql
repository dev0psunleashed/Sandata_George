CREATE OR REPLACE TYPE STAFF_PT_XREF_T AS OBJECT (
STAFF_PT_XREF_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_TERM_TMSTP DATE,
CHANGE_VERSION_ID	NUMBER(38),
BE_ID	VARCHAR2(50 BYTE),
PT_ID	VARCHAR2(50 BYTE),
STAFF_ID	VARCHAR2(50 BYTE),
STAFF_PT_XREF_EFF_DATE DATE,
STAFF_PT_XREF_TERM_DATE DATE,
SVC_NAME	VARCHAR2(20 BYTE)
);
/
