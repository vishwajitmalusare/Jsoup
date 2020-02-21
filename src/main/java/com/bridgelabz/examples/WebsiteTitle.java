package com.bridgelabz.examples;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebsiteTitle {
	
	public static void main(String args[]) throws IOException {
		//try google
		String url = "https://www.bridgelabz.com";
		
		Document doc = Jsoup.connect(url).get();
		String title = doc.title();
		System.out.println(title);
	}

}