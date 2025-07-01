# Write your MySQL query statement below
select * from Cinema 
where (id=1  or id%2=1) and description != 'boring'
order by rating desc;