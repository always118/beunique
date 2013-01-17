<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BeUnique</title>
<%@include file="template/css_js.jsp"%>
</head>
<body>
	<div id="page">
		<!-- Header -->
		<%@include file="template/header.jsp"%>

		<!-- Main content -->
		<div id="content">

			<div id="tweetSpinner" class="tweetSpinner">
				<img src="${pageContext.request.contextPath}/img/ajax.gif" />
			</div>
			<!-- Place for two tweets (with all details) -->
			<form:form method="POST" commandName="submitTweet">
				<div class="tweetsWrapper">
					<div>
						<!-- Left tweet -->
						<div class="submitHeader">Original</div>
						<input id="originalTw" type="text" name="originalTw" />
						<div class="tweetDetails">
							<img id="originalAuthorImg" class="authorImg" src="" />
							<div id="originalAuthorName" class="authorName"></div>
							<div id="originalAuthorUsername" class="authorUsername"></div>
							<div id="originalTimestamp" class="timestamp"></div>
						</div>
						<div class="tweetText">
							<span id="originalTweet"></span>
						</div>
					</div>
					<div>
						<!-- Right tweet -->
						<div class="submitHeader">Copy</div>
						<input id="copyTw" type="text" name="copyTw" />
						<div class="tweetDetails">
							<img id="copyAuthorImg" class="authorImg" src="" />
							<div id="copyAuthorName" class="authorName"></div>
							<div id="copyAuthorUsername" class="authorUsername"></div>
							<div id="copyTimestamp" class="timestamp"></div>
						</div>
						<div class="tweetText">
							<span id="copyTweet"></span>
						</div>
					</div>
				</div>
				<div class="submitTweets">
					<input type="submit" value="<spring:message code="submit"/>"/>
				</div>
				<form:select path="language">
					<form:options items="${languages}" />
				</form:select>
			</form:form>
		</div>


		<!-- Sidebar -->
		<%@include file="template/sidebar.jsp"%>

		<!-- Footer -->
		<%@include file="template/footer.jsp"%>
	</div>

</body>
</html>