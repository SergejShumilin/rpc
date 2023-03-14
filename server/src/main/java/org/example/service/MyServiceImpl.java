package org.example.service;


import io.grpc.stub.StreamObserver;
import org.example.grpc.MyRequest;
import org.example.grpc.MyResponse;
import org.example.grpc.MyServiceGrpc;

public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {
    @Override
    public void printMyResponse(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println(request);

        MyResponse myResponse = MyResponse.newBuilder()
                .setResponseText("Pong").build();

        responseObserver.onNext(myResponse);
        responseObserver.onCompleted();

    }
}
