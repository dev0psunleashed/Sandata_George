CREATE OR REPLACE TYPE RPRT_REQ_T AS OBJECT (
RPRT_REQ_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
RPRT_ID	VARCHAR2(50 BYTE),
USER_GUID	VARCHAR2(128 BYTE),
APP_SESS_SK	NUMBER(38)
);
/
