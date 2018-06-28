package com.hubwiz.demo;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.request.*;
import org.web3j.protocol.core.methods.response.*;

public class Hello{
  public void run(){
    try{
      Web3j web3j =  Web3j.build(new HttpService("http://localhost:8545"));
      Request<?,Web3ClientVersion> request = web3j.web3ClientVersion();
      Web3ClientVersion web3ClientVersion = request.send();
      String clientVersion = web3ClientVersion.getWeb3ClientVersion();
      System.out.println(clientVersion);
    }catch(Exception e){
      System.out.print(e);
    }
  }
}
