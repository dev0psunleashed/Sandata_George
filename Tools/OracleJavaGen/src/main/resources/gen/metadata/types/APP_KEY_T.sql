CREATE OR REPLACE TYPE APP_KEY_T AS OBJECT (
APP_KEY_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
KEY_NAME	VARCHAR2(50 BYTE),
KEY_DESC	VARCHAR2(1000 BYTE)
);
/
