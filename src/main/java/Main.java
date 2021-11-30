public class Main {

    public static void main(String[] args) {
        Pine pine = Pine.builder()
                .branchQuantity(100).
                needlesQuantity(10000)
                .droppingNeedles(true)
                .height(5.6)
                .shape(Shape.CONICAL.name())
                .trunkCircumference(1.4)
                .waterSource(WaterSource.GROUND.name())
                .build();

        Willow willow = Willow.builder()
                .branchQuantity(10)
                .leavesQuantity(1000)
                .height(6.8)
                .leavesColor("Green")
                .shape(Shape.ROUND.name())
                .trunkCircumference(1.3)
                .waterSource(WaterSource.GROUND.name())
                .build();
    }
}
