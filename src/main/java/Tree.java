import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public abstract class Tree {

    protected double trunkCircumference;
    protected double height;
    protected int branchQuantity;
    protected String shape;
    protected String waterSource;
}
