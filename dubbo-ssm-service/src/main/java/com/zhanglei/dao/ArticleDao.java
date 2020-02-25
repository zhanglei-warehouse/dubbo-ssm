package com.zhanglei.dao;

import java.util.List;

import com.zhanglei.pojo.Article;
import com.zhanglei.pojo.ArticlePo;

/** 
* @author: ZhangLei
* @version 创建时间：2020年2月25日 下午7:28:40 
* 类说明 
*/
public interface ArticleDao {

	List<Article> list(ArticlePo articlePo);

}
