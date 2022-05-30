import BackEnd.GUI.backend;
import Tools.Utils;

import javax.swing.*;

// import javax.swing.JFrame;
public class EnterBackEnd {
    public static void main(String[] args){
        Utils.updateTestData();
        //to invoke the class directly
        backend B = new backend();
        B.setVisible(true);
        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
