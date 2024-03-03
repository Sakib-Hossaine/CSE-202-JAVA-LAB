import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Item> items;

    public Shop(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    private Item findItem(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) 
            {
                return item;
            }
        }
        return null;
    }

    public void addItem(String name, String id, String category, double price, int count) {
        Item item = findItem(id);
        if (item != null) {
            item.quantity += count;
        } else {
            items.add(new Item(name, id, category, price, count));
        }
    }

    public void viewItem(String id) {
        Item item = findItem(id);
        if (item != null) {
            System.out.println(item);
        }
    }

    public void viewItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void sellAnItem(String id, int quantity) {
        Item item = findItem(id);
        if (item != null) {
            item.quantity -= quantity;
        } else {
            System.out.println("Item not found");
        }
    }

    public double getSalePriceOfAnItem(String id, double saleAmount) {
        Item item = findItem(id);
        if (item != null) {
            return item.getSalePrice(saleAmount);
        } else {
            System.out.println("Item not found");
            return 0;
        }
    }
}