package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 알아서 메인 함수에 집어넣어 실행해줌
public class BasicController {

    @GetMapping("/") // 누가 메인페이지 접속하면
    String hello(){
        return "index.html"; // 반환해
    }

    @GetMapping("/about")
    @ResponseBody // 문자열 그대로 반환
    String about(){
        return "피싱사이트";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mypage(){
        return "마이페이지";
    }


}