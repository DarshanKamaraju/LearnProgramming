
public class ScoreApp {
public void estimateGrade(int score) {
	if(score>90)
	{
		System.out.println("A+ grade");
	}
	else if (score>80 && score<90)  
		{
		System.out.println("A grade");
	}
	else if(score>70 && score<80)
	{
		System.out.println("B grade");
	}
	else if(score>60 && score<70)
	{
		System.out.println("c grade");
	}
	else if(score>50 && score<60)
	{
		System.out.println("D grade");
	}
	
	else 
	{
		System.out.println("Fail...Get out...");
	}
}
}
