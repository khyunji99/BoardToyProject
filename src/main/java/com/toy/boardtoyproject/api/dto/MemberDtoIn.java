package com.toy.boardtoyproject.api.dto;

import com.toy.boardtoyproject.domain.Member;

public record MemberDtoIn(String email, String password) {

    public Member toEntity() {
        return Member.builder()
                .email(this.email)
                .password(this.password)
                .build();
    }
}
