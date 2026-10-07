package sxunxin.core.order;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import sxunxin.core.discount.DiscountPolicy;
import sxunxin.core.member.Member;
import sxunxin.core.member.MemberRepository;

@Component 
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
    
}
