package androidx.compose.ui.platform;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a implements P0.b {
    public String a;
    public final int[] b = new int[2];

    public final int[] c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        t.v("text");
        return null;
    }

    public void e(String str) {
        f(str);
    }

    public final void f(String str) {
        this.a = str;
    }
}
