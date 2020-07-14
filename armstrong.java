import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ArmStrong" width=500 height=500>
</applet>
*/
public class ArmStrong extends JApplet 
{	JTextField jt;
	JButton b;
	JLabel jb,jb1;
	public void init()
	{
	try
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				makeGUI();
			}
		});
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
public void makeGUI()
{
	setLayout(new FlowLayout());
	
	

	jb=new JLabel("Enter The number:");
						//for first label
	
	
	jt=new JTextField(15);			//for text field
	
	b=new JButton("RESULT");			// button
	
	
	
	jb1=new JLabel(" ");			//label for result
	Font f=new Font("Arial",Font.PLAIN,25);
	jb1.setFont(f);
	jb1.setForeground(Color.RED);
	
	add(jb);
	add(jt);
	add(b);
	
	add(jb1);
	
	b.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{	
			int num=Integer.parseInt(jt.getText());
			int n;
			n=num;
			
			int total=0;
			for( ;n!=0;n /= 10)
        {
            int temp = n % 10;
            total = total + temp*temp*temp;
        }

        if(total == num)
           
		jb1.setText(num + " is an Armstrong number");
        else
            jb1.setText(num + " is not an Armstrong number");
			
			
			
			
		}

	});
}
}
