import java.util.*;

public class Main {

    //Changes ArrayList to List
    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Storm", 4.6);
        album.addSong("Love", 3.6);
        album.addSong("Holy ", 4.2);
        album.addSong("Hold", 9.6);
        album.addSong("Lady", 4.1);
        album.addSong("Right", 8.6);
        album.addSong("Shooter", 4.9);
        album.addSong("Soldier", 10.6);
        albums.add(album);


        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those", 5.44);
        album.addSong("For tea", 7.44);
        album.addSong("For tree", 7.42);
        album.addSong("For those people", 9.54);
        album.addSong("For these", 5.44);
        album.addSong("For seas", 4.44);
        albums.add(album); // we created a new object, so it's different from above

        //Changes LinkedList to List
        //Change to ArrayList
        //Still going to work as the Java Libraries make extensive use of interfaces
        List<Song> playList = new ArrayList<Song>();//0 if first album
        albums.get(0).addToPlayList("Soldier", playList);
        albums.get(0).addToPlayList("Shooter", playList);
        albums.get(0).addToPlayList("Right", playList);
        albums.get(0).addToPlayList(1, playList);
        //next album
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(42, playList);//dpesn't exist

        play(playList);
    }

    private static void play(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        //ListIterator is bidirectional interface, allows access to elements of a list
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
            //toString - because we are using a song object
            //this goes to the toString method in the Song class
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying" + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We have reached the start of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("now playing " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - quit\n" +
                "1 - to play the next song\n" +
                "2 - to play the previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in playlist\n" +
                "5 - print available actions\n" +
                "6 - remove current song\n");
    }

    //Change LinkedList to List
    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();//Iterator just goes forward, good for a print
        System.out.println("======================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("=====================");
    }


}
