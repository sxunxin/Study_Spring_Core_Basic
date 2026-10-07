package sxunxin.core.discount;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import sxunxin.core.member.Grade;
import sxunxin.core.member.Member;

@Component
@Primary
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    } 
}
