package com.example.demo.businessAssignment.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{
    public int[] retrieveData() {
        return new int[] {5, 89, 100};
    }
}
