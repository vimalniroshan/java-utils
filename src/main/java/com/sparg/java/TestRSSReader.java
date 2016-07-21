package com.sparg.java;

/**
 * @author: vimal.sengoden
 * Date: 6/14/2016
 * Time: 5:12 PM
 */
public class TestRSSReader {

	public static final String CRICK_INFO_RSS_FEED_URL = "http://static.cricinfo.com/rss/livescores.xml";

	public static final String CRICK_BUZZ_RSS_FEED_URL = "http://synd.cricbuzz.com/j2me/1.0/livematches.xml";

	public static void main(String[] args) {
		System.out.println(System.nanoTime());
		/*try {
			SyndFeedInput input = new SyndFeedInput();
			SyndFeed feed = input.build(new XmlReader(new URL(CRICK_INFO_RSS_FEED_URL)));
			int count = 1;
			for(SyndEntry entry : (List<SyndEntry>)feed.getEntries()) {
				System.out.println(count++);
				System.out.println("Title:" + entry.getTitle());
				System.out.println("Description:" + entry.getDescription().getValue());
				System.out.println("Link:" + entry.getLink());
				System.out.println("Guid:" + entry.getUri());
			}
		} catch (FeedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		//System.out.println("teststring".hashCode() + " " + new String("teststring").hashCode());
		//System.out.println(new String("teststring").hashCode());

		System.out.println(Integer.toBinaryString(123));


	}
}
