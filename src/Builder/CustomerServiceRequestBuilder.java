package Builder;

public class CustomerServiceRequestBuilder implements RequestBuilder {

	private Request request=new Request();
	
	@Override
	public void buildRequest(Agent agent) {
		// TODO Auto-generated method stub
		Call call=new Call();
		call.callPop(agent);
		request.setReqId(call.getRequestId());
		request.setAgent(agent);
	}

	@Override
	public void buildCustomer(String phone) {
       //Search DB to get customer by phone
		Customer c=new Customer(phone);
		request.setRequester(c);
	  //create a new customer profile if there is no customer
	}

	@Override
	public void buildReq(String reqContent) {
		// TODO Auto-generated method stub
		request.setReqContent(reqContent);
	}

	@Override
	public void buildRes(String resContent) {
		// TODO Auto-generated method stub
		request.setRespContent(resContent);
	}

	@Override
	public void buildConsultation(boolean isSaleLead) {
		// TODO Auto-generated method stub
		request.setSaleLead(isSaleLead);
		if (isSaleLead){
			//forward to supervisor or even a third-party 
		}
	}

	@Override
	public void buildCloseRequest(boolean isAnswered,boolean needCallBack) {
		// TODO Auto-generated method stub
		request.setAnswered(isAnswered);
		request.setNeedCallBack(needCallBack);
		if (isAnswered){
			//close the request
		}else if (needCallBack){
			//Call back to customer
		}
		//Save the request information to database
	}

	@Override
	public Request getRequest() {
		// TODO Auto-generated method stub
		return this.request;
	}

}
