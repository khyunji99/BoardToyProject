package com.toy.boardtoyproject.application;

import com.toy.boardtoyproject.domain.Member;
import com.toy.boardtoyproject.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void insertMember() {

        memberRepository.save(Member.builder()
                .email("test@test.com")
                .password("1234qwer!@")
                .build());
    }
}
