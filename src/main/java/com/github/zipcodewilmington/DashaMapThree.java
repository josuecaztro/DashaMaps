package com.github.zipcodewilmington;

public class DashaMapThree implements HashMapX{

    private String HashFunctionThree(String input) {
        if (input.length() > 1) {
            return (String.valueOf(input.charAt(0)+input.charAt(1)).toLowerCase());
        }
        return null;
    }


    @Override
    public void set(String key, String value) {
//            key-hash = hash-function(key)
//            newval = new Node(key, value)
//            append-to(hash-array[key-hash], newval)
    }

    @Override
    public String delete(String key) {
        return "";
    }

    @Override
    public String get(String key) {
        return "";
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
