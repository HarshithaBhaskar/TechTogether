import java.util.ArrayList;

public class Store extends AStore{
  public String storeName;
  public ArrayList<IItem> itemNames = new ArrayList<>();
  public String storeLocation;

  public Store(String storeName, String storeLocation) {
    super(storeName, storeLocation);
  }

  public Store(String storeName) {
    super(storeName);
  }


}
