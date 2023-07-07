package awt_s;

import java.awt.*;
import java.awt.event.*;
//import.awt.Frame
public class awt_s extends Frame implements ActionListener{
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;


    public 
    void actionPerformed(ActionEvent e){
        count++;
        tfCount.setText(count+"");
    }    
    awt_s(){
        setLayout(new FlowLayout());
        lblCount = new Label("Counter");
        add(lblCount);
        tfCount = new TextField("0",10);
        tfCount.setEditable(false);
        add(tfCount);
        btnCount=new Button("Count");
        add(btnCount);
        btnCount.addActionListener(this);
        setTitle("AWT Counter");
        setSize(250, 100);
        setVisible(true);
    }
    public static void main(String[] args) {
        awt_s ob = new awt_s();
    }
}