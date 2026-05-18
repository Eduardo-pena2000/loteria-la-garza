package V4;

import Da.Y;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class n {
    public static final Set a = Y.e(new String[]{"image/jpeg", "image/webp", "image/heic", "image/heif"});

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final boolean a(j jVar) {
        return jVar.a() > 0;
    }

    public static final boolean b(j jVar) {
        return jVar.a() == 90 || jVar.a() == 270;
    }

    public static final boolean c(l lVar, String str) {
        int i = a.a[lVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new Ca.o();
            }
        } else if (str == null || !a.contains(str)) {
            return false;
        }
        return true;
    }
}
