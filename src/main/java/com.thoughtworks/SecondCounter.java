package com.thoughtworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondCounter {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final String EMPTY_STR = "";
    private RoleSwitch role5Switch = new RoleSwitch();
    private RoleSwitch role6Switch = new RoleSwitch();
    private RoleSwitch role7Switch = new RoleSwitch();

    private List<Function<Pos, String>> ruleList =
            new ArrayList<Function<Pos, String>>() {
                {
                    add(pos -> switchRoleSwitch(pos, 7, role7Switch));
                    add(pos -> switchRoleSwitch(pos, 5, role6Switch, role7Switch));
                    add(
                            pos -> {
                                switchRoleSwitch(pos, 3, role5Switch, role6Switch);
                                if (role5Switch.isOff()) {
                                    return FIZZ;
                                }
                                return EMPTY_STR;
                            });
                    add(
                            pos ->
                                    pos.isDivisible(3) && role5Switch.isOn() && role6Switch.isOn()
                                            ? FIZZ
                                            : EMPTY_STR);
                    add(
                            pos ->
                                    pos.isDivisible(5) && role5Switch.isOn() && role7Switch.isOn()
                                            ? BUZZ
                                            : EMPTY_STR);
                    add(pos -> pos.isDivisible(7) && role5Switch.isOn() ? WHIZZ : EMPTY_STR);
                }
            };

    public String fizzBuzz(Pos pos) {
        resetSwitch();
        String result =
                ruleList.stream().map(func -> func.apply(pos)).collect(Collectors.joining());
        return result.length() > 0 ? result : pos.getPos();
    }

    private String switchRoleSwitch(
            Pos pos, int num, RoleSwitch ownSwitch, RoleSwitch... relateSwitch) {
        boolean canBeTurnOff = Arrays.stream(relateSwitch).allMatch(ret -> ret.state);
        if (pos.isContains(num) && canBeTurnOff) {
            ownSwitch.turnOff();
        }
        return EMPTY_STR;
    }

    private void resetSwitch() {
        role5Switch.turnOn();
        role6Switch.turnOn();
        role7Switch.turnOn();
    }

    class RoleSwitch {
        private boolean state;

        public RoleSwitch() {
            this.state = true;
        }

        public void turnOff() {
            this.state = false;
        }

        public void turnOn() {
            this.state = true;
        }

        public boolean isOn() {
            return this.state;
        }

        public boolean isOff() {
            return !isOn();
        }
    }
}
