package view;

import controller.SignUpFormController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SignUpForm extends JFrame {
    private JPanel bgPanel;
    private JPanel logoPanel;
    private JLabel labelLogo;
    private JLabel labelTiger;
    private JPanel loginPanel;
    private JPanel fieldsPanel;
    private JLabel userIconLabel;
    private JPasswordField passwordTxt;
    private JLabel passwordIconLabel;
    private JLabel labelLogin;
    private JTextField usernameTxt;
    private JPanel buttonsPanel;
    private JButton backButton;
    private JButton signupButton;
    private JPasswordField passConfirmedTxt;
    private JLabel passConfirmedIconLabel;
    private JLabel alertLabel;
    private JPanel alertPanel;
    private JPanel headingPanel;
    private JLabel logoLabel;

    public SignUpForm(String title) {
        super(title);
        setContentPane(bgPanel);

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignUpFormController.signUpBtnClicked();
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignUpFormController.backBtnClicked();
            }
        });

        usernameTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                SignUpFormController.enableSignUpBtn();
            }
        });

        passwordTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                SignUpFormController.enableSignUpBtn();
            }
        });

        passConfirmedTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                SignUpFormController.enableSignUpBtn();
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

    public JPanel getLogoPanel() {
        return logoPanel;
    }

    public void setLogoPanel(JPanel logoPanel) {
        this.logoPanel = logoPanel;
    }

    public JLabel getLabelLogo() {
        return labelLogo;
    }

    public void setLabelLogo(JLabel labelLogo) {
        this.labelLogo = labelLogo;
    }

    public JLabel getLabelTiger() {
        return labelTiger;
    }

    public void setLabelTiger(JLabel labelTiger) {
        this.labelTiger = labelTiger;
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public void setLoginPanel(JPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    public JPanel getFieldsPanel() {
        return fieldsPanel;
    }

    public void setFieldsPanel(JPanel fieldsPanel) {
        this.fieldsPanel = fieldsPanel;
    }

    public JLabel getUserIconLabel() {
        return userIconLabel;
    }

    public void setUserIconLabel(JLabel userIconLabel) {
        this.userIconLabel = userIconLabel;
    }

    public JPasswordField getPasswordTxt() {
        return passwordTxt;
    }

    public void setPasswordTxt(JPasswordField passwordTxt) {
        this.passwordTxt = passwordTxt;
    }

    public JLabel getPasswordIconLabel() {
        return passwordIconLabel;
    }

    public void setPasswordIconLabel(JLabel passwordIconLabel) {
        this.passwordIconLabel = passwordIconLabel;
    }

    public JLabel getLabelLogin() {
        return labelLogin;
    }

    public void setLabelLogin(JLabel labelLogin) {
        this.labelLogin = labelLogin;
    }

    public JTextField getUsernameTxt() {
        return usernameTxt;
    }

    public void setUsernameTxt(JTextField usernameTxt) {
        this.usernameTxt = usernameTxt;
    }

    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }

    public void setButtonsPanel(JPanel buttonsPanel) {
        this.buttonsPanel = buttonsPanel;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JButton getSignupButton() {
        return signupButton;
    }

    public void setSignupButton(JButton signupButton) {
        this.signupButton = signupButton;
    }

    public JPasswordField getPassConfirmedTxt() {
        return passConfirmedTxt;
    }

    public void setPassConfirmedTxt(JPasswordField passConfirmedTxt) {
        this.passConfirmedTxt = passConfirmedTxt;
    }

    public JLabel getPassConfirmedIconLabel() {
        return passConfirmedIconLabel;
    }

    public void setPassConfirmedIconLabel(JLabel passConfirmedIconLabel) {
        this.passConfirmedIconLabel = passConfirmedIconLabel;
    }

    public JLabel getAlertLabel() {
        return alertLabel;
    }

    public void setAlertLabel(JLabel alertLabel) {
        this.alertLabel = alertLabel;
    }
}
