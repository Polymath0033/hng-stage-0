package com.polymath.hng.hngstage0;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class ApiController {

    @GetMapping
    public Map<String,String> getMyDetails() {
        Map<String,String> response = new LinkedHashMap<>();
        response.put("email","olosanyusuf19@gmail.com");
        response.put("current_datetime", ZonedDateTime.now().withNano(0).format(DateTimeFormatter.ISO_INSTANT));
        response.put("github_url","https://github.com/Polymath0033/hng-stage-0");
        return response;
    }

}
