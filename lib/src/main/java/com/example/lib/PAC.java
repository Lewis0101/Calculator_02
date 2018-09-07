package com.example.lib;

public class PAC {

    public static void main(String[] args) {
        PAC pac = new PAC();
        //多线程
        Player p = new Player(pac);
        Watcher w = new Watcher(pac);
        new Thread(p).start();
        new Thread(w).start();
    }

    private String pic;
    private boolean flag = true;

    public synchronized void play(String pic){
        //生产者等待
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //开始生产
        if(!flag){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("produce:"+pic);
        //生产完毕
        this.pic = pic;
        //通知消费者
        this.notify();
        //生产者停下
        this.flag = false;

    }

    public synchronized void watch(String pic){
        //消费者等待
        if(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //消费者消费
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("consume:"+pic);

        //通知生产
        this.notify();
        //消费停止
        this.flag = true;
    }

}

//生产者
class Player implements Runnable{
    private PAC pac;
    public  Player(PAC pac){
        super();
        this.pac = pac;
    }

    @Override
    public void run() {
        for(int i = 0;i<20;i++){
            if(i%2==0){
                pac.play("left D");
            }else{
                pac.play("right T");
            }
        }

    }
}

//消费者
class  Watcher implements Runnable{
    private PAC pac;
    public  Watcher(PAC pac){
        super();
        this.pac = pac;
    }
    @Override
    public void run() {
        for(int i = 0;i<20;i++){
            if(i%2==0){
                pac.watch("left D");
            }else{
                pac.watch("right T");
            }
        }
    }
}

