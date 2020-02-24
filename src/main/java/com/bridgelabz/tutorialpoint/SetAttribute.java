package com.bridgelabz.tutorialpoint;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SetAttribute {

	public static void main(String args[]) {
		String html = "<html> <head> <title>Title SetAttribute</title></head>"
				+ "<body> <p>Paragraph in Set Attribute</p>"
				+ "<div id='sampleDiv'> <a id='googleA' href='www.google.com'>Google</a> </div>"
				+ "<div class='comments'><a href='www.sample1.com'>Sample1</a>"
				+ "<a href='www.sample2.com'>Sample2</a>"
				+ "<a href='www.sample3.com'>Sample3</a>"
				+ "<div></div> "
				+ "<div id='imageDiv' class='header'><img name='google' src='google.png' />"
				+ "<img name='yahoo' src='yahoo.jpg' /> </div> </body> </html>";
		
		Document document = Jsoup.parse(html);
		
		//set attribute
		Element link = document.getElementById("googleA");
		System.out.println("Outer HTML Before Modification :"+ link.outerHtml());
		link.attr("href","www.yahoo.com");
		System.out.println("Outer HTML After Modification :"+ link.outerHtml());
		System.out.println("-----------------------------------------------------");
		
		//Add class 
		Element div = document.getElementById("sampleDiv");
		System.out.println("Outer HTML Before Modification Add Class: "+div.outerHtml());
		link.addClass("header");
		System.out.println("Outer HTML After Modification Add Class: "+div.outerHtml());
		System.out.println("-----------------------------------------------------");

		
		//remove class
		Element div1 = document.getElementById("imageDiv");
		System.out.println("Outer HTML Before Modification Remove Class: "+div1.outerHtml());
		div1.removeClass("header");
		System.out.println("Outer HTML After Modification Remove Class: "+div1.outerHtml());
		System.out.println("-----------------------------------------------------");

		
		//bulk update
		Elements links = document.select("div.comments a");
		System.out.println("Outer HTML Before Modification Bulk Update:"+links.outerHtml());
		links.attr("rel","nofollow");
		System.out.println("Outer HTML After Modification Bulk Update:"+links.outerHtml());
		System.out.println("-----------------------------------------------------");

	}
}