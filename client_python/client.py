import grpc

import MyService_pb2
import MyService_pb2_grpc

def run():
    with grpc.insecure_channel('localhost:8080') as channel:
        stub = MyService_pb2_grpc.MyServiceStub(channel)

        response = stub.printMyResponse(MyService_pb2.MyRequest(requestText='Ping'))

        print(response)

run()