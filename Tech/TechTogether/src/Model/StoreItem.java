package Model;

import java.util.*;

public class StoreItem extends AStore {
  public IItem product;
  public int stock;
  public String category;

  public StoreItem(IItem product, int stock, String category){
    super(product, stock, category);
  }

  @Override
  public ArrayList<String> listOfItemsInStock(String category) {
    ArrayList<String> listOfValid = new ArrayList<>();
    for (IItem i : itemNames){
      if (stock > 0 && category.equalsIgnoreCase(this.category)){
        listOfValid.add(i.getName());
      }
    }
    return listOfValid;
  }


  public void isPurchaseMade(){
    stock--;
  }
}
