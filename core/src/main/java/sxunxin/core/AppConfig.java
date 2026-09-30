package sxunxin.core;

import sxunxin.core.discount.FixDiscountPolicy;
import sxunxin.core.member.MemberService;
import sxunxin.core.member.MemberServiceImpl;
import sxunxin.core.member.MemoryMemberRepository;
import sxunxin.core.order.OrderService;
import sxunxin.core.order.OrderServiceImpl;

public class AppConfig {
    
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
