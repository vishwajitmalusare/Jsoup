package com.bridgelabz.examples;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;

public class SanitizeHTML {

	public static void main(String args[]) {
		String htmlString = "<html><head><title>My title</title></head>"
				+ "<body><center>Body content</center></body></html>";

		boolean valid = Jsoup.isValid(htmlString, Whitelist.basic());

		if (valid) {
			System.out.println("The document is valid");
		} else {
			System.out.println("The document is not valid");
			System.out.println("Cleaned document");

			Document dirtyDoc = Jsoup.parse(htmlString);
			Document cleanDocument = new Cleaner(Whitelist.basic()).clean(dirtyDoc);

			System.out.println(cleanDocument.html());
		}
	}
}