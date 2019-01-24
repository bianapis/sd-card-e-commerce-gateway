package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
  
/**
 * ECommerceGatewayRecordBaseWithIdAndRoot
 */
public class ECommerceGatewayRecordBaseWithIdAndRoot   {
  private String recordingRecordReference = null;

  private String recordingRecordStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the feedback/activity 
   * @return recordingRecordReference
  **/

  @JsonGetter("recordingRecordReference")
  public String getRecordingRecordReference() {
    return recordingRecordReference;
  }
  
  @JsonSetter("recordingRecordReference")
  public void setRecordingRecordReference(String recordingRecordReference) {
    this.recordingRecordReference = recordingRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Recording Record Status 
   * @return recordingRecordStatus
  **/

  @JsonGetter("recordingRecordStatus")
  public String getRecordingRecordStatus() {
    return recordingRecordStatus;
  }
  
  @JsonSetter("recordingRecordStatus")
  public void setRecordingRecordStatus(String recordingRecordStatus) {
    this.recordingRecordStatus = recordingRecordStatus;
  }


}

