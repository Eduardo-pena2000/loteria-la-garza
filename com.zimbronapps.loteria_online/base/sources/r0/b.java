package R0;

import Ca.o;
import android.os.Build;
import o0.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final b c = new b("Copy", 0, 0);
    public static final b d = new b("Paste", 1, 1);
    public static final b e = new b("Cut", 2, 2);
    public static final b f = new b("SelectAll", 3, 3);
    public static final b g = new b("Autofill", 4, 4);
    public static final /* synthetic */ b[] h;
    public static final /* synthetic */ Ja.a i;
    public final int a;
    public final int b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    static {
        b[] a2 = a();
        h = a2;
        i = Ja.b.a(a2);
    }

    public b(String str, int i2, int i3) {
        this.a = i3;
        this.b = i3;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{c, d, e, f, g};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) h.clone();
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        int i2 = a.a[ordinal()];
        if (i2 == 1) {
            return 17039361;
        }
        if (i2 == 2) {
            return 17039371;
        }
        if (i2 == 3) {
            return 17039363;
        }
        if (i2 == 4) {
            return 17039373;
        }
        if (i2 != 5) {
            throw new o();
        }
        if (Build.VERSION.SDK_INT <= 26) {
            return m.a;
        }
        return 17039386;
    }
}
