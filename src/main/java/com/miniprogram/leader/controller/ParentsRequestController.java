package com.miniprogram.leader.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miniprogram.leader.pojo.ParentsRequest;
import com.miniprogram.leader.service.impl.ParentsRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/parent/request")
public class ParentsRequestController {
    @Autowired
    private ParentsRequestService parentRequestService;

    @PostMapping("/submit")
    public ResponseEntity<?> submitRequest(@RequestBody ParentsRequest request) {
        parentRequestService.submitRequest(request);
        return ResponseEntity.ok("需求提交成功！");
    }
}
