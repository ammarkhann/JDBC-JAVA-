import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;


public class hw4_ammar_khan {

	static final String url = "jdbc:db2://192.168.253.128:50001/SAMPLE";
	static final String username = "db2inst1";
	static final String password = "password";
	
	
	
	public static void main(String[] args) {
		 Connection conn = null;
	     Statement stmt = null;
	     
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		
		JPanel mainpanel = new JPanel();
		mainpanel.setLayout(new GridLayout(43,14));
		frame.add(mainpanel);
	
	
	
	
//        firstname.setBounds(0, 0, 0, 0);

        
try {
            
            System.out.println("Connecting ...");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Success ...");    
            
            System.out.println("Creating a statement");
            stmt = conn.createStatement();
            
            String sql;
            
            sql = "SELECT * FROM EMPLOYEE";
            
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
           
        	
    		JLabel empnumberLabel = new JLabel(rsmd.getColumnLabel(1));
    		JLabel firstnameLabel = new JLabel(rsmd.getColumnLabel(2));
    		JLabel midinitLabel = new JLabel(rsmd.getColumnLabel(3));
    		JLabel lastnameLabel = new JLabel(rsmd.getColumnLabel(4));
    		JLabel workdeptLabel = new JLabel(rsmd.getColumnLabel(5));
    		JLabel phonenumberLabel = new JLabel(rsmd.getColumnLabel(6));
    		JLabel hiredateLabel = new JLabel(rsmd.getColumnLabel(7));
    		JLabel jobLabel = new JLabel(rsmd.getColumnLabel(8));
    		JLabel edlevelLabel = new JLabel(rsmd.getColumnLabel(9));
    		JLabel sexLabel = new JLabel(rsmd.getColumnLabel(10));
    		JLabel birthdateLabel = new JLabel(rsmd.getColumnLabel(11));
    		JLabel salaryLabel = new JLabel(rsmd.getColumnLabel(12));
    		JLabel bonusLabel = new JLabel(rsmd.getColumnLabel(13));
    		JLabel commissionLabel = new JLabel(rsmd.getColumnLabel(14));

            mainpanel.add(empnumberLabel);
            mainpanel.add(firstnameLabel);
            mainpanel.add(midinitLabel);
            mainpanel.add(lastnameLabel);
            mainpanel.add(workdeptLabel);
            mainpanel.add(phonenumberLabel);
            mainpanel.add(hiredateLabel);
            mainpanel.add(jobLabel);
            mainpanel.add(edlevelLabel);
            mainpanel.add(sexLabel);
            mainpanel.add(birthdateLabel);
            mainpanel.add(salaryLabel);
            mainpanel.add(bonusLabel);
            mainpanel.add(commissionLabel);
            
            
            while(rs.next()){
           
            JLabel employernumber = new JLabel(rs.getString(1)); 	 
             mainpanel.add(employernumber);	
            	
         	 JLabel firstname = new JLabel(rs.getString(2));           	 
         	 mainpanel.add(firstname);
         	 
         	 JLabel midinit = new JLabel(rs.getString(3));           	 
         	 mainpanel.add(midinit);
         	 
           	 
           	 JLabel lastname = new JLabel(rs.getString(4)); 	 
           	 mainpanel.add(lastname);
           	 
           	 JLabel workdept = new JLabel(rs.getString(5)); 	 
           	 mainpanel.add(workdept);

           	 JLabel phoneno = new JLabel(rs.getString(6)); 	 
           	 mainpanel.add(phoneno);
           	 
           	 JLabel hiredate = new JLabel(rs.getString(7)); 	 
           	 mainpanel.add(hiredate);
           	 
           	 JLabel job = new JLabel(rs.getString(8)); 	 
           	 mainpanel.add(job);
           	 
           	 JLabel edlevel = new JLabel(rs.getString(9)); 	 
           	 mainpanel.add(edlevel);
           	 
           	 JLabel sex = new JLabel(rs.getString(10)); 	 
           	 mainpanel.add(sex);
           	 
           	 JLabel birthdate = new JLabel(rs.getString(11)); 	 
           	 mainpanel.add(birthdate);
           	 
           	 JLabel salary = new JLabel(rs.getString(12)); 	 
           	 mainpanel.add(salary);
           	 
           	 JLabel bonus = new JLabel(rs.getString(13)); 	 
           	 mainpanel.add(bonus);
           	 
           	 JLabel commission = new JLabel(rs.getString(14)); 	 
           	 mainpanel.add(commission);
           	 
           	 
           	 
            }       
            
          
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();

        }
        
       


        


        frame.setVisible(true);
        
        
        
        
		
		
	}
	
}
