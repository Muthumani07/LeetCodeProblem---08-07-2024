//Description

// There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

// The operation of drinking a full water bottle turns it into an empty bottle.

// Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

// Input: numBottles = 9, numExchange = 3
// Output: 13
// Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
// Number of water bottles you can drink: 9 + 3 + 1 = 13.



class EmptyBottle {
    public int numWaterBottles(int numBottles, int numExchange) {
        int n =numBottles;
        int m = 0;
        while(n>=numExchange){
            m = n%numExchange;
            n /=numExchange; 
            numBottles +=n;
            n = n+m;
        }
        return numBottles;
    }
    public static void main(String args[]){
        EmptyBottle emptyBottle = new EmptyBottle();
        System.out.println(emptyBottle.numWaterBottles(9, 3)); // Expected output: 13
    }
}