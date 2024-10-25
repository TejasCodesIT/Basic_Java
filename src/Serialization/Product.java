package Serialization;

public class Product {
	
	
	private int pid;
	private String pname;
	private double prize;
	

	public Product(int pid, String pname, double prize) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prize = prize;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", prize=" + prize + "]";
	}
	
	

}
