package Prac12.user12;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        //Set
        HashSet<String> set = new HashSet<>();

        // 삼겹살 구워먹기 위한 재료들을 추가한다. 일부러 중복값 넣어봤어. Set은 중복값 허용하지 않는다. 순서보장도 안 된다.
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료수");
        set.add("후추");
        set.add("삼겹살");
        set.add("소금");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수: " + set.size());

        // 순회
        for(String s : set) {
            System.out.println(s);
        }
        System.out.println("-----------");



    }
}
