package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class t4 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ b5 e;

    public t4(b5 b5Var, String str, String str2, Object obj, long j) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
        Objects.requireNonNull(b5Var);
        this.e = b5Var;
    }

    public final void run() {
        this.e.B(this.a, this.b, this.c, this.d);
    }
}
