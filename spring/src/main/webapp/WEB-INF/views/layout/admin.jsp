<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	어드민입니다
	<hr>
	<section class="content">
		<tiles:insertAttribute name="header" />
		<!--  /WEB-INF/views/common/layout/header.jsp -->
		<tiles:insertAttribute name="body" />
		<!-- body -->
		<tiles:insertAttribute name="footer" />
		<!-- /WEB-INF/views/common/layout/footer.jsp -->
	</section>
</body>
</html>