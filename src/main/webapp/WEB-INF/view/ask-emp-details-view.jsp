<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2> What is your name</h2>
<%--@elvariable id="employee" type=""--%>
<form:form action="showDetails" modelAttribute="employee">


    Name <form:input path="name"/>
    Surname <form:input path="surname"/>
    Salary <form:input path="salary"/>
    <input type="submit" value="Ok">
</form:form>
</body>
</html>
