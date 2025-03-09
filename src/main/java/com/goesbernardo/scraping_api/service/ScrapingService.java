package com.goesbernardo.scraping_api.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class ScrapingService {

    public void scrapeMatches() {
        try {
            // Conecta ao site BeSoccer
            Document document = Jsoup.connect("https://www.besoccer.com/").get();

            // Exemplo: pegar manchetes de notícias
            Elements headlines = document.select(".news-headline a");

            for (Element headline : headlines) {
                System.out.println("Título: " + headline.text());
                System.out.println("Link: " + headline.absUrl("href"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
