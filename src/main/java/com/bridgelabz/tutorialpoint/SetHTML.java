package com.bridgelabz.tutorialpoint;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class SetHTML {

	public static void main(String args[]) {

		String html = "<html> <head><title>Title in set HTML</title></head>"
				+ "<body> <div id='sampleDiv'> <a id='googleA' href='www.google.com'>Google</a></div>"
				+ "</body> </html>";

		Document doc = Jsoup.parse(html);

		Element div = doc.getElementById("sampleDiv");
		System.out.println("Outer HTML Before Modification :\n " + div.outerHtml());
		System.out.println("--------------------------------------------------\n");

		div.html("<p>This is a sample content.</P>");
		System.out.println("Outer HTML After Modification :\n " + div.outerHtml());
		System.out.println("--------------------------------------------------\n");

		div.prepend("<p>Initial Text</p>");
		System.out.println("After Prepend :\n " + div.outerHtml());
		System.out.println("--------------------------------------------------\n");

		div.append("<p>End Text</p>");
		System.out.println("After Append :\n" + div.outerHtml());
		System.out.println("--------------------------------------------------\n");
	}
}
