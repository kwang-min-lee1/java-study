package variable;

public class Type7 {
    public static void main(String[] args) {
        // 문자열 => 기본타입으로 강제 변환
        String s1 ="60000";
        int i1 = Integer.parseInt(s1);

        double d1 = Double.parseDouble("3.14");

        String s4 = "true";
        boolean b = Boolean.parseBoolean("true");
        // IntelliJ 타입추론 변수추출 단축기 ctrl +alt +v

        String s = String.valueOf(100);
        String s2 = String.valueOf(3.14);
        String s3 = String.valueOf(false);

    }
}
