package first_program;

class DelenieNa3 {
    int[] myList = {33,22,99};

    void DelenieNa3() {
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 3 == 0) {
                System.out.println(myList[i]);
            }
        }
    }
}

class averageSumTest1 {
    public static void main(String[] args) {
        DelenieNa3 av = new DelenieNa3();
        av.DelenieNa3();
    }
}