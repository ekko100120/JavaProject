package com.kenny.springframework.conditional;

import org.springframework.stereotype.Component;

public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
