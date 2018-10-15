package com.daishuaiqing.blog.service;

import com.daishuaiqing.blog.entity.Article;
import com.daishuaiqing.blog.mapper.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public List<Article> list(Article article) {
        return articleDao.findAll();
    }

    public Article get(Article article) {
        return articleDao.findById(article.getId()).get();
    }

    public Article update(Article article) {
        article.setDeleteFlag(false);
        return articleDao.save(article);
    }

    public Article save(Article article) {
        return articleDao.save(article);
    }

    public Boolean delete(Article article) {
        articleDao.deleteById(article.getId());
        return !articleDao.existsById(article.getId());
    }
}
