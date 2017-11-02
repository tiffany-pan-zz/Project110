package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    Temperature temp;
    float value;
    public Fahrenheit(float t)
    {
        super(t);
        value = t;
    }

    @Override
    public Temperature toCelsius() {
        temp = new Fahrenheit((super.getValue() - 32) /9 *5);
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        temp = new Fahrenheit(super.getValue());
        return temp;
    }

    public String toString()
    {
        return Float.toString(this.value) + " F";
    }
}