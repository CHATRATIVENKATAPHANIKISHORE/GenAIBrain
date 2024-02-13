package com.genai.GenAiBrain.service;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GenAIBrainService {
	
	@Autowired
	ChatClient genaibrain;
	
	public String getStory(String topic){
        return this.genaibrain.call(topic);
    }

	

}
