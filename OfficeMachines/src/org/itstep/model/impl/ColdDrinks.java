package org.itstep.model.impl;

import java.util.ArrayList;

import org.itstep.model.Supply;

public class ColdDrinks implements Supply {
	ArrayList<ColdDrinks> coldDrinksList = new ArrayList<ColdDrinks>();
	
	public void addColdDrinks() {
		this.coldDrinksList.add(new ColdDrinks());
	}
	

	public void printArea() {
		// TODO Auto-generated method stub
		
	}

}
