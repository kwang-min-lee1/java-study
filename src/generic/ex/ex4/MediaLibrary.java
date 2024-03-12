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
    Media[] mediaArray = new Media[10];
    int index = 0;

    void addMedia(T media) {
        mediaArray[index++] = media;
    }

    void printMediaTitles() {
        for (int i = 0; i < index; i++) {
            System.out.println(mediaArray[i].getTitle());
        }
    }
}
