<Html>
<Head>
    <title>
        Login Page
    </title>
    <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
</Head>
<body>
<div class="container">
    Welcome to the login page!

    <pre>${errorMessage}</pre>
    <form method="post"> <%--we are using post method as GET method reveals the name and password in the url--%>
        Name: <input type="text" name="name">
        <br>
        Password: <input type="password" name="password">
        <input type="submit">
    </form>
</div>

<script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
<script src="webjars\jquery\3.7.1\jquery.min.js"></script>
</body>
</Html>
