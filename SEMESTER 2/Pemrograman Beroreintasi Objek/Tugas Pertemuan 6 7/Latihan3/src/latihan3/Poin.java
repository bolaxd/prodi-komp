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
public class Poin extends Hero {
    private final String poinJobName;
    
    public Poin(String jobName) {
        this.poinJobName = jobName;
    }
    
    public int getHealthGen() {
        int health = 0;
        if (null != this.poinJobName) switch (this.poinJobName) {
            case "KNIGHT":
                health = 200;
                break;
            case "WIZARD":
                health = 100;
                break;
            case "ARCHER":
                health = 120;
                break;
            default:
                break;
        }
        return health;
    }
    
    public int getMagicGen() {
        int magic = 0;
        if (null != this.poinJobName) switch (this.poinJobName) {
            case "KNIGHT":
                magic = 10;
                break;
            case "WIZARD":
                magic = 200;
                break;
            case "ARCHER":
                magic = 80;
                break;
            default:
                break;
        }
        return magic;
    }
}
