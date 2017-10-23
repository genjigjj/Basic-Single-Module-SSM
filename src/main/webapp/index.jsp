<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ include file="/WEB-INF/view/common/tagPage.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>首页11111</title>
    <script src="/js/jQuery-core/jquery-1.10.2.min.js"></script>
</head>
<body>
<h1>我是首页</h1>
<a href="${webRoot}/user/add">跳转</a>
    <%--<script>--%>
        <%--var user = {--%>
            <%--ucode : 'u001',--%>
            <%--userName : 'gjj',--%>
            <%--password : '000000'--%>
        <%--};--%>
        <%--$(function () {--%>
            <%--$.ajax({--%>
                <%--type : "post",--%>
                <%--dataType :"json",//返回json格式的数据--%>
                <%--url : "${webRoot}/user/add",//要访问的后台地址--%>
                <%--data : user,//要发送的数据--%>
                <%--success : function (data) {--%>
                    <%--alert("成功");--%>
                <%--}--%>
            <%--});--%>
        <%--});--%>
    <%--</script>--%>
</body>
</html>
