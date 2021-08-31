package Containtment;

public class HourlyBased extends Teacher{
	int rate_per_hour;
	int hrs;
	public void HourlyBased(int rate_per_hour,int hrs){
		
		this.rate_per_hour =rate_per_hour;
		this.hrs=hrs;
		
		
	}
	
	public HourlyBased()
	{
	
  }
	void salary(){
		
		System.out.println("in hourlybased class salary method" );
		
	}

	

	}


