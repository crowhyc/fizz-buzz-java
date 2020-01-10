package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondCounter {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final String EMPTY_STR = "";
    private boolean role5Switch;
    private boolean role6Switch;
    private boolean role7Switch;

    private List<CounterRule> ruleList =
            new ArrayList<CounterRule>() {
                {
                    add(
                            new CounterRule(
                                    pos -> {
                                        if (pos.isContains(7)) {
                                            role7Switch = false;
                                        }
                                        return EMPTY_STR;
                                    }));
                    add(
                            new CounterRule(
                                    pos -> {
                                        if (pos.isContains(5) && role7Switch) {
                                            role6Switch = false;
                                        }
                                        return EMPTY_STR;
                                    }));
                    add(
                            new CounterRule(
                                    pos -> {
                                        if (pos.isContains(3) && role6Switch) {
                                            role5Switch = false;
                                            return FIZZ;
                                        } else {
                                            return EMPTY_STR;
                                        }
                                    }));
                    add(
                            new CounterRule(
                                    pos ->
                                            pos.isDivisible(3) && role5Switch && role6Switch
                                                    ? FIZZ
                                                    : EMPTY_STR));
                    add(
                            new CounterRule(
                                    pos ->
                                            pos.isDivisible(5) && role5Switch && role7Switch
                                                    ? BUZZ
                                                    : EMPTY_STR));
                    add(
                            new CounterRule(
                                    pos -> pos.isDivisible(7) && role5Switch ? WHIZZ : EMPTY_STR));
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
        role5Switch = true;
        role6Switch = true;
        role7Switch = true;
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
