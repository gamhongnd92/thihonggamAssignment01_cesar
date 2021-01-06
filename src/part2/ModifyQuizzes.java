package part2;

import javax.swing.JOptionPane;

public class ModifyQuizzes {
	private int ans1;
	private int ans2;
	private int ans3;
	private int ans4;
	private int ans5;
	
	
	public ModifyQuizzes()
	{
	
		Quiz1();
		Quiz2();
		Quiz3();
		Quiz4();
		Quiz5();
	}
	
	public void Quiz1()
	{
		String[] answer1 = {"The Flash","Fast and Furious","The Man","Prison Break"};
		ans1 = JOptionPane.showOptionDialog(null,"What is your favourite movie?","The favorite movie",
				JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, answer1,answer1[3]);
				
		if(ans1==3)
		{
			JOptionPane.showMessageDialog(null, "Correct! Congraturation");
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "incorrect! the correct answer, please try again");
			Quiz1();
		}
	}
	public void Quiz2()
	{
		String[] answer2 = {"Shawn Mendes","Camila Cabello","Ed Sheeran","Maroon 5"};
		ans2 = JOptionPane.showOptionDialog(null,"Who is your favourite singger?","The favorite movie",
				JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, answer2,answer2[1]);
				
		if(ans2==1)
		{
			JOptionPane.showMessageDialog(null, "Correct! Congraturation");
		
		}
		else
		{
			JOptionPane.showMessageDialog(null, "incorrect! the correct answer, please try again");
			Quiz2();
		}
	}
	public void Quiz3()
	{
		String[] answer3 = {"Senorita","Havana","Girl like you","Perfect"};
		ans3 = JOptionPane.showOptionDialog(null, "What is your favorite song?", "The favorite song",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,answer3, answer3[1]);
				
				
		if(ans3==1)
		{
			JOptionPane.showMessageDialog(null, "Correct! Congraturation");
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "incorrect! the correct answer, please try again");
			Quiz3();
		}
	}
	public void Quiz4()
	{
		String[] answer4 = {"Swimming","Jogging","Yoga","Riding"};
		ans4 = JOptionPane.showOptionDialog(null,"Whast is your favorite activity?","The favorite activity",
				JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, answer4,answer4[0]);
				
		if(ans4==0)
		{
			JOptionPane.showMessageDialog(null, "Correct! Congraturation");
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "incorrect! the correct answer, please try again");
			Quiz4();
		}
	}
	public void Quiz5()
	{
		String[] answer5 = {"Aries","Taurus","Gemini","Capricorn"};
		ans5 = JOptionPane.showOptionDialog(null,"What is your atronomy zodiac sign?","The favorite movie",
				JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, answer5,answer5[3]);
				
		if(ans5==3)
		{
			JOptionPane.showMessageDialog(null, "Correct! Congraturation");
			System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "incorrect! the correct answer, please try again");
			Quiz5();
		}
	}
	

}
