<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<Html>
<Head>


    <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
    <title>
        Add Todo Page
    </title>
</Head>
<Body>
<div class="container">
    <h1>Enter Todo Details </h1>
    <form:form method="post" modelAttribute="todo"> <%--to map this form to the todo in public String addNewTodo(ModelMap model, Todo todo) {...}--%>
        Description: <form:input type="text" name="description" required="required" path="description"/> <%--as Todo class me private String desctiption naam ka variable hai--%>
        <form:input type="hidden" name="description" required="required" path="id"/> <%--hidden to prevent the users from seeing these fields--%>
        <form:input type="hidden" name="description" required="required" path="done"/>
        <input type="submit" class="btn btn-success"/>
        <br>
        <form:errors path="description" cssClass="text-danger"/>
    </form:form>
</div>

<script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
<script src="webjars\jquery\3.7.1\jquery.min.js"></script>
</Body>
</Html>
