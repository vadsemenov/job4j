package ru.job4j.converter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        float result = converter.rubleToDollar(60);
        assertThat(result, is(1f));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        float result = converter.rubleToEuro(70);
        assertThat(result, is(1f));
    }

    @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        float result = converter.dollarToRuble(1);
        assertThat(result, is(60f));
    }

    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        float result = converter.euroToRuble(1);
        assertThat(result, is(70f));
    }
}