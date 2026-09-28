# Spring Core Basic

인프런 - 김영한, [스프링 핵심 원리 - 기본편](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8)

## 학습 목표
객체 지향 설계 원칙(SOLID)을 이해하고, 스프링이 이 원칙들을 어떻게 코드로 실현하는지
직접 구현하며 학습한다. 순수 자바로 DI를 구현해보고, 이를 스프링 컨테이너로 전환하는 과정을 통해
스프링 프레임워크가 해결해주는 문제와 그 원리를 파악한다.

## 다룬 내용
- 객체 지향 설계와 스프링 (SOLID 원칙, 다형성)
- 순수 자바로 DI 적용해보기 (AppConfig)
- 스프링 컨테이너와 스프링 빈
  - 스프링 컨테이너 생성 및 빈 조회
  - BeanFactory와 ApplicationContext
- 싱글톤 컨테이너 (싱글톤 패턴의 문제점, 싱글톤 방식의 주의점)
- 컴포넌트 스캔과 의존관계 자동 주입 (`@ComponentScan`, `@Autowired`)
- 의존관계 자동 주입 방법 (생성자 주입, 수정자 주입, 필드 주입, 일반 메서드 주입)
- 빈 생명주기 콜백 (`@PostConstruct`, `@PreDestroy`)
- 빈 스코프 (싱글톤, 프로토타입, 웹 스코프)

## 개발 환경
- Java 17
- Spring Boot 4.1.1
- Gradle (io.spring.dependency-management 1.1.7)
- GitHub Codespaces (VS Code)
