package com.example.workshop;

public class MyData {

    private static MyData instance;

    private MyData() {}

    public static MyData getInstance() {
        if(instance == null) {
            instance = new MyData();
        }
        return instance;
    }


    public static void main(String[] args) {
        MyData myData = MyData.getInstance();
    }

}
