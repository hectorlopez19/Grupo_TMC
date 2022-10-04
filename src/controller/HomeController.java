package controller;

import model.*;
import view.Home;

import javax.swing.*;
import java.awt.*;

public class HomeController {
    public static Home home = new Home("Mexico Destination Club");
    public static Model model = LoginController.model;
    public static User actualUser = null;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start(User user) {
        home.setSize(1000, 600);
        home.setLocationRelativeTo(null);
        home.setResizable(false);
        home.setVisible(true);
        actualUser = user;
        showQuotations();
    }
    public static void end() {
        home.setVisible(false);
    }



    // -------------------------------------------------- Functions --------------------------------------------------
    public static String[] strQuotations() {
        String[] quotations = new String[actualUser.getQuotatiosnList().length()];
        for(int i = 0; i < actualUser.getQuotatiosnList().length(); i++) {
            quotations[i] = actualUser.getQuotatiosnList().valueOf(i).getDestination();
        }
        return quotations;
    }

    public static void showQuotations() {
        String[] quotations = strQuotations();
        home.getQuotationsList().setListData(quotations);
    }




    // -------------------------------------------------- Buttons --------------------------------------------------

    public static void quotationBtnClicked() {
        end();
        RegisterFormController.start(actualUser);
    }

    public static void logOutBtnClicked() {
        end();
        LoginController.start();
    }


}
