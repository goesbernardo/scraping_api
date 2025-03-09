package com.goesbernardo.scraping_api.controller;

import com.goesbernardo.scraping_api.service.ScrapingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrape-besoccer")
public class ScrapingController {

    private final ScrapingService service;


    public ScrapingController(ScrapingService service) {
        this.service = service;
    }

    @GetMapping
    public String scrape() {
        service.scrapeMatches();
        return "Scraping concluído!";
    }
}
