package com.vinimanfrin.toys_fiap.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Constants {

    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#,##0.00",
            new DecimalFormatSymbols(new Locale("pt", "BR")));
}
