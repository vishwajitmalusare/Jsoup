package com.bridgelabz.tutorialpoint;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseUsingSelector {

	public static void main(String args[]) {
		String html = "<html><head><title>Title selector Html</title></head>"
				+ "<body> <p>Paragraph Contenet in selctor html</p>"
				+ "<div id='sampleDiv'><a href='www.google.com'>Google</a>" + "<h3><a>Sample</a></h3> </div>"
				+ "<div id='imageDiv' class='header'><img name='google' src='google.png'/>"
				+ "<img name='yahoo' src='yahoo.jpg'/> </div>" + "</body></html>";

		Document doc = Jsoup.parse(html);

		// a with href
		Elements links = doc.select("a[href]");
		for (Element link : links) {
			System.out.println("Href: " + link.attr("href"));
			System.out.println("Text: " + link.text());
		}

		// img with src enbding .png
		Elements pngs = doc.select("img[src$=.png]");
		for (Element png : pngs) {
			System.out.println("Name: " + png.attr("name"));
		}

		// div with class = header
		Element headerDiv = doc.select("div.header").first();
		System.out.println("Id: " + headerDiv.text());
		
		//direct a after h3
		Elements sampleLinks = doc.select("h3 > a");
		for(Element link : sampleLinks) {
			System.out.println("Text: "+ link.text());
		}
	}
}