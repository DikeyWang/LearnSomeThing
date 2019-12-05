package model;

public class HungrySingleton {



     private static final HungrySingleton singleton = new HungrySingleton() {};
     public static HungrySingleton getSingleton(){
         return singleton;
     }
}
