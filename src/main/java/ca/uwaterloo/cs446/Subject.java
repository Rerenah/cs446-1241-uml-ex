package ca.uwaterloo.cs446;

import java.util.list;
import java.util.LinkedList;

abstract public class Subject {
	private List<Observer> observers = new LinkedList();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void sendNotice() {
		for (int i = 0; i < observers.size(); i++) {
			observers.update();
		}
	}

	abstract public int getState() {}

	abstract public void setState(int state) {}
}