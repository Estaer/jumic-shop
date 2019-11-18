package com.essa.threading;

import java.util.concurrent.ThreadLocalRandom;

public class Authenticator implements Runnable{
    private Thread thread;

    public void run(){
        try {
            for(int i = 0; i<5; i++){
            int token = ThreadLocalRandom.current().nextInt(10000, 100000);
            System.out.println(token);
            }
            Thread.sleep(60000);
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public void start() {
        if(thread == null){
        thread = new Thread(new Authenticator());
        thread.start();

        }
    }

}

class Authenticate{
    public static void main(String[] args) {
        Authenticator authenticator = new Authenticator();
        authenticator.start();
    }
}
