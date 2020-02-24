package com.bridgelabz.tutorialpoint;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseBodyFragment {

	public static void main(String args[]) {
		String html = "<div><p>Paragraph One Content</p><p>Paragraph two contenet</p>";
		Document document = Jsoup.parseBodyFragment(html);
		Element body = document.body();
		Elements paragraphs = body.getElementsByTag("p");
		for(Element paragrapg : paragraphs) {
			System.out.println(paragrapg.text());
			System.out.println("Paragraph without text: ="+paragrapg);
		}
	}
}