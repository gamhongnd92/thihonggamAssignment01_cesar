package part2;

import java.util.Random;

import javax.swing.JOptionPane;

public class Quizzes {
	
	
	private int ans1;
	private int ans2;
	private int ans3;
	private int ans4;
	private int ans5;
	private int score = 0;
	
	public Quizzes()
	{
		String[] questions = {
				"What is your favourite movie?",
				"Who is your favorite singer",
				"What is your favorit song?",
				"What is your favorite activity?",
				 "What is your astronmy zodiac sign?"
		};
		String[][] quiz = {
				new String[] {"Prison Break","The Flash","Fast and Furious","The Man"},
				new String[] {"Camila Cabello","Shawn Mendes","Ed Sheeran","Maroon 5"},
				new String[] {"Havana","Senorita","Girl like you","Perfect"},
				new String[] {"Swimming","Jogging","Yoga","Riding"},
				new String[] {"Capricorn","Taurus","Aries","Gemini"}
		};
				
		int answer;
		for(int i=0; i < questions.length; ++i) {
			
			Random r = new Random();
			int position = r.nextInt(4);
			String temp = quiz[i][position];
			quiz[i][position] = quiz[i][0];
			quiz[i][0] = temp;
			
			answer = JOptionPane.showOptionDialog(null,questions[i],"Question",
					JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, quiz[i],quiz[i][position]);
			
			if(answer==position) {
				JOptionPane.showMessageDialog(null, "Correct! Congraturation");
				++score;
			}
			else {
				JOptionPane.showMessageDialog(null, "incorrect! the correct answer is "+quiz[i][position]);
			}
		}
	}
	
	
	public void Quiz1()
	{
		String[] answer1 = {"The Flash","Fast and Furious","The Man","Prison Break"};
		ans1 = JOptionPane.showOptionDialog(null,"What is your favourite movie?","The favorite movie",
				JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, answer1,answer1[3]);
				
		if(ans1==3)
		{
			JOptionPane.showMessageDialog(null, "Correct! Congraturation");
			++score;
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "incorrect! the correct answer is Prison Break");
		}
		
	}
	public void Quiz2()
	{
		String[] answer2 = {"Shawn Mendes","Camila Cabello","Ed Sheeran","Maroon 5"};
		ans2 = JOptionPane.showOptionDialog(null,"Who is your favorite singer", "The favorite singer",
				JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, answer2, answer2[1]);
		
		 if(ans2==1)
		{
			JOptionPane.showMessageDialog(null, "Correct! Congraturation");
			++score;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "incorrect! the correct answer is Camila Cabello");
		}
		
	}
	public void Quiz3()
	{
		String[] answer3 = {"Senorita","Havana","Girl like you","Perfect"};
		ans3 = JOptionPane.showOptionDialog(null, "What is your favorit song?","The favorite song",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, answer3, answer3[1]);
				
		if(ans3==1)
		{
			JOptionPane.showMessageDialog(null, "Correct! Congraturation");
			++score;
			
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "incorrect! the correct answer is Havana");
		}
		
	}
	public void Quiz4()
	{
		String[] answer4 = {"Swimming","Jogging","Yoga","Riding"};
		ans4 = JOptionPane.showOptionDialog(null,"What is your favorite activity?","The favorite activity",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, answer4, answer4[0]);
				
		if(ans4==0)
		{
			JOptionPane.showMessageDialog(null, "Correct! Congraturation");
			++score;
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "incorrect! the correct answer is Swimming");
		}
		
	}
	public void Quiz5()
	{
		String[] answer5 = {"Aries","Taurus","Gemini","Capricorn"};
		ans5 = JOptionPane.showOptionDialog(null,"What is your astronmy zodiac sign?","The zodiac sign",
				JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, answer5,answer5[3]);
				
		if(ans5==3)
		{
			JOptionPane.showMessageDialog(null,"Correct! Congraturation" );
			++score;
			
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "incorrect! the correct answer is Capricorn");
		}
		
	}
	
	public void CorrectAnswer()
	{
		
		
		JOptionPane.showMessageDialog(null,"Your correct answers are "+ score);
			
		
		
	}
	
	

}
