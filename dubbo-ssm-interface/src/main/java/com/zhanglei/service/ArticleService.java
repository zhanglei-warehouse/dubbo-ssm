package com.zhanglei.service;

import com.github.pagehelper.PageInfo;
import com.zhanglei.pojo.Article;
import com.zhanglei.pojo.ArticlePo;

/** 
* @author: ZhangLei
* @version 创建时间：2020年2月25日 下午7:20:17 
* 类说明 
*/
public interface ArticleService {

	PageInfo<Article> list(int pageNum,ArticlePo articlePo);
}
