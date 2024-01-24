public class 정수캐시 {
    public static void main(String[] args){
        Integer a = 100;
        Integer b = 100;
        boolean result = (a == b); // 이 경우 true가 될 수 있음, 정수 캐시 때문에

        Integer c = 128;
        Integer d = 128;
        boolean result2 = (c == d); // 이 경우 대부분 false가 됨, 새로운 객체가 생성되기 때문에

        System.out.println(result + " " + result2);
    }
}
