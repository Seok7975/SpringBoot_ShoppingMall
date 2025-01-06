package com.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class HomeworkController {

    @GetMapping("/homework")
    @ResponseBody
    String homework(Model model) {

        var a = new Homework();

        // name, age 설정
        a.setName("홍길동");
        a.setAge(60);

        // 나이 설정
        a.setAge(20);

        // 한살 더하기 함수
        a.plusOneAge();
        System.out.println(a.getAge());
        return "출력완료";
    }

    public static void main(String[] args) {
        var a = new Homework();

        // name, age 설정
        a.setName("홍길동");
        a.setAge(60);

        // 나이 설정
        a.setAge(20);

        // 한살 더하기 함수
        a.plusOneAge();
        System.out.println(a.getAge());
    }


}
