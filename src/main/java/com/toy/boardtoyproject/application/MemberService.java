package com.toy.boardtoyproject.application;

import com.toy.boardtoyproject.api.dto.MemberDtoIn;
import com.toy.boardtoyproject.api.dto.MemberDtoOut;
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

    public MemberDtoOut insertPostMember(MemberDtoIn dtoIn) {

        return memberRepository.save(dtoIn.toEntity()).toDtoOut();
    }
}
