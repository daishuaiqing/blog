package com.daishuaiqing.blog.service;

import com.daishuaiqing.blog.entity.Article;
import com.daishuaiqing.blog.mapper.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public Page<Article> list(Article article, Pageable pageable) {
        Specification<Article> specification = new Specification<Article>() {
            @Override
            public Predicate toPredicate(Root<Article> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if(article.getTypeId()!=null){
                    predicates.add(cb.equal(root.get("typeId").as(String.class),article.getTypeId()));
                }
                if (predicates.size() == 0) {
                    return null;
                }
                Predicate[] predicateArr = new Predicate[predicates.size()];
                predicateArr = predicates.toArray(predicateArr);
                return cb.and(predicateArr);
            }
        };
        return articleDao.findAll(specification,pageable);
    }

    public Article get(Article article) {
        return articleDao.findOne(article.getId());
    }

    public Article update(Article article) {
        article.setDeleteFlag(false);
        return articleDao.save(article);
    }

    public Article save(Article article) {
        return articleDao.save(article);
    }

    public Boolean delete(Article article) {
        articleDao.delete(article.getId());
        return !articleDao.exists(article.getId());
    }
}
