package com.bridgelabz.cookbook;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ParsingBodyFragment {

	public static void main(String args[]) {
		
		String html = "<div><p>In P Tag.</p></div>";
		Document doc = Jsoup.parseBodyFragment(html);
		Element body = doc.body();
		System.out.println("Body : \n"+ body);
	}
}