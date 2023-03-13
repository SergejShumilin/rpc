package org.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Main {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        MyGRPCClient myGRPCClient = new MyGRPCClient(channel);

        myGRPCClient.printMessage();

        channel.shutdown();
    }
}