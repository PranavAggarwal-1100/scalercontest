package com.example.scalercontest.controllers;
import com.example.scalercontest.services.cartservice;
import com.example.scalercontest.services.FakestoreCartservice;
import com.example.scalercontest.models.carts;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.websocket.server.PathParam;
import java.util.*;
@RestController
@RequestMapping("/cart")
public class CartController {
    private final cartservice storeService;

    public CartController(cartservice storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/{id}")
//    public carts getCartById(@PathVariable("id") int id) {
//        return this.storeService.getcartsbyid(id);
    public ResponseEntity<carts> getCartById(@PathVariable int id) {
        return ResponseEntity.ok(this.storeService.getcartsbyid(id));
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<carts> getCartByUserId(@PathVariable int userId) {
        return ResponseEntity.ok(this.storeService.getcartsbyuserid(userId));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<carts> deleteCartById(@PathVariable int id) {
        return ResponseEntity.ok(this.storeService.deletecartsbyid(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<carts> updateCartById(@PathVariable int id, @RequestBody carts cart) {
        return ResponseEntity.ok(this.storeService.updatecartsbyid(id, cart));
    }
    @PostMapping("")
    public ResponseEntity<carts> addCart(@RequestBody carts cart) {
        return ResponseEntity.ok(this.storeService.addcarts(cart));
    }



}
