-- 코드를 입력하세요
SELECT A.AUTHOR_ID, B.AUTHOR_NAME, A.CATEGORY, A.PRICE TOTAL_SALES
FROM (
        SELECT B.AUTHOR_ID AUTHOR_ID, B.CATEGORY CATEGORY, SUM(B.PRICE * A.SALES) PRICE
        FROM BOOK_SALES A, BOOK B
        WHERE TO_CHAR(A.SALES_DATE, 'YYYY-MM-DD') LIKE '2022-01%'
        AND A.BOOK_ID = B.BOOK_ID
        GROUP BY B.AUTHOR_ID, B.CATEGORY
    )A, AUTHOR B
WHERE A.AUTHOR_ID = B.AUTHOR_ID
ORDER BY A.AUTHOR_ID, A.CATEGORY DESC