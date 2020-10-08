package com.huabuy.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-08-07T21:50:50.278+10:00[Australia/Sydney]")

public class ItemInfo   {
  @JsonProperty("item")
  private String item;

  @JsonProperty("originalPrice")
  private String originalPrice;

  public ItemInfo item(String item) {
    this.item = item;
    return this;
  }

  /**
   * purchased item name
   * @return item
  */
  @ApiModelProperty(value = "purchased item name")


  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public ItemInfo originalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

  /**
   * Original Price
   * @return originalPrice
  */
  @ApiModelProperty(value = "Original Price")


  public String getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemInfo itemInfo = (ItemInfo) o;
    return Objects.equals(this.item, itemInfo.item) &&
        Objects.equals(this.originalPrice, itemInfo.originalPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, originalPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemInfo {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

