package io.muzoo.ssc.zork;

import java.util.Random;


public class Monster {
    public int HP;
    private int attackPower;

    public Monster(){
        HP = 100;
        Random random = new Random();
        attackPower = random.nextInt(15);
    }

    public void getDamage(int damaged){
        if (HP > 0){
            HP -= damaged;
            System.out.println("Monster's HP -" + damaged);
        }else{
            System.out.println("Monster is death");
        }
    }

    public int monsterAttack(){
        return attackPower;
    }

    public int getMonsterHP(){
        return HP;
    }


}
