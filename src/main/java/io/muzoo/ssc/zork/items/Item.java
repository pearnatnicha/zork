package io.muzoo.ssc.zork.items;

public class Item {
    private String itemName;
    private int attackPower;

    public Item(String itemName, int attackPower) {
        this.itemName = itemName;
        this.attackPower = attackPower;
    }

    public String getItemName() {
        return itemName;
    }

    public int attackPower(){
        return attackPower;
    }

}
