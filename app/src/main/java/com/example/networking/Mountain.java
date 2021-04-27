package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;
    //default
    public Mountain()
    {
        name = "Missing name";
        location = "Missing Location";
        height = -1;
    }
    //new mountains
    public Mountain(String n, String l, int h) {
        name = n;
        location = l;
        height = h;
    }
    public String info(){
        String txt = new String();
        txt += name+" is in "+location+" and is: "+height+"m above sea level";
        return txt;
    }
    @Override
    public String toString(){
        return name;
    }
}
