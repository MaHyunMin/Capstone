<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*, java.util.*" %>

<%!
	String id, password, name, email, phone, gender;

	public void jspInit(String Id, String PW) {
		BufferedReader reader = null;
		try {
			//String filePath = application.getRealPath("/WEB-INF/" + "\\" + Id + ".txt");
			//reader = new BufferedReader(new FileReader(filePath));
			String line = "";
			String[] s;			
			while((line = reader.readLine()) != null) {
					s = line.split("\n");
					id = s[0];
					password = s[1];
					name = s[2];
					email = s[3];
					phone = s[4];
					gender = s[5];
			}			
		} catch (Exception fnfe) {
			System.out.println("회원정보가 존재하지 않습니다.");
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
			}
		}
	}
%>

<%
	String Id = (String)session.getAttribute("ID");
	String pw = (String)session.getAttribute("Password");
	jspInit(Id, pw);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	div#table {
		width: 80%;
		height: 80%;
		border-collapse: colapse;
		text-align: center;
	}
	
	header {
    	height: 65px;
    	text-align: center;
		padding: 5px;
		margin: 10px;	
	}
	
	td, th {
		font-size: 12pt;
		border: 1px solid #98BF21;
		height: 30px;
		padding: 5px;
	}
	
	tr, td {
		color: #000000;
		background-color: #EAF2D3;
	}
	
	th {
		background-color: #A7C942;
		color: #FFFFFF;
		font-family: Georgia;
	}
	
	input {
		height: 25px;
		width: 200px;
	}
	
	input [type = "submit"], [type = "button"], [type = "radio"]{
		height: 25px;
		width: 50px;
	}
</style>
<title>DrumPad Community</title>
</head>
<body>
<form method = post>
	<div id = wapper align = center>
		<header>
			<font size = 20pt>게시판 목록</font> <hr>
		</header>
		<table>
			<tr>
				<th><font size = 3pt>제목</font></th>
				<td></td>
			</tr>
			<tr>
				<td colspan = 2 align = center>
				<input type = button value = '게시글 작성' onclick="location.href = 'post.jsp'">
				</td>
			</tr>
		</table>
	</div>
	</form>
</body>
</html>