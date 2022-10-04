package view;

import controller.HomeController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
    private JPanel bgPanel;
    private JPanel headerPanel;
    private JPanel quotationsPanel;
    private JLabel headerLabel;
    private JLabel sloganLabel;
    private JPanel headingPanel;
    private JPanel buttonsPanel;
    private JButton reserveButton;
    private JButton quotationButton;
    private JLabel headerImageLabek;
    private JPanel savedQuotationsPanel;
    private JLabel savedQuotationsLabel;
    private JList quotationsList;
    private JButton logOutButton;
    private JPanel quotationInfoPanel;


    public Home(String title) {
        super(title);
        setContentPane(bgPanel);

        quotationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomeController.quotationBtnClicked();
            }
        });

        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomeController.logOutBtnClicked();
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

    public JPanel getHeaderPanel() {
        return headerPanel;
    }

    public void setHeaderPanel(JPanel headerPanel) {
        this.headerPanel = headerPanel;
    }

    public JPanel getQuotationsPanel() {
        return quotationsPanel;
    }

    public void setQuotationsPanel(JPanel quotationsPanel) {
        this.quotationsPanel = quotationsPanel;
    }

    public JLabel getHeaderLabel() {
        return headerLabel;
    }

    public void setHeaderLabel(JLabel headerLabel) {
        this.headerLabel = headerLabel;
    }

    public JLabel getSloganLabel() {
        return sloganLabel;
    }

    public void setSloganLabel(JLabel sloganLabel) {
        this.sloganLabel = sloganLabel;
    }

    public JPanel getHeadingPanel() {
        return headingPanel;
    }

    public void setHeadingPanel(JPanel headingPanel) {
        this.headingPanel = headingPanel;
    }

    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }

    public void setButtonsPanel(JPanel buttonsPanel) {
        this.buttonsPanel = buttonsPanel;
    }

    public JButton getReserveButton() {
        return reserveButton;
    }

    public void setReserveButton(JButton reserveButton) {
        this.reserveButton = reserveButton;
    }

    public JButton getQuotationButton() {
        return quotationButton;
    }

    public void setQuotationButton(JButton quotationButton) {
        this.quotationButton = quotationButton;
    }

    public JLabel getHeaderImageLabek() {
        return headerImageLabek;
    }

    public void setHeaderImageLabek(JLabel headerImageLabek) {
        this.headerImageLabek = headerImageLabek;
    }

    public JPanel getSavedQuotationsPanel() {
        return savedQuotationsPanel;
    }

    public void setSavedQuotationsPanel(JPanel savedQuotationsPanel) {
        this.savedQuotationsPanel = savedQuotationsPanel;
    }

    public JLabel getSavedQuotationsLabel() {
        return savedQuotationsLabel;
    }

    public void setSavedQuotationsLabel(JLabel savedQuotationsLabel) {
        this.savedQuotationsLabel = savedQuotationsLabel;
    }

    public JList getQuotationsList() {
        return quotationsList;
    }

    public void setQuotationsList(JList list1) {
        this.quotationsList = list1;
    }

    public JButton getLogOutButton() {
        return logOutButton;
    }

    public void setLogOutButton(JButton logOutButton) {
        this.logOutButton = logOutButton;
    }
}