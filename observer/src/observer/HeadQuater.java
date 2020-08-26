/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class HeadQuater extends Source {
    private final ArrayList<MyObserver> list;
    private int someData;

    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setSomeData(int aData) {
	someData = aData;
	notifyObservers();
    }
    public int getSomeData() {
	return someData;
    }
    public void register (MyObserver observer) {
        list.add(observer);
    }
   
}