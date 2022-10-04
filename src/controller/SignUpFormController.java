package controller;

import model.Model;
import view.Login;
import view.SignUpForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SignUpFormController {
    public static SignUpForm signUpForm = new SignUpForm("Registrarse");
    public static Model model = LoginController.model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        signUpForm.setSize(650, 350);
        signUpForm.setLocationRelativeTo(null);
        signUpForm.setVisible(true);
        reset();
    }
    public static void end() {
        signUpForm.setVisible(false);
    }

    public static void reset() {
        signUpForm.getUsernameTxt().setText("");
        signUpForm.getPasswordTxt().setText("");
        signUpForm.getPassConfirmedTxt().setText("");
        signUpForm.getAlertLabel().setText("");
        signUpForm.getSignupButton().setEnabled(false);
    }

    // -------------------------------------------------- Functions --------------------------------------------------
    public static boolean confirmedPassword() {
        String password = new String(signUpForm.getPasswordTxt().getPassword());
        String confirmedPass = new String(signUpForm.getPassConfirmedTxt().getPassword());
        if(!password.isEmpty() && !confirmedPass.isEmpty()) {
            if(!password.equals(confirmedPass)) {
                signUpForm.getAlertLabel().setText("Las contraseñas deben ser iguales");
                return false;
            }
            else {
                signUpForm.getAlertLabel().setText("");
                return true;
            }
        }
        else {
            return false;
        }
    }

    public static void enableSignUpBtn() {
        if(confirmedPassword() && !signUpForm.getUsernameTxt().getText().isEmpty()) {
            signUpForm.getSignupButton().setEnabled(true);
        }
        else {
            signUpForm.getSignupButton().setEnabled(false);
        }
    }

    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void signUpBtnClicked() {
        String username = signUpForm.getUsernameTxt().getText();
        String password = new String(signUpForm.getPasswordTxt().getPassword());
        if(model.searchUser(username) == -1) {
            model.registerUser(username, password);
            end();
            LoginController.start();
        }
        else {
            signUpForm.getAlertLabel().setText("Usuario invalido");
        }
    }

    public static void backBtnClicked() {
        end();
        LoginController.start();
    }

}
