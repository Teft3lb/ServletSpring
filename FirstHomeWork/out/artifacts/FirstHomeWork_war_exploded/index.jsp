<%--
  Created by IntelliJ IDEA.
  User: Teft3
  Date: 15.09.2021
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@page import="ru.appline.logic.Model"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Домашняя страница по работе с пользователями</h1>
  Введите ID пользователя (0 - для вывода всего списка пользователей)
  <br/>

  Доступно: <%
            Model model = Model.getInstance();
            out.print(model.getFromList().size());
            %>
  <form method="get" action="get">
    <lavel>ID:
      <input type="text" name="id"><br/>
    </lavel>
    <button type="submit">Поиск</button>
  </form>
  <a href="addUser.html">Создать новго пользователя</a>
  </body>
</html>
