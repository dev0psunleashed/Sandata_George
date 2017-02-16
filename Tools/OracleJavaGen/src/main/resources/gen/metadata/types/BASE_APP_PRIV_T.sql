CREATE OR REPLACE TYPE BASE_APP_PRIV_T AS OBJECT (
BASE_APP_PRIV_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
INCL_INHC_IND	NUMBER(1),
PRIV_ACCESS_IND	NUMBER(1),
PRIV_NO_ACCESS_IND	NUMBER(1),
PRIV_CREATE_IND	NUMBER(1),
PRIV_NO_CREATE_IND	NUMBER(1),
PRIV_UPDATE_IND	NUMBER(1),
PRIV_NO_UPDATE_IND	NUMBER(1),
PRIV_DELETE_IND	NUMBER(1),
PRIV_NO_DELETE_IND	NUMBER(1),
EXCL_IND	NUMBER(1)
);
/
