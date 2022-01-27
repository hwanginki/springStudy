# springStudy
스프링으로 웹 공부

스프링부트로 웹학습

1. 프로그램 버전 및 등등등
Spring STS VS Spring Boot의 차이점이란? (개인적으로 Spring Boot 프로그램 깔아서 Eclipse Markeplace에서 Spring STS처럼 사용할 수 있는 다운로드 방법도 있습니다~!!!
onserver가 없는 경우.

https://rateye.tistory.com/36
https://velog.io/@dhffkvm_718/Run-on-server-%EA%B0%80-%EC%97%86%EB%8B%A4
https://yjh5369.tistory.com/entry/Eclipse-Run-on-server%EA%B0%80-%EC%97%86%EC%9D%84-%EA%B2%BD%EC%9A%B0-%ED%95%B4%EA%B2%B0-%EB%B0%A9%EB%B2%95 java.lang.ClassNotFoundException: org.apache.catalina.startup.Catalina
https://meongj-devlog.tistory.com/122

# ? : 쿼리스트링, 물음표 뒤에 =로 연결된 key value pair 부분을 url 뒤에 덧붙여서 추가적인 정보를 서버 측에 전달하는 것.
-ex http://localhost:8080/index.do?name=value&age=value
# 클라이언트(client) : 서비스를 요청하는 애플리케이션(컴퓨터)
# 서버(server) : 서비스(service)를 제공하는 애플리케이션(컴퓨터)
# 서블릿 : 작은 서버프로그램

# Tomcat의 설정 파일 - server.xml, web.xml
톰캣설치경로/conf/server.xml : Tomcat 서버 설정 파일
톰캣설치경로/conf/web.xml : Tomcat의 모든 web app의 공통 설정
웹앱이름/WEB-INF/web.xml : web app의 개별 설정
[STS] 프로젝트/src/main/webapp/WEB-INF/web.xml

# MIME(Multipurpost Internet Mail Extensions) : 텍스트 기반 프로토콜에 바이너리 데이터 전송하기 위해 고안 HTTP의 Content-Type 헤더에 사용. 데이터의 타입을 명시

# 관심사의 분리 Separation of Concerns
 - 공통 코드의 분리 - 입력의 분리
 - 출력(view)의 분리 - 변하는 것과 변하지 않는 것의 분리
 - MVC 패턴

# 웹 애플리케이션 서버(WAS) : 웹 애플리케이션을 서비스하는 서버

