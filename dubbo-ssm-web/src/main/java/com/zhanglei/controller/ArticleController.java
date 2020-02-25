package com.zhanglei.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zhanglei.pojo.Article;
import com.zhanglei.pojo.ArticlePo;
import com.zhanglei.service.ArticleService;

/** 
* @author: ZhangLei
* @version 创建时间：2020年2月25日 下午7:38:06 
* 类说明 
*/
@Controller
public class ArticleController {

	@Reference(url="dubbo://127.0.0.1:20881")
	private ArticleService articleService;
	
	@RequestMapping("list")
	public String list(Model model,ArticlePo articlePo,@RequestParam(defaultValue = "1",value = "pageNum") int pageNum) {
		
		PageInfo<Article> list = articleService.list(pageNum, articlePo);
		model.addAttribute("pageInfo", list);
		model.addAttribute("articlePo", articlePo);
		model.addAttribute("pageNum", pageNum);
		return "list";
	}
}
