CREATE OR REPLACE TYPE APP_FUN_ELT_T AS OBJECT (
APP_FUN_ELT_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
APP_DATA_STRUC_SK	NUMBER(38),
APP_DATA_CONTENT_SK	NUMBER(38),
APP_FUN_SK	NUMBER(38),
APP_MOD_SK	NUMBER(38),
FUN_ELT_NAME	VARCHAR2(100 BYTE)
);
/
