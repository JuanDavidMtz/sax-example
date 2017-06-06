/**
 * 
 */
package com.raidentrance.model;

/**
 * @author raidentrance
 *
 */
public enum BreakfastElement {
	FOOD("food"), NAME("name"), PRICE("price"), DESCRIPTION("description"), CALORIES("calories");

	private String name;

	private BreakfastElement(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
