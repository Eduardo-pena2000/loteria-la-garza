package S5;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class y2 {
    public final L5.h[] a;
    public final String b;

    public y2(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, L5.x.a);
        String string = obtainAttributes.getString(L5.x.b);
        String string2 = obtainAttributes.getString(L5.x.c);
        boolean isEmpty = TextUtils.isEmpty(string);
        boolean isEmpty2 = TextUtils.isEmpty(string2);
        if (!isEmpty && isEmpty2) {
            this.a = c(string);
        } else {
            if (!isEmpty || isEmpty2) {
                if (isEmpty) {
                    obtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                obtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.a = c(string2);
        }
        String string3 = obtainAttributes.getString(L5.x.d);
        this.b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    public static L5.h[] c(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        L5.h[] hVarArr = new L5.h[length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    String str2 = split2[0];
                    int parseInt = "FULL_WIDTH".equals(str2) ? -1 : Integer.parseInt(str2);
                    String str3 = split2[1];
                    hVarArr[i] = new L5.h(parseInt, "AUTO_HEIGHT".equals(str3) ? -2 : Integer.parseInt(str3));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                hVarArr[i] = L5.h.i;
            } else if ("LARGE_BANNER".equals(trim)) {
                hVarArr[i] = L5.h.k;
            } else if ("FULL_BANNER".equals(trim)) {
                hVarArr[i] = L5.h.j;
            } else if ("LEADERBOARD".equals(trim)) {
                hVarArr[i] = L5.h.l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                hVarArr[i] = L5.h.m;
            } else if ("SMART_BANNER".equals(trim)) {
                hVarArr[i] = L5.h.o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                hVarArr[i] = L5.h.n;
            } else if ("FLUID".equals(trim)) {
                hVarArr[i] = L5.h.p;
            } else {
                if (!"ICON".equals(trim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
                hVarArr[i] = L5.h.r;
            }
        }
        if (length != 0) {
            return hVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final L5.h[] a(boolean z) {
        if (z || this.a.length == 1) {
            return this.a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final String b() {
        return this.b;
    }
}
