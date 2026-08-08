class Cashier {
    
    int n;
    int discount;
    int count=0;
   Map<Integer,Integer> mp;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n=n;
        this.discount=discount;
        mp=new HashMap<>();
        for(int i=0;i<products.length;i++){
            mp.put(products[i],prices[i]);
        }
        
    }
    
    public double getBill(int[] product, int[] amount) {
        double totalBill=0;
        count++;
        for(int i=0;i<product.length;i++){
            totalBill+=mp.get(product[i])*amount[i];
        }
        if(count%n==0){
            totalBill=totalBill*((100-discount)/100.0);
        }
        return totalBill;
        
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */