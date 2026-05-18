package L5;

import S5.q2;
import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h {
    public static final h i = new h(320, 50, "320x50_mb");
    public static final h j = new h(468, 60, "468x60_as");
    public static final h k = new h(320, 100, "320x100_as");
    public static final h l = new h(728, 90, "728x90_as");
    public static final h m = new h(300, 250, "300x250_as");
    public static final h n = new h(160, 600, "160x600_as");
    public static final h o = new h(-1, -2, "smart_banner");
    public static final h p = new h(-3, -4, "fluid");
    public static final h q = new h(0, 0, "invalid");
    public static final h r = new h(50, 50, "50x50_mb");
    public final int a;
    public final int b;
    public final String c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;

    static {
        new h(-3, 0, "search_v2");
    }

    public h(int i2, int i3) {
        String valueOf = i2 == -1 ? "FULL" : String.valueOf(i2);
        String valueOf2 = i3 == -2 ? "AUTO" : String.valueOf(i3);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length() + 3);
        sb.append(valueOf);
        sb.append("x");
        sb.append(valueOf2);
        sb.append("_as");
        this(i2, i3, sb.toString());
    }

    public static h a(Context context, int i2) {
        h s = W5.g.s(context, i2, 50, 0);
        s.d = true;
        return s;
    }

    public static h b(Context context, int i2) {
        int y = W5.g.y(context, 0);
        if (y == -1) {
            return q;
        }
        h hVar = new h(i2, 0);
        hVar.f = y;
        hVar.e = true;
        return hVar;
    }

    public static h e(int i2, int i3) {
        h hVar = new h(i2, 0);
        hVar.f = i3;
        hVar.e = true;
        if (i3 < 32) {
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 118);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i3);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            W5.p.f(sb.toString());
        }
        return hVar;
    }

    public static h f(Context context, int i2) {
        h s = W5.g.s(context, i2, 50, 2);
        s.d = true;
        return s;
    }

    public static h g(Context context, int i2) {
        int y = W5.g.y(context, 2);
        h hVar = new h(i2, 0);
        if (y == -1) {
            return q;
        }
        hVar.f = y;
        hVar.e = true;
        return hVar;
    }

    public static h h(Context context, int i2) {
        h s = W5.g.s(context, i2, 50, 1);
        s.d = true;
        return s;
    }

    public static h i(Context context, int i2) {
        int y = W5.g.y(context, 1);
        h hVar = new h(i2, 0);
        if (y == -1) {
            return q;
        }
        hVar.f = y;
        hVar.e = true;
        return hVar;
    }

    public int c() {
        return this.b;
    }

    public int d(Context context) {
        int i2 = this.b;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -2) {
            return q2.M1(context.getResources().getDisplayMetrics());
        }
        S5.B.a();
        return W5.g.c(context, i2);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.c.equals(hVar.c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public int j() {
        return this.a;
    }

    public int k(Context context) {
        int i2 = this.a;
        if (i2 == -3) {
            return -1;
        }
        if (i2 != -1) {
            S5.B.a();
            return W5.g.c(context, i2);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator creator = q2.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean l() {
        return this.a == -3 && this.b == -4;
    }

    public final boolean m() {
        return this.d;
    }

    public final boolean n() {
        return this.e;
    }

    public final void o(boolean z) {
        this.e = true;
    }

    public final void p(int i2) {
        this.f = i2;
    }

    public final int q() {
        return this.f;
    }

    public final boolean r() {
        return this.g;
    }

    public final void s(boolean z) {
        this.g = true;
    }

    public final int t() {
        return this.h;
    }

    public String toString() {
        return this.c;
    }

    public final void u(int i2) {
        this.h = i2;
    }

    public h(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26);
            sb.append("Invalid width for AdSize: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 27);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
    }
}
