package com.hi.deptspring.deptspring.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class DeptDTO {

    private int deptno; // 칼럼 이름과 일치시켜야함
    private String dname;
    private String loc;



}
