package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//dao--->DAta access object
public class daojava {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Studentdao dao = new Studentdao();
		
		Student s1 = dao.getstudent(3);
		System.out.print(s1.studentname);
		//inserting
		Student s2 = new Student();
		s2.studentid=4;
		s2.studentname="rahul";
		dao.connect();
		dao.addStudent(s2);
		dao.deletestudent(3);
		
		

	}
	

}
class Studentdao{
	Connection con = null;
	public void connect() throws Exception {
		String jdbcUrl = "jdbc:mysql://localhost:3307/student";
		String name = "root";
        String password = "s.sshetty2003";
		Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(jdbcUrl, name, password);
	}
	
	public Student getstudent(int rollno) {
		
		try {
        
        String query = "select studentname from information where studentID="+rollno;
		Student s = new Student();
		s.studentid = rollno;
		
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String sname = rs.getString(1);
		s.studentname = sname;
		return s;
		
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return null;
		
		
		
	}
	public void addStudent(Student s) throws Exception {
		String query  = "insert into information values (?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, s.studentid);
		pst.setString(2, s.studentname);
		pst.executeUpdate();
		
	}
	public void deletestudent(int rollno) throws Exception{
		String query = "delete from information where studentID="+rollno;
		Statement st = con.createStatement();
		st.executeUpdate(query);
		
		
		
	}
}

class Student{
	int studentid;
	String studentname;
}
