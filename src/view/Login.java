package view;

import controller.LoginController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel bgPanel;
    private JPasswordField paswordTxt;
    private JLabel userIconLabel;
    private JLabel passwordIconLabel;
    private JPanel fieldsPanel;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JPanel buttonsPanel;
    private JButton exitButton;
    private JButton loginButton;
    private JLabel loginLabel;
    private JTextField usernameTxt;
    private JLabel logoLabel;
    private JLabel tigerLabel;
    private JButton signUpButton;
    private JLabel alertLabel;
    private JPanel headingPanel;
    private JPanel alertPanel;

    public Login(String title) {
        super(title);
        setContentPane(bgPanel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginController.loginBtnClicked();
            }
        });

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginController.signUpBtnClicked();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginController.exitBtnClicked();
            }
        });

    }


    // ------------------------------ Getter and Setters ------------------------------

    public JPanel getBgPanel() {
        return bgPanel;
    }

    public void setBgPanel(JPanel bgPanel) {
        this.bgPanel = bgPanel;
    }

    public JPasswordField getPaswordTxt() {
        return paswordTxt;
    }

    public void setPaswordTxt(JPasswordField paswordTxt) {
        this.paswordTxt = paswordTxt;
    }

    public JLabel getUserIconLabel() {
        return userIconLabel;
    }

    public void setUserIconLabel(JLabel userIconLabel) {
        this.userIconLabel = userIconLabel;
    }

    public JLabel getPasswordIconLabel() {
        return passwordIconLabel;
    }

    public void setPasswordIconLabel(JLabel passwordIconLabel) {
        this.passwordIconLabel = passwordIconLabel;
    }

    public JPanel getFieldsPanel() {
        return fieldsPanel;
    }

    public void setFieldsPanel(JPanel fieldsPanel) {
        this.fieldsPanel = fieldsPanel;
    }

    public JPanel getLogoPanel() {
        return logoPanel;
    }

    public void setLogoPanel(JPanel logoPanel) {
        this.logoPanel = logoPanel;
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public void setLoginPanel(JPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }

    public void setButtonsPanel(JPanel buttonsPanel) {
        this.buttonsPanel = buttonsPanel;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public void setExitButton(JButton exitButton) {
        this.exitButton = exitButton;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JLabel getLoginLabel() {
        return loginLabel;
    }

    public void setLoginLabel(JLabel loginLabel) {
        this.loginLabel = loginLabel;
    }

    public JTextField getUsernameTxt() {
        return usernameTxt;
    }

    public void setUsernameTxt(JTextField usernameTxt) {
        this.usernameTxt = usernameTxt;
    }

    public JLabel getLogoLabel() {
        return logoLabel;
    }

    public void setLogoLabel(JLabel logoLabel) {
        this.logoLabel = logoLabel;
    }

    public JLabel getTigerLabel() {
        return tigerLabel;
    }

    public void setTigerLabel(JLabel tigerLabel) {
        this.tigerLabel = tigerLabel;
    }

    public JButton getSignUpButton() {
        return signUpButton;
    }

    public void setSignUpButton(JButton signUpButton) {
        this.signUpButton = signUpButton;
    }

    public JLabel getAlertLabel() {
        return alertLabel;
    }

    public void setAlertLabel(JLabel alertLabel) {
        this.alertLabel = alertLabel;
    }
}
