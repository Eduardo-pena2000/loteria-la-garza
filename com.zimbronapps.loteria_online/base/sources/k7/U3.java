package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class u3 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ S3 e;

    public u3(S3 s3, String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        Objects.requireNonNull(s3);
        this.e = s3;
    }

    public final void run() {
        String str = this.a;
        if (str == null) {
            S3 s3 = this.e;
            s3.x1().t0(this.b, null);
        } else {
            m5 m5Var = new m5(this.c, str, this.d);
            S3 s32 = this.e;
            s32.x1().t0(this.b, m5Var);
        }
    }
}
