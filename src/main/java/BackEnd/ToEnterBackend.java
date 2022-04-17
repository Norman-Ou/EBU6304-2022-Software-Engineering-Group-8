package BackEnd;

import BackEnd.GUI.backend;

import javax.swing.*;

// import javax.swing.JFrame;
public class ToEnterBackend {
    public static void main(String[] args){
        //to invoke the class directly
        backend B = new backend();
        B.setVisible(true);
        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
