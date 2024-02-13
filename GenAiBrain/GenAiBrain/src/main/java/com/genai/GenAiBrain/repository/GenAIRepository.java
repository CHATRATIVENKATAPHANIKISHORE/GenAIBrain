package com.genai.GenAiBrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genai.GenAiBrain.model.GenAIModel;

public interface GenAIRepository extends JpaRepository<GenAIModel, Long> {

}
