package com.example.mongoJAVA.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data @Document(collection = "items")
@NoArgsConstructor@AllArgsConstructor
public class Item {
    @Id
    private long itemId;
    private String itemName;
    private int price;
    private String description;
    private Date regDate;

    @Override
    public String toString() {
        return "Item Information [" +
                "itemId=" + itemId +
                "description='" + description + '\'' +
                "price=" + price +
                "itemName='" + itemName + '\'' +
                "regDate=" + regDate +
                ']';
    }
}
