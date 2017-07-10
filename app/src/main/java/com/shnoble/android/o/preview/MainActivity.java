package com.shnoble.android.o.preview;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.shnoble.android.o.preview.system.HostName;

import java.util.Currency;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String hostNameFromBuildClass = HostName.getHostNameFromBuildClass();
        String hostNameFromSystemProperties = HostName.getHostNameFromSystemProperties();

        Log.d(TAG, "Host Name From Build.class: " + hostNameFromBuildClass);
        Log.d(TAG, "Host Name From SystemProperties: " + hostNameFromSystemProperties);

        TextView hostNameFromBuildClassView = (TextView) findViewById(R.id.hostname_build_class);
        hostNameFromBuildClassView.setText(hostNameFromBuildClass);

        TextView hostNameFromSystemPropertiesView = (TextView) findViewById(R.id.hostname_system_properties);
        hostNameFromSystemPropertiesView.setText(hostNameFromSystemProperties);


        TextView currencyDisplayNameKorea = (TextView) findViewById(R.id.currency_display_name);
        currencyDisplayNameKorea.setText(getCurrencyDisplayName(Locale.JAPAN));

        TextView currencyDisplayNameNull = (TextView) findViewById(R.id.currency_display_name_null);
        currencyDisplayNameNull.setText(getCurrencyDisplayName(null));


    }

    @TargetApi(19)
    private String getCurrencyDisplayName(Locale locale) {
        Currency currency = Currency.getInstance(Locale.getDefault());
        return currency.getDisplayName(locale);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();

        Log.e(TAG, "onLowMemory");
    }
}
