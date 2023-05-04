CREATE TABLE `test` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `tid` varchar(45)  NOT NULL,
  `tpw` varchar(45) NOT NULL,
  `tuid` varchar(45) DEFAULT NULL,
  `tname` varchar(45) NOT NULL,
  `tphoto` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idx`),
  UNIQUE KEY `uid_UNIQUE` (`tid`)
);

INSERT INTO `project`.`test`
(`tid`,`tpw`,`tname`)
VALUES
('test','1111','TEST');

-- INSERT INTO test (tid, tpw, tname) VALUES (?, ?, ?);
select * from test where tid = 'test' and tpw = '1111';

select idx,tid,tname from test where tid = 'test' and tpw = '1111';
-- select idx,tid,tname from test where tid = ? and tpw = ?;
