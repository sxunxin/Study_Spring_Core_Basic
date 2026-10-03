package sxunxin.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sxunxin.core.discount.DiscountPolicy;
import sxunxin.core.discount.RateDiscountPolicy;
import sxunxin.core.member.MemberRepository;
import sxunxin.core.member.MemberService;
import sxunxin.core.member.MemberServiceImpl;
import sxunxin.core.member.MemoryMemberRepository;
import sxunxin.core.order.OrderService;
import sxunxin.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {
    
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
