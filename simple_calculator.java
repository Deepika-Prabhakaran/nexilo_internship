package nexilo_internship;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class simple_calculator implements ActionListener{
    double num1=0,num2=0,result=0;
    private int calculation=0;
   JFrame frame =new JFrame("calculator");
   JLabel label=new JLabel();
   JTextField textfield=new JTextField();
   JButton zero=new JButton("0");
    JButton one=new JButton("1");
    JButton two=new JButton("2");
    JButton three=new JButton("3");
    JButton four=new JButton("4");
    JButton five=new JButton("5");
    JButton six=new JButton("6");
    JButton seven=new JButton("7");
    JButton eight=new JButton("8");
    JButton nine=new JButton("9");
    JButton clear=new JButton("C");
    JButton add=new JButton("+");
    JButton sub=new JButton("-");
    JButton mul=new JButton("X");
    JButton div=new JButton("/");
    JButton del=new JButton("D");
    JButton equal=new JButton("=");
    JButton dot=new JButton(".");
             
    simple_calculator(){
        calc();
        addcomponents();
        actionevent();
    }
    public void calc(){
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addcomponents(){
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);
        textfield.setBounds(10, 40, 270, 40);
        textfield.setFont(new Font("Arial",Font.BOLD,20));
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);
        seven.setBounds(10,230,60,40);
        seven.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(seven);
        seven.setFocusable(false);
        eight.setBounds(80,230,60,40);
        eight.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(eight);
        eight.setFocusable(false);
        nine.setBounds(150,230,60,40);
        nine.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(nine);
        nine.setFocusable(false);
        four.setBounds(10,290,60,40);
        four.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(four);
        four.setFocusable(false);
        five.setBounds(80,290,60,40);
        five.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(five);
        five.setFocusable(false);
        six.setBounds(150,290,60,40);
        six.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(six);
        six.setFocusable(false);
        three.setBounds(150,350,60,40);
        three.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(three);
        three.setFocusable(false);
        two.setBounds(80,350,60,40);
        two.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(two);
        two.setFocusable(false);
        one.setBounds(10,350,60,40);
        one.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(one);
        one.setFocusable(false);
        zero.setBounds(10,410,130,40);
        zero.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(zero);
        zero.setFocusable(false);
        dot.setBounds(150,410,60,40);
        dot.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(dot);
        dot.setFocusable(false);
        equal.setBounds(220,350,60,100);
        equal.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(equal);
        equal.setFocusable(false);
        div.setBounds(150,170,60,40);
        div.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(div);
        div.setFocusable(false);
        mul.setBounds(220,230,60,40);
        mul.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(mul);
        mul.setFocusable(false);
        sub.setBounds(220,170,60,40);
        sub.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(sub);
        sub.setFocusable(false);
        add.setBounds(220,290,60,40);
        add.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(add);
        add.setFocusable(false);
        del.setBounds(80,170,60,40);
        del.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(del);
        del.setFocusable(false);
        clear.setBounds(10,170,60,40);
        clear.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(clear);
        clear.setFocusable(false);
        
    }
    public void actionevent(){
        
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);
        del.addActionListener(this);
        dot.addActionListener(this);
        equal.addActionListener(this);
    }

    public static void main(String[] args) {
        simple_calculator calc=new simple_calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==clear){
            label.setText(" ");
            textfield.setText(" ");    
        }
        else if(e.getSource()==del){
            int length=textfield.getText().length();
            int number=length-1;
            if(length>0){
                StringBuilder back=new StringBuilder(textfield.getText());
                back.deleteCharAt(number);
                textfield.setText(back.toString());
                if(textfield.getText().endsWith(""));
                label.setText("");
            }
        }
            else if(e.getSource()==zero){
                if(textfield.getText().equals("0")){
                }
                else{
                    textfield.setText(textfield.getText() +"0");
                }
                
            }
            else if (e.getSource()==one){
                        textfield.setText(textfield.getText()+"1");
                        }
            else if (e.getSource()==two){
                        textfield.setText(textfield.getText()+"2");
                        }
            else if (e.getSource()==three){
                        textfield.setText(textfield.getText()+"3");
                        }
            else if (e.getSource()==four){
                        textfield.setText(textfield.getText()+"4");
                        }
            else if (e.getSource()==five){
                        textfield.setText(textfield.getText()+"5");
                        }
            else if (e.getSource()==six){
                        textfield.setText(textfield.getText()+"6");
                        }
            else if (e.getSource()==seven){
                        textfield.setText(textfield.getText()+"7");
                        }
            else if (e.getSource()==eight){
                        textfield.setText(textfield.getText()+"8");
                        }
            else if (e.getSource()==nine){
                        textfield.setText(textfield.getText()+"9");
                        }
            else if (e.getSource()==dot){
                if(textfield.getText().contains(".")){
                    return;
                }
                else{
                    textfield.setText(textfield.getText()+".");
                    
                }
                
            }
            else if (e.getSource()==add){
                String str=textfield.getText();
                num1=Double.parseDouble(textfield.getText());
                  calculation = 1;
                textfield.setText("");
                label.setText(str +"+");
                
            }
            else if (e.getSource()==sub){
                String str=textfield.getText();
                num1=Double.parseDouble(textfield.getText());
                  calculation = 2;
                textfield.setText("");
                label.setText(str +"-"); 
            }
            else if (e.getSource()==mul){
                String str=textfield.getText();
                num1=Double.parseDouble(textfield.getText());
                  calculation = 3;
                textfield.setText("");
                label.setText(str +"X"); 
            }
            else if (e.getSource()==div){
                String str=textfield.getText();
                num1=Double.parseDouble(textfield.getText());
                  calculation = 4;
                textfield.setText("");
                label.setText(str +"/"); 
            }
            else if(e.getSource()==equal){
                num2=Double.parseDouble(textfield.getText());
                
                switch(calculation){
                    case 1:
                        result=num1+num2;
                        break;
                    case 2:
                        result=num1-num2;
                        break;
                    case 3:
                        result=num1*num2;
                        break;
                    case 4:
                        result=num1/num2;
                        break;
                }
                if(Double.toString(result).endsWith(".0")){
                    textfield.setText(Double.toString(result).replace(".0",""));
                    
                }
                else{
                    textfield.setText(Double.toString(result));
                }
                label.setText("");
                num1=result;
                
            }
            
            
        }
        
            }
    

