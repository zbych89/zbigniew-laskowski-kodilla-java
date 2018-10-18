package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final LocalDate dateOfBirth;
    private final char gender;
    private final int postCount;
    public ForumUser(int userID,String userName,int birthYear,int birthMonth,int birthDay,char gender,int postCount){
        this.userID = userID;
        this.userName = userName;
        this.dateOfBirth = LocalDate.of(birthYear,birthMonth,birthDay);
        this.gender = gender;
        this.postCount = postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", postCount=" + postCount +
                '}';
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public int getPostCount() {
        return postCount;
    }
}
