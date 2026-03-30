package _4_FoodOrderingSystem;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        setTitle("Food Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(370, 360);
        setLocationRelativeTo(null);
        setResizable(false);
        // Code below, don't touch above.

        JPanel MainFrame = new JPanel();
        MainFrame.setBackground(new Color(214, 216, 224));
        MainFrame.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
        MainFrame.setBorder(BorderFactory.createLineBorder(Color.black));
        add(MainFrame);

        JLabel emptyHeader = new JLabel("");
        emptyHeader.setPreferredSize(new Dimension(368, 25));
        emptyHeader.setBackground(new Color(214, 216, 224));
        emptyHeader.setOpaque(true);
        MainFrame.add(emptyHeader);

        JLabel foods = new JLabel("Foods");
        foods.setHorizontalAlignment(SwingConstants.CENTER);
        foods.setVerticalAlignment(SwingConstants.CENTER);
        foods.setFont(new Font("Arial", Font.BOLD, 17));
        foods.setPreferredSize(new Dimension(185, 50));
        foods.setBackground(new Color(214, 216, 224));
        foods.setOpaque(true);
        MainFrame.add(foods);

        JLabel discount = new JLabel("Discounts");
        discount.setHorizontalAlignment(SwingConstants.CENTER);
        discount.setVerticalAlignment(SwingConstants.CENTER);
        discount.setFont(new Font("Arial", Font.BOLD, 17));
        discount.setPreferredSize(new Dimension(183, 50));
        discount.setBackground(new Color(214, 216, 224));
        discount.setOpaque(true);
        MainFrame.add(discount);

        // PITSA ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        JPanel emptyLeft1 = new JPanel();
        emptyLeft1.setPreferredSize(new Dimension(35, 30));
        emptyLeft1.setBackground(new Color(214, 216, 224));
        MainFrame.add(emptyLeft1);

        JCheckBox cPizza = new JCheckBox("Pizza");
        cPizza.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        cPizza.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panelPizza = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelPizza.setPreferredSize(new Dimension(115, 30));
        panelPizza.setBackground(new Color(214, 216, 224));
        panelPizza.add(cPizza);
        MainFrame.add(panelPizza);

        JLabel pizzaPrice = new JLabel("Php 100");
        pizzaPrice.setPreferredSize(new Dimension(85, 30));
        pizzaPrice.setVerticalAlignment(SwingConstants.CENTER);
        pizzaPrice.setBackground(new Color(214, 216, 224));
        pizzaPrice.setOpaque(true);
        MainFrame.add(pizzaPrice);

        JRadioButton rbNone = new JRadioButton("None");
        rbNone.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        rbNone.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panelrbNone = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelrbNone.setPreferredSize(new Dimension(100, 30));
        panelrbNone.setBackground(new Color(214, 216, 224));
        panelrbNone.add(rbNone);
        MainFrame.add(panelrbNone);
        // BORGIR ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        JPanel emptyLeft2 = new JPanel();
        emptyLeft2.setPreferredSize(new Dimension(35, 30));
        emptyLeft2.setBackground(new Color(214, 216, 224));
        MainFrame.add(emptyLeft2);

        JCheckBox cBurger = new JCheckBox("Burger");
        cBurger.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        cBurger.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panelcBurger = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelcBurger.setPreferredSize(new Dimension(115, 30));
        panelcBurger.setBackground(new Color(214, 216, 224));
        panelcBurger.add(cBurger);
        MainFrame.add(panelcBurger);

        JLabel burgerPrice = new JLabel("Php 80");
        burgerPrice.setPreferredSize(new Dimension(85, 30));
        burgerPrice.setVerticalAlignment(SwingConstants.CENTER);
        burgerPrice.setBackground(new Color(214, 216, 224));
        burgerPrice.setOpaque(true);
        MainFrame.add(burgerPrice);

        JRadioButton rb5 = new JRadioButton("5% Off");
        rb5.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        rb5.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panelrb5 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelrb5.setPreferredSize(new Dimension(100, 30));
        panelrb5.setBackground(new Color(214, 216, 224));
        panelrb5.add(rb5);
        MainFrame.add(panelrb5);
        // FRIES ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        JPanel emptyLeft3 = new JPanel();
        emptyLeft3.setPreferredSize(new Dimension(35, 30));
        emptyLeft3.setBackground(new Color(214, 216, 224));
        MainFrame.add(emptyLeft3);

        JCheckBox cFries = new JCheckBox("Fries");
        cFries.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        cFries.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panelcFries = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelcFries.setPreferredSize(new Dimension(115, 30));
        panelcFries.setBackground(new Color(214, 216, 224));
        panelcFries.add(cFries);
        MainFrame.add(panelcFries);

        JLabel friesPrice = new JLabel("Php 65");
        friesPrice.setPreferredSize(new Dimension(85, 30));
        friesPrice.setVerticalAlignment(SwingConstants.CENTER);
        friesPrice.setBackground(new Color(214, 216, 224));
        friesPrice.setOpaque(true);
        MainFrame.add(friesPrice);

        JRadioButton rb10 = new JRadioButton("10% Off");
        rb10.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        rb10.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panelrb10 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelrb10.setPreferredSize(new Dimension(100, 30));
        panelrb10.setBackground(new Color(214, 216, 224));
        panelrb10.add(rb10);
        MainFrame.add(panelrb10);
        // SOFT DRINKS ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        JPanel emptyLeft4 = new JPanel();
        emptyLeft4.setPreferredSize(new Dimension(35, 30));
        emptyLeft4.setBackground(new Color(214, 216, 224));
        MainFrame.add(emptyLeft4);

        JCheckBox cSoftDrinks = new JCheckBox("Soft Drinks");
        cSoftDrinks.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        cSoftDrinks.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panelcSoftDrinks = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelcSoftDrinks.setPreferredSize(new Dimension(115, 30));
        panelcSoftDrinks.setBackground(new Color(214, 216, 224));
        panelcSoftDrinks.add(cSoftDrinks);
        MainFrame.add(panelcSoftDrinks);

        JLabel SoftDrinksPrice = new JLabel("Php 55");
        SoftDrinksPrice.setPreferredSize(new Dimension(85, 30));
        SoftDrinksPrice.setVerticalAlignment(SwingConstants.CENTER);
        SoftDrinksPrice.setBackground(new Color(214, 216, 224));
        SoftDrinksPrice.setOpaque(true);
        MainFrame.add(SoftDrinksPrice);

        JRadioButton rb15 = new JRadioButton("15% Off");
        rb15.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        rb15.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panelrb15 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelrb15.setPreferredSize(new Dimension(100, 30));
        panelrb15.setBackground(new Color(214, 216, 224));
        panelrb15.add(rb15);
        MainFrame.add(panelrb15);
        // TEA ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        JPanel emptyLeft5 = new JPanel();
        emptyLeft5.setPreferredSize(new Dimension(35, 30));
        emptyLeft5.setBackground(new Color(214, 216, 224));
        MainFrame.add(emptyLeft5);

        JCheckBox cTea = new JCheckBox("Soft Drinks");
        cTea.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        cTea.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panelcTea = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelcTea.setPreferredSize(new Dimension(115, 30));
        panelcTea.setBackground(new Color(214, 216, 224));
        panelcTea.add(cTea);
        MainFrame.add(panelcTea);

        JLabel teaPrice = new JLabel("Php 50");
        teaPrice.setPreferredSize(new Dimension(85, 30));
        teaPrice.setVerticalAlignment(SwingConstants.CENTER);
        teaPrice.setBackground(new Color(214, 216, 224));
        teaPrice.setOpaque(true);
        MainFrame.add(teaPrice);

        JPanel emptyRight1 = new JPanel();
        emptyRight1.setPreferredSize(new Dimension(100, 30));
        emptyRight1.setBackground(new Color(214, 216, 224));
        MainFrame.add(emptyRight1);
        // SUNDAY ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        JPanel emptyLeft6 = new JPanel();
        emptyLeft6.setPreferredSize(new Dimension(35, 30));
        emptyLeft6.setBackground(new Color(214, 216, 224));
        MainFrame.add(emptyLeft6);

        JCheckBox cSundae = new JCheckBox("Sundae");
        cSundae.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        cSundae.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panelcSundae = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelcSundae.setPreferredSize(new Dimension(115, 30));
        panelcSundae.setBackground(new Color(214, 216, 224));
        panelcSundae.add(cSundae);
        MainFrame.add(panelcSundae);

        JLabel sundaePrice = new JLabel("Php 40");
        sundaePrice.setPreferredSize(new Dimension(85, 30));
        sundaePrice.setVerticalAlignment(SwingConstants.CENTER);
        sundaePrice.setBackground(new Color(214, 216, 224));
        sundaePrice.setOpaque(true);
        MainFrame.add(sundaePrice);

        JPanel emptyRight2 = new JPanel();
        emptyRight2.setPreferredSize(new Dimension(100, 30));
        emptyRight2.setBackground(new Color(214, 216, 224));
        MainFrame.add(emptyRight2);
        // ORDER BUTTON ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        MainFrame.add(Box.createHorizontalStrut(125));
        MainFrame.add(Box.createVerticalStrut(60));

        JButton btnOrder = new JButton("Order");
        btnOrder.setPreferredSize(new Dimension(120, 40));
        btnOrder.setMinimumSize(new Dimension(120, 40)); // di mo shrink below
        btnOrder.setMaximumSize(new Dimension(120, 40)); // di mo grow beyond
        MainFrame.add(btnOrder);

        MainFrame.add(Box.createHorizontalStrut(140));

        // Don't touch below
        setVisible(true);

        btnOrder.addActionListener(_ -> {
            double total = 0.0;

            if (cPizza.isSelected()) {
                double price = 100.0;
                total += price;
            }

            if (cBurger.isSelected()) {
                double price = 80.0;
                total += price;
            }

            if (cFries.isSelected()) {
                double price = 65.0;
                total += price;
            }

            if (cSoftDrinks.isSelected()) {
                double price = 55.0;
                total += price;
            }

            if (cTea.isSelected()) {
                double price = 50.0;
                total += price;
            }

            if (cSundae.isSelected()) {
                double price = 40.0;
                total += price;
            }

            int countSaDiscounts = 0; // dapat isa ra ka discount, wala man nuon gina state ni sir, but i think dapat isa rajud na...
            if (rbNone.isSelected()){
                countSaDiscounts++;
            }
            if (rb5.isSelected()){
                total = total - (total * 0.05);
                countSaDiscounts++;
            }
            if (rb10.isSelected()){
                total = total - (total * 0.1);
                countSaDiscounts++;
            }
            if (rb15.isSelected()){
                total = total - (total * 0.15);
                countSaDiscounts++;
            }

            if(countSaDiscounts > 1){
                String message = "Error! Only one discount allowed";
                JOptionPane.showMessageDialog(this, message, "Order Total", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            String message = String.format("The total price is Php %.2f", total);
            JOptionPane.showMessageDialog(this, message, "Order Total", JOptionPane.INFORMATION_MESSAGE);
        });

    }


    public static void main(String[] args) {
        new Main();
    }
}
