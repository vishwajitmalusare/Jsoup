package com.bridgelabz.tutorialpoint;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class UsingDOMMethods {

	public static void main(String args[]) {
		String html = "<html><head><title> Title in DOM example</title></head>"
				+ "<body><p>Paragraph content in DOM example</p>"
				+ "<div id='sampleDiv'><a href='www.google.com'>Google</a></div>"
				+ "</body></html>";
		
		Document doc = Jsoup.parse(html);
	System.out.println("Title Of Doc :-"+ doc.title());
	
	Elements paragraphs = doc.getElementsByTag("p");
	for(Element paragraph : paragraphs) {
		System.out.println("Paragraphs in DOM example:- "+paragraph.text());
	}
	
	Element sampleDiv = doc.getElementById("sampleDiv");
	System.out.println("sampleDiv Data : "+sampleDiv.text());
	
	Elements links = sampleDiv.getElementsByTag("a");
	for(Element link : links) {
		System.out.println("Href: "+link.attr("href"));
		System.out.println("Text: "+link.text());
	}
	}
}
