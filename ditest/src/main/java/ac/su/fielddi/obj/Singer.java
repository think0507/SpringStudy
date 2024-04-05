package ac.su.fielddi.obj;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Singer {
    private String name;
    private String song;

    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
        System.out.println("Singer is arrived");
    }

    public void sing() {
        if (name != null && song !=null) {
            System.out.printf("%s is singing %s\n", name, song);
            return;
        }
        System.out.println("Singer is singing");
    }
}
