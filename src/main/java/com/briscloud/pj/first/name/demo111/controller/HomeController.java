package com.briscloud.pj.first.name.demo111.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Chỉ định HomeController là Controller
public class HomeController {

    // spring-boot:run -Dspring-boot.run.fork=false -Dspring-boot.run.profiles=dev
    @GetMapping("/api/v1/admin/khanhdemo")
    public ResponseEntity homepage() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("222 Not avatar or logo 222 ");
//        return "index";  // Trả về trang index.html
    }

    // Có thể mapping thêm các endpoint khác nữa...
}