package com.data.prj.member.controller;

import com.data.prj.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.bson.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/info")
    public ResponseEntity<String> getUserInfo(){
        memberService.getUserInfo();
        return ResponseEntity.ok("");
    }
}
