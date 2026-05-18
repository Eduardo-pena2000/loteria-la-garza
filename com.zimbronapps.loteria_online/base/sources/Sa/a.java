package sa;

import android.graphics.Typeface;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum a {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            try {
                iArr[a.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.ITALIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.MONOSPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static a b(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Log.w("NativeTemplateFontStyle", "Invalid index for NativeTemplateFontStyle: " + i);
        return NORMAL;
    }

    public Typeface c() {
        int i = a.a[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.defaultFromStyle(2) : Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}
