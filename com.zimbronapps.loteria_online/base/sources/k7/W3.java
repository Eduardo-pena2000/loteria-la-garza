package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class w3 implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ S3 b;

    public w3(S3 s3, i iVar) {
        this.a = iVar;
        Objects.requireNonNull(s3);
        this.b = s3;
    }

    public final void run() {
        S3 s3 = this.b;
        s3.x1().E();
        i iVar = this.a;
        if (iVar.c.zza() == null) {
            s3.x1().l0(iVar);
        } else {
            s3.x1().j0(iVar);
        }
    }
}
