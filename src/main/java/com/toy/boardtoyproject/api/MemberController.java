package com.toy.boardtoyproject.api;

import com.toy.boardtoyproject.api.dto.MemberDtoIn;
import com.toy.boardtoyproject.api.dto.MemberDtoOut;
import com.toy.boardtoyproject.application.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/insert")
    public String insertMember() {
        memberService.insertMember();
        return "insert 되었습니다.";
    }

    @PostMapping("/insert")
    public MemberDtoOut insertPostMember(@RequestBody MemberDtoIn dtoIn) {

        return memberService.insertPostMember(dtoIn);
    }

}
