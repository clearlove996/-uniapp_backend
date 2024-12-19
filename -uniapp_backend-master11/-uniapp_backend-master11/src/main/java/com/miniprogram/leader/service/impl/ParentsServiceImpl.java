package com.miniprogram.leader.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miniprogram.leader.mapper.ParentsMapper;
import com.miniprogram.leader.pojo.Parents;
import com.miniprogram.leader.service.ParentsService;

@Service
public class ParentsServiceImpl implements ParentsService {
    @Autowired
    private ParentsMapper parentsMapper;

    @Override
    public void addParents(Parents parents){
        parentsMapper.addParents(parents);
    }

    @Override
    public void updateParents(Parents parents){
        parentsMapper.updateParents(parents);
    }

    @Override
    public void updateParentsRequests(Parents parents){
        parentsMapper.updateParentsRequests(parents);
    }

}
