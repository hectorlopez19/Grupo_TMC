package view;

import controller.RegisterFormController;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class RegisterForm extends JFrame {
    private JPanel bgPanel;
    private JPanel daysPanel;
    private JPanel daysAlertPanel;
    private JLabel daysAlertLabel;
    private JLabel daysLabel;
    private JTextField daysTxt;
    private JPanel destinationPanel;
    private JPanel destinationAlertPanel;
    private JLabel destinationAlertLabel;
    private JPanel destinationInputPanel;
    private JLabel destinationLabel;
    private JRadioButton playaRadio;
    private JLabel playaPriceLabel;
    private JRadioButton chapalaRadio;
    private JLabel chapalaPriceLabel;
    private JRadioButton ecatepecRadio;
    private JLabel ecatepecPriceLabel;
    private JRadioButton cabosRadio;
    private JLabel cabosPriceLabel;
    private JRadioButton zasdentroRadio;
    private JLabel zasdentroPriceLabel;
    private JPanel roomPanel;
    private JPanel roomAlertPanel;
    private JLabel roomAlertLabel;
    private JPanel roomInputPanel;
    private JLabel roomLabel;
    private JLabel roomImageLabel;
    private JPanel roomSelectionPanel;
    private JRadioButton regularRoomRadio;
    private JLabel regularRoomPriceLabel;
    private JRadioButton doubleRoomRadio;
    private JLabel doubleRoomPriceLabel;
    private JRadioButton suiteRoomRadio;
    private JLabel suiteRoomPriceLabel;
    private JPanel paymentMethodPanel;
    private JPanel paymentMethodAlertPanel;
    private JLabel paymentMethodAlertLabel;
    private JPanel paymentMethodInputPanel;
    private JLabel paymentMethodLabel;
    private JRadioButton onePaymentRadio;
    private JRadioButton monthlyPaymentRadio;
    private JSeparator separator;
    private JPanel quotationPanel;
    private JLabel quotationLabel;
    private JPanel quotationOutputPanel;
    private JLabel subtotalLabel;
    private JLabel ivaLabel;
    private JLabel totalLabel;
    private JPanel buttonsPanel;
    private JButton backButton;
    private JButton cleanButton;
    private JButton saveButton;
    private ButtonGroup destinationRadios;
    private ButtonGroup roomRadios;
    private ButtonGroup paymentMethodRadios;


    public RegisterForm(String title) {
        super(title);
        setContentPane(bgPanel);

        destinationRadios = new ButtonGroup();
        destinationRadios.add(playaRadio);
        destinationRadios.add(chapalaRadio);
        destinationRadios.add(ecatepecRadio);
        destinationRadios.add(cabosRadio);
        destinationRadios.add(zasdentroRadio);

        roomRadios = new ButtonGroup();
        roomRadios.add(regularRoomRadio);
        roomRadios.add(doubleRoomRadio);
        roomRadios.add(suiteRoomRadio);

        paymentMethodRadios = new ButtonGroup();
        paymentMethodRadios.add(onePaymentRadio);
        paymentMethodRadios.add(monthlyPaymentRadio);

        playaRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.destinationSelected();
            }
        });
        chapalaRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.destinationSelected();
            }
        });
        ecatepecRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.destinationSelected();
            }
        });
        cabosRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.destinationSelected();
            }
        });
        zasdentroRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.destinationSelected();
            }
        });

        regularRoomRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.roomKindSelected();
            }
        });
        doubleRoomRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.roomKindSelected();
            }
        });
        suiteRoomRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.roomKindSelected();
            }
        });


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.saveBtnClicked();
            }
        });

        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.cleanBtnClicked();
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFormController.backBtnClicked();
            }
        });
        daysTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                RegisterFormController.daysEntered();
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

    public JPanel getDaysPanel() {
        return daysPanel;
    }

    public void setDaysPanel(JPanel daysPanel) {
        this.daysPanel = daysPanel;
    }

    public JPanel getDaysAlertPanel() {
        return daysAlertPanel;
    }

    public void setDaysAlertPanel(JPanel daysAlertPanel) {
        this.daysAlertPanel = daysAlertPanel;
    }

    public JLabel getDaysAlertLabel() {
        return daysAlertLabel;
    }

    public void setDaysAlertLabel(JLabel daysAlertLabel) {
        this.daysAlertLabel = daysAlertLabel;
    }

    public JLabel getDaysLabel() {
        return daysLabel;
    }

    public void setDaysLabel(JLabel daysLabel) {
        this.daysLabel = daysLabel;
    }

    public JTextField getDaysTxt() {
        return daysTxt;
    }

    public void setDaysTxt(JTextField daysTxt) {
        this.daysTxt = daysTxt;
    }

    public JPanel getDestinationPanel() {
        return destinationPanel;
    }

    public void setDestinationPanel(JPanel destinationPanel) {
        this.destinationPanel = destinationPanel;
    }

    public JPanel getDestinationAlertPanel() {
        return destinationAlertPanel;
    }

    public void setDestinationAlertPanel(JPanel destinationAlertPanel) {
        this.destinationAlertPanel = destinationAlertPanel;
    }

    public JLabel getDestinationAlertLabel() {
        return destinationAlertLabel;
    }

    public void setDestinationAlertLabel(JLabel destinationAlertLabel) {
        this.destinationAlertLabel = destinationAlertLabel;
    }

    public JPanel getDestinationInputPanel() {
        return destinationInputPanel;
    }

    public void setDestinationInputPanel(JPanel destinationInputPanel) {
        this.destinationInputPanel = destinationInputPanel;
    }

    public JLabel getDestinationLabel() {
        return destinationLabel;
    }

    public void setDestinationLabel(JLabel destinationLabel) {
        this.destinationLabel = destinationLabel;
    }

    public JRadioButton getPlayaRadio() {
        return playaRadio;
    }

    public void setPlayaRadio(JRadioButton playaRadio) {
        this.playaRadio = playaRadio;
    }

    public JLabel getPlayaPriceLabel() {
        return playaPriceLabel;
    }

    public void setPlayaPriceLabel(JLabel playaPriceLabel) {
        this.playaPriceLabel = playaPriceLabel;
    }

    public JRadioButton getChapalaRadio() {
        return chapalaRadio;
    }

    public void setChapalaRadio(JRadioButton chapalaRadio) {
        this.chapalaRadio = chapalaRadio;
    }

    public JLabel getChapalaPriceLabel() {
        return chapalaPriceLabel;
    }

    public void setChapalaPriceLabel(JLabel chapalaPriceLabel) {
        this.chapalaPriceLabel = chapalaPriceLabel;
    }

    public JRadioButton getEcatepecRadio() {
        return ecatepecRadio;
    }

    public void setEcatepecRadio(JRadioButton ecatepecRadio) {
        this.ecatepecRadio = ecatepecRadio;
    }

    public JLabel getEcatepecPriceLabel() {
        return ecatepecPriceLabel;
    }

    public void setEcatepecPriceLabel(JLabel ecatepecPriceLabel) {
        this.ecatepecPriceLabel = ecatepecPriceLabel;
    }

    public JRadioButton getCabosRadio() {
        return cabosRadio;
    }

    public void setCabosRadio(JRadioButton cabosRadio) {
        this.cabosRadio = cabosRadio;
    }

    public JLabel getCabosPriceLabel() {
        return cabosPriceLabel;
    }

    public void setCabosPriceLabel(JLabel cabosPriceLabel) {
        this.cabosPriceLabel = cabosPriceLabel;
    }

    public JRadioButton getZasdentroRadio() {
        return zasdentroRadio;
    }

    public void setZasdentroRadio(JRadioButton zasdentroRadio) {
        this.zasdentroRadio = zasdentroRadio;
    }

    public JLabel getZasdentroPriceLabel() {
        return zasdentroPriceLabel;
    }

    public void setZasdentroPriceLabel(JLabel zasdentroPriceLabel) {
        this.zasdentroPriceLabel = zasdentroPriceLabel;
    }

    public JPanel getRoomPanel() {
        return roomPanel;
    }

    public void setRoomPanel(JPanel roomPanel) {
        this.roomPanel = roomPanel;
    }

    public JPanel getRoomAlertPanel() {
        return roomAlertPanel;
    }

    public void setRoomAlertPanel(JPanel roomAlertPanel) {
        this.roomAlertPanel = roomAlertPanel;
    }

    public JLabel getRoomAlertLabel() {
        return roomAlertLabel;
    }

    public void setRoomAlertLabel(JLabel roomAlertLabel) {
        this.roomAlertLabel = roomAlertLabel;
    }

    public JPanel getRoomInputPanel() {
        return roomInputPanel;
    }

    public void setRoomInputPanel(JPanel roomInputPanel) {
        this.roomInputPanel = roomInputPanel;
    }

    public JLabel getRoomLabel() {
        return roomLabel;
    }

    public void setRoomLabel(JLabel roomLabel) {
        this.roomLabel = roomLabel;
    }

    public JLabel getRoomImageLabel() {
        return roomImageLabel;
    }

    public void setRoomImageLabel(JLabel roomImageLabel) {
        this.roomImageLabel = roomImageLabel;
    }

    public JPanel getRoomSelectionPanel() {
        return roomSelectionPanel;
    }

    public void setRoomSelectionPanel(JPanel roomSelectionPanel) {
        this.roomSelectionPanel = roomSelectionPanel;
    }

    public JRadioButton getRegularRoomRadio() {
        return regularRoomRadio;
    }

    public void setRegularRoomRadio(JRadioButton regularRoomRadio) {
        this.regularRoomRadio = regularRoomRadio;
    }

    public JLabel getRegularRoomPriceLabel() {
        return regularRoomPriceLabel;
    }

    public void setRegularRoomPriceLabel(JLabel regularRoomPriceLabel) {
        this.regularRoomPriceLabel = regularRoomPriceLabel;
    }

    public JRadioButton getDoubleRoomRadio() {
        return doubleRoomRadio;
    }

    public void setDoubleRoomRadio(JRadioButton doubleRoomRadio) {
        this.doubleRoomRadio = doubleRoomRadio;
    }

    public JLabel getDoubleRoomPriceLabel() {
        return doubleRoomPriceLabel;
    }

    public void setDoubleRoomPriceLabel(JLabel doubleRoomPriceLabel) {
        this.doubleRoomPriceLabel = doubleRoomPriceLabel;
    }

    public JRadioButton getSuiteRoomRadio() {
        return suiteRoomRadio;
    }

    public void setSuiteRoomRadio(JRadioButton suiteRoomRadio) {
        this.suiteRoomRadio = suiteRoomRadio;
    }

    public JLabel getSuiteRoomPriceLabel() {
        return suiteRoomPriceLabel;
    }

    public void setSuiteRoomPriceLabel(JLabel suiteRoomPriceLabel) {
        this.suiteRoomPriceLabel = suiteRoomPriceLabel;
    }

    public JPanel getPaymentMethodPanel() {
        return paymentMethodPanel;
    }

    public void setPaymentMethodPanel(JPanel paymentMethodPanel) {
        this.paymentMethodPanel = paymentMethodPanel;
    }

    public JPanel getPaymentMethodAlertPanel() {
        return paymentMethodAlertPanel;
    }

    public void setPaymentMethodAlertPanel(JPanel paymentMethodAlertPanel) {
        this.paymentMethodAlertPanel = paymentMethodAlertPanel;
    }

    public JLabel getPaymentMethodAlertLabel() {
        return paymentMethodAlertLabel;
    }

    public void setPaymentMethodAlertLabel(JLabel paymentMethodAlertLabel) {
        this.paymentMethodAlertLabel = paymentMethodAlertLabel;
    }

    public JPanel getPaymentMethodInputPanel() {
        return paymentMethodInputPanel;
    }

    public void setPaymentMethodInputPanel(JPanel paymentMethodInputPanel) {
        this.paymentMethodInputPanel = paymentMethodInputPanel;
    }

    public JLabel getPaymentMethodLabel() {
        return paymentMethodLabel;
    }

    public void setPaymentMethodLabel(JLabel paymentMethodLabel) {
        this.paymentMethodLabel = paymentMethodLabel;
    }

    public JRadioButton getOnePaymentRadio() {
        return onePaymentRadio;
    }

    public void setOnePaymentRadio(JRadioButton onePaymentRadio) {
        this.onePaymentRadio = onePaymentRadio;
    }

    public JRadioButton getMonthlyPaymentRadio() {
        return monthlyPaymentRadio;
    }

    public void setMonthlyPaymentRadio(JRadioButton monthlyPaymentRadio) {
        this.monthlyPaymentRadio = monthlyPaymentRadio;
    }

    public JSeparator getSeparator() {
        return separator;
    }

    public void setSeparator(JSeparator separator) {
        this.separator = separator;
    }

    public JPanel getQuotationPanel() {
        return quotationPanel;
    }

    public void setQuotationPanel(JPanel quotationPanel) {
        this.quotationPanel = quotationPanel;
    }

    public JLabel getQuotationLabel() {
        return quotationLabel;
    }

    public void setQuotationLabel(JLabel quotationLabel) {
        this.quotationLabel = quotationLabel;
    }

    public JPanel getQuotationOutputPanel() {
        return quotationOutputPanel;
    }

    public void setQuotationOutputPanel(JPanel quotationOutputPanel) {
        this.quotationOutputPanel = quotationOutputPanel;
    }

    public JLabel getSubtotalLabel() {
        return subtotalLabel;
    }

    public void setSubtotalLabel(JLabel subtotalLabel) {
        this.subtotalLabel = subtotalLabel;
    }

    public JLabel getIvaLabel() {
        return ivaLabel;
    }

    public void setIvaLabel(JLabel ivaLabel) {
        this.ivaLabel = ivaLabel;
    }

    public JLabel getTotalLabel() {
        return totalLabel;
    }

    public void setTotalLabel(JLabel totalLabel) {
        this.totalLabel = totalLabel;
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

    public JButton getCleanButton() {
        return cleanButton;
    }

    public void setCleanButton(JButton cleanButton) {
        this.cleanButton = cleanButton;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;

    }

    public ButtonGroup getDestinationRadios() {
        return destinationRadios;
    }

    public void setDestinationRadios(ButtonGroup destinationRadios) {
        this.destinationRadios = destinationRadios;
    }

    public ButtonGroup getRoomRadios() {
        return roomRadios;
    }

    public void setRoomRadios(ButtonGroup roomRadios) {
        this.roomRadios = roomRadios;
    }

    public ButtonGroup getPaymentMethodRadios() {
        return paymentMethodRadios;
    }

    public void setPaymentMethodRadios(ButtonGroup paymentMethodRadios) {
        this.paymentMethodRadios = paymentMethodRadios;
    }
}