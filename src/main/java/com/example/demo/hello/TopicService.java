package com.example.demo.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
					new Topic("1", "mathematics", "Noel"),
					new Topic("2", "Biolog", "Benedists"),
					new Topic("3", "History", "Millar Man"),
					new Topic("4", "econs", "Fred")
					));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopicById(String id) {
		Topic oneTopic =  topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		if(oneTopic != null) {
			return oneTopic;
		}
		else {
			 throw new USER_NOT_FOUND_EXCEPTION("user _" + id);
		}
	}

	public void addTopic(Topic topic) {
		
		 topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i = 0; i <= topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
			else {
				 throw new USER_NOT_FOUND_EXCEPTION("user _" + id);
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));	
	}
}
