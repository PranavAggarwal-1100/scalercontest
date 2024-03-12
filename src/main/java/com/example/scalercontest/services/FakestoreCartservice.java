package com.example.scalercontest.services;
import com.example.scalercontest.models.carts;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.scalercontest.fakestorecartdto.dto;
import java.util.*;
@Service
public class FakestoreCartservice implements cartservice {
    private final RestTemplate restTemplate;
    public FakestoreCartservice(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    @Override
    public carts getcartsbyid(int id) {
        String URL = "https://fakestoreapi.com/carts/"+id;
        return this.restTemplate.getForObject(URL, carts.class);
//        ResponseEntity<carts> response = this.restTemplate.exchange("https://fakestoreapi.com/carts/"+id, HttpMethod.GET, null, new ParameterizedTypeReference<carts>() {});
//        return response.getBody();
    }
    @Override
    public carts getcartsbyuserid(int userId) {
        String URL = "https://fakestoreapi.com/carts/user/"+userId;
        return this.restTemplate.getForObject(URL, carts.class);
//        ResponseEntity<carts> response = this.restTemplate.exchange("https://fakestoreapi.com/carts/user/"+userId, HttpMethod.GET, null, new ParameterizedTypeReference<carts>() {});
//        return response.getBody();
    }
    @Override
    public carts deletecartsbyid(int id) {
        String URL = "https://fakestoreapi.com/carts/"+id;
        ResponseEntity<carts> response = this.restTemplate.exchange(URL, HttpMethod.DELETE, null, new ParameterizedTypeReference<carts>() {});
        return response.getBody();
//        return this.restTemplate.exchange(URL, HttpMethod.DELETE, null, carts.class).getBody();
//        ResponseEntity<carts> response = this.restTemplate.exchange("https://fakestoreapi.com/carts/"+id, HttpMethod.DELETE, null, new ParameterizedTypeReference<carts>() {});
//        return response.getBody();
    }

    @Override
    public carts updatecartsbyid(int id, carts cart) {
        String URL = "https://fakestoreapi.com/carts/" + id;
        HttpEntity<carts> request = new HttpEntity<>(cart);
        ResponseEntity<carts> response = this.restTemplate.exchange(URL, HttpMethod.PUT, request, new ParameterizedTypeReference<carts>() {
        });
        return response.getBody();
    }

    @Override
    public carts addcarts(carts cart) {
        String URL = "https://fakestoreapi.com/carts";
        HttpEntity<carts> request = new HttpEntity<>(cart);
        ResponseEntity<carts> response = this.restTemplate.exchange(URL, HttpMethod.POST, request, new ParameterizedTypeReference<carts>() {
        });
        return response.getBody();
    }

}
