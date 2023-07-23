package com.example.scrable.core.score.domain;

import com.fasterxml.jackson.annotation.JsonInclude;


public class ScoreDTO {

    private String letter1;
    private String letter2;
    private String letter3;
    private String letter4;
    private String letter5;
    private String letter6;
    private String letter7;
    private String letter8;
    private String letter9;
    private String letter10;
    private int score;

    public String getLetter1() {
        return letter1 == null ? "" : letter1;
    }

    public void setLetter1(String letter1) {
        this.letter1 = letter1;
    }

    public String getLetter2() {
        return letter2== null ? "" : letter2;
    }

    public void setLetter2(String letter2) {
        this.letter2 = letter2;
    }

    public String getLetter3() {
        return letter3 == null ? "" : letter3;
    }

    public void setLetter3(String letter3) {
        this.letter3 = letter3;
    }

    public String getLetter4() {
        return letter4 == null ? "" : letter4;
    }

    public void setLetter4(String letter4) {
        this.letter4 = letter4;
    }

    public String getLetter5() {
        return letter5 == null ? "" : letter5;
    }

    public void setLetter5(String letter5) {
        this.letter5 = letter5;
    }

    public String getLetter6() {
        return letter6 == null ? "" : letter6;
    }

    public void setLetter6(String letter6) {
        this.letter6 = letter6;
    }

    public String getLetter7() {
        return letter7 == null ? "" : letter7;
    }

    public void setLetter7(String letter7) {
        this.letter7 = letter7;
    }

    public String getLetter8() {
        return letter8 == null ? "" : letter8;
    }

    public void setLetter8(String letter8) {
        this.letter8 = letter8;
    }

    public String getLetter9() {
        return letter9 == null ? "" : letter9;
    }

    public void setLetter9(String letter9) {
        this.letter9 = letter9;
    }

    public String getLetter10() {
        return letter10 == null ? "" : letter10;
    }

    public void setLetter10(String letter10) {
        this.letter10 = letter10;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
