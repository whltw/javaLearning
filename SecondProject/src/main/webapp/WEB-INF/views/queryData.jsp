<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<title>Insert title here</title>
</head>
<body>
<div>
	<form method ="get" action="companyInfoByIdOrName">
	<table id ="companyInfoQuery">
		<tr>
		<td size="100px">公司id</td>
		<td> <input id ="companyId1" type="text" name="id"/></td>
		</tr>
		<tr>
		<td size="100px">公司名字</td>
		<td> <input id ="companyName1" type="text" name="companyName"/></td>
		</tr>
		<tr>
		
			<td> <input type="hidden" name="pageNum" value="1"/> </td>
		</tr>
		<tr>
		
			<td> <input type="submit" value="提交"/> </td>
		</tr>
	</table>
    	
    </form>
</div>

<div>
	<table border="1" bordercolor="#000000" style="border-collapse:collapse">
	<tr>
        		<td width="100px" align="center"><h3>公司编号</h3></td>
        		<td width="600px" align="center"><h3>公司名称</h3></td>
        	</tr>
	<c:forEach items="${sigleCompanyList.list}" var="compamyInfo">  
        
        	<tr>
        		<td width="100px">${compamyInfo.id } </td>
        		<td width="600px">${compamyInfo.companyName } </td>
        	</tr>
        		
        
   </c:forEach> 	
    </table> 
    
</div>

<div>
<h5>公司个数 ${sigleCompanyList.totalRecord},共有${sigleCompanyList.totalPage}页当前为${sigleCompanyList.pageNum}页</h5>	
	 <c:if test="${sigleCompanyList.pageNum >1}">
	 <a href="${APP_PATH }/companyInfoByIdOrName?${sigleCompanyList.queryCondition }&pageNum=1">首页</a>
	 </c:if>
	
	<%--如果当前页为第一页时，就没有上一页这个超链接显示 --%>
	<c:if test="${sigleCompanyList.pageNum ==1}">
         <c:forEach begin="${sigleCompanyList.start}" end="${sigleCompanyList.end}" step="1" var="i">
        	 <c:if test="${sigleCompanyList.pageNum == i}">
        	 	${i}
        	 </c:if>                
         	<c:if test="${sigleCompanyList.pageNum != i}">
          		<a href="${APP_PATH }/companyInfoByIdOrName?${sigleCompanyList.queryCondition }&pageNum=${i}">${i}</a>                                        
       	    </c:if>                        
         </c:forEach>
             <a href="${APP_PATH }/companyInfoByIdOrName?${sigleCompanyList.queryCondition }&pageNum=${sigleCompanyList.pageNum+1}">下一页</a>                    
    </c:if>
    
      <%--如果当前页不是第一页也不是最后一页，则有上一页和下一页这个超链接显示 --%>
            <c:if test="${sigleCompanyList.pageNum > 1 && sigleCompanyList.pageNum < sigleCompanyList.totalPage}">
                <a href="${APP_PATH }/companyInfoByIdOrName?${sigleCompanyList.queryCondition }&pageNum=${sigleCompanyList.pageNum-1}">上一页</a>
                <c:forEach begin="${sigleCompanyList.start}" end="${sigleCompanyList.end}" step="1" var="i">    
                    <c:if test="${sigleCompanyList.pageNum == i}">
                        ${i}
                    </c:if>            
                    <c:if test="${sigleCompanyList.pageNum != i}">
                        <a href="${APP_PATH }/companyInfoByIdOrName?${sigleCompanyList.queryCondition }&pageNum=${i}">${i}</a>                                        
                    </c:if>                        
                </c:forEach>
                <a href="${APP_PATH }/companyInfoByIdOrName?${sigleCompanyList.queryCondition }&pageNum=${sigleCompanyList.pageNum+1}">下一页</a>    
            </c:if>
            
      <%-- 如果当前页是最后一页，则只有上一页这个超链接显示，下一页没有 --%>
            <c:if test="${sigleCompanyList.pageNum == sigleCompanyList.totalPage&&sigleCompanyList!=null}">
                <a href="${APP_PATH }/companyInfoByIdOrName?${sigleCompanyList.queryCondition }&pageNum=${sigleCompanyList.pageNum-1}">上一页</a>
                <c:forEach begin="${sigleCompanyList.start}" end="${sigleCompanyList.end}" step="1" var="i">
                    <c:if test="${sigleCompanyList.pageNum == i}">
                        ${i}
                    </c:if>
                    <c:if test="${sigleCompanyList.pageNum != i}">
                        <a href="${APP_PATH }/companyInfoByIdOrName?${sigleCompanyList.queryCondition }&pageNum=${i}">${i}</a>                                        
                    </c:if>                
                </c:forEach>
            </c:if>
      <%--尾页 --%>
       <c:if test="${sigleCompanyList.pageNum >=1 && sigleCompanyList.pageNum<sigleCompanyList.totalPage}">
	   		<a href="${APP_PATH }/companyInfoByIdOrName?${sigleCompanyList.queryCondition }&pageNum=${sigleCompanyList.totalPage}">尾页</a>
	   </c:if>
            
</div>

</body>
</html>