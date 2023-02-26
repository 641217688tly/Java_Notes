package Alien_invaders;
public class Game1 {
    //05-Recreating the Same in OOP
    Ship player = new Ship(50, 400, 20, true);
    int numberOfEnemies; //创建了一个尚未赋值的变量，用其来保存敌机数量
    Ship[] enemyShips; //创建了一个类型已定(存储的数据类型为Ship类的对象)的数组，用其来保存敌机

    Game1() {
        //利用构造方法为数组确定尺寸以及装填元素(Ship类的对象)
        enemyShips = new Ship[numberOfEnemies];
        enemyShips[0] = new Ship(70, 50, 15, false);
        enemyShips[1] = new Ship(90, 50, 20, false);
        enemyShips[2] = new Ship(110, 50, 0, false);

    }

    //之后我们来创建移除飞船的方法：
    void removeShip(int m) {
        if (m < numberOfEnemies && m >= 0) {
            for (int i = m; i < numberOfEnemies - 1; i++) {
                enemyShips[i] = enemyShips[i + 1];
            }
            enemyShips[numberOfEnemies - 1] = null;
            numberOfEnemies--;
        }
    }
}
