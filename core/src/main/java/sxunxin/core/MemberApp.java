package sxunxin.core;

import sxunxin.core.member.Grade;
import sxunxin.core.member.Member;
import sxunxin.core.member.MemberService;
import sxunxin.core.member.MemberServiceImpl;

public class MemberApp {
    
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
