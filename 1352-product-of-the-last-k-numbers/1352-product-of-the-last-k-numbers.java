class ProductOfNumbers {
    ArrayList<Integer> ans;

    public ProductOfNumbers() {
        ans=new ArrayList<>();
    }
    
    public void add(int num) {
        ans.add(num);
    }
    
    public int getProduct(int k) {
        int prod=1;
        for(int i=ans.size()-k;i<ans.size();i++){
            prod*=ans.get(i);
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna