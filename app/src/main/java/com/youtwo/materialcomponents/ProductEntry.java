package com.youtwo.materialcomponents;

/**
 * A product entry in the list of products.
 */

public class ProductEntry {
  public final String title;
  public final String url;
  public final String price;
  public final String description;

  public ProductEntry(String title, String url, String price, String description) {
    this.title = title;
    this.url = url;
    this.price = price;
    this.description = description;
  }
}
