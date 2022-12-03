-- Part 1: Test it with SQL
select * from job;

-- Part 2: Test it with SQL

select name from employer where location = "St. Louis City";

-- Part 3: Test it with SQL
drop table job;
-- Part 4: Test it with SQL
SELECT *
FROM skill
LEFT JOIN jobs_skills ON skill.id = jobs_skills.skill_id
WHERE jobs_skills.job_id IS NOT NULL
ORDER BY name ASC;