package com.demo.grpc.Server;

import java.io.IOException;

import com.demo.grpc.user.UserService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
			
		Server server = ServerBuilder.forPort(9090).addService(new UserService()).build();
		server.start();
		
		System.out.println("Server is running");
		server.awaitTermination();
	}

}
