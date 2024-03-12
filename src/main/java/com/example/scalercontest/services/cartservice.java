package com.example.scalercontest.services;
import com.example.scalercontest.models.carts;
import java.util.*;
public interface cartservice {
    public carts getcartsbyid(int id);
    public carts getcartsbyuserid(int userId);
    public carts deletecartsbyid(int id);

    public carts updatecartsbyid(int id, carts cart);

    public carts addcarts(carts cart);
}
