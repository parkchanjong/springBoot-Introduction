# springBoot-Introduction

- Project: Gradle Project
- Spring Boot: 2.3.x
- Language: Java
- Packaging: Jar
- Java: 11
- IntelliJ 사용시 IntelliJ에서 자바를 직접실행으로 설정 변경
  - Gradle이 실행하는 것 보다 빠르다

### 프로젝트 생성
- https://start.spring.io

### 컨트롤러
- 웹 MVC의 컨트롤러

### 서비스
- 핵심 비즈니스 로직 구현

### 리포지토리
- 데이터베이스에 접근, 도메인 객체를 디비에 저장하고 관리한다

### 도메인
- 비즈니스 도메인 객체

### 스프링빈
- 컴포넌트 스캔과 자동 의존관계 설정
- @Component 애노테이션이 있으면 스프링 빈으로 자동 등록된다
- @Controller 컨트롤러가 스프링 빈으로 자동 등록된 이유도 컴포넌트 스캔 때문
  - @Controller
  - @Service
  - @Repository
- 자바 코드로 직접 스프링 빈 등록하기
  - SpringConfig 클래스를 만들어 설정
- 컴포넌트 스캔을 많이 사용한다

### DI
- 생성자 주입을 사용하자

### AOP
- 공통 관심 사항, 핵심 관심 사항 분리 가능