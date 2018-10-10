package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by freedom on 2018/10/9.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt peppers..";
    private String artist = "The beats";

    @Override
    public void play() {
        System.out.println("-----------Test-----------title值=" + title + "," + "当前类=.()");
    }
}
