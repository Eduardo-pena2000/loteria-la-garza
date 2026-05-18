package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Ca.o;
import Za.B;
import Za.E;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import com.revenuecat.purchases.models.Period;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class PeriodExtensionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ MeasureUnit getMeasureUnit(Period.Unit unit) {
        t.g(unit, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i == 1) {
            return MeasureUnit.DAY;
        }
        if (i == 2) {
            return MeasureUnit.WEEK;
        }
        if (i == 3) {
            return MeasureUnit.MONTH;
        }
        if (i == 4) {
            return MeasureUnit.YEAR;
        }
        if (i == 5) {
            return null;
        }
        throw new o();
    }

    private static final String localized(Period period, Locale locale, MeasureFormat.FormatWidth formatWidth) {
        String localizedPeriod = localizedPeriod(period, locale, formatWidth);
        if (period.getValue() != 1 || !B.N(localizedPeriod, "1", false, 2, null)) {
            return localizedPeriod;
        }
        String substring = localizedPeriod.substring(1);
        t.f(substring, "substring(...)");
        return E.j1(substring).toString();
    }

    public static final /* synthetic */ String localizedAbbreviatedPeriod(Period period, Locale locale) {
        t.g(period, "<this>");
        t.g(locale, "locale");
        return localized(period, locale, MeasureFormat.FormatWidth.SHORT);
    }

    public static final /* synthetic */ String localizedPeriod(Period period, Locale locale, MeasureFormat.FormatWidth formatWidth) {
        t.g(period, "<this>");
        t.g(locale, "locale");
        t.g(formatWidth, "formatWidth");
        String format = MeasureFormat.getInstance(locale, formatWidth).format(new Measure(Integer.valueOf(period.getValue()), getMeasureUnit(period.getUnit())));
        t.f(format, "getInstance(locale, form… unit.measureUnit),\n    )");
        return format;
    }

    public static /* synthetic */ String localizedPeriod$default(Period period, Locale locale, MeasureFormat.FormatWidth formatWidth, int i, Object obj) {
        if ((i & 2) != 0) {
            formatWidth = MeasureFormat.FormatWidth.WIDE;
        }
        return localizedPeriod(period, locale, formatWidth);
    }

    public static final /* synthetic */ String localizedUnitPeriod(Period period, Locale locale) {
        t.g(period, "<this>");
        t.g(locale, "locale");
        return localized(period, locale, MeasureFormat.FormatWidth.WIDE);
    }
}
