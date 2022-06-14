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
public class ActionController extends Hero {

    public ActionController() {
    }
    
    @Override
    public String attackInfo() {
        return "Hero menyerang musuh menggunakan " + this.getWeapon() + " Dengan Power " + this.getPower();
    } 
}
