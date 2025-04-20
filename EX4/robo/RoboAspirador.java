package robo;

public class RoboAspirador {
    private int numero;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private int quantidadePo;
    private int limitePo;

    public RoboAspirador(int numero, int limitePo) {
        this.numero = numero;
        this.status = "desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.quantidadePo = 0;
        this.limitePo = limitePo;
    }

    public int getNumero() {
        return numero;
    }

    public String getStatus() {
        return status;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public int getQuantidadePo() {
        return quantidadePo;
    }

    public int getLimitePo() {
        return limitePo;
    }

    // Operações
    public void ligar() {
        if (!status.equals("ligado")) {
            status = "ligado";
            System.out.println("Robô " + numero + " ligado.");
        }
    }

    public void desligar() {
        status = "desligado";
        System.out.println("Robô " + numero + " desligado.");
    }

    public void andar(int x, int y) {
        if (!status.equals("ligado") && !status.equals("andando") && !status.equals("parado")) {
            System.out.println("Robô " + numero + " está desligado. Não pode andar.");
            return;
        }

        posicaoX += x;
        posicaoY += y;
        status = "andando";
        System.out.println("Robô " + numero + " andou para (" + posicaoX + ", " + posicaoY + ").");
    }

    public void parar() {
        if (!status.equals("ligado") && !status.equals("andando")) {
            System.out.println("Robô " + numero + " está desligado. Não pode parar.");
            return;
        }

        status = "parado";
        System.out.println("Robô " + numero + " parou.");
    }

    public void aspirar(int quantidade) {
        if (!status.equals("ligado") && !status.equals("andando") && !status.equals("parado")) {
            System.out.println("Robô " + numero + " está desligado. Não pode aspirar.");
            return;
        }

        if (quantidadePo + quantidade > limitePo) {
            quantidadePo = limitePo;
            status = "desligado";
            System.out.println("⚠️ Robô " + numero + " atingiu o limite de pó e foi desligado!");
        } else {
            quantidadePo += quantidade;
            System.out.println("Robô " + numero + " aspirou " + quantidade + " unidades de pó.");
        }
    }

    @Override
    public String toString() {
        return "Robo #" + numero +
               " | Status: " + status +
               " | Posição: (" + posicaoX + ", " + posicaoY + ")" +
               " | Pó: " + quantidadePo + "/" + limitePo;
    }
}
