package com.apple.shop;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@ToString
@Data
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id; // 유니크 아이디 컬럼 추가

    @Column(nullable = false, unique = true) // not null, unique
    public String title; // title 컬럼 추가
    public Integer price; // price 컬럼 추가
    // private는 같은 패키지 끼리에서만 사용가능, 또한 getter setter 만들어야함

    // @ToString이 대신 해줌
//    public String toString() {
//        return this.title + this.price;
//    }
}




// 클래스 변수, 함수에 붙이는 modifier
// 1. public 붙이면 모든 곳에서 사용가능
// 2. 안붙이면 package-private(같은 폴더의 클래스에서만 사용가능)
// 3. private 붙이면 다른 클래스에서 사용불가
// 4. protected 붙이면 package-private와 같음
//    예외 : 상속한 클래스는 맘대로 사용가능, 코드가 복잡해져서 최근엔 비선호 
//    요새는 상속보다 composition 등을 선호한다. 
// 5. static 붙이면 클래스, 변수 이렇게 직접 사용가능
//    utility용 함수만들 때 가끔 씀
// * 그럼 private 지정한 변수를 어떻게 다른 곳에서 읽지?
//     ex) 내가 title 값을 원해, 그러면 title을 리턴으로 받는 함수를 만들어서 함수를 호출한다.
//         => 전문용어로 getter 함수
// * 그럼 값을 넣는 것(수정하는 것)은?
//   : 변수 수정하는 함수를 만들면 된다. => 전문용어로 setter 함수, 그리고 setTitle("  ");
// 롬복으로 편하게 할 수 있다~

// 그럼 왜 private 왜 붙여? setter로 변형하면 안전하니까~
// ex) setter함수 안에 로직을 추가할 수 있음 => if 255자 이하면 title에 저장 뭐 이런
// 그렇다고 setter함수를 만들기만 한다고 안전한건 아님 로직을 통해 안전해지는거임.

// ex) 만약 내가 price를 Integer -> Long형으로 바꾸고싶어.
//     그럴 때 setter함수 안에 int형 숫자가 들어오면 Long으로 저장하게 로직 넣으면 된다.(데이터가 여러개라면 언제 다 바꿈)
//     이것이 price의 api같은 것이고 price의 API 쓰는 사람은 내부로직 알 필요 없음.