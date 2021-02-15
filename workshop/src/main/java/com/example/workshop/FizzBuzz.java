package com.example.workshop;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public String speakBy(int input) {
        List<BusinessRule> rules = new ArrayList<>();
        rules.add(new FizzBuzzBusinessRule());
        rules.add(new FizzBusinessRule());
        rules.add(new BuzzBusinessRule());
        rules.add(new HeyBusinessRule());

        for (BusinessRule rule : rules) {
            if(rule.validate(input)) return rule.speak();
        }

        // Other
        return String.valueOf(input);
    }
}
