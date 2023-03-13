package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.service.MyServiceImpl;

import java.io.IOException;

public class MyGRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder
                .forPort(8080)
                .addService(new MyServiceImpl()).build();

        server.start();
        System.out.println("Server has started");
        server.awaitTermination();

    }
}