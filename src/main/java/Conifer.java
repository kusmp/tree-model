import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Conifer extends Tree{

    protected int needlesQuantity;
    protected boolean droppingNeedles;

    protected String shedNeedles(){
        if (droppingNeedles){
            return "Sheding needles";
        }
        return "Needles are not sheding";
    }
}
