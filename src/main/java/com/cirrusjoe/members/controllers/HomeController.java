package com.cirrusjoe.members.controllers;
import com.cirrusjoe.members.model.Member;
import com.cirrusjoe.members.repositories.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private MembersRepository repository;
    @GetMapping
    public List<Member> getMembers() {
        List<Member> members = repository.findAll();
        return members;
    }

}