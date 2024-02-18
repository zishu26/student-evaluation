//package com.zade.studentevaluation.Secutiry;
//
//import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.*;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//@Component
//public class ZadeClient {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    private String authToken;
//
//    private String authURI = "http://localhost:8080/auth/login";
//
//    public void fetchNewToken() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON); // Set content type to JSON
//        // Create a JSON object with email and password
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("email", "zishanansari26@gmail.com");
//        requestBody.put("password", "Summer@26");
//        HttpEntity<String> request = new HttpEntity<>(requestBody.toString(), headers);
//        ResponseEntity<String> response = restTemplate.postForEntity(authURI, request, String.class);
//        if (response.getStatusCode() == HttpStatus.OK) {
//            authToken = response.getBody(); // Update the token
//        } else {
//            throw new RuntimeException("Failed to fetch new token");
//        }
//    }
//
//}
