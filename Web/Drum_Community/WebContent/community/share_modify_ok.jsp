<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<%
	Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost/board";
	String id = "root";
	String pass = "wjrdnjf8457";
	String password = "";
	
		try{
			
			request.setCharacterEncoding("euc-kr");
			int idx = Integer.parseInt(request.getParameter("idx"));
			String title = request.getParameter("title");
			String memo = request.getParameter("memo");
			String passw = request.getParameter("password");
		
			Connection conn = DriverManager.getConnection(url,id,pass);
			Statement stmt = conn.createStatement();
		
			String sql = "SELECT u_PASSWORD FROM boardinfo2 WHERE NUM=" + idx;
			ResultSet rs = stmt.executeQuery(sql);
		
		 if(rs.next()){
				password = rs.getString(1); 
	            if(password.equals(passw)) {
					sql = "UPDATE boardinfo2 SET TITLE='" + title+ "' ,MEMO='"+ memo +"' WHERE NUM=" + idx;				
					stmt.executeUpdate(sql);
%>				
				  <script language=javascript>
				  	self.window.alert("글이 수정되었습니다.");
				  	location.href="share_view.jsp?idx=<%=idx%>";
				  </script>
<%
				rs.close();
				stmt.close();
				conn.close();
				
				} else {
%>
			<script language=javascript>
				self.window.alert("비밀번호를 틀렸습니다.");
				location.href="javascript:history.back()";
			</script>
<%			
				}
		 	} 
		 } catch(SQLException e) {
			out.println( e.toString() );
		} 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>공유하기</title>
</head>
<body>

</body>
</html>