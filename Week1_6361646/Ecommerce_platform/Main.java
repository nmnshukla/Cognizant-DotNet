public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Camera", "Electronics"),
            new Product(105, "Backpack", "Bags")
        };

        System.out.println("=== Linear Search ===");
        Product found1 = SearchEngine.linearSearch(products, "Camera");
        System.out.println(found1 != null ? "Found: " + found1 : "Product not found.");

        System.out.println("\n=== Binary Search ===");
        SearchEngine.sortByName(products); // sort before binary search
        Product found2 = SearchEngine.binarySearch(products, "Camera");
        System.out.println(found2 != null ? "Found: " + found2 : "Product not found.");
    }
}