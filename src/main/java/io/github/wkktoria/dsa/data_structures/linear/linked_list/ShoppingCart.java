package io.github.wkktoria.dsa.data_structures.linear.linked_list;

class ShoppingCart {
    private LinkedList<String> items;

    ShoppingCart() {
        items = new LinkedList<>();
    }

    void addItem(String itemName) {
        items.append(itemName);
    }

    void removeItem(String itemName) {
        items.remove(itemName);
    }

    void printItems() {
        items.print();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("T-Shirt");
        cart.addItem("Jeans");
        cart.addItem("Jacket");

        cart.printItems();

        cart.removeItem("Jeans");

        cart.printItems();
    }
}
