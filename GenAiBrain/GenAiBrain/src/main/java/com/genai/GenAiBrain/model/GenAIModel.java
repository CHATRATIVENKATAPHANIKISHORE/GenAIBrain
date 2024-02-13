package com.genai.GenAiBrain.model;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class GenAIModel {
	
	GenAIModel(){}
	@Id  
	//defining id as column name 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column  
	private Long qid;  
	//defining name as column name  
	@Column  
	private String userName; 
	
	@Column  
	private String userPrompt;
	
	@Column  
	private String topic;
	
	@Column(columnDefinition="text") 
	private String qanswer;
	
	@Column  
	private Date timestamp;

	public Long getQid() {
		return qid;
	}

	public void setQid(Long qid) {
		this.qid = qid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPrompt() {
		return userPrompt;
	}

	public void setUserPrompt(String userPrompt) {
		this.userPrompt = userPrompt;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getQanswer() {
		return qanswer;
	}

	public void setQanswer(String qanswer) {
		this.qanswer = qanswer;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(qanswer, qid, timestamp, topic, userName, userPrompt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenAIModel other = (GenAIModel) obj;
		return Objects.equals(qanswer, other.qanswer) && Objects.equals(qid, other.qid)
				&& Objects.equals(timestamp, other.timestamp) && Objects.equals(topic, other.topic)
				&& Objects.equals(userName, other.userName) && Objects.equals(userPrompt, other.userPrompt);
	}

	@Override
	public String toString() {
		return "GenAIModel [qid=" + qid + ", userName=" + userName + ", userPrompt=" + userPrompt + ", topic=" + topic
				+ ", qanswer=" + qanswer + ", timestamp=" + timestamp + "]";
	}

	public GenAIModel(Long qid, String userName, String userPrompt, String topic, String qanswer, Date timestamp) {
		super();
		this.qid = qid;
		this.userName = userName;
		this.userPrompt = userPrompt;
		this.topic = topic;
		this.qanswer = qanswer;
		this.timestamp = timestamp;
	}

	
	
	


		
	

	

}
