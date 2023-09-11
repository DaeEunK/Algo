-- 코드를 입력하세요
-- SELECT to_char(datetime, 'hh24') as HOUR, count(datetime) count
-- from animal_outs
-- WHERE TO_CHAR(DATETIME, 'HH24:MI') BETWEEN '09:00' AND '19:59'
-- group by to_char(datetime, 'hh24') 
-- order by to_char(datetime, 'hh24') asc

   SELECT TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) AS HOUR, COUNT(*) AS COUNT
     FROM ANIMAL_OUTS
    WHERE TO_CHAR(DATETIME, 'HH24:MI') BETWEEN '09:00' AND '19:59'
 GROUP BY TO_CHAR(DATETIME, 'HH24')
 ORDER BY TO_CHAR(DATETIME, 'HH24') ASC;