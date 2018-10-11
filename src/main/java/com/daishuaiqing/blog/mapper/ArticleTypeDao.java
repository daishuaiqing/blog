package com.daishuaiqing.blog.mapper;

import com.daishuaiqing.blog.entity.ArticleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ArticleTypeDao extends JpaRepository<ArticleType,Integer>, JpaSpecificationExecutor<ArticleType> {

}
