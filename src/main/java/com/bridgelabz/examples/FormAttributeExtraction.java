package com.bridgelabz.examples;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FormAttributeExtraction {

	public static void main(String args[]) throws IOException {
		// Make it working Its not working
		//try https://www.bridgelabz.com || http://x-hub.io
		Document doc = Jsoup.connect("https://www.google.com/").get();
		Element formElement = doc.getElementById("Form");
		System.out.println("formElement = "+formElement);
		
		Elements inputElements = formElement.getElementsByTag("input");
		
		for(Element inputElement : inputElements) {
			String key = inputElement.attr("name");
			String value = inputElement.attr("value");
			System.out.println("Param name: "+key+"\nParam Value: "+value);
		}
	}
}