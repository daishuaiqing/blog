package com.daishuaiqing.blog.controller;

import com.daishuaiqing.blog.entity.ArticleType;
import com.daishuaiqing.blog.model.MyResult;
import com.daishuaiqing.blog.model.SuccessResult;
import com.daishuaiqing.blog.service.ArticleTypeService;
import com.daishuaiqing.blog.util.DateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value="文章类型",tags={"文章类型"})
@RestController
public class ArticleTypeController {
    @Autowired
    private ArticleTypeService articleTypeService;

    @ApiOperation("文章类型列表")
    @GetMapping("/articleType/list")
    public MyResult list(ArticleType articleType) {
        return new SuccessResult(articleTypeService.list(articleType));
    }

    @ApiOperation("文章类型信息")
    @GetMapping("/articleType/get")
    public ArticleType get(ArticleType articleType) {
        return articleTypeService.get(articleType);
    }

    @ApiOperation("修改文章类型信息")
    @ApiImplicitParam(name = "user", value = "单个用户信息", dataType = "User")
    @PutMapping("/articleType/update")
    public ArticleType update(@RequestBody ArticleType articleType) {
        articleType.setDeleteFlag(false);
        return articleTypeService.update(articleType);
    }

    @ApiOperation("新增文章类型")
    @PostMapping("/articleType/save")
    public ArticleType save(@RequestBody ArticleType articleType) {
        articleType.setCreateTime(DateUtil.getUnixMillis());
        articleType.setDeleteFlag(false);
        return articleTypeService.save(articleType);
    }

    @ApiOperation("删除文章类型")
    @DeleteMapping("/articleType/delete")
    public Boolean delete(ArticleType articleType) {
        return articleTypeService.delete(articleType);
    }

}
