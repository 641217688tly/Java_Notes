package Alien_invaders;
public class Ship {
    //05-Recreating the Same in OOP
    int x;
    int y;
    int cooldown;
    //int health; //06-Adding More Functionality：由于默认子弹命中即可击毁敌机，所以生命值这一实例变量可以被忽略
    boolean player; //06-Adding More Functionality：用于判断飞船是敌人的还是玩家的：true-玩家;false-敌人

    public Ship(int x, int y, int cooldown, boolean player) {
        this.x = x;
        this.y = y;
        this.cooldown = cooldown;
        this.player = player;
    }

    boolean isHit(Bullet b) {
        //为了方便理解，我们仅简单地写个判断条件来判断飞船是否被击中
        if (this.x <= b.x && this.x + 10 < b.x && this.y >= b.y && this.y+10<b.y ) {
            return true;
        }
        return false;
    }

    Bullet fire() {
        //fire方法的思路是：如果冷却时间为0，我们发射子弹;如果冷却时间不为0，我们不发射
        //但是一旦子弹能被发射时，我们要创建一个Bullet类的对象，因此我们给规定方法的return值为Bullet
        Bullet b = null; //null是空的意思
        if (cooldown == 0) {
            b = new Bullet(x, y, player);
            cooldown = 15;
        }
        return b;
    }


}
