CREATE OR REPLACE TYPE PMT_TERMS_T AS OBJECT (
PMT_TERMS_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
CHANGE_VERSION_ID	NUMBER(38),
PMT_TERMS_ID	VARCHAR2(50 BYTE),
PMT_DUE	NUMBER(7, 2),
DISCOUNT_APPLIED	NUMBER(7, 2)
);
/
