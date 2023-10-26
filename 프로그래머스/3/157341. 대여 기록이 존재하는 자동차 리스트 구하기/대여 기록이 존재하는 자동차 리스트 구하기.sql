-- 코드를 입력하세요
SELECT DISTINCT(A.CAR_ID)
FROM CAR_RENTAL_COMPANY_CAR A, 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY B
WHERE A.CAR_TYPE = '세단'
AND A.CAR_ID = B.CAR_ID
AND TO_CHAR(B.START_DATE, 'MM') >= '10'
ORDER BY A.CAR_ID DESC