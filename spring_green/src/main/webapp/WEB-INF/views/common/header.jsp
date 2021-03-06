<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">

	<div class="container">
	  	<a class="navbar-brand" href="#">Navbar</a>
	  	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
	    	<span class="navbar-toggler-icon"></span>
	  	</button>
	  	<div class="collapse navbar-collapse" id="collapsibleNavbar">
	    	<ul class="navbar-nav">
	    		<c:if test="${ user == null }">
			      	<li class="nav-item">
			        	<a class="nav-link" href="<%=request.getContextPath()%>/signup">회원가입</a>
			      	</li>
			      	<li class="nav-item">
			        	<a class="nav-link" href="<%=request.getContextPath()%>/login">로그인</a>
			      	</li>
		      	</c:if>
		      	<c:if test="${ user != null }">
		      		<li class="nav-item">
			        	<a class="nav-link" href="<%=request.getContextPath()%>/mypage">마이페이지</a>
			      	</li>
			      	<li class="nav-item">
			        	<a class="nav-link" href="<%=request.getContextPath()%>/logout">로그아웃</a>
			      	</li>   
		      	</c:if>
		      	<li class="nav-item">
			        	<a class="nav-link" href="<%=request.getContextPath()%>/board/list">게시판</a>
			    </li>
			    <li class="nav-item">
			        	<a class="nav-link" href="<%=request.getContextPath()%>/board/list?type=공지">공지사항</a>
			    </li>
			    <li class="nav-item">
			        	<a class="nav-link" href="<%=request.getContextPath()%>/board/list?type=qna">QnA</a>
			    </li>   
	    	</ul>
		</div> 
	</div> 
</nav>
</body>
</html>