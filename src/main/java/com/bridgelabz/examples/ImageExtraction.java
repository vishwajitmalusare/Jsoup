package com.bridgelabz.examples;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ImageExtraction {

	public static void main(String args[]) {
		
		Document doc;
		try {
			//get all images
			//Try https://www.bridgelabz.com
			doc = Jsoup.connect("http://x-hub.io").get();
			Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
			
			for(Element img : images) {
				System.out.println("\nsrc : "+ img.attr("src"));
				System.out.println("height : "+ img.attr("height"));
				System.out.println("width : "+ img.attr("width"));
				System.out.println("alt : "+ img.attr("alt"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}