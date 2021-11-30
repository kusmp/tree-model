import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Pine extends Conifer implements TreeGrowth{

    @Override
    public String grow() {
        return "Pine grownig";
    }
}
