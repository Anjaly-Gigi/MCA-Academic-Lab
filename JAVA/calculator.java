//calculator using awt in java

import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener
{
  TextField  t1,t2,t3;
  Label  l1,l2,l3;
  Button b1,b2,b3,b4;
  
  calculator()
  {
   
   setLayout(new FlowLayout());
   
   t1= new TextField(10);
   t2= new TextField(10);
   t3=new TextField(10);
   
   l1= new Label("first no");
   l2= new Label("second no");
   l3= new Label("result");
   
   b1=new Button("add");
   b2=new Button("sub");
   b3=new Button("mul");
   b4=new Button("div");
   
   add(l1);
   add(t1);
   
   add(l2);
   add(t2);
   
   add(b1);
   add(b2);
   add(b3);
   add(b4);
   add(l3);
   add(t3);
   
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   
   }
   
   public void actionPerformed(ActionEvent ae)
   {
   
   int a,b,result;
   if(ae.getSource()==b1)
   {
     a=Integer.parseInt(t1.getText());
     b=Integer.parseInt(t2.getText());
     
     result=a+b;
     
     t3.setText(""+result);
      
   }
   
    if(ae.getSource()==b2)
   {
     a=Integer.parseInt(t1.getText());
     b=Integer.parseInt(t2.getText());
     
     result=a-b;
     
     t3.setText(""+result);
      
   }
    if(ae.getSource()==b3)
   {
     a=Integer.parseInt(t1.getText());
     b=Integer.parseInt(t2.getText());
     
     result=a*b;
     
     t3.setText(""+result);
      
   }
    if(ae.getSource()==b4)
   {
     a=Integer.parseInt(t1.getText());
     b=Integer.parseInt(t2.getText());
     
     if(b==0)
     {
      
       t3.setText("division not posiible");
     }
     else
     {
     result=a/b;
     
     t3.setText(""+result);
      }
   }
   }
   
   public static void main(String a[])
   {
    calculator ob=new calculator();
    ob.setTitle("calculator");
    ob.setSize(200,300);
    ob.setVisible(true);
    }
    }
   
