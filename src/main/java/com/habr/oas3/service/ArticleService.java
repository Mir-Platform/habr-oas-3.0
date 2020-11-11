package com.habr.oas3.service;

import com.habr.oas3.model.ArticleDto;
import com.habr.oas3.model.Hubs;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ArticleService {

    public ArticleDto createTest() {
        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthor("Habr Author");
        articleDto.setHubs(Arrays.asList(Hubs.JAVA, Hubs.MATH));
        articleDto.setText("Habr text");
        articleDto.setTitle("Habr title");
        return articleDto;
    }
}
