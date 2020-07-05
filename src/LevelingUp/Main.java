package LevelingUp;


public class Main {
    public static void main(String[] args) {
        Skill JavaProgramming = new Skill("Java");
        JavaProgramming.setMaxValue(1000);
        System.out.println("Skill name:\t" + JavaProgramming.getSkillName());
        System.out.println("Skill level:\t" + JavaProgramming.getLevel());
        JavaProgramming.ProgressUp();
        System.out.println("Current progress:\t" + JavaProgramming.getSkillProgress());
        System.out.println("Max level value:\t" + JavaProgramming.getMaxValue());
        System.out.println(JavaProgramming);
    }
}
