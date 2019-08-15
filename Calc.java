package first_program;

class averageSum {
    int[] myList = new int[10];

    void averageSumCalc() {
        myList[0] = 0;
        int massivSum = 0;
        for (int i = 1; i < myList.length; i++) {
            myList[i] = myList[i - 1] + 2;
            System.out.println(myList[i]);
            massivSum = massivSum + myList[i];
        }
        int avgSum = massivSum / myList.length;
        System.out.println(avgSum);
    }
}

class averageSumTest {
    public static void main(String[] args) {
        averageSum av = new averageSum();
        av.averageSumCalc();
    }
}