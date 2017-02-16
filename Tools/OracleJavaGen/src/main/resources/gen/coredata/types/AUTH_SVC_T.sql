CREATE OR REPLACE TYPE AUTH_SVC_T AS OBJECT (
AUTH_SVC_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
CHANGE_VERSION_ID	NUMBER(38),
AUTH_SK	NUMBER(38),
BE_ID	VARCHAR2(50 BYTE),
SVC_NAME	VARCHAR2(20 BYTE),
BILLING_CODE	VARCHAR2(20 BYTE),
RATE_TYP_NAME	VARCHAR2(20 BYTE),
RATE_QLFR_CODE	VARCHAR2(4 BYTE),
AUTH_SVC_RATE_AMT	NUMBER(7, 2),
AUTH_SVC_START_DATE DATE,
AUTH_SVC_END_DATE DATE,
AUTH_LMT_TYP_NAME	VARCHAR2(50 BYTE),
AUTH_SVC_UNIT_NAME	VARCHAR2(50 BYTE),
AUTH_SVC_LMT	NUMBER(6, 2),
AUTH_SVC_LMT_DAY_1	NUMBER(6, 2),
AUTH_SVC_LMT_START_TIME_DAY_1 DATE,
AUTH_SVC_LMT_END_TIME_DAY_1 DATE,
AUTH_SVC_LMT_DAY_2	NUMBER(6, 2),
AUTH_SVC_LMT_START_TIME_DAY_2 DATE,
AUTH_SVC_LMT_END_TIME_DAY_2 DATE,
AUTH_SVC_LMT_DAY_3	NUMBER(6, 2),
AUTH_SVC_LMT_START_TIME_DAY_3 DATE,
AUTH_SVC_LMT_END_TIME_DAY_3 DATE,
AUTH_SVC_LMT_DAY_4	NUMBER(6, 2),
AUTH_SVC_LMT_START_TIME_DAY_4 DATE,
AUTH_SVC_LMT_END_TIME_DAY_4 DATE,
AUTH_SVC_LMT_DAY_5	NUMBER(6, 2),
AUTH_SVC_LMT_START_TIME_DAY_5 DATE,
AUTH_SVC_LMT_END_TIME_DAY_5 DATE,
AUTH_SVC_LMT_DAY_6	NUMBER(6, 2),
AUTH_SVC_LMT_START_TIME_DAY_6 DATE,
AUTH_SVC_LMT_END_TIME_DAY_6 DATE,
AUTH_SVC_LMT_DAY_7	NUMBER(6, 2),
AUTH_SVC_LMT_START_TIME_DAY_7 DATE,
AUTH_SVC_LMT_END_TIME_DAY_7 DATE,
PAYER_ID	VARCHAR2(50 BYTE)
);
/