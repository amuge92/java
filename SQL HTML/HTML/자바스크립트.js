// html 웹페이지의 구조와 내용
// CSS 색상이나 폰트, 배치 등 웹페이지의 모양
// 자바스크립트 사용자의 입력을 처리하거나
// 웹 애플리케이션 작성 등 웹 페이지의 동적제어
//1. HTML태그의 이벤트 리스너 속성에 작성
/*2. 자바스크립트 파일에 작성
3. URL부분에 작성
4. <script></script>태그 안에 작성

prompt : 입력함수*다이어로그  입력값은 문자열로 취급됨.
confirm :  확인취소 (return true false)
alert : 경고 다이어로그

함수
funtion 이름(){};
기본적인 함수
1.  isNaN()    NaN: 숫자가 아님을 나타내는 상수키워드

2.  parseInt()

3. eval();문자열 계산식 계산


자바스크립트 객체
1. 코어 객체(기본 객체)
->Array,Date,String,Math

2. HTML DOM 객체
3. 브라우저 객체 (BOM)

배열 함수
var a = new Array("김","이","박");
        var b = new Array("최");
        var c;
        c=a.concat(b);
        c=c.join("@@");
        c=a.reverse();
        c=a.toString(); 원소 사이에 ","를 삽입

        var n = new Date(2020,8,21);
        var b1 = n.getDate();
        var b2 = n.getHours();
        document.write(n.toLocaleString());
        달만 입력한 달 다음달이 출력 된다.
        var n = new Date();현재 시간 입력
        n.toUTCString();으로 돌리면 현재날 출력
        documet.body.style.backgroundcolor(red);


        DOM(Document Object Model) : 각 HTML태그를 하나의 객체로 만듬 <div>,<p>....
           HTML 태그가 출력된 모양과 컨텐츠를 제어한다.
           <DOM 구성요소 5가지>
            1. 프로퍼티(property) : DOM 객체의 변수
                ex> var n = new Object ....n이 프로퍼티
            2. 메소드 
            3. 컬렉션 : 데이터의 집합(배열)
            4. 이벤트 리스너
            5. CSS스타일

            -DOM 객체 구분 : id속성
            <p id="a">안녕<p>
            
            -DOM 객체 찾기 : documnet.getElementById();
            var p =  documnet.getElementById("a");
            p.style.color="red";