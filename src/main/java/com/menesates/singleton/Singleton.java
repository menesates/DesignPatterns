package com.menesates.singleton;

public class Singleton {

    /*
    * Singleton sınıfından olusturabilecek tek nesne statik olarak sınıf değişkeni olarak tanımlanıyor.
    */
    private static volatile Singleton instance = null;

    /*
    * Double check locking yapabilmek için kullanılan nesne
    */
    private static Object lock = new Object();

    /*
    * Başka sınıfların new Singleton() ile nesne oluşturmaları private ile engellenmiş oluyor.
    */
    private Singleton() {
        System.out.println("Singleton Init");
    }

    /*
    * Singleton sınıfından oluşturulabilen tek nesneye ulaşmak için instance()
    * metodu kullanilmaktadir..
    */
    public static Singleton getInstance(){
        if (instance == null){
            // Double check locking
            synchronized (lock) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void printThis(){
        System.out.println(this);
    }
}
