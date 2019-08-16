package first_program;

class NechetCisla {
    int[] myList = new int[11];

    void NechetCisla() {
        int maxElements;
        myList[0] = 0;
        for (int i = 1; i < myList.length; i++) {
            myList[i] = myList[i - 1] - 1;
//            if (myList[i] % 3 == 0) {
//            }
            System.out.print(myList[i] + ",");
        }
    }
}

class averageSumTest1 {
    public static void main(String[] args) {
        NechetCisla av = new NechetCisla();
        av.NechetCisla();
    }
}