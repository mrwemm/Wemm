/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pond.swan;

import pond.shore.Bird;

public class Swan extends Bird{
    public void swim() {
        floatInWater();
        System.out.println(text);
    }
    
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }
    
    public void helpOtherBirdSwim() {
        Bird other = new Bird();
//        other.floatInWater();
//        System.out.println(other.text);
    }
}
