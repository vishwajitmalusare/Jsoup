package com.bridgelabz.tutorialpoint;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WorkingWithURL {

	public static void main(String args[]) throws IOException {
		//String url = "http://www.tutorialspoint.com/";
		String url = "https://www.bridgelabz.com/";
		
		Document doc = Jsoup.connect(url).get();
		
		Element link = doc.select("a").first();
		System.out.println("Relative Link: "+ link.attr("href"));
		System.out.println("Absolute Link: "+link.attr("abs:href"));
		System.out.println("Absolute Link: "+link.absUrl("href"));
	}
}