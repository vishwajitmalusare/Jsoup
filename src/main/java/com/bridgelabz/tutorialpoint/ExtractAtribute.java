package com.bridgelabz.tutorialpoint;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ExtractAtribute {

	public static void main(String args[]) {
		String html = "<html><head><title>Title in ExtractAttribute</title></head>"
				+ "<body> <p>Paragraph in Extarct Attribute</p> <a href='www.google.com'>Google</a>"
				+ "<h3><a>Sample</a></h3> </body> </html>";
		Document document = Jsoup.parse(html);
		Element link = document.select("a").first();
		System.out.println("Href: "+ link.attr("href"));
	}
}
