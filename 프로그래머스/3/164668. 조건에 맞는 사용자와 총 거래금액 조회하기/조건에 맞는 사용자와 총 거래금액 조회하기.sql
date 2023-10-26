-- 코드를 입력하세요
SELECT WRITER_ID A, B.NICKNAME, SUM(A.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD A, USED_GOODS_USER B
WHERE A.STATUS = 'DONE'
AND A.WRITER_ID = B.USER_ID
GROUP BY A.WRITER_ID, B.NICKNAME
HAVING SUM(A.PRICE) >= 700000
ORDER BY TOTAL_SALES

