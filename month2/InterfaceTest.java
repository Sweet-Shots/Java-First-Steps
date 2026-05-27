package month2;

interface Playable {  // defines what classes must do
    void play();  // method that all playable things must have
}

class Song implements Playable {  // song follows Playable rule
    public void play() {  // the required play method
        System.out.println("Playing a song by slayr!");  // print song message
    }
}

class Podcast implements Playable {  // podcast follows Playable rule
    public void play() {  // the required play method
        System.out.println("Playing a podcast about Minecraft!");  // print podcast message
    }
}

public class InterfaceTest {  // test class
    public static void main(String[] args) {  // program start point
        Playable mySong = new Song();  // create a new song
        Playable myPodcast = new Podcast();  // create a new podcast

        mySong.play();  // play the song
        myPodcast.play();  // play the podcast


        Playable[] playlist = { new Song(), new Podcast() };
        for (Playable p : playlist) { p.play(); }
    }
}
