![](https://velog.velcdn.com/images/seok7975/post/dc0e41bb-40b1-448a-b702-27983366b0de/image.png)

<br>
<br>
<br>

먼저 서버가 뭘까?
![](https://velog.velcdn.com/images/seok7975/post/8d2a4142-1f6c-4ca9-953f-b7f878fa8973/image.png)
서버는 유저가 데이터 요청하면 요청한 그 데이터를 보내주는 프로그램들일 뿐이다.
"~~해줘~" 하면 ~~해주는 프로그램이 서버일 뿐이다.

따라서 **웹서버**란?
그냥 누가 웹페이지 달라고 하면 웹페이지 보내주는 서버일 뿐이다.
그럼 웹페이지 보내주는 서버와 그 기능을 만들려면 어떻게 할까?

# 1. 서버기능 만들려면 Controller
일단 아무 Controller.java파일을 만들어보자.
![](https://velog.velcdn.com/images/seok7975/post/f366d2ed-7c1d-488e-a2e7-780de74bcf90/image.png)
여기다가 이제 서버 기능을 만들면 된다.
서버기능을 만들고 싶으면 아무 클래스에 @Controller를 써놓자.

![](https://velog.velcdn.com/images/seok7975/post/5dde1d8f-fac6-4355-8aa7-2b04f6825a48/image.png)

```
@GetMapping() : 페이지 경로 적기
@ResponseBody : /경로에 방문했을 때 return값을 데이터로 보내준다

cf)
@ResponseBody 를 쓰면 return 오른쪽에 있는걸 유저에게 보내라는 뜻이고
@ResponseBody 를 안쓰면 return 오른쪽에 있는 경로의 파일을 전송하라는 뜻이 된다.
파일경로는 static 폴더가 기본
```
<br>
그러면 메인페이지에 접속 했을 때, "안녕하쇼"라고 유저에게 메세지를 보내는 기능을 만들려면?

![](https://velog.velcdn.com/images/seok7975/post/597a7b56-23c5-4041-845f-a2fe4beb45af/image.png)

한 번더! 누가 /mypage 이렇게 접속하면 "마이페이지입니다"이런 문자를 보내주고 싶으면?

``` java
package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {

    @GetMapping("/mypage")
    @ResponseBody
    String mypage(){
        return "마이페이지";
    }

}

```

<br><br>
## &nbsp&nbsp (1) 데이터값으로 html 보내기
![](https://velog.velcdn.com/images/seok7975/post/c6089155-17b5-424e-b097-e61c19342864/image.png)

이렇게 간단한 html문을 써도 되지만, 매우 길 땐 별도의 html파일을 만들고 파일을 전송할 수 있다.

![](https://velog.velcdn.com/images/seok7975/post/324fc331-f842-40a4-b7b5-9d95aa594fff/image.png)
![](https://velog.velcdn.com/images/seok7975/post/bf02234a-b343-4d58-9388-05bed25e18f3/image.png)

보통 html, css, js파일들은 resources 폴더안의 static폴더에 보관하면 된다.
위처럼 index.html같은 파일을 만들어서 만들면 된다.

``` 
꿀팁 : 
1. ! 입력하고 탭키 누르면 기본 양식 자동완성(intellij)
2. .html 파일은 그냥 html 담는 파일이고 html은 웹페이지 만들 때 쓰는 언어
```
<br>

![](https://velog.velcdn.com/images/seok7975/post/911ca9a7-717c-4c59-9076-7e95b8b2b69f/image.png)
마지막으로 유저에게 html파일을 보내주고 싶으면,
@ResponseBody를 빼고 return 오른쪽에 "html파일경로"를 적으면 된다.

```
결론
웹페이지 하나 보내주는 기능 만들고 싶으면
@Controller 클래스 안에 함수하나 만들고 이거저거 채우면 만들 수 있다.
```

*출처: [코딩애플](https://codingapple.com/)*
