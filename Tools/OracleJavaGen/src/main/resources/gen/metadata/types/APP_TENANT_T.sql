CREATE OR REPLACE TYPE APP_TENANT_T AS OBJECT (
APP_TENANT_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
TENANT_NAME	VARCHAR2(100 BYTE),
TENANT_TYP_NAME	VARCHAR2(50 BYTE)
);
/
