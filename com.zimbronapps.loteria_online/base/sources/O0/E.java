package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements androidx.compose.ui.focus.h {
    public static final e a = new e();
    public static Boolean b;

    public void h(boolean z) {
        b = Boolean.valueOf(z);
    }

    public boolean i() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        L0.a.c("canFocus is read before it is written");
        throw new Ca.i();
    }

    public final boolean o() {
        return b != null;
    }

    public final void p() {
        b = null;
    }
}
