-- 2023.04.13
-- JOIN

-- cross join
-- 스키마를 붙이고 결과행은 모든 경우의 수 => n * n
-- emp, dept => 14 * 4 = 56
select*
from emp, dept
;

select *
from emp cross join dept
;

select *
from emp inner join dept
;


-- equi.join 
-- 가장 많이 사용하는 조인 방법으로서 조인 대상이 되는 두 테이블에서 공통적으로
-- 존재하는 컬럼의 값이 일치되는 행을 연결하여 결과를 생성하는 조인 방법
select * 
from emp, dept
where emp.deptno = dept.deptno
;


select *
from emp inner join dept
on emp.deptno = dept.deptno
;

select *
from emp join dept
on emp.deptno = dept.deptno
;

-- inner는 생략 가능 / where 절에 on이 왔다면 inner join

-- 같은 이름의 컬럼이면 using 
select *
from emp join dept
using(deptno)
;

-- natural 뒤를 생략가능
select *
from emp natural join dept
;

select e.deptno, e.empno, dname
from emp e, dept d
where e.deptno = d.deptno
;

-- ex) 이름이 SCOTT인 사원의 부서명을 출력해봅시다.
-- Join을 안쓴다면
select deptno from emp where ename = 'SCOTT';
-- 20
select dname from dept where deptno = 20;

-- Join으로 해결
select e.ename, d.dname 
from emp e, dept d
where e.deptno = d.deptno
    and e.ename = 'SCOTT'
;

-- 사원별 급여 등급 표현
select * from salgrade;

select e.ename, s.grade, s.losal, e.sal, s.hisal
from emp e, salgrade s
where e.sal between s.losal and s.hisal
;


-- self join : 자기 자신의 테이블을 조인하는 경우
-- 각 사원의 이름과 각 사원의 매니저(관리자) 이름을 출력
select e.ename, m.ename
from emp e, emp m  -- 별칭을 따로 주어야 함, 꼭 같은 테이블일 필요는 없음
where e.mgr = m.empno
;


-- outer join : 조건에 만족하지 않는 행도 출력하는 join
select e.ename, nvl(m.ename, '없음')
from emp e, emp m 
where e.mgr = m.empno(+)
;


select *
from emp e join emp m
on e.mgr = m.empno
;

select *
from emp e left outer join emp m
on e.mgr = m.empno
;

-- 도서 판매 정보 출력
select * from orders;

select o.orderid, c.name, b.bookname, o.saleprice, o.orderdate
from orders o, customer c, book b
where o.custid = c.custid and o.bookid = b.bookid
;
