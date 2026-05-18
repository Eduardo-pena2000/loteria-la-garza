package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class s3 implements Runnable {
    public final /* synthetic */ n7 a;
    public final /* synthetic */ S3 b;

    public s3(S3 s3, n7 n7Var) {
        this.a = n7Var;
        Objects.requireNonNull(s3);
        this.b = s3;
    }

    public final void run() {
        S3 s3 = this.b;
        s3.x1().E();
        s3.x1().h0(this.a);
    }
}
