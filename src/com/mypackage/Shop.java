package com.mypackage;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class Shop {

    public static void main(String[] args) {

        ArrayList<String> Name = new ArrayList<String>();
        Name.add("Apple");
        Name.add("Milk");
        Name.add("Bred");
        Name.add("Salt");
        for (String i : Name) {
            System.out.println(i);
        }

        Name.remove("Apple");


        Name.remove("Apple");


    }

}
