/* Tehtävässä mainittiin "higher gasoline consumption", mutta alkuperäisessä Car-luokassa
ei ole missään metodissa mitään tähän liittyvään, niin alkanut keksimään sitä tätä tehtävää varten.
Eli minun SportsCar vain kiihdyttää ja jarruttaa nopeammin*/

public class SportsCar extends Car {

    public SportsCar (String typeName, double cap, double speedLim, double speedLevel, double gasoline) {
        super(typeName, cap, speedLim, speedLevel, gasoline);
    }

    @Override
    public void accelerate() {
        if (super.getGasolineLevel() > 0)
            super.setSpeed(super.getSpeed() + 20);
        else
            super.setSpeed(0);
    }

    @Override
    void decelerate(int amount) {
        if (super.getGasolineLevel() > 0) {
            if (amount > 0)
                super.setSpeed(Math.max(0, super.getSpeed() - amount * 2));
        } else
            super.setSpeed(0);;
    }
}
