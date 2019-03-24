package Model;

public class AItem implements IItem {
  public String productName;
  public String productPrice;
  public long productUPC;

  public AItem(String productName, String productPrice, long productUPC) {
    this.productName = productName;
    this.productPrice = productPrice;
   // if (!productUPC.contains("[a-zA-Z]+")) {
      this.productUPC = productUPC;
    //}
    //throw new IllegalArgumentException("Only numbers for the productUPC");
  }


  @Override
  public String getName() {
    return this.productName;
  }

  @Override
  public String getPrice() {
    return this.productPrice;
  }

  @Override
  public long getUPCCode() {
    return this.productUPC;
  }
}
