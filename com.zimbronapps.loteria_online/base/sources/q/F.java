package Q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final int a(int i) {
        return Character.charCount(i);
    }

    public static final int b(CharSequence charSequence, int i) {
        return Character.codePointAt(charSequence, i);
    }

    public static final int c(CharSequence charSequence, int i) {
        return Character.codePointBefore(charSequence, i);
    }
}
