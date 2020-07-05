package LevelingUp;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Skill JavaProgramming = new Skill("Java");
//        JavaProgramming.setMaxValue(1000);
//        System.out.println("Skill name:\t" + JavaProgramming.getSkillName());
//        System.out.println("Skill level:\t" + JavaProgramming.getLevel());
//        JavaProgramming.ProgressUp();
//        System.out.println("Current progress:\t" + JavaProgramming.getSkillProgress());
//        System.out.println("Max level value:\t" + JavaProgramming.getMaxValue());
//        System.out.println(JavaProgramming);
        test();

    }

    public static void test()
            throws InterruptedException{
                TimerTask Task = new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("Date:\t" + new Date() +
                                "\nThread:\t" + Thread.currentThread().getName());
                    }
                };
                Timer timer = new Timer("Timer");
                timer.scheduleAtFixedRate(Task, 3000L, 1000L);
                Thread.sleep(1000L*2);
            }
}
