package com.huabuy.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.huabuy.models.ItemInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-08-07T21:50:50.278+10:00[Australia/Sydney]")

public class OrderInfo   {
  @JsonProperty("date")
  private String date;

  @JsonProperty("customer")
  private String customer;

  @JsonProperty("orderItems")
  @Valid
  private List<ItemInfo> orderItems = null;

  public OrderInfo date(String date) {
    this.date = date;
    return this;
  }

  /**
   * date of order
   * @return date
  */
  @ApiModelProperty(value = "date of order")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public OrderInfo customer(String customer) {
    this.customer = customer;
    return this;
  }

  /**
   * customer name
   * @return customer
  */
  @ApiModelProperty(value = "customer name")


  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public OrderInfo orderItems(List<ItemInfo> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public OrderInfo addOrderItemsItem(ItemInfo orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

  /**
   * Get orderItems
   * @return orderItems
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ItemInfo> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<ItemInfo> orderItems) {
    this.orderItems = orderItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderInfo orderInfo = (OrderInfo) o;
    return Objects.equals(this.date, orderInfo.date) &&
        Objects.equals(this.customer, orderInfo.customer) &&
        Objects.equals(this.orderItems, orderInfo.orderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, customer, orderItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderInfo {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
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

