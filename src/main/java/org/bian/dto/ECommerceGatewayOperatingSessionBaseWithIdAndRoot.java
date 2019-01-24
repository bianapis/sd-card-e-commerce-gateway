package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
  
/**
 * ECommerceGatewayOperatingSessionBaseWithIdAndRoot
 */
public class ECommerceGatewayOperatingSessionBaseWithIdAndRoot   {
  private String eCommerceGatewayServiceSessionReference = null;

  private String eCommerceGatewayReference = null;

  private String eCommerceGatewaySchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the active eCommerce Gateway session 
   * @return eCommerceGatewayServiceSessionReference
  **/

  @JsonGetter("eCommerceGatewayServiceSessionReference")
  public String getECommerceGatewayServiceSessionReference() {
    return eCommerceGatewayServiceSessionReference;
  }
  
  @JsonSetter("eCommerceGatewayServiceSessionReference")
  public void setECommerceGatewayServiceSessionReference(String eCommerceGatewayServiceSessionReference) {
    this.eCommerceGatewayServiceSessionReference = eCommerceGatewayServiceSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the eCommerce Gateway service 
   * @return eCommerceGatewayReference
  **/

  @JsonGetter("eCommerceGatewayReference")
  public String getECommerceGatewayReference() {
    return eCommerceGatewayReference;
  }
  
  @JsonSetter("eCommerceGatewayReference")
  public void setECommerceGatewayReference(String eCommerceGatewayReference) {
    this.eCommerceGatewayReference = eCommerceGatewayReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: service availability 
   * @return eCommerceGatewaySchedule
  **/

  @JsonGetter("eCommerceGatewaySchedule")
  public String getECommerceGatewaySchedule() {
    return eCommerceGatewaySchedule;
  }
  
  @JsonSetter("eCommerceGatewaySchedule")
  public void setECommerceGatewaySchedule(String eCommerceGatewaySchedule) {
    this.eCommerceGatewaySchedule = eCommerceGatewaySchedule;
  }


}

