package org.itstep.model.impl;

import java.util.ArrayList;

import org.itstep.model.Supply;

public class Snacks implements Supply {
	ArrayList<Snacks> snacksList = new ArrayList<Snacks>();
	
	public void addSnacks() {
		this.snacksList.add(new Snacks());
	}
	
	public void printArea() {
		
		
	}

}
