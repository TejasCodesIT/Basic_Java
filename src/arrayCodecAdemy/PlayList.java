package arrayCodecAdemy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class PlayList {
	
	public static void main(String[] args) {
		
		String[] favoriteSongs = new String[10];
		ArrayList<String> desertIslandPlaylist  = new ArrayList<String>();
		
		favoriteSongs[0]="Adele - Hello";
		favoriteSongs[1]= "Ed Sheeran - \"Shape of You\"" ;
		favoriteSongs[2]="Billie Eilish - \"Bad Guy\"";
		favoriteSongs[3]="Drake - \"God's Plan\"";
		favoriteSongs[4]="The Weeknd - \"Blinding Lights\"";
		favoriteSongs[5]="Beyoncé - \"Halo\"";
		favoriteSongs[6]="Taylor Swift - \"Blank Space\"";
		favoriteSongs[7]="Bruno Mars - \"Uptown Funk\"";
		favoriteSongs[8]="Dua Lipa - \"Levitating\"";
		favoriteSongs[9]="Imagine Dragons - \"Radioactive\"";
		
		System.out.println(favoriteSongs[0]);
		System.out.println(favoriteSongs[1]);
		System.out.println(favoriteSongs[2]);
		
		desertIslandPlaylist.add("Kal ho na ho");
		desertIslandPlaylist.add("Give me sunshine") ;
		desertIslandPlaylist.add("Desi girl") ;
		desertIslandPlaylist.add("Taki Taki") ;
		desertIslandPlaylist.add("Maharani") ;
		System.out.println();
		System.out.println();
		
		System.out.println("DesertIslanfPlaylisy as follow :- ");
		
		System.out.println(desertIslandPlaylist.get(0));
		System.out.println(desertIslandPlaylist.get(1));
		System.out.println(desertIslandPlaylist.get(2));
		System.out.println(desertIslandPlaylist.get(3));
		System.out.println(desertIslandPlaylist.get(4));
		
		
		desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
		
		System.out.println(desertIslandPlaylist.size());
		
		for (Iterator iterator = desertIslandPlaylist.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
		desertIslandPlaylist.remove(5);
		desertIslandPlaylist.remove(6);
		desertIslandPlaylist.remove(7);
		desertIslandPlaylist.remove(8);
		desertIslandPlaylist.remove(9);
		desertIslandPlaylist.remove(10);
		desertIslandPlaylist.remove(11);
		desertIslandPlaylist.remove(12);
		desertIslandPlaylist.remove(13);
		desertIslandPlaylist.remove(14);
		
		

	}

}
