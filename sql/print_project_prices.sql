SELECT project_id AS number_id_project, sum(worker.salary)*TIMESTAMPDIFF(MONTH, start_date, finish_date)  as prise
FROM project_worker
JOIN worker ON worker_id =worker.id
JOIN project ON project_id=project.id
GROUP BY project_id
ORDER BY 2 DESC