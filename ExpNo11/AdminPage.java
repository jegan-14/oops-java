package ExpNo11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminPage extends javax.swing.JFrame {

    ResultSet rs,rs1;
    int it,i1,i2;

    public AdminPage() {
        initComponents();
         try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
         rs=stmt.executeQuery("SELECT Id FROM books");
         
           while(rs.next())
           {
               String ex=rs.getString(1);
               id1.addItem(ex);
           }
           rs1=stmt.executeQuery("SELECT Title FROM books");
           while(rs1.next())
           {
               String ex1=rs1.getString(1);
               t1.addItem(ex1);
               t2.addItem(ex1);
           }
       }
       catch(Exception e){
           System.out.println(e);
       }

    }

    @SuppressWarnings("unchecked")
  
    private void t1ComponentHidden(java.awt.event.ComponentEvent evt) {
       
    }

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        
        setVisible(false);
        FrontPage obj=new FrontPage();
        obj.setVisible(true);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
       
        int a=Integer.parseInt(Id2.getText());
        String b=Author.getText();
        int c=Integer.parseInt(Quantity.getText());
        String d=Title.getText();
        float e=Float.parseFloat(Price2.getText());
        Id2.setText("");
        Author.setText("");
        Quantity.setText("");
        Title.setText("");
        Price2.setText("");
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO books VALUES('"+a+"','"+d+"','"+b+"','"+e+"','"+c+"')");
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String id=id1.getItemAt(it);
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
         stmt.executeUpdate("DELETE FROM books WHERE id = '"+id+"'");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }

    private void id1ItemStateChanged(java.awt.event.ItemEvent evt) {
        
        it=id1.getSelectedIndex();
    }

    private void t1ItemStateChanged(java.awt.event.ItemEvent evt) {
        
        i1=t1.getSelectedIndex();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        float price=Float.parseFloat(tf1.getText());
        String title=t1.getItemAt(i1);
        tf1.setText("");
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
         stmt.executeUpdate("UPDATE books SET Price= '" +price+"' WHERE Title = '" +title+"'");
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    private void t2ItemStateChanged(java.awt.event.ItemEvent evt) {
        
        i2=t2.getSelectedIndex();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {        
        int quantity=Integer.parseInt(tf2.getText());
        String title=t2.getItemAt(i2);
        tf2.setText("");
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
         stmt.executeUpdate("UPDATE books SET Quantity= '" +quantity+"' WHERE Title = '" +title+"'");
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }
    private javax.swing.JTextField Author;
    private javax.swing.JTextField Id2;
    private javax.swing.JTextField Price2;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField Title;
    private javax.swing.JComboBox<String> id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JComboBox<String> t1;
    private javax.swing.JComboBox<String> t2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}