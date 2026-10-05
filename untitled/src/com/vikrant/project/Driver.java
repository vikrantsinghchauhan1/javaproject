package com.vikrant.project;

public class Driver {
    static void main(String[] args) {

        User us=new User();
        System.out.println(us.keyboardName);
        System.out.println(us.laptopName);
        System.out.println(us.mouseType);
        System.out.println(us.tableSize);

        User user1 = new User("Dell", "Wireless", "Logitech", 10);
        User user2 = new User("HP", "Wired", "HP Keyboard", 12);
        User user3 = new User("Lenovo", "Wireless", "Lenovo Keyboard", 15);
        User user4 = new User("Apple", "Wireless", "Magic Keyboard", 20);
        User user5 = new User("Asus", "Wired", "Asus Keyboard", 14);
        User user6 = new User("Acer", "Wireless", "Acer Keyboard", 16);
        User user7 = new User("MSI", "Wired", "MSI Keyboard", 18);
        User user8 = new User("Samsung", "Wireless", "Samsung Keyboard", 11);
        User user9 = new User("Dell", "Wired", "Dell Keyboard", 13);
        User user10 = new User("HP", "Wireless", "HP Keyboard", 17);

        User user[]=new User[10];
        user[1]=user1;
        user[2]=user2;
        user[3]=user3;
        user[4]=user4;
        user[5]=user5;
        user[6]=user6;
        user[7]=user7;
        user[8]=user8;

        for (int i=1;i<8;i++){
            System.out.print(user[i].laptopName+" ");
            System.out.print(user[i].mouseType+ " ");
            System.out.print(user[i].keyboardName+ " ");
            System.out.print(user[i].tableSize+ " ");
            System.out.println();
        }
    }
}
