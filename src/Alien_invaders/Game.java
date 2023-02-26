package Alien_invaders;
public class Game {
    //02-The Start of an Arcade Game
    //让我们从表达玩家的位置以及生命值开始
    int playerX = 50;
    int playerY = 400;
    int playerHealth = 20;

    //接下来我们要储存关于外星飞船的信息，如果我们为每个飞船都创建一个变量(位置X,Y)，那么工作量将非常的大
    //所以我们选择利用array来存储相关信息:
    int numberOfEnemies = 3;
    int[] enemyX = {70, 90, 110};
    int[] enemyY = {50, 50, 50};

    //03-Adding Functionality to the Code
    /*
     * 敌人是可以被击毁的，当敌机被摧毁时，我们需要将其相应的数据移除
     * 所以我们需要定义一个方法，使其能够从列表中移除飞船i的数据
     */

    void removeShip(int m) {
        //此方法能够从数组中移除敌机的位置，参数m代表着编号为m的敌机被移除
        if (m < numberOfEnemies && m >= 0) {
            for (int i = m; i < numberOfEnemies - 1; i++) {
                //这段for循环的目的是让被击毁的敌机的坐标被移除，之后数组中位于它右侧的坐标向左移补上它的空缺
                enemyX[i] = enemyX[i + 1];
                enemyY[i] = enemyX[i + 1];
            }
            //下列代码的效果是让数组最右侧的元素等于0，意思是这里已经没有敌机了
            enemyX[numberOfEnemies - 1] = 0;
            enemyY[numberOfEnemies - 1] = 0;
            numberOfEnemies--;
        }

    }

    //为了验证上述方法有无BUG，我们需要：1.为数组赋值；2.调用方法；3.遍历并打印数组内的元素

    void test() {
        System.out.println("Player (" + playerX + ", " + playerY+")");
        for (int i = 0; i < numberOfEnemies; i++) {
            System.out.println("Enemy " + i + " (" + enemyX[i] + ", " + enemyY[i] + ")");
        }
        removeShip(1);
        for (int i = 0; i < numberOfEnemies; i++) {
            System.out.println("Enemy " + i + " (" + enemyX[i] + ", " + enemyY[i] + ")");
        }
    }
    //之后我们只需要在Main文件中调用test()即可

    //04-Making Changes
    int playerCoolDown = 10;
    int[] enemyCoolDown = {15,20,0};
    //由于敌机会被摧毁，所以被摧毁的敌机在数组中对应的冷却值也应该被删除，这是一个需要注意的小变化，我们将在下节中解决它








}
