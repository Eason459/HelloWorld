package Helloworld;

import java.util.ArrayList;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String arr[] = {"eason", "jerry", "Tom", "hanmeimei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        int data = 0;

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }

    }

    public static void getData() {


    }
}

