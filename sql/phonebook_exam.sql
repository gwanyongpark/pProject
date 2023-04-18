-- 전화번호 저장 테이블

-- phoneInfo_basic
create table phoneInfo_basic(
    idx number(6) constraint pk_phoneInfo_basic_idx primary key,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date default sysdate
);
desc phoneInfo_basic;
rename phonenInfo_basic to phoneInfo_basic; 



-- phoneInfo_univ
create table phoneInfo_univ(
    idx number(6),
    fr_u_major varchar2(20) default 'N' not null,
    fr_u_year number(1) default 1 not null,
    fr_ref number(7) constraint fk_phoneInfo_univ_fr_ref references phoneInfo_basic(idx)
    
    constraint pk_phoneInfo_univ_idx primary key,
    constraint ck_phoneInfo_univ_fr_u_year check (fr_u_year between 1 and 4)
);
desc phoneInfo_univ;



-- phoneInfo_com
create table phoneInfo_com(
    idx number(6) constraint pk_phoneInfo_com_idx not null primary key,
    fr_c_company varchar2(20) default 'N' not null,
    fr_ref number(6) constraint nn_phoneInfo_com_fr_ref references phoneInfo_basic(idx)
);

select * from phoneInfo_basic;
select * from phoneInfo_univ;
select * from phoneInfo_com;

drop table phoneInfo_basic;
drop table phoneInfo_univ;
drop table phoneInfo_com;


-- 1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL

insert into phoneInfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address, fr_regdate)
                    values(920607, 'son', '010-1111-2222', 'son@gmail', '서울특별시', default);
insert into phoneInfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address, fr_regdate)
                    values(020423, 'lee', '010-3333-4444', 'lee@naver', '인천광역시', sysdate);
insert into phoneInfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address, fr_regdate)
                    values(970812, 'kim', '010-5555-6666', 'lee@daum', '부산광역시', sysdate);                   

update phoneInfo_basic
set fr_email = 'kim@daum'
where fr_name ='kim'
;

update phoneInfo_basic
set idx = '990423'
where fr_name ='lee'
;

delete from phoneInfo_basic where idx = 1;



-- 2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL


-- 3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
