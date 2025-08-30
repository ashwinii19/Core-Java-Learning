package com.techlabs.DesignPatternStructural.test;

//Subsystems (complex parts)
class Lights {
 void dim() {
     System.out.println("Lights dimmed");
 }
}

class Projector {
 void on() {
     System.out.println("Projector turned on");
 }
}

class SoundSystem {
 void setSurroundSound() {
     System.out.println("Surround sound set");
 }
}

class DVDPlayer {
 void playMovie() {
     System.out.println("Movie started");
 }
}

//Facade class
class HomeTheaterFacade {
 private Lights lights;
 private Projector projector;
 private SoundSystem sound;
 private DVDPlayer dvd;

 public HomeTheaterFacade() {
     lights = new Lights();
     projector = new Projector();
     sound = new SoundSystem();
     dvd = new DVDPlayer();
 }

 public void watchMovie() {
     System.out.println("Get ready for movie night...");
     lights.dim();
     projector.on();
     sound.setSurroundSound();
     dvd.playMovie();
 }
}

//Client code
public class FacadePattern {
 public static void main(String[] args) {
     HomeTheaterFacade theater = new HomeTheaterFacade();
     theater.watchMovie();  // Single method for full setup
 }
}