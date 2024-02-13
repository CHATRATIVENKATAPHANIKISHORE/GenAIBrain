package com.genai.GenAiBrain.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genai.GenAiBrain.dto.GenAIDTO;
import com.genai.GenAiBrain.model.GenAIModel;
import com.genai.GenAiBrain.repository.GenAIRepository;
import com.genai.GenAiBrain.service.GenAIBrainService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/genaibrain")
public class GenAIBrainController {
	GenAIModel genAIModel;
	@Autowired
	GenAIRepository genAIRepository;
	@Autowired
	GenAIBrainService genbrain;

	 @PostMapping("/user")
	    public String receiveData(@RequestBody  Map<String, Object> payLoad) {
	        // Process the received data here
		 
		 System.out.print("hi"+ (String)payLoad.get("userName"));
		 System.out.print("hi"+ (String)payLoad.get("userPrompt"));
		 String userName = (String)payLoad.get("userName");
		 String topic = (String)payLoad.get("userPrompt");
		 String userPrompt = "Generate one quote on topic"+" "+topic+"";
		 String qanswer = genbrain.getStory(userPrompt);
		 
			GenAIModel genAIModel = new GenAIModel(null,userName,userPrompt,topic, qanswer,new Date());
			genAIRepository.save(genAIModel);

		 

	        //System.out.println("Received Text Area s1: " + data);
	       // System.out.println("Received Text Area 2: " + data.getTextArea2());

	        // Returning a simple response
	        return qanswer;
	 }
	        @GetMapping("/data")
		    public List<GenAIModel> receivedData() {
		        // Process the received data here
		       
		        // Returning a simple response
	        	return genAIRepository.findAll();
	        
	        
}
}
	


