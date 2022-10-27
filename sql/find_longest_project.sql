SELECT id AS name,TIMESTAMPDIFF(MONTH, start_date, finish_date) AS MONTH_COUNT
FROM Project
WHERE (finish_date - start_date)  = (
      SELECT MAX (finish_date - start_date) FROM Project
);

