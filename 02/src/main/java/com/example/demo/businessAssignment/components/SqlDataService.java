package com.example.demo.businessAssignment.components;

import org.springframework.stereotype.Component;

@Component
public class SqlDataService implements DataService{
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
