package Containtment;

public class Main_Pen_Refill_Nib {
	
	public static void main(String[] args){
		Pen newPen = new Pen();
		
		Nib tip=new Nib("stel" ,0.5f);
		Refill refill=new Refill();
		
		refill.steInkColorString("Blue");
		refill.setLength(18);
		refill.setTipNib(tip);
		
		newPen.setRefill(refill);
		newPen.setCapLength(5);
		newPen.setBrandString("Mercury");
		
		String brandString;
		
		brandString=newPen.getBrandString();
		System.out.println("Brand :"+newPen.getCapLength());
		System.out.println("Cap Length(cm) :"+newPen.getCapLength());
		System.out.println("Refill Length(cm :"+(newPen.getRefill().getLength()));
		System.out.println("color :"+ newPen.getRefill().getInkColorString());
		
		String material=tip.getMaterialTypeString();
	    
		float width=newPen.getRefill().gettilNib.getWidth();
		
		System.out.println("Nib Material :"+material);
		System.out.println("Nib width(cm) :"+width);
		
		
	}

}
