package Containtment;

 abstract public class Teacher

	private int tid;
	private String tname;
	private long mobileNo;
	
	
	public Teacher (int tid,String tname,long mobileNo)
	
	{
		this.tid=tid;
		this.tname=tname;
		this.mobileNo=mobileNo;
		
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	abstract void salary();

