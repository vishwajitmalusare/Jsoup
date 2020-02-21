package com.bridgelabz.examples;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ParsingLocalHtml {

	public static void main(String args[]) throws IOException {
		String fileName = "/home/admin1/Downloads/Vish/HTMLDocs/FirstDocument.html";
		
		Document doc = Jsoup.parse(new File(fileName), "utf-8");
		Element divTag = doc.getElementById("mydiv");
		System.out.println(divTag.text());
	}
}