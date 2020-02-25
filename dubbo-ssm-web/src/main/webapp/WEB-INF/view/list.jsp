<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表展示页</title>
<link rel="stylesheet" href="bootstrap-4.3.1-dist/css/bootstrap.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
</head>
<body>
   

<div class="container">
  <div class="row">
    <div class="col-sm-1">
      
    </div>
    <div class="col-sm-13">
       
			<div class="table-responsive">
			  <table class="table">
			  <!-- 搜索框 -->
			  	<tr>
			  		<td colspan="6">
			  			<form class="form-inline" action="list">
				  		<div class="form-group mb-2">
							    请按照选项排序：
							  </div>
							  <input type="hidden" name="pageNum">
							  <div class="form-group mx-sm-3 mb-2">
							    <select name="condition" id="inputState" class="form-control">
							            <option value="">请选择</option>
							            <c:if test="${articlePo.condition!='created' }">
							            <option value="created">发表时间</option>
							            </c:if>
							            <c:if test="${articlePo.condition=='created' }">
							            <option value="created" selected>发表时间</option>
							            </c:if>
							            <c:if test="${articlePo.condition=='user_id' }">
					                    <option value="user_id" selected>作者</option>
					                    </c:if>
					                    <c:if test="${articlePo.condition!='user_id' }">
					                    <option value="user_id">作者</option>
					                    </c:if>
					                     <c:if test="${articlePo.condition=='commentCnt' }">
					                    <option value="commentCnt" selected>评论数量</option>
					                    </c:if>
					                    <c:if test="${articlePo.condition!='commentCnt' }">
					                    <option value="commentCnt">评论数量</option>
					                    </c:if>
							      </select>
							  </div>
							  开始时间：<input type="date" name="startDate" value="${articlePo.startDate}">
             				  结束时间: <input type="date" name="endDate" value="${articlePo.endDate}">
							  <button type="submit" class="btn btn-primary mb-2">查询</button>
							</form>         
			  				
			  				
			  		</td>
			  	</tr>
			  
			  	<!-- 页面内容 -->
			     <tr>
			        <td>id</td>
			        <td>文章标题</td>
			        <td>文章发布时间</td>
			        <td>作者</td>
			        <td>评论数量</td>
			        <td>文章状态</td>
			     </tr>
			     <c:forEach items="${pageInfo.list }" var="a">
			       <tr>
			        <td>${a.id }</td>
			        <td>${a.title }</td>
			        <td>${a.created }</td>
			        <td>${a. username}</td>
			        <td>${a.commentcnt }</td>
			        <td>${a.status==1?'审核通过':审核未通过 }</td>
			       </tr>
			     </c:forEach>
			     <!-- 分页 -->
			     <tr>
			     	<td colspan="10">
			     		<div class="row col-9">
						   	<nav aria-label="Page navigation example col-4">
						   	
							  <ul class="pagination">
							  	<c:if test="${!pageInfo.isFirstPage }">
								    <li class="page-item"><a class="page-link" href="javascript:gotoPage('${pageInfo.prePage }')">上一页</a></li>
							  	</c:if>
							    <c:forEach items="${pageInfo.navigatepageNums }" var="item">
							    		<c:if test="${pageInfo.pageNum==item }">
									    	<li class="page-item active"><a class="page-link" href="javascript:gotoPage('${item }')">${item}</a></li>
								    	</c:if>
								    	<c:if test="${pageInfo.pageNum!=item }">
									    	<li class="page-item"><a class="page-link" href="javascript:gotoPage('${item }')">${item}</a></li>
								    	</c:if>
							    </c:forEach>
							    <c:if test="${!pageInfo.isLastPage }">
								    <li class="page-item"><a class="page-link" href="javascript:gotoPage('${pageInfo.nextPage }')">下一页</a></li>
							  	</c:if>
							  </ul>
							</nav>
						</div>
			     	</td>
			     </tr>
			  
			  </table>
			</div>  

    </div>
    <div class="col-sm-1">
      
    </div>
  </div>
</div>

</body>
<script type="text/javascript">

	function gotoPage(pageNo){
		$("[name=pageNum]").val(pageNo);
		$("form").submit();
	}
</script>
</html>