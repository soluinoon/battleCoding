package com.dku.dandev.domain;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class Submission {
    @Id
    @GeneratedValue
    private Long id;
    private Long problemId;
    @Lob
    private String code;
    @Nullable
    private int score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}