package Splitwise;

public class SplitStrategyFactory {
    public static SplitStrategy getStrategy(SplitwiseService.SplitType splitType) {
        return new EqualSplit();
    }
}
