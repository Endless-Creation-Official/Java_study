package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {
    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainer() {

        AppConfig appConfig = new AppConfig();

        // 1. 조회: 호출할 때마다 객체를 생성
        MemberService memberService1 = appConfig.memberService();

        // 2. 조회: 호출할 때마다 객체를 생성
        MemberService memberService2 = appConfig.memberService();

        // 참조값이 다른 것을 확인
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        // memberService1 != memberService2
        assertThat(memberService1).isNotSameAs(memberService2);

    }

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    public void singletonServiceTest() {
        // private으로 생성자를 막아두었으므로, 컴파일 오류 발생
        // new SingletonSerivce();

        // 1. 조회: 호출할 때마다 같은 객체 반환
        SingletonService singletonService1 = SingletonService.getInstance();

        // 2. 조회: 호출할 때마다 같은 객체 반환
        SingletonService singletonService2 = SingletonService.getInstance();

        // 참조값이 같은 것을 확인
        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

        // singletonService1 == singletonService2
        assertThat(singletonService1).isSameAs(singletonService2);

        singletonService1.logic();
    }

    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springContainer() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        // 1. 조회: 호출할 때마다 같은 객체 반환
        MemberService memberService1 = ac.getBean("memberService", MemberService.class);

        // 2. 조회: 호출할 때마다 같은 객체 반환
        MemberService memberService2 = ac.getBean("memberService", MemberService.class);

        // 참조값이 같은 것을 확인
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        // memberService1 = memberService2
        assertThat(memberService1).isSameAs(memberService2);
    }
    // 스프링 컨테이너 덕분에 고객의 요청이 들어올 때마다 객체를 생성하는 것이 아니라,
    // 이미 만들어진 객체를 공유해서 효율적으로 재사용할 수 있다.
}
/*
싱글톤 패턴 문제점

싱글톤 패턴을 구현하는 코드 자체가 많이 들어간다.
의존관계상 클라이언트가 구체 클래스에 의존한다. -> DIP를 위반한다.
클라이언트가 구체 클래스에 의존해서 OCP 원칙을 위반할 가능성이 높다.
테스트하기 어렵다.
내부 속성을 변경하거나 초기화 하기 어렵다.
private 생성자로 자식 클래스를 만들기 어렵다.
결론적으로 유연성이 떨어진다.
안티패턴으로 불리기도 한다.
*/
