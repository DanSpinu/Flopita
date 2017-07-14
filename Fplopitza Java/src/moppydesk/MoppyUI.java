/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moppydesk;

import org.jdesktop.application.SingleFrameApplication;

/**
 *
 * 
 */
public class MoppyUI extends SingleFrameApplication{

    MoppySequencer ms = null;
    
    @Override
    protected void startup() {
        MoppyMainWindow mainWindow = new MoppyMainWindow(this);
        show(mainWindow);
    }
    
     /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(MoppyUI.class, args);
    }
    
}
