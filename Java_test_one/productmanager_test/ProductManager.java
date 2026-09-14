package productmanager_test;
import java.util.*;
import collectiondemo.*;
public class ProductManager {
    private List<Product> productList = new ArrayList<>();
    public void addProduct(Product pro) {
        productList.add(pro);
        System.out.println("成功添加商品: " + pro.getName() + pro.getStock() + "个");
    }

    public void printAllProducts() {
        if (productList.isEmpty()) {
            System.out.println("当前没有商品数据!");
        }
        else {
            System.out.println("-----商品列表开始-----");
            for (Product pro : productList) {
                System.out.println(pro);
            }
        }
        System.out.println("-----商品列表结束, 共" + productList.size() + "种商品-----");
    }

    public void deleteProductByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                productList.remove(i);
                System.out.println("成功删除商品: " + name);
                return;
            }
        }
        System.out.println("没有找到名为" + name + "的商品, 删除失败!");
    }

    public void sellProduct(String name, int stock) {
        for (Product pro : productList) {
            if (pro.getName().equals(name)) {
                if (pro.getStock() <= stock) {
                    System.out.println("商品" + name + "库存不足, 无法出售!");
                    return;
                }
                else {
                    pro.setStock(pro.getStock() - stock);
                    System.out.println("成功出售商品: " + name + " " + stock + "个");
                    return;
                }
            }
        }
        System.out.println("没有找到名为" + name + "的商品, 出售失败!");
    }


}
