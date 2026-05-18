package j9;

import android.media.MediaFormat;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h extends f {
    public final String c;
    public final boolean d;

    public h() {
        super(null);
        this.c = "audio/raw";
        this.d = true;
    }

    public g9.e g(String str) {
        return new g9.g(str);
    }

    public MediaFormat i(e9.e eVar) {
        t.g(eVar, "config");
        int l = (eVar.l() * 16) / 8;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", j());
        mediaFormat.setInteger("sample-rate", eVar.n());
        mediaFormat.setInteger("channel-count", eVar.l());
        mediaFormat.setInteger("x-frame-size-in-bytes", l);
        return mediaFormat;
    }

    public String j() {
        return this.c;
    }

    public boolean k() {
        return this.d;
    }
}
