package com.github.zipcodewilmington;

public class DashaMapTwo implements HashMapX{

    private String HashFunctionTwo(String input) {
        if (input.length() > 0) {
            return (String.valueOf(input.charAt(1)).toLowerCase());
        }
        return null;
    }

    @Override
    public void set(String key, String value) {

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
