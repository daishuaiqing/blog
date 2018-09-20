package com.daishuaiqing.blog.controller;

import com.daishuaiqing.blog.entity.Article;
import com.daishuaiqing.blog.service.ArticleService;
import com.daishuaiqing.blog.util.DateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "文章", tags = "文章" )
@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @ApiOperation("文章列表")
    @GetMapping("/article/list")
    public List<Article> list(Article article) {
        return articleService.list(article);
    }

    @ApiOperation("文章信息")
    @GetMapping("/article/get")
    public Article get(Article article) {
        return articleService.get(article);
    }

    @ApiOperation("修改文章信息")
    @ApiImplicitParam(name = "user", value = "单个文章信息", dataType = "User")
    @PutMapping("/article/update")
    public int update(@RequestBody Article article) {
        return articleService.update(article);
    }

    @ApiOperation("新增文章")
    @PostMapping("/article/save")
    public int save(@RequestBody Article article) {
        article.setCreateTime(DateUtil.getUnixMillis());
        article.setDeleteFlag(false);
        return articleService.save(article);
    }

    @ApiOperation("删除文章")
    @DeleteMapping("/article/delete")
    public int delete(Article article) {
        return articleService.delete(article);
    }

}
