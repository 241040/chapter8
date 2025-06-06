public class Hero {
    String name;
    int hp;
    public void sleep(){
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("５のダメージ！");
    }

    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAME OVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}