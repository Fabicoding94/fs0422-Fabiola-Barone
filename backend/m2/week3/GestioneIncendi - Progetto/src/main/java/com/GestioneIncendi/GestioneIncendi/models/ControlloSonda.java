package com.GestioneIncendi.GestioneIncendi.models;

import java.util.ArrayList;
import java.util.List;

public class ControlloSonda implements Subject {

	
	
	private List <Observer> observers = new ArrayList<>();
	
	public void readData() {
		notifyObservers();
	}
	

	
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		this.getObservers().forEach(obs -> obs.update(this));
		
	}



	public List<Observer> getObservers() {
		return observers;
	}



	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

}
