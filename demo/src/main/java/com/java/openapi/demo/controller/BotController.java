package com.java.openapi.demo.controller;

import com.java.openapi.demo.model.BotRequest;
import com.java.openapi.demo.model.ChatGptResponse;
import com.java.openapi.demo.service.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bot")
@RequiredArgsConstructor
public class BotController {

    private final BotService botService;

    @PostMapping("/send")
    public ChatGptResponse sendMessage(@RequestBody BotRequest botRequest) {
        return botService.askQuestion(botRequest);
    }
}
