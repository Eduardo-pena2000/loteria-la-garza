package k7;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class y3 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ S3 d;

    public y3(S3 s3, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        Objects.requireNonNull(s3);
        this.d = s3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        S3 s3 = this.d;
        s3.x1().E();
        return s3.x1().F0().D0(this.a, this.b, this.c);
    }
}
