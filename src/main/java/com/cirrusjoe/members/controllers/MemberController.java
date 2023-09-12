package com.cirrusjoe.members.controllers;
import com.cirrusjoe.members.model.Member;
import com.cirrusjoe.members.repositories.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("member")
public class MemberController {
    @Autowired
    private MembersRepository repository;

    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return repository.save(member);
    }

    @GetMapping(value = "/{id}")
    public Member getMemberById(@PathVariable("id") long id) {
        return repository.getOne(id);
    }

    @DeleteMapping(value = "/{id}")
    public void removeMemberById(@PathVariable("id") long id) {
        repository.deleteById(id);
    }
}