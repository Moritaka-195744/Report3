package jp.ac.uryukyu.ie.e195744;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name,int maximumHP,int attack){
        this.name =name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public LivingThing(){

    }

    public boolean isDead() {
        return this.dead;
    }

    public String getName() {
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(){
        this.hitPoint = hitPoint;
    }

    public int getAttack(){
        return attack;
    }

    public void setAttack(){
        this.attack = attack;
    }



    public void setDead(){
        this.dead = dead;
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param  opponent 攻撃対象
     */

    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * attack);
        if (!dead) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}