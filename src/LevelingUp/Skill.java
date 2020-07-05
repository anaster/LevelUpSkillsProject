package LevelingUp;
public class Skill {
    private int Level = 0;
    private String SkillName;
    private int SkillProgress;
    private int MaxValue;

    public Skill(String SkillName){
        this.SkillName = SkillName;
    }
    public void levelUp(int Level){
        this.Level++;
    }
    public void ProgressUp(){
        this.SkillProgress = this.SkillProgress + 10;
    }
    public String getSkillName(){
        return SkillName;
    }
    public void setMaxValue(int MaxValue){
        this.MaxValue = MaxValue;
    }
    public int getLevel(){
        return Level;
    }
    public int getSkillProgress(){
        return SkillProgress;
    }
    public int getMaxValue(){
        return MaxValue;
    }

    @Override
    public String toString(){
        return "\nBasic Info" +
                "\nSkill name:\t" + SkillName +
                "\nSkill level:\t" + Level +
                "\nSkill Max progress\t" + MaxValue +
                "\nCurrent progress:\t" + SkillProgress + '\n';
    }
}
