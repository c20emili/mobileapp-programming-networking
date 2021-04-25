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

    public void setName(String n) {
        name = n;
    }

    public void setLocation(String l) {
        location = l;
    }

    public void setHeight(int h) {
        height = h;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getHeight() {
        return height;
    }
    public String info(){
        String txt = new String();
        txt += name+" is in the "+location+" and is: "+height+" meters above sea level";
        return txt;
    }
    @Override
    public String toString(){
        return name;
    }
}
