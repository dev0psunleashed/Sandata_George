CREATE OR REPLACE TYPE APP_DATA_STRUC_HIST_T AS OBJECT (
APP_DATA_STRUC_HIST_SK	NUMBER(38),
REC_CHANGE_TMSTP DATE,
REC_CHANGE_CODE	VARCHAR2(8 BYTE),
APP_DATA_STRUC_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
APP_DATA_STRUC_PAR_SK	NUMBER(38),
APP_SECR_GRP_SK	NUMBER(38),
LGCL_ELT_TYP_NAME	VARCHAR2(50 BYTE),
LGCL_ELT_NAME	VARCHAR2(100 BYTE),
PHYS_ELT_TYP_NAME	VARCHAR2(50 BYTE),
PHYS_ELT_NAME	VARCHAR2(100 BYTE)
);
/
