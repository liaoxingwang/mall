<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<title>首页</title>
	<meta name="decorator" content="cms_default_${site.theme}"/>
	<meta name="description" content="mall ${site.description}" />
	<meta name="keywords" content="mall ${site.keywords}" />
    <%@include file="/WEB-INF/views/modules/cms/front/include/head.jsp" %>
    <link href="${ctxStaticView}/cms/front/theme.css" type="text/css" rel="stylesheet" />
</head>
<body>
    <%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/layouts/default_head.jsp"%>
    <div class="hero-unit" style="padding-bottom:35px;margin:10px 0;">
      <c:set var="article" value="${fnc:getArticle('2')}"/>
      <h1>${fns:abbr(article.title,28)}</h1><p></p>
      <p>${fns:abbr(fns:replaceHtml(article.articleData.content),260)}</p>
      <p><a href="${article.url}" class="btn btn-primary btn-large">&nbsp;&nbsp;&nbsp;查看详情 &raquo;&nbsp;&nbsp;&nbsp;</a></p>
    </div>
    <div class="row">
      <div class="span4">
        <h4><small><a href="${ctx}/list-2${urlSuffix}" class="pull-right">更多&gt;&gt;</a></small>组织机构</h4>
		<ul><c:forEach items="${fnc:getArticleList(site.id, 2, 8, '')}" var="article">
			<li><span class="pull-right"><fmt:formatDate value="${article.updateDate}" pattern="yyyy.MM.dd"/></span><a href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
		</c:forEach></ul>
      </div>
      <div class="span4">
        <h4> <small><a href="${ctx}/list-6${urlSuffix}" class="pull-right">更多&gt;&gt;</a></small>质量监督</h4>
		<ul><c:forEach items="${fnc:getArticleList(site.id, 6, 8, '')}" var="article">
			<li><span class="pull-right"><fmt:formatDate value="${article.updateDate}" pattern="yyyy.MM.dd"/></span><a href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
		</c:forEach></ul>
      </div>
      <div class="span4">
        <h4><small><a href="${ctx}/list-10${urlSuffix}" class="pull-right">更多&gt;&gt;</a></small>政策法规</h4>
		<ul><c:forEach items="${fnc:getArticleList(site.id, 10, 8, '')}" var="article">
			<li><span class="pull-right"><fmt:formatDate value="${article.updateDate}" pattern="yyyy.MM.dd"/></span><a href="${article.url}" style="color:${article.color}">${fns:abbr(article.title,28)}</a></li>
		</c:forEach></ul>
      </div>
    </div>
    <%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/layouts/default_footer.jsp"%>
</body>
</html>