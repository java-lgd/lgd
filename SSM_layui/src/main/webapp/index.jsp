<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<script src="js/jquery-2.2.4.min.js" ></script>
<title>Insert title here</title>
</head>
<style>
    .iframe_page{
        width: 800px;
        height: 500px;
        position:absolute;
        left:140px;
        background-color: #dfdfdf;  
    }
    .iframe_page #framePage{
        width: 800px;
        height: 500px;
    }
</style>
<body>
	<ul>
		<li>
			<a href="Book/index.jsp" target="test">Book</a>
		</li>
		<li >
			<a href="Type/index.jsp" target="test">Type</a>
		</li>
	</ul>
	
    <div class="iframe_page">
        <iframe id="framePage" src="Book/index.jsp" name="test"></iframe>
    </div>

</body>
</html>