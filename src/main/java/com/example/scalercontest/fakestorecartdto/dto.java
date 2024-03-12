package com.example.scalercontest.fakestorecartdto;
import com.example.scalercontest.models.Product;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
public class dto {
    private int id;
    private int userId;
    private Date date;
    private List<Product> products;
}
