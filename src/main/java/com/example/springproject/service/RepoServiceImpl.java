package com.example.springproject.service;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.example.springproject.domain.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepoServiceImpl implements RepoService {

    @Override
    public Repo findInfo() {
        return new Repo();
    }
}
