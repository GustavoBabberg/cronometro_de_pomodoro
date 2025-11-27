public class cronometro_pomodoro {
    public static void main(String[] args) throws InterruptedException {
        int tempo_de_estudo = 25;
        int pausa = 5;

        System.out.println("Pomodoro iniciado! Foco por " + tempo_de_estudo + " minutos...");
        Thread.sleep(tempo_de_estudo * 60 * 1000);

        System.out.println("Tempo de foco acabou! Hora da pausa de " + pausa + " minutos!");
        Thread.sleep(pausa * 60 * 1000);

        System.out.println("Pausa finalizada! Ciclo concluído.");
    }
}
