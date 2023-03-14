package org.example;

import io.grpc.Channel;
import org.example.grpc.MyRequest;
import org.example.grpc.MyResponse;
import org.example.grpc.MyServiceGrpc;

public class MyGRPCClient {
    private transient MyServiceGrpc.MyServiceBlockingStub stub;

    public MyGRPCClient(Channel channel) {
        this.stub = MyServiceGrpc.newBlockingStub(channel);
    }

    public void printMessage(){
        MyRequest myRequest = MyRequest.newBuilder()
                .setRequestText("Ping")
                .build();

        MyResponse myResponse = stub.printMyResponse(myRequest);

        System.out.println(myResponse);
    }
}
