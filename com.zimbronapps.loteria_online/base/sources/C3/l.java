package c3;

import P2.K;
import android.media.MediaCodec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class l extends S2.e {
    public final m a;
    public final String b;
    public final int c;

    public l(Throwable th, m mVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(mVar == null ? null : mVar.a);
        super(sb.toString(), th);
        this.a = mVar;
        int i = K.a;
        String a = i >= 21 ? a(th) : null;
        this.b = a;
        this.c = i >= 23 ? b(th) : K.X(a);
    }

    public static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    public static int b(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
