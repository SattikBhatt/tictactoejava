import java.awt.*;
import java.awt.event.*;

//import javafx.scene.control.Label;

import java.applet.*;
//<applet code="tictac2" height=800 width=1000></applet>
public class tictac2 extends Applet implements MouseListener,ActionListener {
    //TextField t;
    ActionListener ev,ev2;
    TextField ta,tq;
    Button b1,b2,b3,b,g;
    String s1,s2;
    Label l1,l2,l3,l4,l5;
    int flag=0,x=0,y=0,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6,x7,y7,x8,y8,x9=0,y9=0,count=-1,count2=-1,flag2=0;
    int count3=-1,count4=-1,count5=-1,count6=-1,count7=-1,count8=-1,count9=-1;
    int p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,z=0;
    int win=0,o1=0,o2=0,o3=0,o4=0,o5=0,o6=0,o7=0,o8=0,o9=0,e1=0;
    int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0;
    int bt=0;
   // Color c=Color.magenta;
   public void init()
   {
l1=new Label("Player1:");
l2=new Label("Player2:");
l3=new Label();
l4=new Label();
l5=new Label();
b3=new Button("Enter");
// l2=new Label("h");
// l3=new Label("y");
// l3.setBounds(30,40,100,60);
l1.setBounds(10,25,50,30);
l2.setBounds(10,40,50,60);
l3.setBounds(300,10,80,40);
l4.setBounds(300,540,400,40);
l5.setBounds(300,60,400,30);
// l2.setBounds(30,120,100,60);
ta=new TextField(10);
tq=new TextField(10);
ta.setBounds(60, 30,100, 20);
tq.setBounds(60, 60,100, 20);
add(l1);
add(ta);
add(l2);
add(l3);
add(tq);
add(l4);

setLayout(null);
//tictac2 a=new tictac2();
addMouseListener(this);
b=new Button("O");
g=new Button("X");
b2=new Button("Reset");
b.setBounds(400,20,20,20);
g.setBounds(450,20,20,20);
b2.setBounds(500,20,50,20);
b3.setBounds(60,100,50,20);
add(b);
//add(l1);
add(g);
add(b2);
add(b3);
add(l5);
b.addMouseListener(this);
b2.addMouseListener(this);
b.addActionListener(this);
g.addMouseListener(this);
b3.addMouseListener(this);
g.addActionListener(this);
b2.addActionListener(this);
   }
   
   public void mousePressed(java.awt.event.MouseEvent e)
    {//repaint();
        
        // show the point where the user pressed the mouse
      
    }
 
    // this function is invoked when the mouse is released
    public void mouseReleased(java.awt.event.MouseEvent e)
    {
 
        // show the point where the user released the mouse click
      
    }
 
    // this function is invoked when the mouse exits the component
    public void mouseExited(java.awt.event.MouseEvent e)
    {
 
    }
 
