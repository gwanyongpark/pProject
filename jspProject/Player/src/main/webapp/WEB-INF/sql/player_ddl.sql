CREATE TABLE `player` (
  `pno` int NOT NULL AUTO_INCREMENT,
  `pname` varchar(100)  NOT NULL,
  `duedate` date DEFAULT (curdate()),
  `finished` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`pno`)
) ;

INSERT INTO player (pname, duedate) VALUES ('이강인', '2023-05-05');
-- INSERT INTO player (pname, duedate) VALUES (?, ?)

-- DML update
update player set pname='백승호', duedate='2023-05-09', finished=1  where pno=2;
-- update tbl_todo set todo=?, duedate=?, finished=? where tno=?

-- DML delete
delete from player where pno=4;
-- delete from player where tno=?

-- DQL select
-- list
select * from player;
-- select * from player

-- 상세보기 view, 수정 update-view
select * from player where pno=2;
-- select * from player where pno=?