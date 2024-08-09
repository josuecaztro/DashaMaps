package com.github.zipcodewilmington;

public class Node {

    private String key;
    private Integer value;
    private Node next;




    public Node (String string, Integer integer, Node next){
        this.key =  string;
        this.value = integer;
        this.next = next;
    }



}
