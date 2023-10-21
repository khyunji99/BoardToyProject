package com.toy.boardtoyproject.api;

import com.toy.boardtoyproject.application.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
