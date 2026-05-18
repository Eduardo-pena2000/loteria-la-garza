package k7;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class e5 implements Runnable {
    public final /* synthetic */ f5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Exception c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ Map e;

    public /* synthetic */ e5(f5 f5Var, int i, Exception exc, byte[] bArr, Map map) {
        this.a = f5Var;
        this.b = i;
        this.c = exc;
        this.d = bArr;
        this.e = map;
    }

    public final /* synthetic */ void run() {
        this.a.a(this.b, this.c, this.d, this.e);
    }
}
