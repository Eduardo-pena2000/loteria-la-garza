package j9;

import android.media.MediaFormat;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class i extends f {
    public final String c;
    public final boolean d;
    public int e;

    public i() {
        super(null);
        this.c = "audio/raw";
        this.d = true;
    }

    public g9.e g(String str) {
        if (str != null) {
            return new g9.h(str, this.e);
        }
        throw new IllegalArgumentException("Path not provided. Stream is not supported.");
    }

    public MediaFormat i(e9.e eVar) {
        t.g(eVar, "config");
        this.e = (eVar.l() * 16) / 8;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", j());
        mediaFormat.setInteger("sample-rate", eVar.n());
        mediaFormat.setInteger("channel-count", eVar.l());
        mediaFormat.setInteger("x-frame-size-in-bytes", this.e);
        return mediaFormat;
    }

    public String j() {
        return this.c;
    }

    public boolean k() {
        return this.d;
    }
}
