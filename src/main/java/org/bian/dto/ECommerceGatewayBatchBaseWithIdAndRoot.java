package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
  
/**
 * ECommerceGatewayBatchBaseWithIdAndRoot
 */
public class ECommerceGatewayBatchBaseWithIdAndRoot   {
  private String eCommerceGatewayServiceSessionReference = null;

  private String eCommerceBatchTransactionReference = null;

  private String eCommerceBatchTransactionDateTime = null;

  private String transactionMerchantReference = null;

  private String eCommerceTransactionReference = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String cardexpirationdate = null;

  private String cardCVV = null;

  private String eCommerceTransactionRecordReference = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: eCommerce Batch Transaction Reference 
   * @return eCommerceBatchTransactionReference
  **/

  @JsonGetter("eCommerceBatchTransactionReference")
  public String getECommerceBatchTransactionReference() {
    return eCommerceBatchTransactionReference;
  }
  
  @JsonSetter("eCommerceBatchTransactionReference")
  public void setECommerceBatchTransactionReference(String eCommerceBatchTransactionReference) {
    this.eCommerceBatchTransactionReference = eCommerceBatchTransactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: eCommerce Batch Transaction Date/Time 
   * @return eCommerceBatchTransactionDateTime
  **/

  @JsonGetter("eCommerceBatchTransactionDateTime")
  public String getECommerceBatchTransactionDateTime() {
    return eCommerceBatchTransactionDateTime;
  }
  
  @JsonSetter("eCommerceBatchTransactionDateTime")
  public void setECommerceBatchTransactionDateTime(String eCommerceBatchTransactionDateTime) {
    this.eCommerceBatchTransactionDateTime = eCommerceBatchTransactionDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Transaction Merchant Reference 
   * @return transactionMerchantReference
  **/

  @JsonGetter("transactionMerchantReference")
  public String getTransactionMerchantReference() {
    return transactionMerchantReference;
  }
  
  @JsonSetter("transactionMerchantReference")
  public void setTransactionMerchantReference(String transactionMerchantReference) {
    this.transactionMerchantReference = transactionMerchantReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Following fields are repreated for all transactions included in the batch 
   * @return eCommerceTransactionReference
  **/

  @JsonGetter("eCommerceTransactionReference")
  public String getECommerceTransactionReference() {
    return eCommerceTransactionReference;
  }
  
  @JsonSetter("eCommerceTransactionReference")
  public void setECommerceTransactionReference(String eCommerceTransactionReference) {
    this.eCommerceTransactionReference = eCommerceTransactionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: eCommerce Transaction Record Reference 
   * @return eCommerceTransactionRecordReference
  **/

  @JsonGetter("eCommerceTransactionRecordReference")
  public String getECommerceTransactionRecordReference() {
    return eCommerceTransactionRecordReference;
  }
  
  @JsonSetter("eCommerceTransactionRecordReference")
  public void setECommerceTransactionRecordReference(String eCommerceTransactionRecordReference) {
    this.eCommerceTransactionRecordReference = eCommerceTransactionRecordReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: duplicate as batch is for a merchant 
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

