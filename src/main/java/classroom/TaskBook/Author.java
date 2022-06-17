package classroom.TaskBook;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Author {
    @Getter
    public String name = "";
    @Getter @Setter
    public String email = "";

}
