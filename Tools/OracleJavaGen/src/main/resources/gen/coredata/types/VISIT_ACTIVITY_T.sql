CREATE OR REPLACE TYPE VISIT_ACTIVITY_T AS OBJECT (
VISIT_ACTIVITY_SK	NUMBER(38),
REC_CREATE_TMSTP DATE,
REC_UPDATE_TMSTP DATE,
CHANGE_VERSION_ID	NUMBER(38),
VISIT_SK	NUMBER(38),
ACTIVITY_SK	NUMBER(38)
);
/