package org.itstep.model.impl;

import java.util.ArrayList;

import org.itstep.model.Supply;

public class HotDrinks implements Supply {
	ArrayList<HotDrinks> hotDrinksList = new ArrayList<HotDrinks>();
	
	public void addHotDrinks() {
		this.hotDrinksList.add(new HotDrinks());
	}

	public void printArea() {
		
		
	}

}
