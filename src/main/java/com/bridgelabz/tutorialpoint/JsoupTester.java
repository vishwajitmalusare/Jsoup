package com.bridgelabz.tutorialpoint;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTester {
	
	public static void main(String args[]) throws IOException {
		
		String html = "https://www.bridgelabz.com";
//		String html = "<html><head><title>Sample Title</title></head>"
//				+ "<body><p>Paragraph Content</p></body></html>";
		Document document = Jsoup.connect(html).get();
		System.out.println(document.title());
		Elements paragraphs = document.getElementsByTag("p");
		for(Element paragraph: paragraphs) {
			System.out.println(paragraph.text());
		}
	}
}