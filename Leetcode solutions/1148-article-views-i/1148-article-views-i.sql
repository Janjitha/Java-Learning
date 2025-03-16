# Write your MySQL query statement below
select distinct author_id as id
from views
where author_id = viewer_id
order by author_id;

/*
# Write your MySQL query statement below
SELECT DISTINCT author_id as id FROM Views 
WHERE author_id = viewer_id 
ORDER BY id ASC
*/
