CREATE OR REPLACE PACKAGE PKG_INVOICE IS

TYPE REF_CURSOR IS REF CURSOR;
FUNCTION getInvNote RETURN REF_CURSOR;
FUNCTION getInvNote(INVNOTE_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getInvNote(INVNOTE_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertInvNote(INV_NOTE_VAR INV_NOTE_T) RETURN NUMBER;
FUNCTION updateInvNote(INV_NOTE_VAR INV_NOTE_T) RETURN NUMBER;
FUNCTION deleteInvNote(INV_NOTE_KEY NUMBER) RETURN NUMBER;
FUNCTION getInvDetNote RETURN REF_CURSOR;
FUNCTION getInvDetNote(INVDETNOTE_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getInvDetNote(INVDETNOTE_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertInvDetNote(INV_DET_NOTE_VAR INV_DET_NOTE_T) RETURN NUMBER;
FUNCTION updateInvDetNote(INV_DET_NOTE_VAR INV_DET_NOTE_T) RETURN NUMBER;
FUNCTION deleteInvDetNote(INV_DET_NOTE_KEY NUMBER) RETURN NUMBER;
FUNCTION getInvDet(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getInvDet(INVDET_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getInvDet(INVDET_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertInvDet(INV_DET_VAR INV_DET_T) RETURN NUMBER;
FUNCTION updateInvDet(INV_DET_VAR INV_DET_T) RETURN NUMBER;
FUNCTION deleteInvDet(INV_DET_KEY NUMBER) RETURN NUMBER;
FUNCTION getInv(BE_ID VARCHAR2) RETURN REF_CURSOR;
FUNCTION getInv(INV_KEY NUMBER) RETURN REF_CURSOR;
FUNCTION getInv(INV_ARRAY STRING_ARRAY) RETURN REF_CURSOR;
FUNCTION insertInv(INV_VAR INV_T) RETURN NUMBER;
FUNCTION updateInv(INV_VAR INV_T) RETURN NUMBER;
FUNCTION deleteInv(INV_KEY NUMBER) RETURN NUMBER;

END PKG_INVOICE;
/

CREATE OR REPLACE PACKAGE BODY PKG_INVOICE IS

FUNCTION getInvNote RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'InvNote.getInvNote() return java.sql.ResultSet';
FUNCTION getInvNote(INVNOTE_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'InvNote.getInvNote(long) return java.sql.ResultSet';
FUNCTION getInvNote(INVNOTE_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'InvNote.getInvNote(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertInvNote(INV_NOTE_VAR INV_NOTE_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'InvNote.insertInvNote(oracle.sql.STRUCT) return long';
FUNCTION updateInvNote(INV_NOTE_VAR INV_NOTE_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'InvNote.updateInvNote(oracle.sql.STRUCT) return long';
FUNCTION deleteInvNote(INV_NOTE_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'InvNote.deleteInvNote(long) return long';
FUNCTION getInvDetNote RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'InvDetNote.getInvDetNote() return java.sql.ResultSet';
FUNCTION getInvDetNote(INVDETNOTE_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'InvDetNote.getInvDetNote(long) return java.sql.ResultSet';
FUNCTION getInvDetNote(INVDETNOTE_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'InvDetNote.getInvDetNote(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertInvDetNote(INV_DET_NOTE_VAR INV_DET_NOTE_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'InvDetNote.insertInvDetNote(oracle.sql.STRUCT) return long';
FUNCTION updateInvDetNote(INV_DET_NOTE_VAR INV_DET_NOTE_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'InvDetNote.updateInvDetNote(oracle.sql.STRUCT) return long';
FUNCTION deleteInvDetNote(INV_DET_NOTE_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'InvDetNote.deleteInvDetNote(long) return long';
FUNCTION getInvDet(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'InvDet.getInvDet(java.lang.String) return java.sql.ResultSet';
FUNCTION getInvDet(INVDET_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'InvDet.getInvDet(long) return java.sql.ResultSet';
FUNCTION getInvDet(INVDET_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'InvDet.getInvDet(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertInvDet(INV_DET_VAR INV_DET_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'InvDet.insertInvDet(oracle.sql.STRUCT) return long';
FUNCTION updateInvDet(INV_DET_VAR INV_DET_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'InvDet.updateInvDet(oracle.sql.STRUCT) return long';
FUNCTION deleteInvDet(INV_DET_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'InvDet.deleteInvDet(long) return long';
FUNCTION getInv(BE_ID VARCHAR2) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'Inv.getInv(java.lang.String) return java.sql.ResultSet';
FUNCTION getInv(INV_KEY NUMBER) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'Inv.getInv(long) return java.sql.ResultSet';
FUNCTION getInv(INV_ARRAY STRING_ARRAY) RETURN REF_CURSOR
AS LANGUAGE JAVA NAME 'Inv.getInv(oracle.sql.ARRAY) return java.sql.ResultSet';
FUNCTION insertInv(INV_VAR INV_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'Inv.insertInv(oracle.sql.STRUCT) return long';
FUNCTION updateInv(INV_VAR INV_T) RETURN NUMBER
AS LANGUAGE JAVA NAME 'Inv.updateInv(oracle.sql.STRUCT) return long';
FUNCTION deleteInv(INV_KEY NUMBER) RETURN NUMBER
AS LANGUAGE JAVA NAME 'Inv.deleteInv(long) return long';

END PKG_INVOICE;
/
