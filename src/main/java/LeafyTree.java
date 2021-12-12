import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public abstract class LeafyTree extends Tree{
    protected int leavesQuantity;
    protected String leavesColor;

    protected String shedLeaves(){
        return "Sheding leaves";
    }
}
