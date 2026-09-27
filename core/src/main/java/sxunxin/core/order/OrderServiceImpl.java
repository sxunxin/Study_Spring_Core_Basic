package sxunxin.core.order;

import sxunxin.core.discount.DiscountPolicy;
import sxunxin.core.discount.FixDiscountPolicy;
import sxunxin.core.member.Member;
import sxunxin.core.member.MemberRepository;
import sxunxin.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy DiscountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = DiscountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
    
}
