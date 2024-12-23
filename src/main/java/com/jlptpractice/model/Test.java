package com.jlptpractice.model;

public class Test {
    private int test_id;
    private int level_id;
    private int year;

    public Test(int test_id, int level_id, int year) {
        this.test_id = test_id;
        this.level_id = level_id;
        this.year = year;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public int getLevel_id() {
        return level_id;
    }

    public void setLevel_id(int level_id) {
        this.level_id = level_id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "test{" + "test_id=" + test_id + ", level_id=" + level_id + ", year=" + year + '}';
    }
}
