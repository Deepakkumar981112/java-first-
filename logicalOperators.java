class andOperator {
    public static void main(String arr[]) {
        int a = 4;
        int b = 5;
        int c = 47;
        int d = 46;
        boolean result = a > b && c > d;
        System.out.println(result);
    }
}

class orOperator {
    public static void main(String arr[]) {
        int a = 4;
        int b = 5;
        int c = 47;
        int d = 46;
        boolean result = a > b || c > d;
        System.out.println(result);
    }
}


class notOperator {
    public static void main(String arr[]) {
        int a = 4;
        int b = 5;
        int c = 47;
        int d = 46;
        boolean result = a > b || c > d;
        System.out.println(!result);
    }
}