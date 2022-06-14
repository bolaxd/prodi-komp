/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Menu extends Hero {
    public Menu() {
        
    }
    
    public void inputName() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        this.setHeroName(name);
    }
    
    public void inputJobName() {
        Scanner input = new Scanner(System.in);
        String jobNameIndex = input.nextLine();
        String jobName = "";
        System.out.println(jobNameIndex);
        if (null != jobNameIndex) switch (jobNameIndex) {
            case "1":
                jobName = "KNIGHT";
                break;
            case "2":
                jobName = "ARCHER";
                break;
            case "3":
                jobName = "WIZARD";
                break;
            default:
                System.out.println("INPUT INVALID!");
                this.start();
                break;
        }
        this.setJobName(jobName);
    }
    
    public String showJobNameMenu() {
        return "1) KNIGHT\n2) ARCHER\n3) WIZARD\nPILIH JOB [1/2/3]  : ";
    }
    
    public void showHeroStatus() {
        Weapon weapon = new Weapon(this.getJobName());
        Poin poin = new Poin(this.getJobName());
        Ability ability = new Ability(this.getJobName());
        
        this.setWeapon(weapon.getWeaponGen());
        this.setHealth(poin.getHealthGen());
        this.setMagic(poin.getMagicGen());
        this.setPower(ability.getPowerGen());
        this.setDefend(ability.getDefendGen());

        
        System.out.println("TAMPIL STATUS HERO");
        System.out.println("=================================");
        System.out.println("Nama Character  : " + this.getHeroName());
        System.out.println("Level Character : " + this.getLevel());
        System.out.println("Nama JOB        : " + this.getJobName());
        System.out.println("Weapon JOB      : " + this.getWeapon());
        System.out.println("Health Poin     : " + this.getHealth());
        System.out.println("Magic Poin      : " + this.getMagic());
        System.out.println("Power           : " + this.getPower());
        System.out.println("Defend          : " + this.getDefend());
    }
    
    public void breakLine(int length) {
        String breakStr = "";
        for (int i = 0; i < length; i++) {
            breakStr += "\n";
        }
        System.out.println(breakStr);
    }
    
    @Override
    public void start() {
        System.out.println("CREATE CHARACTER GAME ANDA");
        System.out.println("==========================");
        System.out.print("Masukan Nama Character Anda : ");
        this.inputName();
        System.out.println("Pilih JOB CHARACTER Anda : ");
        System.out.print(this.showJobNameMenu());
        this.inputJobName();
        this.breakLine(2);
        this.showHeroStatus();
        this.attackInfo();
    }
}
