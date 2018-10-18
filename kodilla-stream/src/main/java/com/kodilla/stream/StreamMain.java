package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(n -> n.getGender()=='M')
                .filter(n -> n.getDateOfBirth().plusYears(20).isBefore(LocalDate.now()))
                .filter(n -> n.getPostCount()>0)
                .collect(Collectors.toMap(ForumUser::getUserID,ForumUser -> ForumUser));

        resultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}