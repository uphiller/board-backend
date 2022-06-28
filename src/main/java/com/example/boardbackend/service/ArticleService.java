package com.example.boardbackend.service;

import com.example.boardbackend.controller.dto.PostArticleDto;
import com.example.boardbackend.domain.Article;
import com.example.boardbackend.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;


@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional
    public Article setArticle(PostArticleDto.Request request){
        Article article = new Article(request);
        articleRepository.save(article);
        return article;
    }

    public List<Article> getArticles(){
        return articleRepository.findAll();
    }

}
