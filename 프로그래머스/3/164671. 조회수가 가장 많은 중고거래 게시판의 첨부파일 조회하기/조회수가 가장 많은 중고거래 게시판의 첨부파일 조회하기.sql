-- 코드를 입력하세요
SELECT '/home/grep/src/' || a.board_id || '/' || b.file_id || b.file_name || b.file_ext AS FILE_PATH
FROM USED_GOODS_BOARD A,
USED_GOODS_FILE B
WHERE A.BOARD_ID = B.BOARD_ID
AND B.BOARD_ID = (
                    SELECT BOARD_ID
                    FROM (
                            SELECT *
                            FROM USED_GOODS_BOARD
                            WHERE 1=1
                            ORDER BY VIEWS DESC
                        )
                    WHERE ROWNUM = 1
                )
ORDER BY B.FILE_ID DESC



