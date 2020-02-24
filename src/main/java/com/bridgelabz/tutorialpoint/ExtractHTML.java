package com.bridgelabz.tutorialpoint;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ExtractHTML {

	public static void main(String args[]) {
		String html = "<html><head><title>Title in ExtractHTML</title></head>"
				+ "<body> <p>Paragraph in Extarct HTML</p> "
				+ "<div id='ampleDiv'><a href='www.google.com'>Google</a>"
				+ "<h3><a>Sample</a></h3> </div> </body> </html>";
		
		Document document = Jsoup.parse(html);
		
		//a with href
		Element link = document.select("a").first();
		System.out.println("Outer Html: "+ link.outerHtml());
		System.out.println("Innter Html: "+link.html());
	}
}