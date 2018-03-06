package com.kenny.springframework.conditional;

import org.springframework.stereotype.Component;


public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
