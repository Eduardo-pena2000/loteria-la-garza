package com.revenuecat.purchases.models;

import Ca.q;
import Sa.c;
import Za.k;
import Za.o;
import com.revenuecat.purchases.models.Period;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PeriodKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.Unit.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ q access$toPeriod(String str) {
        return toPeriod(str);
    }

    private static final q toPeriod(String str) {
        double d;
        double d2;
        double d3;
        k g = new o("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$").g(str);
        if (g == null) {
            return new q(0, Period.Unit.UNKNOWN);
        }
        PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = PeriodKt$toPeriod$1$toInt$1.INSTANCE;
        k.b a = g.a();
        String str2 = (String) a.a().b().get(1);
        String str3 = (String) a.a().b().get(2);
        String str4 = (String) a.a().b().get(3);
        String str5 = (String) a.a().b().get(4);
        int intValue = ((Number) periodKt$toPeriod$1$toInt$1.invoke(str2)).intValue();
        int intValue2 = ((Number) periodKt$toPeriod$1$toInt$1.invoke(str3)).intValue();
        int intValue3 = ((Number) periodKt$toPeriod$1$toInt$1.invoke(str4)).intValue();
        int intValue4 = ((Number) periodKt$toPeriod$1$toInt$1.invoke(str5)).intValue();
        Period.Unit unit = intValue4 > 0 ? Period.Unit.DAY : intValue3 > 0 ? Period.Unit.WEEK : intValue2 > 0 ? Period.Unit.MONTH : intValue > 0 ? Period.Unit.YEAR : Period.Unit.UNKNOWN;
        int i = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i != 1) {
            if (i == 2) {
                d2 = intValue * 12.0d;
                d3 = intValue2;
            } else if (i == 3) {
                d2 = (intValue * 52.142857142857146d) + (intValue2 * 4.345238095238096d);
                d3 = intValue3;
            } else if (i == 4) {
                d2 = (intValue * 365.0d) + (intValue2 * 30.0d) + (intValue3 * 7.0d);
                d3 = intValue4;
            } else {
                if (i != 5) {
                    throw new Ca.o();
                }
                d = 0.0d;
            }
            d = d2 + d3;
        } else {
            d = intValue;
        }
        return new q(Integer.valueOf(c.c(d)), unit);
    }
}
