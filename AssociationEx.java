// isA hasA usesA producesA

import java.time.LocalDate;    

public class AssociationEx{
    
    public static void main(String args[]){
        
        
    	Lyrics l=new Lyrics("happy", "english");
    	Singer singer = new Singer("Arijit", "Male", 111, 30);
    	singer.sing(l);
    	singer.printPerson();
    	l.printLyrics();
    	
    }
}
class Person{
    String name;
    String gender;
    
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	
	void printPerson() {
		System.out.println("+----PERSON INFO----");
		System.out.println("|Name : "+name);
		System.out.println("|Gender   : "+gender);
		
		System.out.println("-----------------------");
    }
}

class Singer extends Person{  // is A
   
//	String singerName;
	int singerId;
	int songCount ; 
	
	
public Singer(String name, String gender, int singerId, int songCount) {
		super(name, gender);
		this.singerId = singerId;
		this.songCount = songCount;
	}


// produces song    uses lyrics
    Song sing(Lyrics lyrics){
    	System.out.println("singer id is : "+singerId);
    	System.out.println("Count of Songs sing by singer : "+songCount);
    	System.out.println("--------------------------------");
    	
    	Song song = new Song("kesriya", "Brahmastra", LocalDate.of(2022, 04, 12));
    	
    	System.out.println("-------SONG INFO--------");
    	System.out.println("Song Name is : "+song.songName);
    	System.out.println("Album is : "+song.albumName);
    	System.out.println("Release Date is : "+song.releaseDate);
    	System.out.println("--------------------------------");
    	
    	return song;

    	
    }
}

class Lyrics{
    String typeOfLyrics;
    String language;
    
    
	
	public Lyrics(String typeOfLyrics, String language) {
		super();
		this.typeOfLyrics = typeOfLyrics;
		this.language = language;
	}



	void printLyrics() {
		System.out.println("-----LYRICS INFO----");
		System.out.println("typeOfLyrics : "+typeOfLyrics);
		System.out.println("language   : "+language);
		System.out.println("-----------------------");
    }
} 

class Song{
    String songName;
    String albumName;
    LocalDate releaseDate;
    
    
	
	public Song(String songName, String albumName, LocalDate releaseDate) {
		super();
		this.songName = songName;
		this.albumName = albumName;
		this.releaseDate = releaseDate;
	}

}

