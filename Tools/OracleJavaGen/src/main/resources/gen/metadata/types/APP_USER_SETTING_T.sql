CREATE OR REPLACE TYPE APP_USER_SETTING_T AS OBJECT (
USER_GUID	VARCHAR2(128 BYTE),
KEY	VARCHAR2(50 BYTE),
VAL	VARCHAR2(1000 BYTE)
);
/
