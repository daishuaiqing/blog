package com.daishuaiqing.blog.service;

import com.daishuaiqing.blog.entity.Article;
import com.daishuaiqing.blog.entity.ArticleType;
import com.daishuaiqing.blog.mapper.ArticleTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleTypeService{
    @Autowired
    private ArticleTypeDao articleTypeDao;

    public List<ArticleType> list(ArticleType articleType) {
        return articleTypeDao.findAll();
    }

    public ArticleType get(ArticleType articleType) {
        return articleTypeDao.findById(articleType.getId()).get();
    }

    public ArticleType update(ArticleType articleType) {
        return articleTypeDao.save(articleType);
    }

    public ArticleType save(ArticleType articleType) {
        return articleTypeDao.save(articleType);
    }

    public Boolean delete(ArticleType articleType) {
        articleTypeDao.deleteById(articleType.getId());
        return !articleTypeDao.existsById(articleType.getId());
    }
}
