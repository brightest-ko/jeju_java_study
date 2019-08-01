<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"
    import="java.util.List, study3.*"%><%

//	1. ��������
	List<BangMyungVO> rl = null;
	Exception err = null; 
    
//	2. DB ����
	BangMyungDAO dao = new BangMyungDAO_OracleImpl();
	try{
		rl = dao.findAll();
	}
	catch( Exception e ){ err = e; }
	
//	3. �帧 ����� 
	if( rl == null || err != null ) {
		response.sendRedirect("/study3/error.jsp");
	}	
	else {
%><!DOCTYPE html>
<html><body>
	<table border="1" cellspacing="0" cellpadding="8"><%
		for( BangMyungVO vo : rl ) {
			%><tr>
			<td> <%=vo.getNo()%> </td>
			<td> <%=vo.getGul()%> </td>
			<td> <%=vo.getTheTime()%> </td>
			</tr><%		
		}
	%></table>
	
	<form method="POST" action="bangmyung_add2.jsp">
		<input type="text" size="50" name="gul"/>
		<input type="submit"/>
	</form>

</body></html><%-- bangmyung_list.jsp --%><%
}
%>









