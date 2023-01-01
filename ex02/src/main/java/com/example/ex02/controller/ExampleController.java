package com.example.ex02.controller;

import com.example.ex02.domain.vo.MemberVO;
import com.example.ex02.domain.vo.ProductVO;
import com.example.ex02.domain.vo.TaskVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
@RequestMapping("/ex/*")
// 프론트 컨트롤러 역할을 하기 위해서
// /ex/로 시작하는 모든 url을 클래스와 연결 시켜주기 위함
public class ExampleController {

    // Post, Get 방식으로 오는 모든 형태를 mapping 함
    // value 값은 *에 해당, 따라서 아래의 경우 url은 /ex/ex01이다
    // 리턴이 없을 경우, 자동으로 위 url 페이지로 이동
    // 원하는 url이 있을 경우, 리턴을 String 타입 / 리턴에 url 적어주면 된다.
    @RequestMapping(value = "ex01", method = {RequestMethod.GET, RequestMethod.POST})
    public void ex01(){
        log.info("ex01...........");
    }

    // url ?name=추성윤 입력한 경우, 콘솔에서 값 확인
    // HttpServletRequest 으로 받는 경우 / 이렇게 하지 않아도 아래 아래처럼 사용이 가능하다
    @GetMapping("ex02")
    public void ex02(HttpServletRequest request){
        log.info("name: " + request.getParameter("name"));
    }

    // 매개 변수명이 ?name=, 이런식으로 일치해야지 해당 변수명으로 사용이 가능하다.
    @GetMapping("ex03")
    public void ex03(String name){
        log.info("name: " + name);
    }

    // MemberVO안에 있는 값들을 ?name= & age= 넣으면 인식함
    // 전부 넣지 않아도 넣은 값만 저장한다.
    @GetMapping("ex04")
    public void ex04(MemberVO memberVO){
        log.info("member: " + memberVO);
    }

    //name 값을 ?=id로 받을때 / 다른 이름으로 받는 경우
    @GetMapping("ex05")
    public void ex05(@RequestParam("id") String name, int age){
        log.info("name: " + name);
        log.info("age " + age);
    }

    // 해당페이지로 이동하는 경우,
    @GetMapping("/ex06")
    public void ex06(MemberVO memberVO){
        log.info("ex06..............");
    }

    @GetMapping("ex07")
    public void ex07(@ModelAttribute("gender") String gender, MemberVO memberVO){
        log.info("ex07..............");
        log.info("memberVO: " + memberVO);
        log.info("gender: " + gender);
    }

    // 외부에서 상품명, 상품가격, 상품재고, 브랜드 전달받아서 화면에 전송
    // 화면에서 4개 정보 입력 후 form태그로 전송한다.

    @GetMapping("ex08")
    public void ex08(){
        log.info("ex08..............");
    }

    @GetMapping("ex09")
    public void ex09(ProductVO productVO){
        log.info("ex09..............");
        log.info("productVO: " + productVO);
    }

    @GetMapping("ex10")
    public void ex10(TaskVO taskVO){
        log.info("ex10..............");
    }

    @GetMapping("login")
    public void login(){

    }

    @GetMapping("test")
    public String login(String id){
        if (id.equals("admin")){
            return "ex/admin";
        }else if (id.equals("user")){
            return "ex/admin";
        }
        else{
            return "ex/login";
        }
    }

    @GetMapping("admin")
    public void admin(){
    }

    @GetMapping("user")
    public void user(){
    }

//    [실습 4]
//    이름을 입력하고 출근 또는 퇴근 버튼을 클릭한다.
//    출근 시간은 09:00이며, 퇴근 시간은 17:00이다.
//    출근 버튼 클릭 시 9시가 넘으면 지각으로 처리하고,
//    퇴근 버튼 클릭 시 17시 전이라면 퇴근이 아닌 업무시간으로 처리한다.
//    - getToWork.html  출근입니다.
//    - leaveWork.html 퇴근입니다.
//    - late.html 지각입니다.
//    - work.html   업무시간입니다.

    @GetMapping("getToWork")
    public void getToWork(){
    }

    @PostMapping("getToWork")
    public void getToWork(String name){
    }


}



















