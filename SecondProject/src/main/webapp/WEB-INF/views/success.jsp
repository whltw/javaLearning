<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>SUCCESS</h1>
   <h2>${sigleCompany.id}</h2>
   <h3>${sigleCompany.companyName}</h3>
   <!--<c:if test="${requestScope.person != null}">
		    <h3>HttpServletRequest对象中存的用户信息如下：</h3> 
                        用户编号：${requestScope.person.id}
            <br>
                        用户名：${requestScope.person.name}
            <br>
                      
        </c:if>

  --> 
   
</body>
</html>