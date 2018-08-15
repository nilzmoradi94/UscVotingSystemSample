package com.usc.VotingSystem.controller;

import com.usc.VotingSystem.entity.Citizen;
import com.usc.VotingSystem.repositories.CandidateRepo;
import com.usc.VotingSystem.repositories.CitizenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VotingController {

    @Autowired
    CitizenRepo citizenRepo;

    @Autowired
    CandidateRepo candidateRepo;

    @RequestMapping("/")
    public String goToVote()
    {
        return "vote.html";
    }
    @RequestMapping("/doLogin")
    public String dologin(@RequestParam String name)
    {
        Citizen citizen =citizenRepo.findByName(name);

        if(!citizen.getHasVoted()){
            return "/performVoted.html";
        }
        else {
            return "/alreadyVoted.html";
        }
    }

}
