package com.habr.oas3.conrtoller;

import com.habr.oas3.model.ArticleDto;
import com.habr.oas3.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ArticlesApiImpl implements ArticlesApi {

    private final ArticleService articleService;

    @Override
    public ResponseEntity<ArticleDto> create(String xIdempotencyKey, @Valid ArticleDto body) {
        return ResponseEntity.ok(articleService.createTest());
    }

    @Override
    public ResponseEntity<Void> delete(Long articleId) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<ArticleDto> getArticle(Long articleId) {
        return ResponseEntity.ok(articleService.createTest());
    }

    @Override
    public ResponseEntity<List<ArticleDto>> getArticles() {
        return ResponseEntity.ok(Collections.singletonList(articleService.createTest()));
    }

    @Override
    public ResponseEntity<ArticleDto> update(Long articleId, @Valid ArticleDto body) {
        return ResponseEntity.ok(articleService.createTest());
    }
}
