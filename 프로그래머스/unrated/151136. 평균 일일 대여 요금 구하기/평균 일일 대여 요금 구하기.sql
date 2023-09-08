-- 코드를 입력하세요
SELECT ROUND(AVG(DAILY_FEE), 0) AVERAGE_FEE
from car_rental_company_car
group by car_type
HAVING CAR_TYPE = 'SUV'
