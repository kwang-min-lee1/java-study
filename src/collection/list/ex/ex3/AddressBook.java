package collection.list.ex.ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 주소록 관리
public class AddressBook {

    // Composition: 필드로 데이터 (친구 클래스 리스트)를 가짐
    private List<Friend> friendsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 삽입
    public void addFriend() {
        System.out.println("친구 이름을 입력하세요: " );
        String name = scanner.nextLine();
        System.out.println("친구 이메일을 입력하세요: " );
        String email = scanner.nextLine();
        System.out.println("친구 전화번호를 입력하세요: " );
        String phoneNumber = scanner.nextLine();

        friendsList.add(new Friend(name,email,phoneNumber));
        System.out.println("주소록에 추가되었습니다.");
    }

    // 삭제
    public void deleteFriend(){

        //사용자로부터 삭제할 친구의 이름을 입력받기
        System.out.println("삭제할 이름을 입력하시오");
        String name = scanner.nextLine();

        // 친구 목록을 순회하기 위해 Iterator 를 사용
        Iterator<Friend> iterator = friendsList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                iterator.remove(); // 안전한 삭제
                // friendsList.remove(name)  // X
                System.out.println(name + "님의 이름이 삭제되었습니다.");
            }
        }  System.out.println("삭제할 이름이 없습니다.");
    }

    // 조회
    public void searchFriend() {

        System.out.println("조회할 친구 이름을 입력하세요");
        String name = scanner.nextLine();

        boolean isSearched = false;

        for (Friend friend : friendsList) {
            if (name.equals(friend.getName())) {
                System.out.println(friend);
                isSearched = true;
            }
        }
        if (!isSearched) System.out.println("찾을수 없는 이름입니다.");
    }

    // 출력
    public void printAllFriend() {
        for (Friend friend : friendsList) {
            System.out.println(friend.toString());
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true){
            // """ """ String Template 텍스트를 보이는 그대로 출력
            System.out.println("""
                    1. 친구추가
                    2. 친구삭제
                    3. 친구검색
                    4. 주소록 출력
                    5. 종료
                    선택>
                    """);
            int select = scanner.nextInt();

            // 향상된 switch-case 문
            switch (select) {
                case 1 -> addressBook.addFriend();
                case 2 -> addressBook.deleteFriend();
                case 3 -> addressBook.searchFriend();
                case 4 -> addressBook.printAllFriend();
                case 5 -> {
                    System.out.println("종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
