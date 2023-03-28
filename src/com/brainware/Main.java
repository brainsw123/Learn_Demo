package com.brainware;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Base obj1
            = new Base();
    obj1.insert(10);
    obj1.display();
    Base obj2= new Base();
    obj2.insert(20);
    obj2.display();

    }
}

class Base
{
    static int num;
    void insert(int num)
    {
        this.num+=num;
    }
    void display()
    {
        System.out.println("Number "+num);
    }


}
