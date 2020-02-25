package com.zhanglei.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhanglei.dao.ArticleDao;
import com.zhanglei.pojo.Article;
import com.zhanglei.pojo.ArticlePo;
import com.zhanglei.service.ArticleService;

/** 
* @author: ZhangLei
* @version 创建时间：2020年2月25日 下午7:25:16 
* 类说明 
*/
@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleDao articleDao;
	
//	列表展示 分页 加上条件查询 区间查询
	@Override
	public PageInfo<Article> list(int pageNum, ArticlePo articlePo) {
		PageHelper.startPage(pageNum, 6);
		List<Article> list = articleDao.list(articlePo);
		PageInfo<Article> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

}
