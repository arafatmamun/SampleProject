/**
 * 
 */
package com.sample.utilities;

import com.sample.activities.ClickMethods;
import com.sample.activities.CompareMethods;

/**
 * @author arafatmamun
 *
 */
public abstract class MethodsHandler {
	
	private final static String xpath = "xpath";
	private final static String id = "id";
	private final static String cssSelector = "css";
	private final static String name = "name";
	private final static String linkText = "linkText";
	
	public static String getXpath() {
		return xpath;
	}

	public static String getId() {
		return id;
	}

	public static String getCssselector() {
		return cssSelector;
	}

	public static String getName() {
		return name;
	}
	
	public static String getLinkText(){
		return linkText;
	}
	
	
	/*
	 * Object for Click Methods
	 */
	public ClickMethods click(){
		ClickMethods clickMethods = new ClickMethods();
		return clickMethods;
	}
	
	/*
	 * Object for Assert Methods
	 */
	public CompareMethods compare(){
		CompareMethods compareMethods = new CompareMethods();
		return compareMethods;
	}
}