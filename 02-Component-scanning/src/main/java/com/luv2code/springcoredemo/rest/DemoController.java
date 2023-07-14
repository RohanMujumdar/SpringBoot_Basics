package com.luv2code.springcoredemo.rest;


import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Defining a private field for the dependency
    private Coach myCoach;

    // Defining a constructor for dependency injection
    @Autowired // tells a spring to inject a dependency
    public DemoController(Coach theCoach)
    {
        myCoach=theCoach;
    }

    @GetMapping("/dailyworkout")
    public String GetDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
