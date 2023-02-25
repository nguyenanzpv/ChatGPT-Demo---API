package com.java.openapi.demo.service;

import com.java.openapi.demo.model.BotRequest;
import com.java.openapi.demo.model.ChatGptRequest;
import com.java.openapi.demo.model.ChatGptResponse;

public interface BotService {
    ChatGptResponse askQuestion(BotRequest botRequest);
}
