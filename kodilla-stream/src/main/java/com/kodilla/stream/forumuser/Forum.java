package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    public List<ForumUser> getUserList(){
        final List<ForumUser> userList = new ArrayList<>();
        userList.add(new ForumUser(1,"MarianoItaliano",1987,11,24,'M',0));
        userList.add(new ForumUser(2,"Karolajna",1996,4,6,'F',7));
        userList.add(new ForumUser(3,"BuryZenek",2001,7,21,'M',10));
        userList.add(new ForumUser(4,"Matylda14",2004,7,16,'F',6));
        userList.add(new ForumUser(5,"Harry",1998,2,19,'M',3));
        userList.add(new ForumUser(6,"Larry",1998,12,10,'M',8));
        userList.add(new ForumUser(7,"Katrina",2001,4,28,'F',8));
        userList.add(new ForumUser(8,"DoktorKidler",1995,9,30,'M',5));
        return new ArrayList<ForumUser>(userList);
    }
}
