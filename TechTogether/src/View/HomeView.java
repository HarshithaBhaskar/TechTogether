package View;
//import java.awt.*;
//
//import javax.swing.*;
//
//public class HomeView {
//  JPanel homeScreen;
//  JTextField text;
//
//  public HomeView(){
//    this.homeScreen = new JPanel();
//    homeScreen.setBackground(new Color(255));
//    homeScreen.setPreferredSize(new Dimension(340, 640));
//    this.text = new JTextField();
//    text.setText("Hello");
//  }
//}

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;
class HomeView{
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
        homeframe.setVisible(false);
        userTypeFrame.setVisible(true);
      }
    });

    customer = new JButton(new AbstractAction("Customer") {
      @Override
      public void actionPerformed(ActionEvent e) {
        userTypeFrame.setVisible(false);
        customerFrame.setVisible(true);
      }
    });

    manufacturer = new JButton(new AbstractAction("Retailer") {
      @Override
      public void actionPerformed(ActionEvent e) {
        userTypeFrame.setVisible(false);
        manufacturerFrame.setVisible(true);
      }
    });

    retailer = new JButton(new AbstractAction("Manufacturer") {
      @Override
      public void actionPerformed(ActionEvent e) {
        userTypeFrame.setVisible(false);
        retailerFrame.setVisible(true);
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
    customerScreen.setBackground(new Color(255, 255, 255));

    customerFrame = new JFrame("Hello Customer");
    customerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    customerFrame.setSize(340, 640);
    customerFrame.add(customerScreen);

    retailerScreen = new JPanel();
    retailerScreen.setPreferredSize(new Dimension(340, 640));
    retailerScreen.setBackground(new Color(255, 255, 255));

    retailerFrame = new JFrame("Hello Retailer");
    retailerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    retailerFrame.setSize(340, 640);
    retailerFrame.add(retailerScreen);

    manufacturerScreen = new JPanel();
    manufacturerScreen.setPreferredSize(new Dimension(340, 640));
    manufacturerScreen.setBackground(new Color(255, 255, 255));

    manufacturerFrame = new JFrame("Hello Manufacturer");
    manufacturerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    manufacturerFrame.setSize(340, 640);
    manufacturerFrame.add(manufacturerScreen);

    homeframe.add(homeScreen);
    homeframe.setVisible(true);
  }
}