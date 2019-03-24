package View;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class AppView {
  Dimension d = new Dimension(340, 640);

  JFrame homeScreen;
  JFrame typeScreen;
  JFrame choiceScreen;
  JFrame findProdScreen;
  JFrame findStoreScreen;
  JFrame groceryScreen;
  JFrame toiletriesScreen;
  JFrame accessoriesScreen;
  JFrame furnitureScreen;
  JFrame kitchenWareScreen;


  JPanel homePanel;
  JPanel choicePanel;
  JPanel typePanel;
  JPanel findProdPanel;
  JPanel findStorePanel;
  JPanel groceryPanel;
  JPanel toiletriesPanel;
  JPanel accessoriesPanel;
  JPanel furniturePanel;
  JPanel kitchenWarePanel;

  JLabel title;
  JLabel what;

  JTextField prod;
  JTextField store;

  JScrollPane scrollStore;
  JScrollPane scrollGrocery;
  JScrollPane scrollToiletries;
  JScrollPane scrollAccessories;
  JScrollPane scrollFurniture;
  JScrollPane scrollKitchenWare;

  JButton enter;
  JButton customer;
  JButton retailer;
  JButton manufacturer;
  JButton prodC;
  JButton storeC;
  JButton grocery;
  JButton toiletries;
  JButton accessories;
  JButton furniture;
  JButton kitchenWare;
  JButton backHome;
  JButton backType;
  JButton backToChoiceProd;
  JButton backToChoiceStore;
  JButton backToChoiceGroc;
  JButton backToChoiceToi;
  JButton backToChoiceAcc;
  JButton backToChoiceFur;
  JButton backToChoiceKit;




  public static void main(String[] args){
    AppView ap = new AppView("Itemizer");
  }

  public AppView(String in){
    //------------------------------------------------------------ HOME SCREEN

    enter = new JButton(new AbstractAction("Enter") {
      @Override
      public void actionPerformed(ActionEvent e) {
        typeScreen.setVisible(true);
      }
    });

    homeScreen = new JFrame("Itemizer");
    homeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    homeScreen.setSize(d);

    title = new JLabel("<html><font color = 'white'>ITEMIZER</font></html>");
    title.setFont(new Font("Serif", Font.PLAIN, 34));
    title.setBackground(new Color(225, 225, 225));

    homePanel = new JPanel();
    homePanel.setPreferredSize(d);
    homePanel.setBackground(new Color(255));
    homePanel.add(title);
    homePanel.add(enter);

    homeScreen.add(homePanel);
    homeScreen.setVisible(true);

    //------------------------------------------------------------ TYPE SCREEN

    what = new JLabel("<html><font color = 'white'>What type of user are you?</font></html>");
    what.setFont(new Font("Serif", Font.PLAIN, 24));
    what.setBackground(new Color(225, 225, 225));

    customer = new JButton(new AbstractAction("Customer") {
      @Override
      public void actionPerformed(ActionEvent e) {
       choiceScreen.setVisible(true);
      }
    });

    retailer = new JButton(new AbstractAction("Retailer") {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });

    manufacturer = new JButton(new AbstractAction("Manufacturer") {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });

    backHome = new JButton(new AbstractAction("Back Home") {
      @Override
      public void actionPerformed(ActionEvent e) {
        homeScreen.setVisible(true);
      }
    });

    typeScreen = new JFrame("What type of user are you?");
    typeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    typeScreen.setSize(d);

    typePanel = new JPanel();
    typePanel.setPreferredSize(d);
    typePanel.setBackground(new Color(100));
    typePanel.add(what);
    typePanel.add(customer);
    typePanel.add(retailer);
    typePanel.add(manufacturer);
    typePanel.add(backHome);
    typeScreen.add(typePanel);

    //------------------------------------------------------------ CHOICES SCREEN

    prodC = new JButton(new AbstractAction("Find Product") {
      @Override
      public void actionPerformed(ActionEvent e) {
        findProdScreen.setVisible(true);
      }
    });

    storeC = new JButton(new AbstractAction("Find Store") {
      @Override
      public void actionPerformed(ActionEvent e) {
        findStoreScreen.setVisible(true);
      }
    });

    grocery = new JButton(new AbstractAction("Groceries") {
      @Override
      public void actionPerformed(ActionEvent e) {
        groceryScreen.setVisible(true);
      }
    });

    toiletries = new JButton(new AbstractAction("Toiletries") {
      @Override
      public void actionPerformed(ActionEvent e) {
        toiletriesScreen.setVisible(true);
      }
    });

    accessories = new JButton(new AbstractAction("Accessories") {
      @Override
      public void actionPerformed(ActionEvent e) {
        accessoriesScreen.setVisible(true);
      }
    });

    furniture = new JButton(new AbstractAction("Furniture") {
      @Override
      public void actionPerformed(ActionEvent e) {
        furnitureScreen.setVisible(true);
      }
    });

    kitchenWare = new JButton(new AbstractAction("KitchenWare") {
      @Override
      public void actionPerformed(ActionEvent e) {
        kitchenWareScreen.setVisible(true);
      }
    });

    backType = new JButton(new AbstractAction("Back to Type of User") {
      @Override
      public void actionPerformed(ActionEvent e) {
        typeScreen.setVisible(true);
      }
    });

    backToChoiceProd = new JButton(new AbstractAction("Back to choices") {
      @Override
      public void actionPerformed(ActionEvent e) {
        choiceScreen.setVisible(true);
      }
    });

    backToChoiceStore = new JButton(new AbstractAction("Back to choices") {
      @Override
      public void actionPerformed(ActionEvent e) {
        choiceScreen.setVisible(true);
      }
    });

    backToChoiceGroc = new JButton(new AbstractAction("Back to choices") {
      @Override
      public void actionPerformed(ActionEvent e) {
        choiceScreen.setVisible(true);
      }
    });

    backToChoiceToi = new JButton(new AbstractAction("Back to choices") {
      @Override
      public void actionPerformed(ActionEvent e) {
        choiceScreen.setVisible(true);
      }
    });

    backToChoiceAcc = new JButton(new AbstractAction("Back to choices") {
      @Override
      public void actionPerformed(ActionEvent e) {
        choiceScreen.setVisible(true);
      }
    });

    backToChoiceFur = new JButton(new AbstractAction("Back to choices") {
      @Override
      public void actionPerformed(ActionEvent e) {
        choiceScreen.setVisible(true);
      }
    });

    backToChoiceKit = new JButton(new AbstractAction("Back to choices") {
      @Override
      public void actionPerformed(ActionEvent e) {
        choiceScreen.setVisible(true);
      }
    });


    prod = new JTextField("   Look up a product   ");
    store = new JTextField("   Look up a store   ");

    choiceScreen = new JFrame("What do you want to find");
    choiceScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    choiceScreen.setSize(d);

    choicePanel = new JPanel();
    choicePanel.setPreferredSize(d);
    choicePanel.setBackground(new Color(2, 255, 255));
    choicePanel.add(prod);
    choicePanel.add(store);
    choicePanel.add(prodC);
    choicePanel.add(storeC);
    choicePanel.add(grocery);
    choicePanel.add(toiletries);
    choicePanel.add(accessories);
    choicePanel.add(furniture);
    choicePanel.add(kitchenWare);
    choicePanel.add(backType);
    choiceScreen.add(choicePanel);

    //------------------------------------------------------------ FIND PROD SCREEN

    findProdScreen = new JFrame(prod.getText());
    findProdScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    findProdScreen.setSize(d);

    findProdPanel = new JPanel();
    findProdPanel.setPreferredSize(d);
    findProdPanel.setBackground(new Color(155, 0, 0));
    findProdPanel.add(backToChoiceProd);
    findProdScreen.add(findProdPanel);

    //------------------------------------------------------------ FIND STORE SCREEN

    findStoreScreen = new JFrame(store.getText());
    findStoreScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    findStoreScreen.setSize(d);

    findStorePanel = new JPanel();
    findStorePanel.setPreferredSize(d);
    findStorePanel.setBackground(new Color(0, 155, 0));
    findStorePanel.add(backToChoiceStore);
    scrollStore = new JScrollPane(findStorePanel);
    findStoreScreen.add(scrollStore);

    //------------------------------------------------------------ GROCERIES SCREEN

    groceryScreen = new JFrame("Groceries");
    groceryScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    groceryScreen.setSize(d);

    groceryPanel = new JPanel();
    groceryPanel.setPreferredSize(d);
    groceryPanel.setBackground(new Color(0, 255, 0));
    groceryPanel.add(backToChoiceGroc);
    scrollGrocery = new JScrollPane(groceryPanel);
    groceryScreen.add(scrollGrocery);

    //------------------------------------------------------------ TOILETRIES SCREEN

    toiletriesScreen = new JFrame("Toiletries");
    toiletriesScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    toiletriesScreen.setSize(d);

    toiletriesPanel = new JPanel();
    toiletriesPanel.setPreferredSize(d);
    toiletriesPanel.setBackground(new Color(0, 255, 0));
    toiletriesPanel.add(backToChoiceToi);
    scrollToiletries = new JScrollPane(toiletriesPanel);
    toiletriesScreen.add(scrollToiletries);

    //------------------------------------------------------------ ACCESSORIES SCREEN

    accessoriesScreen = new JFrame("Accessories");
    accessoriesScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    accessoriesScreen.setSize(d);

    accessoriesPanel = new JPanel();
    accessoriesPanel.setPreferredSize(d);
    accessoriesPanel.setBackground(new Color(0, 255, 0));
    accessoriesPanel.add(backToChoiceAcc);
    scrollAccessories = new JScrollPane(accessoriesPanel);
    accessoriesScreen.add(scrollAccessories);

    //------------------------------------------------------------ FURNITURE SCREEN

    furnitureScreen = new JFrame("Furniture");
    furnitureScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    furnitureScreen.setSize(d);

    furniturePanel = new JPanel();
    furniturePanel.setPreferredSize(d);
    furniturePanel.setBackground(new Color(0, 255, 0));
    furniturePanel.add(backToChoiceFur);
    scrollFurniture = new JScrollPane(furniturePanel);
    furnitureScreen.add(scrollFurniture);

    //------------------------------------------------------------ KITCHENWARE SCREEN

    kitchenWareScreen = new JFrame("KitchenWare");
    kitchenWareScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    kitchenWareScreen.setSize(d);

    kitchenWarePanel = new JPanel();
    kitchenWarePanel.setPreferredSize(d);
    kitchenWarePanel.setBackground(new Color(0, 255, 0));
    kitchenWarePanel.add(backToChoiceKit);
    scrollKitchenWare = new JScrollPane(kitchenWarePanel);
    kitchenWareScreen.add(scrollKitchenWare);

  }


}
