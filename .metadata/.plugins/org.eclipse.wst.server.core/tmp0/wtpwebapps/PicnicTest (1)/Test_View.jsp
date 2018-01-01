<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
		<title>Insert title here</title>
	</head>
	
	<body>
		查詢所有管理員
		<FORM METHOD="post" ACTION="${pageContext.request.contextPath}/adm.do" >
	        <input type="submit" value="查詢">
	        <input type="hidden" name="action" value="get_adm_one_data">
	    </FORM> 
	    
	           管理員編號+權限編號（MA00000005PU00000004）
	    <FORM METHOD="post" ACTION="${pageContext.request.contextPath}/man_men_data.do" >
	        <b>輸入編號:</b>
	        <input type="text" name="admno">
	        <input type="submit" value="送出">
	        <input type="hidden" name="button" value="back">
	    </FORM>
	  
	  	留言板搜尋
	  	<form method='post' action='${pageContext.request.contextPath}/pboard_article.do'>
	  		<input type="text" name="title">
	  		<input type="submit" value="送出">
	        <input type="hidden" name="button" value="search">
	  	</form>
	  	
	  	權限編號（PU00000008）
	  	<FORM METHOD="post" ACTION="${pageContext.request.contextPath}/test.do" enctype="multipart/form-data">
	        <b>輸入編號:</b>
	        <input type="file" name="upfile1">
	        <input type="submit" value="送出">
	        <input type="hidden" name="action" value="get_pur_one_data">
	    </FORM>
	</body>
</html>