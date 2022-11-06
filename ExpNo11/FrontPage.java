package ExpNo11;
public class FrontPage extends javax.swing.JFrame {

    public FrontPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        label1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        label1.setText("ONLINE BOOK STORE");
        getContentPane().add(label1);
        label1.setBounds(150, 60, 420, 60);

        button1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        button1.setLabel("USER");
        button1.setPreferredSize(new java.awt.Dimension(24, 24));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(280, 180, 130, 50);

        button2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        button2.setLabel("ADMIN");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2);
        button2.setBounds(280, 290, 130, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
             
                setVisible(false);
                UserClass obj=new UserClass();
                obj.setVisible(true);
    }

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {
        
                setVisible(false);
                AdminPage obj=new AdminPage();
                obj.setVisible(true);
    }
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
            }
        });
    }
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Label label1;
  
}