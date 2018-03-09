/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird{
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    
    public void helpOtherGooseSwim() {
        Bird birdGoose = new Goose();
        birdGoose.floatInWater();
//        System.out.println(other.text);
        
    }  

    public Goose() {
    }
    
    
}
