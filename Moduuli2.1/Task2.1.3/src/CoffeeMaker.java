public class CoffeeMaker {
    private boolean on = false;
    private String coffeeType = "normal";
    private int amount = 40;

/* Tämän vois varmaan toteuttaa ilman näitä get-metodeja, kun vaan laittais noi metodit,
 jotka muuttaa muuttujia, palauttamaan arvoja, ja niitä vois sitten printata pääohjelmassa
samalla, kun muuttaa arvoja metodeja. No, tein nyt kuitenkin näin. */

    public String onOrOff() {
        String status;
        if (on) {
            status = "on";
        } else {
            status = "off";
        }
        return status;
    }


    public void turnOnOff() {
        this.on = !on;
    }

    public void selectCoffeeType() {
        if (on) {
            if (coffeeType == "normal") {
                coffeeType = "espresso";
            } else {
                coffeeType = "normal";
            }
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void moreCoffee() {
        if (on) {
            if (amount < 80) {
                amount += 10;
            } else {
                amount = 80;
            }
        }
    }

    public void lessCoffee() {
        if (on) {
            if (amount > 10) {
                amount -= 10;
            } else {
                amount = 10;
            }
        }
    }

    public int getAmount() {
        return amount;
    }

}
