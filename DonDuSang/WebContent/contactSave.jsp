<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.sql.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 	
	
String nom  = request.getParameter("nom");
String email = request.getParameter("email");
String message = request.getParameter("message");

		
		Connection con = null;
		
		String url = "jdbc:mysql://localhost:3306/donDuSang";
		String user = "root";
		String pwd = "root";
		
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, user, pwd);
				
	PreparedStatement ps = con.prepareStatement("insert into contact values(?,?,?)");
			
	ps.setString(1, nom);
	ps.setString(2, email);
	ps.setString(3, message);
	
	   int i = ps.executeUpdate();
	   
	 if (i > 0){
  
		 %>
  		
  		<jsp:forward page="index.jsp"></jsp:forward>
  		
  <%
  } else {
      out.print("sorry, fill correct info please");
  }
      
} catch (SQLException se) {
  System.out.println(se);
}catch (ClassNotFoundException cne) {
  System.out.println(cne);
}
		
%>
</body>
</html>