import java.util.*;

public abstract class AStore implements IStore {
  public IItem product;
  public int stock;
  public String storeName;
  public ArrayList<IItem> itemNames = new ArrayList<>();
  public String storeLocation;
  public String category;

  public AStore(IItem product, int stock, String category) {
    this.product = product;
    this.stock = stock;
    this.category = category;
  }

  public AStore(String storeName, String storeLocation) {
    this.storeName = storeName;
    this.storeLocation = storeLocation;
  }

  public AStore(String storeName) {
    this.storeName = storeName;
  }

  @Override
  public ArrayList<String> listOfItemsInStock(String category) {
    ArrayList<String> listOfValid = new ArrayList<>();
    for (IItem i : itemNames){
      if (stock > 0){
        listOfValid.add(i.getName());
      }
    }
    return listOfValid;
  }

  @Override
  public String productLookUp(String productName){
    String output = "";
    for (IItem i : itemNames){
      if (i.getName().equalsIgnoreCase(productName)){
        output = output +  i.getName() + "\n" + i.getPrice() + "\n" + i.getUPCCode() + "\n";
        if (stock > 0){
          output = output + Integer.toString(stock) + " Left in stock :-)";
        }
        else {
          output = output + Integer.toString(stock) + " Left in stock :-(";
        }
      }
    }
    return output;
  }
}
