package com.study.client;

import com.study.Study;
import com.study.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class studyClient {
    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();
        List<User> userList = new ArrayList<>();

        Study studyGroup = new Study();
        studyGroup.setStudyingUsers(userList);
    }
}
