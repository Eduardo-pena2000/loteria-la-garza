package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class v3 implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ n7 b;
    public final /* synthetic */ S3 c;

    public v3(S3 s3, i iVar, n7 n7Var) {
        this.a = iVar;
        this.b = n7Var;
        Objects.requireNonNull(s3);
        this.c = s3;
    }

    public final void run() {
        S3 s3 = this.c;
        s3.x1().E();
        i iVar = this.a;
        if (iVar.c.zza() == null) {
            s3.x1().m0(iVar, this.b);
        } else {
            s3.x1().k0(iVar, this.b);
        }
    }
}
