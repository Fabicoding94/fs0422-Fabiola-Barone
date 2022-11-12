package com.GestioneIncendi.GestioneIncendi.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();

	

public void addObservers(Observer o) {
	this.observers.add(o);
}

public void notificaObserver() {
	for(Observer o: this.observers) {
		o.notifica(this);
	}	
}

public void removeObserver(Observer o) {
	this.observers.remove(o);
}
}
