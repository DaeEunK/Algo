-- 코드를 입력하세요
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, NVL(FREEZER_YN, 'N') FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE SUBSTR(ADDRESS, 0, 3) = '경기도'
ORDER BY WAREHOUSE_ID