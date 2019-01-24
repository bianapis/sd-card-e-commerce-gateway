/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ECommerceGatewayApiService {

	ECommerceGatewayBatchBaseWithIdAndRoot executePostBatches(String crReferenceId, ECommerceGatewayBatchBase request);
	
	ECommerceGatewayBatchBaseWithIdAndRoot executePutBatches(String crReferenceId, String bqReferenceId, ECommerceGatewayBatchBase request);
	
	ECommerceGatewayCaptureBaseWithIdAndRoot executePostCapture(String crReferenceId, ECommerceGatewayCaptureBase request);
	
	ECommerceGatewayCaptureBaseWithIdAndRoot executePutCapture(String crReferenceId, String bqReferenceId, ECommerceGatewayCaptureBase request);
	
	ECommerceGatewayRecordBaseWithIdAndRoot record(String crReferenceId, ECommerceGatewayRecordBase request);
	
	ECommerceGatewayUpdateBaseWithIdAndRoot requestPostUpdates(String crReferenceId, ECommerceGatewayUpdateBase request);
	
	ECommerceGatewayUpdateBaseWithIdAndRoot requestPutUpdates(String crReferenceId, String bqReferenceId, ECommerceGatewayUpdateBase request);
	
	ECommerceGatewayOperatingSessionBaseWithIdAndRoot retrieve(String crReferenceId);
	
	ECommerceGatewayAuthenticationBaseWithIdAndRoot retrieveAuthentications(String crReferenceId, String bqReferenceId);
	
	ECommerceGatewayAuthorizationBaseWithIdAndRoot retrieveAuthorizations(String crReferenceId, String bqReferenceId);
	
	ECommerceGatewayBatchBaseWithIdAndRoot retrieveBatches(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	ECommerceGatewayCaptureBaseWithIdAndRoot retrieveCaptures(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	ECommerceGatewayReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId);
	
	ECommerceGatewayUpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId);
	
}
