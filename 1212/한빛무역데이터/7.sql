select 부서.부서번호, 부서명, 이름 from 부서 inner join 사원 on 부서.부서번호 = 사원.부서번호;
select 부서.부서번호, 부서명, 이름 from 부서, 사원 where 부서.부서번호 = 사원.부서번호;