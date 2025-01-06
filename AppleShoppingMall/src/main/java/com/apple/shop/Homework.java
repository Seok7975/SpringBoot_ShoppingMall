/*
오늘의 숙제 :



1. 이름과 나이를 저장할 수 있는 클래스를 하나 만들어두고

object를 하나 뽑아서 여러분의 이름과 나이를 저장해봅시다.

근데 클래스 안의 변수들을 private 변수로 만들어서 사용해봅시다.



2. 방금 만든 클래스에서 나이를 +1 하는 함수와 나이를 바꿔주는 함수를 각각 만들어서 사용까지 해봅시다.
 */

package com.apple.shop;

import lombok.Data;

@Data
public class Homework {

    private String name;
    private Integer age;

    // 한살 더하기 함수
    public void plusOneAge() {
        this.age += 1;
    }

    // 나이를 설정하는 함수 => 근데 롬복에서 알아서 만들어놓게 어노테이션 설정해놓음
//    public void setAge(Integer a) {
//        this.age = a;
//    }
}
