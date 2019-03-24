import java.util.*;

public interface IStore {

  ArrayList<String> listOfItemsInStock(String category);
  String productLookUp(String productName);
}
