package com.shnoble.android.o.preview.system;

import junit.framework.Assert;

import org.junit.Test;

import java.util.Currency;
import java.util.Locale;

/**
 * Created by shhong on 2017. 7. 7..
 */

public class LocaleTest {
    @Test
    public void getDisplayName() throws Exception {
        Locale locale = Locale.getDefault();
        Assert.assertNotNull(locale);

        Currency currency = Currency.getInstance(locale);
        Assert.assertNotNull("Currency is null", currency);

        String displayName;
        displayName = currency.getDisplayName();
        Assert.assertNotNull("Display name is null", displayName);

        displayName = currency.getDisplayName(Locale.JAPAN);
        Assert.assertNotNull("Display name is null", displayName);

        displayName = currency.getDisplayName(null);
        Assert.assertNotNull("Display name is null", displayName);
    }

    @Test
    public void getSymbol() throws Exception {
        Locale locale = Locale.getDefault();
        Assert.assertNotNull(locale);

        Currency currency = Currency.getInstance(locale);
        Assert.assertNotNull("Currency is null", currency);

        String symbol;
        symbol = currency.getSymbol();
        Assert.assertNotNull("Symbol is null", symbol);

        symbol = currency.getSymbol(Locale.JAPAN);
        Assert.assertNotNull("Symbol is null", symbol);

        symbol = currency.getSymbol(null);
        Assert.assertNotNull("Symbol is null", symbol);
    }

    @Test
    public void getDisplayScript() throws Exception {
        Locale locale = Locale.getDefault();
        Assert.assertNotNull(locale);

        String displayScript;
        displayScript = locale.getDisplayScript();
        Assert.assertNotNull("Display Script is null", displayScript);

        displayScript = locale.getDisplayScript(Locale.JAPAN);
        Assert.assertNotNull("Display Script is null", displayScript);

        displayScript = locale.getDisplayScript(null);
        Assert.assertNotNull("Display Script is null", displayScript);
    }
}
