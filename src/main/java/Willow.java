import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Willow extends LeafyTree implements TreeGrowth{

    @Override
    public String grow() {
        return "Willow growing";
    }
}
