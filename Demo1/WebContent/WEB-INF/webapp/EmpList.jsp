<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
      
    
<!-- <!DOCTYPE html> -->
<html>

<title>Insert title here</title>
</head>
<body>
<form action="get" action="empController">
<br>
<table border=1>
        <thead>
            <tr>
                <th>EmployeeName</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${empList}" var="emp">
                <tr>
                   
                    <td><c:out value="${emp.firstName}" /></td>
                    
                   
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </form>
</body>
</html>