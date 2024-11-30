package com.data.prj.member.service;

import com.data.prj.member.query.MemberQuery;
import lombok.RequiredArgsConstructor;
import org.bson.Document;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberQuery memberQuery;

    public List<Document> getUserInfo() {
        List<Document> docs = new ArrayList<>();
        docs.addAll(memberQuery.getMemberList());
        return docs;
    }
}
