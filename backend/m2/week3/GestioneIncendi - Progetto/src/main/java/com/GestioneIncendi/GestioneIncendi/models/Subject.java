package com.GestioneIncendi.GestioneIncendi.models;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
public void register(Observer o);
public void unregister(Observer o);
public void notifyObservers();


}



