package com.bridgelabz.tutorialpoint;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class SetTextContent {

	public static void main(String args[]) {
		String html = "<html><head><title>Title in Set Text</title></head>"
				+ "<body> <div id='sampleDiv'><a id='gogleA' href='www.google.com'>Google</a></div>" + "</body></html>";

		Document document = Jsoup.parse(html);

		Element div = document.getElementById("sampleDiv");
		System.out.println("Outer HTML Before Modification :\n " + div.outerHtml());
		System.out.println("-----------------------------------");

		div.prepend("Initial Text.");
		System.out.println("After prepending :\n " + div.outerHtml());
		System.out.println("-----------------------------------");

		div.append("End Text.");
		System.out.println("After prepending :\n " + div.outerHtml());
		System.out.println("-----------------------------------");

	}
}