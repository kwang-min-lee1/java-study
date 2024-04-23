package jdbc.board;
// Step 1 : 콘솔 게시판 앱 메뉴
public class BoardEx1 {

    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-4s%-12s%-16s%-40S\n", "1", "winter", "2024-04-23", "안녕하세요");
        System.out.printf("%-4s%-12s%-16s%-40S\n", "2", "winter", "2024-04-23", "반갑습니다.");
        mainMenu();
    }

    public void mainMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("메인메뉴: 1. create | 2. Read | 3. Clear | 4. Exit " );
    }
    public static void main(String[] args) {
        BoardEx1 boardEx = new BoardEx1();
        boardEx.list();

    }
}
