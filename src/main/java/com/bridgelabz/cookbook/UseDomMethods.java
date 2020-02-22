package com.bridgelabz.cookbook;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class UseDomMethods {

	public static void main(String args[]) throws IOException {
	String url ="https://www.google.com";
	
	Document doc = Jsoup.connect(url).get();
	
//	Element content = doc.getElementById("content");
	Elements  links = doc.getElementsByTag("a");
	for(Element link : links) {
		String linkHref = link.attr("href");
		String linkText = link.text();
		System.out.println("Link : "+linkHref+" LinkText : "+linkText);
	}
}}