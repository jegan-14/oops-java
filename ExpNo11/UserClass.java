package ExpNo11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserClass extends javax.swing.JFrame {

    String[] cname={"Id","Title","Author","Price","Quantity"};
    ResultSet rs,rs1;
    DefaultTableModel model1;
   
    public UserClass() {
        initComponents();
        DefaultTableModel model=new DefaultTableModel();
       model.setColumnIdentifiers(cname);
            DefaultTableModel model1=new DefaultTableModel();
            model1.setColumnIdentifiers(cname);
            jTable2.setModel(model1);
            jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_ALL_COLUMNS);
       jTable1.setModel(model);
       jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS);

       try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
         rs=stmt.executeQuery("SELECT * FROM books");
           
           while(rs.next())
           {
               String ex=rs.getString(1);
               String ex1=rs.getString(2);
               String ex2=rs.getString(3);
               String ex3=rs.getString(4);
               String ex4=rs.getString(5);
               model.addRow(new Object[]{ex,ex1,ex2,ex3,ex4});
           }
          rs1=stmt.executeQuery("SELECT Author FROM books");
          while(rs1.next())
          {
              String s=rs1.getString(1);
              jb1.addItem(s);
          }
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e);
       }
       
    }

    @SuppressWarnings("unchecked")
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        FrontPage obj=new FrontPage();
        obj.setVisible(true);
    }

    private void jb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jb1ItemStateChanged
        
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
            DefaultTableModel model1=new DefaultTableModel();
            model1.setColumnIdentifiers(cname);
            jTable2.setModel(model1);
            jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_ALL_COLUMNS);
            int jb=jb1.getSelectedIndex();
            String title1=jb1.getItemAt(jb);
            rs=stmt.executeQuery("SELECT * FROM books WHERE Author='" +title1+"'");
            while(rs.next())
            {
              model1.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});   
            }  
            
        
        
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e);
       }
        
    }

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserClass().setVisible(true);
                
            }
        });
    }

  
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> jb1;

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}