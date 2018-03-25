
package beer_song;


public class Beer_Song {

   
    public static void main(String[] args) {
        
        beerSong();
    }
    
    public static void beerSong() {
        
        for (int i=99 ; i>=0 ; i--){
            if (i != 0) {
                System.out.print(i+" bottles of beer on the wall,\n"+i+" bottles of beer,\nya’ take one down, ya’ pass it around,\n"+(i-1)+" bottles of beer on the wall.\n\n");
            }else if (i ==0){
                System.out.print("No bottles of beer on the wall,\nno bottles of beer,\nya’ can’t take one down, ya’ can’t pass it around,\n’cause there are no more bottles of beer on the wall!");
            }
        }
        
        
    }
    
}
