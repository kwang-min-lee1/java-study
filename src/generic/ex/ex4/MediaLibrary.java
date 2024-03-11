package generic.ex.ex4;

import java.util.ArrayList;
import java.util.List;

/*
미디어 라이브러리 클래스 구현:
MediaLibrary 클래스를 제네릭으로 정의하여, 다양한 타입의 Media 항목을 저장할 수 있습니다.
addMedia 메소드와 printMediaTitles 메소드를 포함합니다.
 */

// MediaLibrary 클래스는 제네릭으로 정의되어 다양한 타입의 미디어 항목을 저장할 수 있다.
// T는 Media 인터페이스를 구현하는 어떤 클래스도 될 수 있다.
public class MediaLibrary<T extends Media> {

    // mediaList는 저장된 미디어 항목을 관리하는 리스트
    private List<T> mediaList;

    // 생성자에서는 이 리스트를 초기화
    public MediaLibrary() {
        this.mediaList = new ArrayList<>();
    }
    // addMedia 메소드는 미디어 항목을 라이브러리에 추가
    public void addMedia(T media){
        mediaList.add(media);
    }

    // printMediaTitles 메소드는 라이브러리에 저장된 모든 미디어 항목의 제목을 출력
    public void printMediaTitles() {
        for (T media : mediaList) {
            System.out.println(media.getTitle());
        }

    }

}
