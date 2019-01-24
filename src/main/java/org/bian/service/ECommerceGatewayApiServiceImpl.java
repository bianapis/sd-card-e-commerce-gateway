/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ECommerceGatewayApiServiceImpl implements ECommerceGatewayApiService {

	public ECommerceGatewayBatchBaseWithIdAndRoot executePostBatches(String crReferenceId, ECommerceGatewayBatchBase request){
		return JsonReader.read("executePost-ECommerceGatewayBatchBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayBatchBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayBatchBaseWithIdAndRoot executePutBatches(String crReferenceId, String bqReferenceId, ECommerceGatewayBatchBase request){
		return JsonReader.read("executePut-ECommerceGatewayBatchBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayBatchBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayCaptureBaseWithIdAndRoot executePostCapture(String crReferenceId, ECommerceGatewayCaptureBase request){
		return JsonReader.read("executePost-ECommerceGatewayCaptureBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayCaptureBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayCaptureBaseWithIdAndRoot executePutCapture(String crReferenceId, String bqReferenceId, ECommerceGatewayCaptureBase request){
		return JsonReader.read("executePut-ECommerceGatewayCaptureBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayCaptureBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayRecordBaseWithIdAndRoot record(String crReferenceId, ECommerceGatewayRecordBase request){
		return JsonReader.read("record-ECommerceGatewayRecordBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayRecordBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayUpdateBaseWithIdAndRoot requestPostUpdates(String crReferenceId, ECommerceGatewayUpdateBase request){
		return JsonReader.read("requestPost-ECommerceGatewayUpdateBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayUpdateBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayUpdateBaseWithIdAndRoot requestPutUpdates(String crReferenceId, String bqReferenceId, ECommerceGatewayUpdateBase request){
		return JsonReader.read("requestPut-ECommerceGatewayUpdateBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayUpdateBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayOperatingSessionBaseWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ECommerceGatewayOperatingSessionBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayOperatingSessionBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayAuthenticationBaseWithIdAndRoot retrieveAuthentications(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ECommerceGatewayAuthenticationBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayAuthenticationBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayAuthorizationBaseWithIdAndRoot retrieveAuthorizations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ECommerceGatewayAuthorizationBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayAuthorizationBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayBatchBaseWithIdAndRoot retrieveBatches(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ECommerceGatewayBatchBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayBatchBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public ECommerceGatewayCaptureBaseWithIdAndRoot retrieveCaptures(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ECommerceGatewayCaptureBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayCaptureBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ECommerceGatewayReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ECommerceGatewayReportingBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayReportingBaseWithIdAndRoot>(){});
	}
	
	public ECommerceGatewayUpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ECommerceGatewayUpdateBaseWithIdAndRoot.json",new TypeReference<ECommerceGatewayUpdateBaseWithIdAndRoot>(){});
	}
	
}
