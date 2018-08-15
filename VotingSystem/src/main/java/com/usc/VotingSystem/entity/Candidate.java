package com.usc.VotingSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidate")
public class Candidate {

    @Id
    @Column(name = "id")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "candidate_name")
    private String name;

    public String getName() {
        return name;
    }

    public Candidate(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Candidate() {
    }

    public void setName(String name) {
        this.name = name;
    }
}
