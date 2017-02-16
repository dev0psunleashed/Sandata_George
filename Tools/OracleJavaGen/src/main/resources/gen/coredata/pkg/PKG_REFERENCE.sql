CREATE OR REPLACE PACKAGE PKG_REFERENCE IS

TYPE REF_CURSOR IS REF CURSOR;
FUNCTION getRef(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getRef(REF_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getRef(REF_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertRef(REF_VAR REF_T) RETURN NUMBER;
FUNCTION updateRef(REF_VAR REF_T) RETURN NUMBER;
FUNCTION deleteRef(REF_KEY NUMBER) RETURN NUMBER;

END PKG_REFERENCE;
/

CREATE OR REPLACE PACKAGE BODY PKG_REFERENCE IS

FUNCTION getRef(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'Ref.getRef(java.lang.String) return java.sql.ResultSet';
FUNCTION getRef(REF_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'Ref.getRef(long) return java.sql.ResultSet';
FUNCTION getRef(REF_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'Ref.getRef(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertRef(REF_VAR REF_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'Ref.insertRef(oracle.sql.STRUCT) return long';
FUNCTION updateRef(REF_VAR REF_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'Ref.updateRef(oracle.sql.STRUCT) return long';
FUNCTION deleteRef(REF_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'Ref.deleteRef(long) return long';

END PKG_REFERENCE;
/

