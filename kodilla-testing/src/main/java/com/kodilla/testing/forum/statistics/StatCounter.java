package com.kodilla.testing.forum.statistics;

public class StatCounter {
    int usersCount;
    int postsCount;
    int commentsCount;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if(usersCount == 0){
            postsPerUser = 0.0;
            commentsPerUser = 0.0;
        }
        else{
            postsPerUser = (double) postsCount/usersCount;
            commentsPerUser = (double) commentsCount/usersCount;
        }
        if(postsCount == 0){
            commentsPerPost = 0.0;
        }
        else{
            commentsPerPost = (double) commentsCount/postsCount;
        }
    }

    public void showStatistics(){
        System.out.println("Users count = " + usersCount);
        System.out.println("Posts count = " + postsCount);
        System.out.println("Comments count = " + commentsCount);
        System.out.println("Posts per user: " + postsPerUser);
        System.out.println("Comments per user: " + commentsPerUser);
        System.out.println("Comments per post: " + commentsPerPost);
    }
}
