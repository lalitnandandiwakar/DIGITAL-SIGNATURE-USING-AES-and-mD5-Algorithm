/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public class FrontFrame extends JFrame implements ActionListener {
    private Object FileChooserDemo2;
   

    public void drawFrame()
    {
        JButton jb1=new JButton("Choose File");
        JButton jb2=new JButton("Genetrate MD5");
        JButton jb3=new JButton("Upload File");
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        JPanel pnl=new JPanel();
        pnl.add(jb1);
        pnl.add(jb2);
        pnl.add(jb3);
        getContentPane().add(pnl,BorderLayout.CENTER);
        this.setSize(400, 200);
        this.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()=="jb1")
        {
            //JFileChooser fc = new JFileChooser();
 //int returnVal = fc.showOpenDialog(FileChooserDemo.this);
        }
        
    }
    public static void main(String ar[])
    {
        FrontFrame frm=new FrontFrame();
        frm.drawFrame();
    }
    
    
}
