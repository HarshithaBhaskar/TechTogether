public class AItem implements IItem {
  public String productName;
  public String productPrice;
  public int productUPC;

  public AItem(String productName, String productPrice, int productUPC){
    this.productName = productName;
    this.productPrice = productPrice;
    this.productUPC = productUPC;
  }

  public AItem(String productName){
    this.productName = productName;
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
  public int getUPCCode() {
    return this.productUPC;
  }
}
