package com.briscloud.pj.first.name.demo111.controller;

import com.briscloud.pj.first.name.demo111.response.ImageLocationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Chỉ định HomeController là Controller
public class HomeController {

    //**********Tao Project*******
    //   https://viblo.asia/p/tao-du-an-spring-boot-dau-tien-gDVK2L0wlLj
    //  https://start.spring.io/

    //********* run o cho IntelliJ******
    //   spring-boot:run -Dspring-boot.run.fork=false -Dspring-boot.run.profiles=dev

    //**********build, trien khai len docker ****
    //1. setting java 11
    //    echo $JAVA_HOME
    //    /usr/libexec/java_home -V
    //    export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.12.jdk/Contents/Home
    //2. build bang maven
    //   ./mvnw package && java -jar target/demo111 0.0.1-SNAPSHOT.jar
    //3. build image thong qua docker file
    //    docker build -t springio/gs-spring-boot-docker .
    //    docker run -p 8080:8080 springio/gs-spring-boot-docker
    //4. Test API
    //  http://localhost:8080/api/v1/admin/khanhdemo


    @GetMapping("/api/v1/admin/khanhdemo")
    public ResponseEntity homepage() {

        ImageLocationResponse giftResponse = ImageLocationResponse.builder()
                .imageId("111-2234324-4543543-45345")
                .imageLocation("https://image.shutterstock.com/image-vector/communications-comments-ratings-voting-system-600w-1056429164.jpg")
                .build();

        return new ResponseEntity<ImageLocationResponse>(giftResponse, HttpStatus.OK);
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("222 Not avatar or logo 222 ");
//        return "index";  // Trả về trang index.html
    }

    // Có thể mapping thêm các endpoint khác nữa...
}