// package LinkedList;

import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList <Integer>list=new LinkedList<>();
        list.add(23);
        list.add(35);
        list.add(34);
        list.add(25);
        list.add(67);
        LinkedList <Integer>list1=new LinkedList<>();

        for(int i=list.size()-1;i>=0;i--)
        {
            list1.add(list.get(i));
        }
        System.out.println(list1);
    }
}
