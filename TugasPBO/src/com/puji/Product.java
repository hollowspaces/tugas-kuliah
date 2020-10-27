package com.puji;

public class Product {
    // 4 atribut/field dalam kelas Product
    private int mProductID;
    private String mProductName;
    private double mPrice;
    private int mQuantity;

    // Constructor
    public Product(int productID, String productName, double price, int qty){
        setProduct(productID, productName, price, qty);
    }

    // Fungsi setter/modifier untuk mengubah nilai member yang memiliki akses private
    public void setProduct(int productID, String productName, double price, int qty){
        mProductID = productID;
        mProductName = productName;
        mPrice = price;
        mQuantity = qty;
    }

    // Fungsi getter untuk mengakses member dari class Product yang bersifat private
    public int getProductID(){
        return mProductID;
    }
    public String getProductName(){
        return mProductName;
    }
    public double getHarga(){
        return mPrice;
    }

    // Fungsi print() untuk menampilkan ID produk, nama, harga, dan quantity/jumlah
    public void print(){
        System.out.println("ID Produk: "+mProductID
                +"\nNama Produk: "+mProductName
                +"\nHarga: "+mPrice
                +"\nJumlah: "+mQuantity);
    }

    // Fungsi utama
    public static void main(String[] args) {
        Product tBarang = new Product(0, "Aqua Botol", 5000, 3);
        tBarang.print();
    }
}
