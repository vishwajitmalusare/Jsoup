package com.bridgelabz.advance;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CustumisedConnection {

	public static void main(String args[]) throws IOException{
		String blogUrl = "https://spring.io/blog";
		//step one
//		String blogUrl = "https://spring.io/blog";
//		Document doc = Jsoup.connect(blogUrl).get();
//		System.out.println("Document ==>> : "+doc);

		//Step two
		//		try {
//			Document doc404 = Jsoup.connect("https://spring.io/will-not-be-found").get();
//		}catch (HttpStatusException e) {
//			// TODO: handle exception
//			e.getMessage();
//		}
		
		//Step Three
//		Connection connection = Jsoup.connect(blogUrl);
//		connection.userAgent("Mozilla");
//		connection.timeout(5000);
//		connection.cookie("cookieOne", "val123");
//		connection.cookie("cookieTwo", "val234");
//		connection.referrer("http://google.com");
//		connection.header("headersecurity", "xyz123");
//		Document docCutomConn = connection.get();
//		System.out.println("Document : "+docCutomConn);
		
		//Step Four
		Document docCutomConn = Jsoup.connect(blogUrl)
				.userAgent("Mozilla")
				.timeout(5000)
				.cookie("cookieOne", "val234")
				.cookie("cookieTwo", "jsoup")
				.referrer("http://google.com")
				.header("headersecurity", "xyz123")
				.get();
		System.out.println("Document : "+docCutomConn);
		
	}
}
/**
 * Document docCustomConn = Jsoup.connect(blogUrl)
  .userAgent("Mozilla")
  .timeout(5000)
  .cookie("cookiename", "val234")
  .cookie("anothercookie", "ilovejsoup")
  .referrer("http://google.com")
  .header("headersecurity", "xyz123")
  .get();*/