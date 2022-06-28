package com.example.boardbackend.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;


public class PostArticleDto {
    @Getter
    @Setter
    public static class Request {
        private String title;
        private String content;
    }
}
