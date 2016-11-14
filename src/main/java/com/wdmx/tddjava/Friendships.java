package com.wdmx.tddjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by wdmx
 * Date: 2016/11/14.
 */
public class Friendships {
    private final Map<String, List<String>> friendships =
            new HashMap<>();
    public void makeFriends(String person1, String person2) {
        addFriend(person1, person2);
        addFriend(person2, person1);
    }
    public List<String> getFriendsList(String person) {
        if (!friendships.containsKey(person)) {
            return Collections.emptyList();
        }
        return friendships.get(person);
    }
    public boolean areFriends(String person1, String person2) {
        return friendships.containsKey(person1) &&
                friendships.get(person1).contains(person2);
    }

    private void addFriend(String person, String friend) {
        if (!friendships.containsKey(person)) {
            friendships.put(person, new ArrayList<String>());
        }
        List<String> friends = friendships.get(person);
        if (!friends.contains(friend)) {
            friends.add(friend);
        }
    }
}