<%--
  Created by Qu Peng.
  User: asus
  Date: 2022/2/2
  Time: 19:58
  description:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Comet OS</title>

</head>

<body>
<form action="/upload/uploadFile" method="post" enctype="multipart/form-data">
    图片： <input type="file" name="upload"/><br/>
    图片描述:<input type="text" name="description"/>
    <input type="submit" value="上传"/>
</form>


</body>
</html>
