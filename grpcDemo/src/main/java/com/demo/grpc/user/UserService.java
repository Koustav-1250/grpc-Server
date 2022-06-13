package com.demo.grpc.user;

import com.demo.grpc.User.APIResponse;
import com.demo.grpc.User.LoginRequest;
import com.demo.grpc.userGrpc.userImplBase;

import io.grpc.stub.StreamObserver;

public class UserService  extends userImplBase{

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
			
		String userName=request.getUserName();
		String passWord=request.getPassword();
		
		// write business logic 
		
		APIResponse.Builder response=APIResponse.newBuilder();
		
		if(userName.equals(passWord)) {
			response.setResponseMessage("SUCCESS").setResponseStatus("200");
		}else{
			response.setResponseMessage("FAILURE").setResponseStatus("500");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}



	
}
