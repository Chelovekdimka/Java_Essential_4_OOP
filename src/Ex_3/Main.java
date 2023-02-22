//Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створіть 2 інтерфейси Playable та Recodable.
//        У кожному з інтерфейсів створіть по 3 методи void play() / void pause() / void stop() та void record() / void pause() / void stop() відповідно.
//        Створіть похідний клас Player від базових інтерфейсів Playable та Recodable.
//        Написати програму, яка виконує програвання та запис.

package Ex_3;

public class Main {
    public static void main(String[] args) {
        Player tv = new Player();
        tv.play();
        tv.pause();
        tv.stop();
        tv.record();
    }
}

