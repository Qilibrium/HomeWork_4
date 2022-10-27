SELECT name, count(name) as project_count
FROM client
JOIN project ON client.id=project.client_id
GROUP BY  name
LIMIT 1



