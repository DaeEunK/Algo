-- 코드를 입력하세요
SELECT animal_id, name, to_char(datetime, 'yyyy-mm-dd') "날짜"
FROM ANIMAL_INS 
ORDER BY ANIMAL_ID