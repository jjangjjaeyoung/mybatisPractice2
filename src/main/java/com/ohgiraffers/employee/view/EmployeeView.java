package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.service.EmployeeService;

import java.util.Scanner;

public class EmployeeView {

    public void displayView() {

        /*
        ============ 직원 관리 ====================
        1. 직원전체조회
        2. 직원 이름 또는 id로 직원조회
        3. 부서명으로 검색
        4. 직급으로 검색
        5. 신규 부서 생성
        6. 신규 직원 생성
        7. 직원 정보 변경(이름, 전화번호, 이메일,부서, 직급)
        8. 직원퇴사
        ==========================================
        상세 내용은 pdf를 참고
        */

        Scanner sc = new Scanner(System.in);
        EmployeeService employeeSerivce = new EmployeeService();

        do {
            System.out.println("===================직원관리=======================");
            System.out.println("1. 직원 전체 조회");
            int no = sc.nextInt();

            switch (no){
                case 1 : employeeSerivce.selectAllEmployee();break;
            }

        }while (true);

    }
}
