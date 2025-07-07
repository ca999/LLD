package Splitwise;

import java.util.List;
import java.util.Map;

public class EqualSplit implements SplitStrategy{
    @Override
    public List<Split> calculateSplits(Map<User, Double> splitData, double totalAmount) {
        return List.of();
    }
}
