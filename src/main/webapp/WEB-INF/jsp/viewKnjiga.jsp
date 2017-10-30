<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ include file="header.jsp" %>

<html>
    <head>
        <title><spring:message code="unosNaslov"/></title>
    </head>
    <body>
        <h2><spring:message code="pregledNaslov"/></h2>
        <table>
            <tr>
                <td><spring:message code="naziv"/></td>
                <td>${naziv}</td>
            </tr>
            <tr>
                <td><spring:message code="pisac"/></td>
                <td>${pisac}</td>
            </tr>
            <tr>
                <td><spring:message code="godina"/></td>
                <td>${godina}</td>
            </tr>
        </table>
    </body>
</html>

<%@ include file="footer.jsp" %>