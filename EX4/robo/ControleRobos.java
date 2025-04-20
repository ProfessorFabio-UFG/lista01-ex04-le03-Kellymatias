package robo;

public class ControleRobos {
    public static void main(String[] args) {
        RoboAspirador robo1 = new RoboAspirador(1, 100);
        RoboAspirador robo2 = new RoboAspirador(2, 50);

        System.out.println(robo1);
        System.out.println(robo2);
        System.out.println("---------");

        robo1.ligar();
        robo1.andar(5, 3);
        robo1.aspirar(30);
        robo1.parar();
        robo1.aspirar(80);
        System.out.println(robo1);
        System.out.println("---------");

        robo2.ligar();
        robo2.andar(2, 2);
        robo2.aspirar(25);
        robo2.aspirar(30);
        robo2.andar(1, 1);
        System.out.println(robo2);
    }
}
