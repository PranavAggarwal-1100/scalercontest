package com.example.scalercontest.models;
import java.util.*;
import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class carts {
    private int id;
    private int userId;
    private Date date;
    private List<Product> products;
}
