-- 코드를 입력하세요
SELECT B.BOOK_ID, A.AUTHOR_NAME, TO_CHAR(B.PUBLISHED_DATE, 'YYYY-MM-DD') PUBLISHED_DATE
FROM BOOK B, AUTHOR A
WHERE A.AUTHOR_ID = B.AUTHOR_ID
AND B.CATEGORY = '경제'
ORDER BY B.PUBLISHED_DATE