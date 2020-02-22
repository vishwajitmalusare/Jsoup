package com.bridgelabz.cookbook;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TextAttrFormElement {

	public static void main(String args[]) {
		
		String html = "<p> An <a href='http://example.com/'><b>example</b></a>link.</p>";
		Document doc = Jsoup.parse(html);
		System.out.println("Document: \n"+doc);
		
		Element link = doc.select("a").first();
		System.out.println("\nLink : "+link);
		
		String text = doc.body().text();
		String linkHref = link.attr("href");
		String linkText = link.text();
		System.out.println("\nText: "+text);
		System.out.println("LinkHerf : "+linkHref);
		System.out.println("LinkText : "+linkText);
		
		String linkOuterH = link.outerHtml();
		String linkInnerH = link.html();
		System.out.println("\nOuter HTML :"+linkOuterH);
		System.out.println("Inner HTM :"+linkInnerH);
		
	}
}