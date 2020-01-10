package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondCounter {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "WHIZZ";
    public static final String EMPTY_STR = "";
    private List<CounterRule> ruleList =
            new ArrayList<CounterRule>() {
                {
                    add(new CounterRule(pos -> pos.isDivisible(3) ? FIZZ : EMPTY_STR));
                    add(new CounterRule(pos -> pos.isDivisible(5) ? BUZZ : EMPTY_STR));
                    add(new CounterRule(pos -> pos.isDivisible(7) ? WHIZZ : EMPTY_STR));
                }
            };

    public String fizzBuzz(Pos pos) {
        if (pos.isContains(3)) {
            return FIZZ;
        }
        String result =
                ruleList.stream()
                        .map(counterRule -> counterRule.calcRule(pos))
                        .collect(Collectors.joining());
        if (result.length() == 0) {
            return pos.getPos();
        }
        return result;
    }

    class CounterRule {

        private Function<Pos, String> ruleFunc;

        public CounterRule(Function<Pos, String> ruleFunc) {
            this.ruleFunc = ruleFunc;
        }

        public String calcRule(Pos pos) {
            return ruleFunc.apply(pos);
        }
    }
}
