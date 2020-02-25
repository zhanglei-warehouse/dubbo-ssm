package com.zhanglei.pojo;

import java.io.Serializable;

/**
 * @author: ZhangLei
 * @version 创建时间：2020年2月25日 下午7:14:59 类说明
 */
public class ArticlePo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2873262508509688404L;
	private String startDate;
	private String endDate;
	private String date;
	private Integer userId;
	private Integer commentcnt;
	private String condition;
	@Override
	public String toString() {
		return "ArticlePo [startDate=" + startDate + ", endDate=" + endDate + ", date=" + date + ", userId=" + userId
				+ ", commentcnt=" + commentcnt + ", condition=" + condition + "]";
	}
	public ArticlePo(String startDate, String endDate, String date, Integer userId, Integer commentcnt,
			String condition) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.date = date;
		this.userId = userId;
		this.commentcnt = commentcnt;
		this.condition = condition;
	}
	public ArticlePo() {
		super();
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCommentcnt() {
		return commentcnt;
	}
	public void setCommentcnt(Integer commentcnt) {
		this.commentcnt = commentcnt;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

	
}
