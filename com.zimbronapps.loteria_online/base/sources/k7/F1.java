package k7;

import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f1 {
    public final X3 a;

    public f1(X3 x3) {
        this.a = x3;
    }

    public static f1 c(String str) {
        return new f1((TextUtils.isEmpty(str) || str.length() > 1) ? X3.UNINITIALIZED : a4.j(str.charAt(0)));
    }

    public final X3 a() {
        return this.a;
    }

    public final String b() {
        return String.valueOf(a4.m(this.a));
    }
}
