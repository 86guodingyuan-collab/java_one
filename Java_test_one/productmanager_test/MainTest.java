package productmanager_test;

public class MainTest {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.addProduct(new Product("键盘",25.23,10));
        productManager.addProduct(new Product("鼠标",15.3,20));
        productManager.addProduct(new Product("显示器",500,5));
        productManager.addProduct(new Product("主机",5000,5));
        productManager.addProduct(new Product("耳机",100,20));

        productManager.printAllProducts();

        System.out.println("\n-----删除耳机-----");
        productManager.deleteProductByName("耳机");

        System.out.println("\n-----删除台灯-----");
        productManager.deleteProductByName("台灯");

        System.out.println("\n-----再次打印所有商品-----");
        productManager.printAllProducts();

        // 出售商品
        System.out.println("\n-----出售主机-----");
        productManager.sellProduct("主机", 2);
        System.out.println("\n-----出售鼠标-----");
        productManager.sellProduct("鼠标", 100);

        productManager.printAllProducts();

    }
}
