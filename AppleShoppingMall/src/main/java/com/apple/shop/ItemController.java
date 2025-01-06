package com.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class ItemController {

    // 2. 원하는 클래스에 repository 등록
    private final ItemRepository itemRepository;

    @GetMapping("/hehe")
    String hehe(Model model) {

        // item 테이블에 있는 데이터 꺼내주세요~
        /*
        JPA로 데이터 입출력하려면?
        1. repository 만들기
        2. 원하는 클래스에 repository 등록
        3. repository.입출력문법() 쓰기
         */

        var result = itemRepository.findAll();
        System.out.println(result);
        System.out.println(result.get(0).price);
        System.out.println(result.get(1).title);

        var a = new ArrayList<>();
        a.add(30);
        a.add(40);
        System.out.println(a);
        System.out.println(a.get(0));
        System.out.println(a.get(1));

        List<Object> b = new ArrayList<>();



        model.addAttribute("name", "홍길동");
        model.addAttribute("name2", "비싼 바지");
        return "list.html";
    }


    @GetMapping("/list")
    String list(Model model) {

        List<Item> result = itemRepository.findAll();
        model.addAttribute("items", result);
        var a = new Item();
        System.out.println(a.toString());
        return "list.html";
    }

    @GetMapping("/write")
    String write(Model model) {
        return "write.html";
    }

    @PostMapping("/add")
    String addPost(@RequestParam String title, @RequestParam String price) {
        Item item = new Item();
        item.setTitle(title);
        item.setPrice(Integer.parseInt(price));

        itemRepository.save(item);

        System.out.println(title);
        System.out.println(price);

        return "redirect:/list";
    }
}

/*
HTML에 서버데이터 넣어서 보내주려면
1. Model model 추가
2. model.addAttribute(작명, 데이터)
3. th:text="&{작명}"
*/