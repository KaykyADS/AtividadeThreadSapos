package controller;

public class ThreadSapo extends Thread {
    private int fimCorrida = 100;
    private int[] total = new int[5];
    private int[] pulo = new int[5];
    private int i;
    private static int posicao = 0;

    public ThreadSapo(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (total[i] < fimCorrida) {
            pulo[i] = (int) ((Math.random() * 50) + 0);
            total[i] = total[i] + pulo[i];
            System.out.println("O sapo " + i + " pulou " + pulo[i] + " metros e percorreu " + total[i] + " metros");
            System.out.println(" ");
        }
        
        synchronized (ThreadSapo.class) {
            posicao++;
            System.out.println("O sapo " + i + " chegou em " + posicao + "°");
        }
    }
}