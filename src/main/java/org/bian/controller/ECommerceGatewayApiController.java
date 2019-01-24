/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class ECommerceGatewayApiController {

	@Autowired
	ECommerceGatewayApiService service;
	
	@BQ("batches")
	@Operate.ExecutePost
	public BianResponse<ECommerceGatewayBatchBaseWithIdAndRoot> executePostBatches(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ECommerceGatewayBatchBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostBatches(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("batches")
	@Operate.ExecutePut
	public BianResponse<ECommerceGatewayBatchBaseWithIdAndRoot> executePutBatches(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ECommerceGatewayBatchBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutBatches(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Operate.ExecutePost
	public BianResponse<ECommerceGatewayCaptureBaseWithIdAndRoot> executePostCapture(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ECommerceGatewayCaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostCapture(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Operate.ExecutePut
	public BianResponse<ECommerceGatewayCaptureBaseWithIdAndRoot> executePutCapture(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ECommerceGatewayCaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutCapture(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<ECommerceGatewayRecordBaseWithIdAndRoot> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ECommerceGatewayRecordBase> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("updates")
	@Operate.RequestPost
	public BianResponse<ECommerceGatewayUpdateBaseWithIdAndRoot> requestPostUpdates(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ECommerceGatewayUpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostUpdates(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("updates")
	@Operate.RequestPut
	public BianResponse<ECommerceGatewayUpdateBaseWithIdAndRoot> requestPutUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ECommerceGatewayUpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutUpdates(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<ECommerceGatewayOperatingSessionBaseWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("authentications")
	@Operate.Retrieve
	public BianResponse<ECommerceGatewayAuthenticationBaseWithIdAndRoot> retrieveAuthentications(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthentications(crReferenceId, bqReferenceId));
	}
	
	@BQ("authorizations")
	@Operate.Retrieve
	public BianResponse<ECommerceGatewayAuthorizationBaseWithIdAndRoot> retrieveAuthorizations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthorizations(crReferenceId, bqReferenceId));
	}
	
	@BQ("batches")
	@Operate.Retrieve
	public BianResponse<ECommerceGatewayBatchBaseWithIdAndRoot> retrieveBatches(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBatches(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("captures")
	@Operate.Retrieve
	public BianResponse<ECommerceGatewayCaptureBaseWithIdAndRoot> retrieveCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCaptures(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reportings")
	@Operate.Retrieve
	public BianResponse<ECommerceGatewayReportingBaseWithIdAndRoot> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Operate.Retrieve
	public BianResponse<ECommerceGatewayUpdateBaseWithIdAndRoot> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
}
