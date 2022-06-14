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
public class Weapon extends Hero {
    private final String weaponJobName;
    
    public Weapon(String jobName) {
        this.weaponJobName = jobName;
    }
    
    public String getWeaponGen() {
        String weapon = "";
        if (null != this.weaponJobName) switch (this.weaponJobName) {
            case "KNIGHT":
                weapon = "Sword";
                break;
            case "WIZARD":
                weapon = "Wand";
                break;
            case "ARCHER":
                weapon = "Bow";
                break;
            default:
                break;
        }
        return weapon;
    }
}
