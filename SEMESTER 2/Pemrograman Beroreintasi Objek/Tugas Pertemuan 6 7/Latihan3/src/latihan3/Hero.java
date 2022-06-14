/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author user
 */
public class Hero {
    private String heroName;
    private int level = 1;
    private String weapon, jobName;
    private int health, magic;
    private int power, defend;

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the weapon
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * @param weapon the weapon to set
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    /**
     * @return the jobName
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName the jobName to set
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the magic
     */
    public int getMagic() {
        return magic;
    }

    /**
     * @param magic the magic to set
     */
    public void setMagic(int magic) {
        this.magic = magic;
    }

    /**
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * @return the defend
     */
    public int getDefend() {
        return defend;
    }

    /**
     * @param defend the defend to set
     */
    public void setDefend(int defend) {
        this.defend = defend;
    }

    /**
     * @return the heroName
     */
    public String getHeroName() {
        return heroName;
    }

    /**
     * @param heroName the heroName to set
     */
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    
    // OVERRIDE METHOD
    public void start() {}
    public String attackInfo() { return ""; }
}
