package controller;

import view.ExitAlert;

public class ExitAlertController {
    public static ExitAlert exitAlert = new ExitAlert("Exit");

    public static void start() {
        exitAlert.setSize(300, 150);
        exitAlert.setLocationRelativeTo(null);
        exitAlert.setVisible(true);
    }

    public static void end() {
        exitAlert.setVisible(false);
    }

    public static void exitBtnClicked() {
        System.exit(0);
    }

    public static void cancelBtnClicked() {
        end();
    }
}
