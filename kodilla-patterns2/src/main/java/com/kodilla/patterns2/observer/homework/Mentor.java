package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(": New entry in topic " + homework.getName() + "\n" + " (total: " + homework.getWorks().size() + " entries)");
        updateCount++;
    }
}
