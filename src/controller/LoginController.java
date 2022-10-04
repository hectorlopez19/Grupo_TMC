package controller;

import view.*;
import model.*;

public class LoginController {
    public static Login login = new Login("Inicio de sesion");
    public static Model model = new Model();

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        login.setSize(650, 350);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        reset();
    }

    public static void end() {
        login.setVisible(false);
    }

    public static void reset() {
        login.getUsernameTxt().setText("");
        login.getPaswordTxt().setText("");
        login.getAlertLabel().setText("");
    }

    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void loginBtnClicked() {
        String username = login.getUsernameTxt().getText();
        String password = new String(login.getPaswordTxt().getPassword());
        int index = model.searchUser(username);
        if(index != -1) {
            User actualUser = model.loginUser(index, password);
            if(actualUser != null) {
                end();
                HomeController.start(actualUser);
            }
            else {
                login.getAlertLabel().setText("Contraseña incorrecta");
            }
        }
        else {
            login.getAlertLabel().setText("Usuario incorrecto");
        }

    }

    public static void signUpBtnClicked() {
        end();
        SignUpFormController.start();
    }

    public static void exitBtnClicked() {
        ExitAlertController.start();
    }

}
