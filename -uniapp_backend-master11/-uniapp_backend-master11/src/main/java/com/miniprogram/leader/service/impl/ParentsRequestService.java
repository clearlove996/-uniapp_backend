package com.miniprogram.leader.service.impl;
import com.miniprogram.leader.mapper.ParentsRequestMapper;
import com.miniprogram.leader.pojo.ParentsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentsRequestService {

    @Autowired
    private ParentsRequestMapper parentRequestMapper;

    public void submitRequest(ParentsRequest parentRequest) {
        parentRequest.setStatus("pending");
        parentRequestMapper.insertParentsRequest(parentRequest);
    }
}
