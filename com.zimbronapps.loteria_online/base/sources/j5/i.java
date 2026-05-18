package j5;

import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final e5.c a = new e5.c(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f5.e.values().length];
            try {
                iArr[f5.e.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f5.e.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f5.e.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final boolean a(e5.h hVar) {
        int i = a.a[hVar.H().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                throw new Ca.o();
            }
            if (hVar.q().m() != null || !(hVar.K() instanceof f5.d)) {
                hVar.M();
                return false;
            }
        }
        return true;
    }

    public static final e5.c b() {
        return a;
    }

    public static final Drawable c(e5.h hVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return d.a(hVar.l(), num.intValue());
    }
}
