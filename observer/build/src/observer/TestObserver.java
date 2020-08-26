/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;
import java.util.Observer;
/**
 *
 * @author user
 */
public class TestObserver {
    public static void main(String[] args) {
        
        Observer obj = new MyObserver();
        Observer obj1 = new Senior();
        Observer obj2 = new Marketing();
        Source observable = new Source();

        observable.addObserver(obj);
        observable.addObserver(obj1);
        observable.addObserver(obj2);
        observable.setA(6);
	observable.setA(7);
    }
}
