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
    private boolean role4Switch;
    private boolean role5Switch;

    private List<CounterRule> ruleList =
            new ArrayList<CounterRule>() {
                {
                    add(
                            new CounterRule(
                                    pos -> {
                                        if (pos.isContains(5)) {
                                            role5Switch = false;
                                        }
                                        return EMPTY_STR;
                                    }));
                    add(
                            new CounterRule(
                                    pos -> {
                                        if (pos.isContains(3) && role5Switch) {
                                            role4Switch = false;
                                            return FIZZ;
                                        } else {
                                            return EMPTY_STR;
                                        }
                                    }));
                    add(
                            new CounterRule(
                                    pos ->
                                            pos.isDivisible(3) && role4Switch && role5Switch
                                                    ? FIZZ
                                                    : EMPTY_STR));
                    add(
                            new CounterRule(
                                    pos -> pos.isDivisible(5) && role4Switch ? BUZZ : EMPTY_STR));
                    add(
                            new CounterRule(
                                    pos -> pos.isDivisible(7) && role4Switch ? WHIZZ : EMPTY_STR));
                }
            };

    public String fizzBuzz(Pos pos) {
        initSwitch();
        String result =
                ruleList.stream()
                        .map(counterRule -> counterRule.calcRule(pos))
                        .collect(Collectors.joining());
        return result.length() > 0 ? result : pos.getPos();
    }

    private void initSwitch() {
        role4Switch = true;
        role5Switch = true;
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
