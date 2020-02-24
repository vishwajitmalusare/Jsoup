package com.bridgelabz.tutorialpoint;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class LoadingFromFile {

	public static void main(String args[]) throws URISyntaxException, IOException {
		//Not working as i think May be related to internet connection issue
		URL path = ClassLoader.getSystemResource("test.html");
		File input = new File(path.toURI());
		//Above both lines are for getting exact url from FS 
		Document doc = Jsoup.parse(input, "UTF-8");
		System.out.println(doc.title());
	}
}
