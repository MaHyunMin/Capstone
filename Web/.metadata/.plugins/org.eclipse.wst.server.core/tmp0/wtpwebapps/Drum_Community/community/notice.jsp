<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>DrumPad Community</title>
<link rel="stylesheet" href="community.css" type="text/css"/>
</head>
<body>
	<div class="wrapper">
			<div class="header1">
				공지사항
			</div>
			<div class="header2">
				<from name=form_login method=post>
					ID <input type="text" name="id">
					PW <input type="text" name="pw">
					<input type="submit" name="login" value="로그인">
					<button type="button" name="member" onclick = "location.href = 'member.html'">회원가입</button>
				</from>
			</div>
			<div class="menu">
					<li class="bar">│</li>
					<li class="menuLink"><a href="post.jsp">자유게시판</a></li>
					<li class="bar">│</li>
					<li class="menuLink"><a href="share.jsp">공유하기</a></li>
					<li class="bar">│</li>
					<li class="menuLink"><a href="#">자랑하기</a></li>
					<li class="bar">│</li>
					<li class="menuLink"><a href="notice.jsp">공지사항</a></li>
					<li class="bar">│</li>
					<li class="menuLink"><a href="main.html">홈</a></li>
					<li class="bar">|</li>
			</div>
			<div class="board" style="width: 50%; margin: 0 25%; position: absoulte; align: center;">
				<%
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost/board";
					String id = "root";
					String pass = "wjrdnjf8457";
					int total = 0;
					
					try {
						Connection conn = DriverManager.getConnection(url,id,pass);
						Statement stmt = conn.createStatement();
				
						String sqlCount = "SELECT COUNT(*) FROM boardinfo";
						ResultSet rs = stmt.executeQuery(sqlCount);
						
						if(rs.next()){
							total = rs.getInt(1);
						}
						rs.close();
						out.print("총 게시물 : " + total + "개");
						
						String sqlList = "SELECT NUM, USERNAME, TITLE, d_TIME, HIT from boardinfo order by NUM DESC";
						rs = stmt.executeQuery(sqlList);
						
				%>
				<table width="100%" cellpadding="0" cellspacing="0" border="0">
				  <tr height="5"><td width="5"></td></tr>
				 <tr style="background:url('img/table_mid.gif') repeat-x; text-align:center;">
				   <td width="5"><img src="img/table_left.gif" width="5" height="30" /></td>
				   <td width="73">번호</td>
				   <td width="379">제목</td>
				   <td width="73">작성자</td>
				   <td width="164">작성일</td>
				   <td width="58">조회수</td>
				   <td width="7"><img src="img/table_right.gif" width="5" height="30" /></td>
				  </tr>
				<%
					if(total==0) {
				%>
					 		<tr align="center" bgcolor="#FFFFFF" height="30">
					 	   <td colspan="6">등록된 글이 없습니다.</td>
					 	  </tr>
				<%
					 	} else {
					 		
						while(rs.next()) {
							int idx = rs.getInt(1);
							String name = rs.getString(2);
							String title = rs.getString(3);
							String time = rs.getString(4);
							int hit = rs.getInt(5);
						
				%>
				<tr height="25" align="center">
					<td>&nbsp;</td>
					<td><%=idx %></td>
					<td align="left"><a href="view.jsp?idx=<%=idx%>"><%=title %></td>
					<td align="center"><%=name %></td>
					<td align="center"><%=time %></td>
					<td align="center"><%=hit %></td>
					<td>&nbsp;</td>
				</tr>
				  <tr height="1" bgcolor="#D2D2D2"><td colspan="6"></td></tr>
				<% 
						}
					} 
					rs.close();
					stmt.close();
					conn.close();
				} catch(SQLException e) {
					out.println( e.toString() );
				}
				%>
				 <tr height="1" bgcolor="#82B5DF"><td colspan="6" width="752"></td></tr>
				 </table>
				 
				<table width="100%" cellpadding="0" cellspacing="0" border="0">
				  <tr><td colspan="4" height="5"></td></tr>
				  <tr align="center">
				   <td><input type=button value="글쓰기" OnClick = "window.location='write.jsp'"></td>
				  </tr>
				</table>			
			</div>
			<div class="footer">
			</div>
		</div>
</body>
</html>