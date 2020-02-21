package com.bridgelabz.examples;

import java.io.IOException;

import org.jsoup.Jsoup;

public class ReadingSource {

	public static void main(String arg[]) throws IOException {

		String webPage = "https://www.bridgelabz.com";

		String html = Jsoup.connect(webPage).get().html();

		System.out.println(html);
	}
}