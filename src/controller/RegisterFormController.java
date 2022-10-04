package controller;

import model.*;
import model.User;
import view.RegisterForm;

import javax.swing.*;
import java.util.Arrays;

public class RegisterFormController {
    public static RegisterForm registerForm = new RegisterForm("Cotizacion");
    public static Model model = LoginController.model;
    public static User actualUser = null;
    public static int days = 0;
    public static double destinationPrice = 0;
    public static double roomPrice = 0;


    // -------------------------------------------------- Start / End / reset --------------------------------------------------
    public static void start(User user) {
        registerForm.setSize(1000, 600);
        registerForm.setLocationRelativeTo(null);
        registerForm.setResizable(false);
        registerForm.setVisible(true);
        actualUser = user;
        reset();
        showQuotation();
    }

    public static void end() {
        registerForm.setVisible(false);
    }

    public static void resetInfo() {
        registerForm.getDaysTxt().setText("");
        registerForm.getDestinationRadios().clearSelection();
        registerForm.getRoomRadios().clearSelection();
        registerForm.getPaymentMethodRadios().clearSelection();
        registerForm.getRoomImageLabel().setIcon(new ImageIcon("src/view/img/logo-club.png"));
        days = 0;
        destinationPrice = 0;
        roomPrice = 0;
    }

    public static void resetAlerts() {
        registerForm.getDaysAlertLabel().setVisible(false);
        registerForm.getDestinationAlertLabel().setVisible(false);
        registerForm.getRoomAlertLabel().setVisible(false);
        registerForm.getPaymentMethodAlertLabel().setVisible(false);
    }

    public static void reset() {
        resetInfo();
        resetAlerts();
    }

    // -------------------------------------------------- Functions --------------------------------------------------
    public static void showQuotation() {
        double subtotal = days * destinationPrice + days * roomPrice;
        double iva = subtotal * 0.16;
        double total = subtotal + iva;
        registerForm.getSubtotalLabel().setText("Subtotal: " + subtotal);
        registerForm.getIvaLabel().setText("IVA: " + iva);
        registerForm.getTotalLabel().setText("Total: " + total);
    }

    public static String destinationSelected() {
        String destination = null;
        if(registerForm.getPlayaRadio().isSelected()) {
            destination = "Playa del carmen";
        }
        if(registerForm.getChapalaRadio().isSelected()) {
            destination = "Chapala";
        }
        if(registerForm.getEcatepecRadio().isSelected()) {
            destination = "Ecatepec";
        }
        if(registerForm.getCabosRadio().isSelected()) {
            destination = "Los Cabos";
        }
        if(registerForm.getZasdentroRadio().isSelected()) {
            destination = "Lago Zasdentro";
        }
        destinationPrice = model.destinationPrice(1, destination);
        showQuotation();
        return destination;
    }

    public static String roomKindSelected() {
        String roomKind;
        if(registerForm.getRegularRoomRadio().isSelected()) {
            registerForm.getRoomImageLabel().setIcon(new ImageIcon("src/view/img/simpleRoom.png"));
            roomKind = "Sencilla";
        }
        else if(registerForm.getDoubleRoomRadio().isSelected()) {
            registerForm.getRoomImageLabel().setIcon(new ImageIcon("src/view/img/doubleRoom.png"));
            roomKind = "Doble";
        }
        else if(registerForm.getSuiteRoomRadio().isSelected()) {
            registerForm.getRoomImageLabel().setIcon(new ImageIcon("src/view/img/suiteRoom.png"));
            roomKind = "Suite";
        }
        else {
            roomKind = null;
        }
        roomPrice = model.roomPrice(1, roomKind);
        showQuotation();
        return roomKind;
    }

    public static String payMethodSelected() {
        if(registerForm.getOnePaymentRadio().isSelected()) {
            return "Pago unico";
        }
        else if(registerForm.getMonthlyPaymentRadio().isSelected()) {
            return "6 meses";
        }
        else {
            return null;
        }
    }

    public static boolean correctInfo() {
        boolean correct = false;
        if(registerForm.getDaysTxt().getText().isEmpty()) {
            registerForm.getDaysAlertLabel().setVisible(true);
            correct = false;
        }
        else {
            registerForm.getDaysAlertLabel().setVisible(false);
            correct = true;
        }
        if(registerForm.getDestinationRadios().getSelection() == null) {
            registerForm.getDestinationAlertLabel().setVisible(true);
            correct = false;
        }
        else {
            registerForm.getDestinationAlertLabel().setVisible(false);
            correct = true;
        }
        if(registerForm.getRoomRadios().getSelection() == null) {
            registerForm.getRoomAlertLabel().setVisible(true);
            correct = false;
        }
        else {
            registerForm.getRoomAlertLabel().setVisible(false);
            correct = true;
        }
        if(registerForm.getPaymentMethodRadios().getSelection() == null) {
            registerForm.getPaymentMethodAlertLabel().setVisible(true);
            correct = false;
        }
        else {
            registerForm.getPaymentMethodAlertLabel().setVisible(false);
            correct = true;
        }
        return correct;
    }

    // -------------------------------------------------- Fields --------------------------------------------------
    public static void daysEntered() {
        if(!registerForm.getDaysTxt().getText().isEmpty()) {
            days = Integer.parseInt(registerForm.getDaysTxt().getText());
            showQuotation();
        }
    }

    // -------------------------------------------------- Buttons --------------------------------------------------
    public static void saveBtnClicked() {
        if(correctInfo()) {
            int days = Integer.parseInt(registerForm.getDaysTxt().getText());
            String destination = destinationSelected();
            String roomKind = roomKindSelected();
            String payMethod = payMethodSelected();
            double subtotal = model.calcSubtotal(days, destination, roomKind);
            model.registerQuotation(actualUser, days, destination, roomKind, payMethod, subtotal);
            end();
            HomeController.start(actualUser);
        }
    }

    public static void backBtnClicked() {
        end();
        HomeController.start(actualUser);
    }

    public static void cleanBtnClicked() {
        reset();
    }
}
