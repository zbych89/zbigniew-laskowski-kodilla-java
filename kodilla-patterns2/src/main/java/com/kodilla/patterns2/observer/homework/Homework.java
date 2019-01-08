package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements HomeworkObservable {
    private final List<String> works;
    private final List<HomeworkObserver> observers;
    private final String name;

    public Homework(String name) {
        this.works = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void notifyObservers() {
        for(HomeworkObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public List<String> getWorks() {
        return works;
    }
    public void addWork(String work){
        works.add(work);
        notifyObservers();
    }
}
