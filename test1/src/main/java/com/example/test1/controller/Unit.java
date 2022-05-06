package com.example.test1.controller;

import org.springframework.util.DigestUtils;

public class Unit {
    public static void main(String[] args) {
        String s="dd3fd8a155f34528be6d813eb8aba468";
        System.out.println(DigestUtils.md5DigestAsHex(s.getBytes()));
    }
}
