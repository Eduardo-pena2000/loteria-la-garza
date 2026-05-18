package k7;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class r3 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ S3 b;

    public r3(S3 s3, String str) {
        this.a = str;
        Objects.requireNonNull(s3);
        this.b = s3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        S3 s3 = this.b;
        s3.x1().E();
        return s3.x1().F0().C0(this.a);
    }
}
