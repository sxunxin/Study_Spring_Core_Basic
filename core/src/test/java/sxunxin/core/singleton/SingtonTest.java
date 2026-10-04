package sxunxin.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sxunxin.core.AppConfig;
import sxunxin.core.member.MemberService;

public class SingtonTest {
    
    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();

        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        Assertions.assertThat(memberService1).isNotSameAs(memberService2);
    }

    @Test 
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void SingletonServiceTest() {
        SingletonService siglSingletonService1 = SingletonService.getInstance();
        SingletonService siglSingletonService2 = SingletonService.getInstance();

        System.out.println("siglSingletonService1 = " + siglSingletonService1);
        System.out.println("siglSingletonService2 = " + siglSingletonService2);

        Assertions.assertThat(siglSingletonService1).isSameAs(siglSingletonService2);
    }
}
