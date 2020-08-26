/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author Beer
 */
public class MyFacade {
    private static MyFacade myFacadeObj = null;
        private MyFacade() {}
        public static MyFacade getMyFacadeObject() {
            if (myFacadeObj == null) {
                myFacadeObj = new MyFacade();
            } 
            return myFacadeObj;
        }
        public void startserver() {
            ScheduleServer obj = new ScheduleServer();
            obj.startBooting();
            obj.readSystemConfigFile();
            obj.init();
            obj.initializeContext();
            obj.initializeListeners();
            obj.createSystemObjects();
        }
        public void stopserver() {
            ScheduleServer obj = new ScheduleServer();
            obj.releaseProcesses();
            obj.destory();
            obj.destroySystemObjects();
            obj.destoryListeners();
            obj.destoryContext();
            obj.shutdown();
        }
}
