/**
 * TO COMPLETE -
 * - Make Home screen with text box for :itemize: and have button to enter app/swipe on it's own
 * - Add buttons for look up (connect to server)
 * - Re position it
 * - Drop down menu for products and stores
 */

package View;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JPanel;

import Model.IItem;

class HomeView{
  IItem item;

  JButton welcome;
  JButton customer;
  JButton retailer;
  JButton manufacturer;
  JPanel homeScreen;
  JPanel userTypeScreen;
  JFrame homeframe;
  JFrame userTypeFrame;
  JFrame customerFrame;
  JFrame retailerFrame;
  JFrame manufacturerFrame;
  JPanel customerScreen;
  JPanel retailerScreen;
  JPanel manufacturerScreen;
//  JTextField lookUpProductsC;
//  JTextField lookUpStoreC;
//  JTextField lookUpProductsR;
//  JTextField lookUpStoreM;

  JComboBox<String> Items = new JComboBox<>(); // SELECT s.name FROM Items


  public static void main(String args[]){
    HomeView HW = new HomeView("Itemizer");
  }

  public HomeView(String in){

    homeframe = new JFrame("Itemizer");
    homeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    homeframe.setSize(340,640);

    welcome = new JButton(new AbstractAction("Welcome") {
      @Override
      public void actionPerformed(ActionEvent e) {
        userTypeFrame.setVisible(true);
      }
    });

    customer = new JButton(new AbstractAction("Customer") {
      @Override
      public void actionPerformed(ActionEvent e) {
        customerFrame.setVisible(true);
      }
    });

    retailer = new JButton(new AbstractAction("Retailer") {
      @Override
      public void actionPerformed(ActionEvent e) {
        retailerFrame.setVisible(true);
      }
    });

    manufacturer = new JButton(new AbstractAction("Manufacturer") {
      @Override
      public void actionPerformed(ActionEvent e) {
        manufacturerFrame.setVisible(true);
      }
    });

    homeScreen = new JPanel();
    homeScreen.setPreferredSize(new Dimension(340, 640));
    homeScreen.setBackground(new Color(255));
    homeScreen.add(welcome);

    userTypeScreen = new JPanel();
    userTypeScreen.setPreferredSize(new Dimension(340, 640));
    userTypeScreen.setBackground(new Color(225, 0, 0));
    userTypeScreen.add(customer);
    userTypeScreen.add(retailer);
    userTypeScreen.add(manufacturer);

    userTypeFrame = new JFrame("What type of user are you?");
    userTypeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    userTypeFrame.setSize(340, 640);
    userTypeFrame.add(userTypeScreen);

    customerScreen = new JPanel();
    customerScreen.setPreferredSize(new Dimension(340, 640));
    customerScreen.setBackground(new Color(255, 25, 255));
    //customerScreen.add(items);
//    customerScreen.add(lookUpStoreC);

    customerFrame = new JFrame("Hello Customer");
    customerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    customerFrame.setSize(340, 640);
    retailerScreen = new JPanel();

    retailerScreen.setPreferredSize(new Dimension(340, 640));
    retailerScreen.setBackground(new Color(255, 255, 25));
//    retailerScreen.add(lookUpProductsR);

    retailerFrame = new JFrame("Hello Retailer");
    retailerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    retailerFrame.setSize(340, 640);
    retailerFrame.add(retailerScreen);

    manufacturerScreen = new JPanel();
    manufacturerScreen.setPreferredSize(new Dimension(340, 640));
    manufacturerScreen.setBackground(new Color(255, 255, 255));
//    manufacturerScreen.add(lookUpStoreM);

    manufacturerFrame = new JFrame("Hello Manufacturer");
    manufacturerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    manufacturerFrame.setSize(340, 640);
    manufacturerFrame.add(manufacturerScreen);

    homeframe.add(homeScreen);
    homeframe.setVisible(true);
  }
}

// Testing GitHub