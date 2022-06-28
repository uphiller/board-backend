package com.example.boardbackend.controller;

import com.example.boardbackend.controller.dto.GetArticlesDto;
import com.example.boardbackend.controller.dto.PostArticleDto;
import com.example.boardbackend.domain.Article;
import com.example.boardbackend.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleService articleService;
    private final ModelMapper modelMapper;

    @PostMapping("/article")
    public void setArticle(PostArticleDto.Request request) throws IOException {
        articleService.setArticle(request);
    }

    @GetMapping("/articles")
    public List<GetArticlesDto.Response> getArticles(){
        List<Article> articles = articleService.getArticles();
        List<GetArticlesDto.Response> response = modelMapper.map(articles, new TypeToken<List<GetArticlesDto.Response>>() {}.getType());
        return response;
    }
}
