package Containtment;

public class Refill {
	
	Private  String inkColorString;
	Private int length;
	Nib tipNib;
	Refill()
	{	

}
	
	Refill(String color,int length,Nib tip){
		this.inkColorString=color;
		this.length=length;
		this.tipNib=tip;
	}
	public void setInkColorString(String  inkColorString){
		this.inkColorString = inkColorString;
	}
	
	public String getInkColorString(){
		return inkColorString;
	}


	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Nib getTipNib() {
		return tipNib;
	}

	public void setTipNib(Nib tipNib) {
		this.tipNib = tipNib;
	}
