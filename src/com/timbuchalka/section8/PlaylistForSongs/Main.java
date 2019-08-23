package com.timbuchalka.section8.PlaylistForSongs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author tl0904
 */
public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static LinkedList<Song> playList = new LinkedList<>();
    private static ListIterator<Song> i;
    private static Song aktual;

    public static void main(String[] args) {

        Album fireball = new Album("Deep Purple - Fireball");
        fireball.addNewSong("Fireball", "3:24");
        fireball.addNewSong("No No No", "6:54");
        fireball.addNewSong("Demon's Eye", "5:21");
        fireball.addNewSong("Anyone's Daughter", "4:43");
        fireball.addNewSong("The Mule", "5:21");
        fireball.addNewSong("Fools", "8:19");
        fireball.addNewSong("No One Came", "6:34");
        fireball.addNewSong("Strange Kind Of Woman", "4:07");
        albums.add(fireball);

        Album schoolDays = new Album("Stanley Clarke - School Days");
        schoolDays.addNewSong("School Days", "7:51");
        schoolDays.addNewSong("Quiet Afternoon", "5:10");
        schoolDays.addNewSong("The Dancer", "5:28");
        schoolDays.addNewSong("Desert Song", "6:57");
        schoolDays.addNewSong("Hot Fun", "2:55");
        schoolDays.addNewSong("Life Is Just A Game", "8:59");
        albums.add(schoolDays);

        Album chariots = new Album("Vangelis - Chariots of Fire");
        chariots.addNewSong("Chariots of Fire (\"Titles\")", "3:33");
        chariots.addNewSong("Five Circles", "5:20");
        chariots.addNewSong("Abraham's Theme", "3:20");
        chariots.addNewSong("Eric's Theme", "4:18");
        chariots.addNewSong("100 Metres", "2:04");
        chariots.addNewSong("Jerusalem", "2:47");
        chariots.addNewSong("Chariots of Fire", "20:41");
        albums.add(chariots);

        boolean quit = false;
        int choise = 0;
//        printInstructions();
        while (!quit) {
            printInstructions();
            System.out.println("Enter your choise!");
            choise = sc.nextInt();
            sc.nextLine();

            switch (choise) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    printAlbums();
                    System.out.println("Please enter the album number");
                    int albumNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Please enter the song number");
                    int songNumber = sc.nextInt();
                    sc.nextLine();
                    playList.add(new Song(albums.get(albumNumber - 1).getAlbum().get(songNumber - 1).getTitle(),
                            albums.get(albumNumber - 1).getAlbum().get(songNumber - 1).getDuration()));
                    break;
                case 2:
                    printPlayList();
                    break;
                case 3:
                    skip(0);
                    break;
                case 4:
                    skip(1);
                    break;
                case 5:
                    skip(2);
                    break;
                case 6:
                    System.out.print("Please enter the name to search: ");
                    String nameToSearch = sc.nextLine();

                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

    private static void printAlbums() {
        for (int i = 0; i < albums.size(); i++) {
            System.out.println((i + 1) + " " + albums.get(i).getName());
            for (int j = 0; j < albums.get(i).getAlbum().size(); j++) {
                System.out.println("\t" + (j + 1) + " " + albums.get(i).getAlbum().get(j).getTitle()
                        + " " + albums.get(i).getAlbum().get(j).getDuration());
            }
            System.out.println("------------------------------------------------");

        }
    }

    private static void printInstructions() {
        System.out.println("\nPress!");
        System.out.println("\t 0 - To quit the application");
        System.out.println("\t 1 - To add song to the playlist");
        System.out.println("\t 2 - To print the songs in the playlist");
        System.out.println("\t 3 - To skip forward to the next song");
        System.out.println("\t 4 - To skip backwards to the previous song");
        System.out.println("\t 5 - To replay the current song");
        System.out.println("\t 6 - To remove song from the playlist");
    }

    private static void printPlayList() {
        Iterator<Song> i = playList.iterator();
        while (i.hasNext()) {
            Song listSong = i.next();
            System.out.println(listSong.getTitle() + " " + listSong.getDuration());
        }
    }

    private static void skip(int number) {
        i = playList.listIterator();
//        aktual = playList.getFirst();
        boolean quit = false;

        if (playList.isEmpty()) {
            System.out.println("There's no song in the playlist.");
            return;
        } else {
            while (!quit) {
//            int comparison = listSong.getTitle().compareTo(aktual.getTitle());
                switch (number) {
                    case 0:
                        Song listSong = i.next();
                        System.out.println("Now playing: " + i.next().getTitle());
//                        aktual = i.next();
                        quit = true;
                        break;
                    case 1:
//                        listSong = i.previous();
                        if (i.hasPrevious()) {
                            System.out.println("Now playing: " + i.previous().getTitle());
//                        aktual = listSong;
                        } else {
                            System.out.println("This is the begin of the playlist");
                        }
                        quit = true;
                        break;
                    case 2:
//                        listSong = i.next();
                        System.out.println("Now playing: " + i.next().getTitle());
//                        aktual = listSong;
                        quit = true;
                        break;
                }
            }
        }
    }

}
