package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        User user1 = new Millenials("Ania");
        User user2 = new YGeneration("Basia");
        User user3 = new ZGeneration("Czarek");
        String post1 = user1.sharePost();
        String post2 = user2.sharePost();
        String post3 = user3.sharePost();
        Assert.assertEquals("Sharing with Facebook",post1);
        Assert.assertEquals("Sharing with Twitter",post2);
        Assert.assertEquals("Sharing with Snapchat",post3);
    }
    @Test
    public void testIndividualSharingStrategy(){
        User user = new Millenials("Darek");
        user.setPublisher(new TwitterPublisher());
        String post = user.sharePost();
        Assert.assertEquals("Sharing with Twitter",post);
    }
}
