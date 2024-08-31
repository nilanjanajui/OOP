package previousyearques22;

class Display {
    void disp(char c) {
        System.out.println(c);
    }
    void disp(char c, int num) {
        System.out.println(c+ "," +num);
    }
    void disp(char c, int num, double num2) {
        System.out.println(c+ "," +num+ "," +num2);
    }
}

class Sample {
    public static void main(String args[])
    {
        Display obj = new Display();
        obj.disp('a');
        obj.disp('a',10);
        obj.disp('a',10, 5.5);
    }
}