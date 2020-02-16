package arrays.productLastKNumbers;

import java.util.ArrayList;

public class ProductOfNumbers {
    ArrayList<Integer> A;
    public ProductOfNumbers() {
        add(0);
    }

    public void add(int a) {
        if (a > 0)
            A.add(A.get(A.size() - 1) * a);
        else {
            A = new ArrayList();
            A.add(1);
        }
    }

    public int getProduct(int k) {
        int n = A.size();
        return k < n ? A.get(n - 1) / A.get(n - k - 1)  : 0;
    }

    /**
     * add(1)
     * list A: [1]
     * add(2)
     * list A: [1,2]
     * add(3)
     * list A:[1,2,6]
     * add(4)
     * list A:[1,2,6,24]
     * add(5)
     * list A:[1,2,6,24,120]
     * list A:
     * getProduct(1)
     * n=5 k=1 n-k-1=3
     * 120/24 = 5
     * getProduct(2)
     * n=5, k=2, n-k-1=2
     * 120/6 = 20
     */

    /**
     * add(3)
     * list A:[1]
     * add(0)
     * list A:[1]
     * add(2)
     * list A:[1,2]
     * add(5)
     * list A:[1,2,10]
     * add(4)
     * list A:[1,2,10,40]
     *
     * items = [3,0,2,5,4]
     * getProduct(5) i.e. last 5 terms
     * n=4 k=5 => only possible when one of the elements was zero, hence the product is zero
     *
     * getProduct(3)
     * n=4, k=3
     * 40/1 = 40
     *
     * getProduct(2)
     * n-k-1 = 4-2-1 = 1
     * 40/2 = 20
     */
}
