package j9;

import android.media.MediaFormat;
import android.os.Build;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g extends f {
    public final int[] c;
    public final String d;
    public final boolean e;

    public g() {
        super(null);
        this.c = new int[]{8000, 12000, 16000, 24000, 48000};
        this.d = "audio/opus";
    }

    public g9.e g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Path not provided. Stream is not supported.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return new g9.f(str, false, 4);
        }
        throw new IllegalAccessException("Opus requires min API version: 29");
    }

    public MediaFormat i(e9.e eVar) {
        t.g(eVar, "config");
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", j());
        mediaFormat.setInteger("sample-rate", l(this.c, eVar.n()));
        mediaFormat.setInteger("channel-count", eVar.l());
        mediaFormat.setInteger("bitrate", eVar.e());
        return mediaFormat;
    }

    public String j() {
        return this.d;
    }

    public boolean k() {
        return this.e;
    }
}
