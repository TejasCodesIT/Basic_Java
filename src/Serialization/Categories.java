package Serialization;
import java.util.ArrayList;

public class Categories {
	
	private int id;
	private String cname;
	private ArrayList<Product> plist;
	
	
	
	public Categories(int id, String cname, ArrayList<Product> plist) {
		super();
		this.id=id;
		this.cname = cname;
		this.plist = plist;
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public ArrayList<Product> getPlist() {
		return plist;
	}
	public void setPlist(ArrayList<Product> plist) {
		this.plist = plist;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", cname=" + cname + ", plist=" + plist + "]";
	}
	

	
	
	

}
