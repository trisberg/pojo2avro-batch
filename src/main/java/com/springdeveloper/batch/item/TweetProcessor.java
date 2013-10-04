package com.springdeveloper.batch.item;

import com.springdeveloper.domain.Tweet;
import org.springframework.batch.item.ItemProcessor;

import java.util.Map;

/**
 */
public class TweetProcessor implements ItemProcessor<Map<String, Object>, Tweet> {

	public Tweet process(Map<String, Object> s) throws Exception {
		Tweet t = new Tweet();
		t.setId((Long) s.get("id"));
		t.setCreatedAt((Long) s.get("createdAt"));
		t.setFromUser((String) s.get("fromUser"));
		t.setText((String) s.get("text"));
		return t;
	}
}
