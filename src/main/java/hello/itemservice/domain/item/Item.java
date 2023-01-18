package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemname, Integer price, Integer quantity) {
        this.itemName = itemname;
        this.price = price;
        this.quantity = quantity;
    }
}
