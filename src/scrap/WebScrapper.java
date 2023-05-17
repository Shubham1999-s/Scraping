package scrap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebScrapper {
	 public static void main(String[] args) {
	        String phoneNumber = "9897654007"; // Input phone number
	        String emailAddress = "example@example.com"; // Input email address

	        // Scrape WhatsApp data
	        scrapeWhatsApp(phoneNumber);

	        // Scrape other platforms
	        // ...

	        // You can implement similar methods for scraping other platforms
	    }

	    private static void scrapeWhatsApp(String phoneNumber) {
	        String url = "https://web.whatsapp.com/?phone=" + phoneNumber;

	        try {
	            Document doc = Jsoup.connect(url).get();

	            // Check if user is registered
	            String registrationStatus = doc.selectFirst(".registration-status").text();
	            System.out.println("Registered: " + registrationStatus);

	            // Scrape other attributes
	            String name = doc.selectFirst(".name").text();
	            String status = doc.selectFirst(".status").text();
	            String lastSeen = doc.selectFirst(".last-seen").text();
	            // Scrape profile picture, UPI ID, username, profile URL, etc.
	            // ...

	            // Print the scraped attributes
	            System.out.println("Name: " + name);
	            System.out.println("Status: " + status);
	            System.out.println("Last seen: " + lastSeen);
	            // Print other attributes
	            // ...
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("An error occurred while scraping WhatsApp data.");
	        }
	    }


}
