package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
  
/**
 * ECommerceGatewayCaptureBase
 */
public class ECommerceGatewayCaptureBase   {
  private String productInstanceReference = null;

  private String customerReference = null;

  private String cardexpirationdate = null;

  private String cardCVV = null;

  private String cardIssuingBankReference = null;

  private String merchantAcquiringBankReference = null;

  private String eCommerceTransactionType = null;

  private String eCommerceTransactionCurrency = null;

  private String eCommerceTransactionAmountType = null;

  private String eCommerceTransactionAmount = null;

  private String eCommerceTransactionMerchantReference = null;

  private String eCommerceTransactionLocationReference = null;

  private String eCommerceTransactionProductServiceReference = null;

  private String eCommerceTransactionDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: card product identificier/number 
   * @return productInstanceReference
  **/

  @JsonGetter("productInstanceReference")
  public String getProductInstanceReference() {
    return productInstanceReference;
  }
  
  @JsonSetter("productInstanceReference")
  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: card holder as detailed on the card 
   * @return customerReference
  **/

  @JsonGetter("customerReference")
  public String getCustomerReference() {
    return customerReference;
  }
  
  @JsonSetter("customerReference")
  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: as detailed on the card/token 
   * @return cardexpirationdate
  **/

  @JsonGetter("cardexpirationdate")
  public String getCardexpirationdate() {
    return cardexpirationdate;
  }
  
  @JsonSetter("cardexpirationdate")
  public void setCardexpirationdate(String cardexpirationdate) {
    this.cardexpirationdate = cardexpirationdate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: as detailed on the card/token 
   * @return cardCVV
  **/

  @JsonGetter("cardCVV")
  public String getCardCVV() {
    return cardCVV;
  }
  
  @JsonSetter("cardCVV")
  public void setCardCVV(String cardCVV) {
    this.cardCVV = cardCVV;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Card Issuing Bank Reference 
   * @return cardIssuingBankReference
  **/

  @JsonGetter("cardIssuingBankReference")
  public String getCardIssuingBankReference() {
    return cardIssuingBankReference;
  }
  
  @JsonSetter("cardIssuingBankReference")
  public void setCardIssuingBankReference(String cardIssuingBankReference) {
    this.cardIssuingBankReference = cardIssuingBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Merchant Acquiring Bank Reference 
   * @return merchantAcquiringBankReference
  **/

  @JsonGetter("merchantAcquiringBankReference")
  public String getMerchantAcquiringBankReference() {
    return merchantAcquiringBankReference;
  }
  
  @JsonSetter("merchantAcquiringBankReference")
  public void setMerchantAcquiringBankReference(String merchantAcquiringBankReference) {
    this.merchantAcquiringBankReference = merchantAcquiringBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: eCommerce Transaction Type 
   * @return eCommerceTransactionType
  **/

  @JsonGetter("eCommerceTransactionType")
  public String getECommerceTransactionType() {
    return eCommerceTransactionType;
  }
  
  @JsonSetter("eCommerceTransactionType")
  public void setECommerceTransactionType(String eCommerceTransactionType) {
    this.eCommerceTransactionType = eCommerceTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: eCommerce Transaction Currency 
   * @return eCommerceTransactionCurrency
  **/

  @JsonGetter("eCommerceTransactionCurrency")
  public String getECommerceTransactionCurrency() {
    return eCommerceTransactionCurrency;
  }
  
  @JsonSetter("eCommerceTransactionCurrency")
  public void setECommerceTransactionCurrency(String eCommerceTransactionCurrency) {
    this.eCommerceTransactionCurrency = eCommerceTransactionCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Original amount, Billing currency amount, conversion rate, FX Mark 
   * @return eCommerceTransactionAmountType
  **/

  @JsonGetter("eCommerceTransactionAmountType")
  public String getECommerceTransactionAmountType() {
    return eCommerceTransactionAmountType;
  }
  
  @JsonSetter("eCommerceTransactionAmountType")
  public void setECommerceTransactionAmountType(String eCommerceTransactionAmountType) {
    this.eCommerceTransactionAmountType = eCommerceTransactionAmountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: eCommerce Transaction Amount 
   * @return eCommerceTransactionAmount
  **/

  @JsonGetter("eCommerceTransactionAmount")
  public String getECommerceTransactionAmount() {
    return eCommerceTransactionAmount;
  }
  
  @JsonSetter("eCommerceTransactionAmount")
  public void setECommerceTransactionAmount(String eCommerceTransactionAmount) {
    this.eCommerceTransactionAmount = eCommerceTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: eCommerce Transaction Merchant Reference 
   * @return eCommerceTransactionMerchantReference
  **/

  @JsonGetter("eCommerceTransactionMerchantReference")
  public String getECommerceTransactionMerchantReference() {
    return eCommerceTransactionMerchantReference;
  }
  
  @JsonSetter("eCommerceTransactionMerchantReference")
  public void setECommerceTransactionMerchantReference(String eCommerceTransactionMerchantReference) {
    this.eCommerceTransactionMerchantReference = eCommerceTransactionMerchantReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: point of sale location 
   * @return eCommerceTransactionLocationReference
  **/

  @JsonGetter("eCommerceTransactionLocationReference")
  public String getECommerceTransactionLocationReference() {
    return eCommerceTransactionLocationReference;
  }
  
  @JsonSetter("eCommerceTransactionLocationReference")
  public void setECommerceTransactionLocationReference(String eCommerceTransactionLocationReference) {
    this.eCommerceTransactionLocationReference = eCommerceTransactionLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: e.g. purchased service/product 
   * @return eCommerceTransactionProductServiceReference
  **/

  @JsonGetter("eCommerceTransactionProductServiceReference")
  public String getECommerceTransactionProductServiceReference() {
    return eCommerceTransactionProductServiceReference;
  }
  
  @JsonSetter("eCommerceTransactionProductServiceReference")
  public void setECommerceTransactionProductServiceReference(String eCommerceTransactionProductServiceReference) {
    this.eCommerceTransactionProductServiceReference = eCommerceTransactionProductServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: eCommerce Transaction Date/Time 
   * @return eCommerceTransactionDateTime
  **/

  @JsonGetter("eCommerceTransactionDateTime")
  public String getECommerceTransactionDateTime() {
    return eCommerceTransactionDateTime;
  }
  
  @JsonSetter("eCommerceTransactionDateTime")
  public void setECommerceTransactionDateTime(String eCommerceTransactionDateTime) {
    this.eCommerceTransactionDateTime = eCommerceTransactionDateTime;
  }


}

