CREATE OR REPLACE TYPE APP_FUN_T AS OBJECT (
APP_FUN_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
APP_MOD_SK	NUMBER(38),
FUN_NAME	VARCHAR2(100 BYTE),
FUN_TYP_NAME	VARCHAR2(50 BYTE),
FUN_AREA	VARCHAR2(100 BYTE),
FUN_SCOPE	VARCHAR2(100 BYTE)
);
/
