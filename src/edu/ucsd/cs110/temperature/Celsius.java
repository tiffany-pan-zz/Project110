package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    Temperature temp;
    float val;
    public Celsius(float t)
    {
        super(t);
        val = t;
    }

    @Override
    public Temperature toCelsius() {
        temp = new Celsius(super.getValue());
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        temp = new Celsius(super.getValue() * 9 / 5 + 32);
        return temp;
    }

    public String toString()
    {
        return Float.toString(this.val) + " C";
    }
}