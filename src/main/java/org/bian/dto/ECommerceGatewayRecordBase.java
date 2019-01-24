package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
  
/**
 * ECommerceGatewayRecordBase
 */
public class ECommerceGatewayRecordBase   {
  private String recordingRecordType = null;

  private Object recordingRecord = null;

  private String recordingRecordDateTime = null;

  private String employeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: the layout/type of the feedback provided 
   * @return recordingRecordType
  **/

  @JsonGetter("recordingRecordType")
  public String getRecordingRecordType() {
    return recordingRecordType;
  }
  
  @JsonSetter("recordingRecordType")
  public void setRecordingRecordType(String recordingRecordType) {
    this.recordingRecordType = recordingRecordType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: the feedback 
   * @return recordingRecord
  **/

  @JsonGetter("recordingRecord")
  public Object getRecordingRecord() {
    return recordingRecord;
  }
  
  @JsonSetter("recordingRecord")
  public void setRecordingRecord(Object recordingRecord) {
    this.recordingRecord = recordingRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Recording Record Date/Time 
   * @return recordingRecordDateTime
  **/

  @JsonGetter("recordingRecordDateTime")
  public String getRecordingRecordDateTime() {
    return recordingRecordDateTime;
  }
  
  @JsonSetter("recordingRecordDateTime")
  public void setRecordingRecordDateTime(String recordingRecordDateTime) {
    this.recordingRecordDateTime = recordingRecordDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: source of the recording detail 
   * @return employeeBusinessUnitReference
  **/

  @JsonGetter("employeeBusinessUnitReference")
  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }
  
  @JsonSetter("employeeBusinessUnitReference")
  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


}

