package Splitwise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BalanceSheet {
    private final Map<User, Map<User, Double>> balances;

    public BalanceSheet() {
        balances = new ConcurrentHashMap<>();
    }

    public void updateBalance(User paidBy, List<Split>splits) {
        for (Split split : splits) {
            User user = split.getUser();
            double amount = split.getAmount();
            if (user.equals(paidBy)) {
                continue;
            }

            balances.putIfAbsent(paidBy, new HashMap<>());
            balances.putIfAbsent(user, new HashMap<>());


            balances.get(paidBy).put(user, balances.get(paidBy).getOrDefault(user, 0.0) + amount);
            balances.get(user).put(paidBy, balances.get(user).getOrDefault(user, 0.0) - amount);

        }

    }

    public void settleBalance(User paidBy, User payee, double amount) {
        balances.putIfAbsent(paidBy, new HashMap<>());
        balances.putIfAbsent(payee, new HashMap<>());

        double currentOwned = balances.get(paidBy).getOrDefault(payee, 0.0);

        if(currentOwned < amount) {
            throw new IllegalArgumentException("Too much");
        }

        balances.get(paidBy).put(payee, currentOwned - amount);
        balances.get(payee).put(paidBy, balances.get(payee).getOrDefault(paidBy, 0.0) + amount);


    }
}

