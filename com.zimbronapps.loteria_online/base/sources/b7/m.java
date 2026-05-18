package B7;

import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class m extends Exception {
    public m() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super(str);
        t.g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, Throwable th) {
        super(str, th);
        t.g(str, "Detail message must not be empty");
    }
}
