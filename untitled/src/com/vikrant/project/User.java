package com.vikrant.project;

public class User {
    String laptopName;
    String mouseType;
    String keyboardName;
    int tableSize;

    @Override
    public String toString() {
        return "User{" +
                "laptopName='" + laptopName + '\'' +
                ", mouseType='" + mouseType + '\'' +
                ", keyboardName='" + keyboardName + '\'' +
                ", tableSize=" + tableSize +
                '}';
    }

    public User(String laptopName, String mouseType, String keyboardName, int tableSize) {
        this.laptopName = laptopName;
        this.mouseType = mouseType;
        this.keyboardName = keyboardName;
        this.tableSize = tableSize;
    }
    public User(){
        this("Unknow " ,"Unknow " ,"Unknow " ,123);
    }
}
