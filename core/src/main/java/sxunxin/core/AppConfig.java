package sxunxin.core;

import sxunxin.core.discount.DiscountPolicy;
import sxunxin.core.discount.FixDiscountPolicy;
import sxunxin.core.member.MemberRepository;
import sxunxin.core.member.MemberService;
import sxunxin.core.member.MemberServiceImpl;
import sxunxin.core.member.MemoryMemberRepository;
import sxunxin.core.order.OrderService;
import sxunxin.core.order.OrderServiceImpl;

public class AppConfig {
    
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
