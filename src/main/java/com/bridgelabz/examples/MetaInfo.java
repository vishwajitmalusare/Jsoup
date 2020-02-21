package com.bridgelabz.examples;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MetaInfo {

	public static void main(String args[]) throws IOException {
		
//		String url = "https://www.bridgelabz.com";
		String url = "http://www.jsoup.org";
		// Try "www.jsoup.org"
		
		Document document = Jsoup.connect(url).get();
		
		String description = document.select("meta[name=description]").first().attr("content");
		System.out.println("Description :"+description);
		
		String keyword = document.select("meta[name=description]").first().attr("content");
		System.out.println("Keyword :"+keyword);
	}
}
 