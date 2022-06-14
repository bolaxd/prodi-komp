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
public class Ability extends Hero {
    private final String abilityJobName;
    
    public Ability(String jobName) {
        this.abilityJobName = jobName;
        System.out.println(jobName);
    }
    
    public int getPowerGen() {
        int power = 0;
        if (null != this.abilityJobName) switch (this.abilityJobName) {
            case "KNIGHT":
                power = 70;
                break;
            case "WIZARD":
                power = 200;
                break;
            case "ARCHER":
                power = 120;
                break;
            default:
                break;
        }
        return power;
    }
    
    public int getDefendGen() {
        int defend = 0;
        if (null != this.abilityJobName) switch (this.abilityJobName) {
            case "KNIGHT":
                defend = 200;
                break;
            case "WIZARD":
                defend = 50;
                break;
            case "ARCHER":
                defend = 100;
                break;
            default:
                break;
        }
        return defend;
    }
}
