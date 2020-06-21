package com.osfocus.www.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Bullet {
    public UUID id = UUID.randomUUID();
    boolean alive = false;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                ", alive=" + alive +
                '}';
    }
}

public class BulletPool {
    private static List<Bullet> bullets = new ArrayList<>();
    {
        for (int i = 0; i < 5; i++) {
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet() {
        for (int i = 0; i < bullets.size(); i++) {
            if (!bullets.get(i).alive) {
                return bullets.get(i);
            }
        }

        Bullet b = new Bullet();
        bullets.add(b);
        return b;
    }

    public static void main(String args[]) {
        BulletPool pool = new BulletPool();
        for (int i = 0; i < 5; i++) {
            Bullet b = bullets.get(i);
            System.out.println("bullet in list = " + b);
        }

        for (int i = 0; i < 10; i++) {
            Bullet b = pool.getBullet();
            b.alive = true;
            System.out.println("b = " + b);
        }
    }
}
