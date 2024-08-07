-- 코드를 입력하세요
SELECT A.APNT_NO, C.PT_NAME, C.PT_NO, B.MCDP_CD, B.DR_NAME, A.APNT_YMD
FROM APPOINTMENT A,
    DOCTOR B,
    PATIENT C
WHERE 1=1
AND A.PT_NO = C.PT_NO
AND A.MDDR_ID = B.DR_ID
AND A.MCDP_CD = 'CS'
AND A.APNT_CNCL_YN = 'N'
AND TO_CHAR(A.APNT_YMD, 'YYYY-MM-DD') = '2022-04-13'
ORDER BY A.APNT_YMD