    // this function is invoked when the mouse enters the component
    public void mouseEntered(java.awt.event.MouseEvent e)
    {
 
        // show the point through which the mouse entered the frame
       
    }
    public void actionPerformed(ActionEvent e){}
    // this function is invoked when the mouse is pressed or released
    public void mouseClicked(MouseEvent  e)
    {if(e.getSource()==b3&&e1==0){
         s1=ta.getText();
 s2=tq.getText();
}
    //count++;
//    if()
// c="HI";
 //l3.setText(c);
 if(!s1.equals("")&&!s2.equals(""))
 e1++;
 else
 l4.setText("Name cannot be empty");
 if(e1>0){
    l4.setText("");
    l3.setText(s1+":");
 if(e.getSource()==b){if(flag==0){
    l5.setText(s1+" starts game with O");
flag=1;}}
 else if(e.getSource()==g){if(flag==0){
    l5.setText(s1+" starts game with X");
 flag=2;}}
 if(flag==1&&p==0){count++;
    x=e.getX();
    y=e.getY();
    }
        if(flag==2&&p==0){count++;
            x=e.getX();
            y=e.getY();
}if(flag==1&&q==0){count2++;
    x2=e.getX();
    y2=e.getY();
    }
        if(flag==2&&q==0){count2++;
            x2=e.getX();
            y2=e.getY();
}
if(flag==1&&r==0){count3++;
    x3=e.getX();
    y3=e.getY();
    }
        if(flag==2&&r==0){count3++;
            x3=e.getX();
            y3=e.getY();
}if(flag==1&&s==0){count4++;
    x4=e.getX();
    y4=e.getY();
    }
        if(flag==2&&s==0){count4++;
            x4=e.getX();
            y4=e.getY();
}
if(flag==1&&t==0){count5++;
    x5=e.getX();
    y5=e.getY();
    }
        if(flag==2&&t==0){count5++;
            x5=e.getX();
            y5=e.getY();
}
if(flag==1&&u==0){count6++;
    x6=e.getX();
    y6=e.getY();
    }
        if(flag==2&&u==0){count6++;
            x6=e.getX();
            y6=e.getY();
}if(flag==1&&v==0){count7++;
    x7=e.getX();
    y7=e.getY();
    }
        if(flag==2&&v==0){count7++;
            x7=e.getX();
            y7=e.getY();
}
if(flag==1&&w==0){count8++;
    x8=e.getX();
    y8=e.getY();
    }
        if(flag==2&&w==0){count8++;
            x8=e.getX();
            y8=e.getY();
}
if(flag==1&&z==0){count9++;
    x9=e.getX();
    y9=e.getY();
    }
        if(flag==2&&z==0){count9++;
            x9=e.getX();
            y9=e.getY();
}
if(e.getSource()==b2){
    flag=0;
     flag2=0;x=0;y=0;
     p=0;
     q=0;r=0;s=0;t=0;u=0;v=0;w=0;x=0;y=0;z=0;
     x2=0;y2=0;x3=0;y3=0;x4=0;y4=0;x5=0;y5=0;x6=0;y6=0;x7=0;y7=0;x8=0;x9=0;
     count3=-1;count4=-1;count5=-1;count6=-1;count7=-1;count8=-1;count9=-1;
     count=-1;count2=-1;
     o1=0;o2=0;o3=0;o4=0;o5=0;o6=0;o7=0;o8=0;o9=0;
     p1=0;p2=0;p3=0;p4=0;p5=0;p6=0;p7=0;p8=0;p9=0;
    
e1=0;s1="";s2="";
l3.setText("");
l5.setText("");
ta.setText("");
tq.setText("");
}

repaint();
 }
 
}
   public void paint(Graphics g)
{
g.drawLine(300,100,300,500);
g.drawLine(500,100,500,500);
g.drawLine(200,200,600,200);
g.drawLine(200,350,600,350);
if(x>=200&&x<=300 &&y<=200&&y>=100){
    p++;
    if(o1==0&&p1==0){
    
    flag2++;
    }
if(count%2!=0&&flag==1){o1++;
g.drawOval(200,100,80,80);
}
else if(count%2==0&&flag==1){p1++;
g.drawLine(200,100,300,200);
g.drawLine(200,200,300,100);
}
if(count%2!=0&&flag==2){p1++;
    g.drawLine(200,100,300,200);
    g.drawLine(200,200,300,100);
    }
    else if(count%2==0&&flag==2){o1++;
        g.drawOval(200,100,80,80);
    }
}
if(x2>=300&&x2<=500 &&y2<=200&&y2>=100){
     q++;
    if(o2==0&&p2==0){
   
    flag2++;
    }
    if(count2%2!=0&&flag==1){o2++;
    g.drawOval(350,100,80,80);
    }
    else if(count2%2==0&&flag==1){p2++;
    g.drawLine(300,100,500,200);
    g.drawLine(300,200,500,100);
    }
    if(count2%2!=0&&flag==2){p2++;
        g.drawLine(300,100,500,200);
        g.drawLine(300,200,500,100);
        }
        else if(count2%2==0&&flag==2){o2++;
            g.drawOval(350,100,80,80);
        }
    }
    if(x3>=500&&x3<=800 &&y3<=200&&y3>=100){
        r++;
      if(o3==0&&p3==0){
    
    flag2++;
    }
        if(count3%2!=0&&flag==1){o3++;
        g.drawOval(510,100,80,80);
        }
        else if(count3%2==0&&flag==1){p3++;
        g.drawLine(500,100,600,200);
        g.drawLine(500,200,600,100);
        }
        if(count3%2!=0&&flag==2){p3++;
            g.drawLine(500,100,600,200);
            g.drawLine(500,200,600,100);
            }
            else if(count3%2==0&&flag==2){o3++;
                g.drawOval(510,100,80,80);
            }
        }
        if(x4>=200&&x4<=300 &&y4<=350&&y4>=200){
             s++;
            if(o4==0&&p4==0){
   
    flag2++;
    }
            if(count4%2!=0&&flag==1){o4++;
            g.drawOval(200,240,80,80);
            }
            else if(count4%2==0&&flag==1){p4++;
            g.drawLine(200,200,300,350);
            g.drawLine(200,350,300,200);
            }
            if(count4%2!=0&&flag==2){p4++;
                g.drawLine(200,200,300,350);
            g.drawLine(200,350,300,200);
                }
                else if(count4%2==0&&flag==2){o4++;
                    g.drawOval(200,240,80,80);
                }
            }
            if(x5>=300&&x5<=500 &&y5<=350&&y5>=200){
                 t++;
                if(o5==0&&p5==0){
   
    flag2++;
    }
                if(count5%2!=0&&flag==1){o5++;
                g.drawOval(350,240,80,80);
                }
                else if(count5%2==0&&flag==1){p5++;
                g.drawLine(300,200,500,350);
                g.drawLine(300,350,500,200);
                }
                if(count5%2!=0&&flag==2){p5++;
                    g.drawLine(300,200,500,350);
                    g.drawLine(300,350,500,200);
                    }
                    else if(count5%2==0&&flag==2){o5++;
                       g.drawOval(350,240,80,80);
                    }
                }
                if(x6>=500&&x6<=700 &&y6<=350&&y6>=200){
                    u++;
                    if(o6==0&&p6==0){
    
    flag2++;
    }
                    if(count6%2!=0&&flag==1){o6++;
                    g.drawOval(510,240,80,80);
                    }
                    else if(count6%2==0&&flag==1){p6++;
                    g.drawLine(500,200,600,350);
                    g.drawLine(500,350,600,200);
                    }
                    if(count6%2!=0&&flag==2){p6++;
                        g.drawLine(500,200,600,350);
                        g.drawLine(500,350,600,200);
                        }
                        else if(count6%2==0&&flag==2){o6++;
                            g.drawOval(510,240,80,80);
                        }
                    }
                    if(x7>=200&&x7<=300 &&y7>=350&&y7<=500){
                         v++;
                       if(o7==0&&p7==0){
   
    flag2++;
    }
                        if(count7%2!=0&&flag==1){o7++;
                        g.drawOval(200,380,80,80);
                        }
                        else if(count7%2==0&&flag==1){p7++;
                            g.drawLine(200,350,300,500);
                            g.drawLine(200,500,300,350);
                        }
                        if(count7%2!=0&&flag==2){p7++;
                            g.drawLine(200,350,300,500);
                            g.drawLine(200,500,300,350);
                            }
                            else if(count7%2==0&&flag==2){o7++;
                                g.drawOval(200,380,80,80);
                            }
                        
}
if(x8>=300&&x8<=500 &&y8>=350&&y8<=500){
     w++;
    if(o8==0&&p8==0){
   
    flag2++;
    }
    if(count8%2!=0&&flag==1){o8++;
        g.drawOval(350,380,80,80);
    }
    else if(count8%2==0&&flag==1){p8++;
        g.drawLine(300,350,500,500);
    g.drawLine(300,500,500,350);
    }
    if(count8%2!=0&&flag==2){p8++;
        g.drawLine(300,350,500,500);
    g.drawLine(300,500,500,350);
        }
        else if(count8%2==0&&flag==2){o8++;
            g.drawOval(350,380,80,80);
        }
}
if(x9>=500&&x9<=800 &&y9>=350&&y9<=500){
    z++;
    if(o9==0&&p9==0){
    
    flag2++;
    }
    if(count9%2!=0&&flag==1){o9++;
        g.drawOval(510,380,80,80);
    }
    else if(count9%2==0&&flag==1){p9++;
        g.drawLine(500,350,600,500);
    g.drawLine(500,500,600,350);
    }
    if(count9%2!=0&&flag==2){p9++;
        g.drawLine(500,350,600,500);
    g.drawLine(500,500,600,350);
        }
        else if(count9%2==0&&flag==2){o9++;
            g.drawOval(510,380,80,80);
        }
}
if(x>=200&&x<=300 &&y<=200&&y>=100&&x5>=300&&x5<=500 &&y5<=350&&y5>=200&&x9>=500&&x9<=800 &&y9>=350&&y9<=500&&o1>=1&&o5>=1&&o9>=1){
    win=1;
    if(flag==1)
    g.drawString("Winner is "+s1,300,540);
    else
    g.drawString("Winner is "+s2,300,540);
    g.drawLine(200,100,600,440);
    q=1;r=1;s=1;u=1;v=1;w=1;
    }
    else if(x>=200&&x<=300 &&y<=200&&y>=100&&x5>=300&&x5<=500 &&y5<=350&&y5>=200&&x9>=500&&x9<=800 &&y9>=350&&y9<=500&&p1>=1&&p5>=1&&p9>=1){
        win=1;
        if(flag==2)
        g.drawString("Winner is "+s1,300,540);
        else
        g.drawString("Winner is "+s2,300,540);
       // g.drawString("Winner is X",300,540);
        g.drawLine(200,100,600,440);
        q=1;r=1;s=1;u=1;v=1;w=1;
        }  
       else if(x3>=500&&x3<=800 &&y3<=200&&y3>=100&&x5>=300&&x5<=500 &&y5<=350&&y5>=200&&x7>=200&&x7<=300 &&y7>=350&&y7<=500&&o3>=1&&o5>=1&&o7>=1){
            win=1;
            if(flag==1)
            g.drawString("Winner is "+s1,300,540);
            else
            g.drawString("Winner is "+s2,300,540);
       //     g.drawString("Winner is O",300,540);
        g.drawLine(200,440,600,100);
        p=1;q=1;s=1;u=1;w=1;z=1;
        }
       else if(x3>=500&&x3<=800 &&y3<=200&&y3>=100&&x5>=300&&x5<=500 &&y5<=350&&y5>=200&&x7>=200&&x7<=300 &&y7>=350&&y7<=500&&p3>=1&&p5>=1&&p7>=1){
            win=1;
             if(flag==2)
            g.drawString("Winner is "+s1,300,540);
            else
            g.drawString("Winner is "+s2,300,540);
           // g.drawString("Winner is X",300,540);
            g.drawLine(200,440,600,100);
            p=1;q=1;s=1;u=1;w=1;z=1;
            }
        else   if(x>=200&&x<=300 &&y<=200&&y>=100&&x4>=200&&x4<=300 &&y4<=350&&y4>=200&&x7>=200&&x7<=300 &&y7>=350&&y7<=500&&o1>=1&&o4>=1&&o7>=1){
            win=1;
             if(flag==1)
            g.drawString("Winner is "+s1,300,540);
            else
            g.drawString("Winner is "+s2,300,540);
           // g.drawString("Winner is O",300,540);
            g.drawLine(250,100,250,500);
            q=1;r=1;t=1;u=1;w=1;z=1;
            }
        else    if(x>=200&&x<=300 &&y<=200&&y>=100&&x4>=200&&x4<=300 &&y4<=350&&y4>=200&&x7>=200&&x7<=300 &&y7>=350&&y7<=500&&p1>=1&&p4>=1&&p7>=1){
                win=1;
                  if(flag==2)
                g.drawString("Winner is "+s1,300,540);
                else
                g.drawString("Winner is "+s2,300,540);
               // g.drawString("Winner is X",300,540);
                g.drawLine(250,100,250,500);
                q=1;r=1;t=1;u=1;w=1;z=1;
                }
            else  if(x5>=300&&x5<=500 &&y5<=350&&y5>=200&&x2>=300&&x2<=500 &&y2<=200&&y2>=100&&x8>=300&&x8<=500 &&y8>=350&&y8<=500&&o2>=1&&o5>=1&&o8>=1){
                win=1;
                if(flag==1)
                g.drawString("Winner is "+s1,300,540);
                else
                g.drawString("Winner is "+s2,300,540);
                // g.drawString("Winner is O",300,540);
                g.drawLine(400,100,400,500);
                p=1;r=1;s=1;u=1;v=1;z=1;
                }
         else       if(x5>=300&&x5<=500 &&y5<=350&&y5>=200&&x2>=300&&x2<=500 &&y2<=200&&y2>=100&&x8>=300&&x8<=500 &&y8>=350&&y8<=500&&p2>=1&&p5>=1&&p8>=1){
                    win=1;
                    if(flag==2)
    g.drawString("Winner is "+s1,300,540);
    else
    g.drawString("Winner is "+s2,300,540);
                    //g.drawString("Winner is X",300,540);
                        g.drawLine(400,100,400,500);
                        p=1;r=1;s=1;u=1;v=1;z=1;
                        }
              else  if(x3>=500&&x3<=800 &&y3<=200&&y3>=100&&x6>=500&&x6<=700 &&y6<=350&&y6>=200&&x9<=800 &&y9>=350&&y9<=500&&o3>=1&&o6>=1&&o9>=1){
                    win=1;
                    if(flag==1)
                    g.drawString("Winner is "+s1,300,540);
                    else
                    g.drawString("Winner is "+s2,300,540);
               //     g.drawString("Winner is O",300,540);
                g.drawLine(540,100,540,500);
                p=1;q=1;s=1;t=1;v=1;w=1;
                }
            else    if(x3>=500&&x3<=800 &&y3<=200&&y3>=100&&x6>=500&&x6<=700 &&y6<=350&&y6>=200&&x9<=800 &&y9>=350&&y9<=500&&p3>=1&&p6>=1&&p9>=1){
                    win=1;
                    if(flag==2)
                    g.drawString("Winner is "+s1,300,540);
                    else
                    g.drawString("Winner is "+s2,300,540);
                   // g.drawString("Winner is X",300,540);
                    g.drawLine(540,100,540,500);
                    p=1;q=1;s=1;t=1;v=1;w=1;
                    }
            else    if(x>=200&&x<=300 &&y<=200&&y>=100&&x2>=300&&x2<=500 &&y2<=200&&y2>=100&&x3>=500&&x3<=800 &&y3<=200&&y3>=100&&o1>=1&&o2>=2&&o3>=1){
                   
                   win=1;
                    if(flag==1)
                    g.drawString("Winner is "+s1,300,540);
                    else
                    g.drawString("Winner is "+s2,300,540);
               //     g.drawString("Winner is O",300,540);
                g.drawLine(200,150,600,150);
                s=1;t=1;u=1;v=1;w=1;z=1;
                }
            else    if(x>=200&&x<=300 &&y<=200&&y>=100&&x2>=300&&x2<=500 &&y2<=200&&y2>=100&&x3>=500&&x3<=800 &&y3<=200&&y3>=100&&p1>=1&&p2>=2&&p3>=1){
                   win=1;
                    if(flag==2)
                    g.drawString("Winner is "+s1,300,540);
                    else
                    g.drawString("Winner is "+s2,300,540);
                   // g.drawString("Winner is X",300,540);
                    g.drawLine(200,150,600,150);
                    s=1;t=1;u=1;v=1;w=1;z=1;
                    }
             else   if(x4>=200&&x4<=300 &&y4<=350&&y4>=200&&x5>=300&&x5<=500 &&y5<=350&&y5>=200&&x6>=500&&x6<=700 &&y6<=350&&y6>=200&&o5>=1&&o6>=1&&o4>=1){
                    win=1;
               // g.drawString("Winner is "+s1,300,540);
                    if(flag==2)
                    g.drawString("Winner is "+s1,300,540);
                    else
                    g.drawString("Winner is "+s2,300,540);
                //    g.drawString("Winner is O",300,540);
                g.drawLine(200,300,600,300);
                p=1;q=1;r=1;v=1;w=1;z=1;
                }
            else    if(x4>=200&&x4<=300 &&y4<=350&&y4>=200&&x5>=300&&x5<=500 &&y5<=350&&y5>=200&&x6>=500&&x6<=700 &&y6<=350&&y6>=200&&p5>=1&&p6>=1&&p4>=1){
                    win=1;
                    if(flag==2)
                    g.drawString("Winner is "+s1,300,540);
                    else
                    g.drawString("Winner is "+s2,300,540);
                   // g.drawString("Winner is X",300,540);
                    g.drawLine(200,300,600,300);
                    p=1;q=1;r=1;v=1;w=1;z=1;
                    }
             else   if(x7>=200&&x7<=300 &&y7>=350&&y7<=500&&x8>=300&&x8<=500 &&y8>=350&&y8<=500&&x9>=500&&x9<=800 &&y9>=350&&y9<=500&&o7>=1&&o8>=1&&o9>=1){
                    win=1;
                    if(flag==1)
                    g.drawString("Winner is "+s1,300,540);
                    else
                    g.drawString("Winner is "+s2,300,540);
                    // g.drawString("Winner is O",300,540);
                g.drawLine(200,410,600,410);
                p=1;q=1;r=1;s=1;t=1;u=1;
                }
             else   if(x7>=200&&x7<=300 &&y7>=350&&y7<=500&&x8>=300&&x8<=500 &&y8>=350&&y8<=500&&x9>=500&&x9<=800 &&y9>=350&&y9<=500&&p7>=1&&p8>=1&&p9>=1){
                    win=1;
                    if(flag==2)
                    g.drawString("Winner is "+s1,300,540);
                    else
                    g.drawString("Winner is "+s2,300,540);
                   // g.drawString("Winner is X",300,540);
                    g.drawLine(200,410,600,410);
                    p=1;q=1;r=1;s=1;t=1;u=1;
                    }
                  else if(flag2>=9&&win==0)
                  l5.setText("Match Draw");
        
}
}
