package com.example.workshop;

import java.util.ArrayList;
import java.util.List;

class XXX extends Address {
    @Override
    public List<String> getData() {
        List<String> results = new ArrayList<>();
        results.add("");
        results.add("");
        results.add("");
        results.add("");
        results.add("");
        return results;
    }
}

public class Employee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.doSth(new XXX());
    }

    public void doSth(Address address) {
        List<String > results = address.getData();
        System.out.println(results.size());
    }
}

class Address {
    public List<String> getData() {
        throw new RuntimeException("Underconstruction !!");
    }
}
