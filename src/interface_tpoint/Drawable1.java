package interface_tpoint;

public interface Drawable1 {
	
	void draw();
	
	default void  msg() {
		System.out.println("Default method in interface..!");
	}

}
