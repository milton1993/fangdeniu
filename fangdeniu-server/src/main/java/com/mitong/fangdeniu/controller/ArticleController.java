package com.mitong.fangdeniu.controller;

import com.mitong.fangdeniu.entity.param.PageQueryParam;
import com.mitong.fangdeniu.entity.po.Article;
import com.mitong.fangdeniu.entity.vo.IndexArticle;
import com.mitong.fangdeniu.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-4
 * @decription
 */
@Controller
@RequestMapping("/server/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "/indexFour", method = RequestMethod.POST)
    @ResponseBody
    public IndexArticle getIndexArticles(@RequestBody PageQueryParam params) {
        return articleService.getIndexArticles(params);
    }
}
