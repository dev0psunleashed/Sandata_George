CREATE OR REPLACE TYPE PT_ID_XWALK_T AS OBJECT (
PT_ID_XWALK_SK	NUMBER(38),
PT_ID_XWALK_ID	VARCHAR2(50 BYTE),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
CHANGE_VERSION_ID	NUMBER(38),
BE_ID	VARCHAR2(50 BYTE),
PT_ID	VARCHAR2(50 BYTE),
PT_ID_TYP	VARCHAR2(50 BYTE),
PT_ID_QLFR	VARCHAR2(100 BYTE),
PT_ID_NUM	VARCHAR2(50 BYTE),
PT_ID_CREATING_ORG	VARCHAR2(100 BYTE)
);
/