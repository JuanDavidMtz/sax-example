/**
 * 
 */
package com.raidentrance.parser;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.raidentrance.handler.BreakFastHandler;
import com.raidentrance.model.Food;

/**
 * @author maagapi
 *
 */
public class BreakfastParser {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		BreakFastHandler handler = new BreakFastHandler();
		saxParser.parse("src/main/resources/menu.xml", handler);
		List<Food> list = handler.getBreakfast();
		for (Food food : list) {
			System.out.println("Name: " + food.getName());
			System.out.println("Description: " + food.getDescription());
			System.out.println("Price: " + food.getPrice());
			System.out.println("Calories: " + food.getCalories());
			System.out.println("---------------------------------------------------------------------------------------------");
		}
	}
}
