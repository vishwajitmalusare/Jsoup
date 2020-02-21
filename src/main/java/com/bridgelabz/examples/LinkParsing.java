package com.bridgelabz.examples;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LinkParsing {

	public static void main(String args[]) throws IOException {
		
		String url = "https://www.jsoup.org";
		//bridgelabz not having links
		
		Document document = Jsoup.connect(url).get();
		Elements links = document.select("a[href]");
		
		for(Element link : links) {
			System.out.println("link : "+ link.attr("href"));
			System.out.println("text : "+ link.text());
		}
	}
}