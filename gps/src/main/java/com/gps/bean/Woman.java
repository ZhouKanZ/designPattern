package com.gps.bean;

/**
 * Created by Administrator on 2017/7/17 0017.
 */
public class Woman {

    private int height;
    private String happy;

    public Woman(int height, String happy) {
        this.height = height;
        this.happy = happy;
    }

    public Woman() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHappy() {
        return happy;
    }

    public void setHappy(String happy) {
        this.happy = happy;
    }
}
