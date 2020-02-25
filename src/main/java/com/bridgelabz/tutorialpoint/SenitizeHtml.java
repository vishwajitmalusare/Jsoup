package com.bridgelabz.tutorialpoint;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

public class SenitizeHtml {

	public static void main(String args[]) {
		String html = "<p><a href='http://example.com/'" 
	+ "onClick='checkData()'>Link</a></p>";
		
		System.out.println("Initial HTML: "+html);
		String safeHtml = Jsoup.clean(html, Whitelist.basic());
		System.out.println("Cleaned Html :"+safeHtml);
	}
}