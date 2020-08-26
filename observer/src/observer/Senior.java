/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;

/**
 *
 * @author sarun
 */
public class Senior extends MyObserver {
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(((Source)o).getA());
      }

}
