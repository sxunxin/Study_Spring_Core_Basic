package sxunxin.core;

import sxunxin.core.member.Grade;
import sxunxin.core.member.Member;
import sxunxin.core.member.MemberService;
import sxunxin.core.member.MemberServiceImpl;
import sxunxin.core.order.Order;
import sxunxin.core.order.OrderService;
import sxunxin.core.order.OrderServiceImpl;

public class OrderApp {
    
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order.toString());
    }
}
