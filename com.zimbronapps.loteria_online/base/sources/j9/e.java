package j9;

import android.media.MediaFormat;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e extends f {
    public final int[] c;
    public final String d;
    public final boolean e;

    public e() {
        super(null);
        this.c = new int[]{8000, 11025, 22050, 44100, 48000};
        this.d = "audio/flac";
    }

    public g9.e g(String str) {
        if (str != null) {
            return new g9.d(str);
        }
        throw new IllegalArgumentException("Path not provided. Stream is not supported.");
    }

    public MediaFormat i(e9.e eVar) {
        t.g(eVar, "config");
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", j());
        mediaFormat.setInteger("sample-rate", l(this.c, eVar.n()));
        mediaFormat.setInteger("channel-count", eVar.l());
        mediaFormat.setInteger("bitrate", 0);
        mediaFormat.setInteger("flac-compression-level", 8);
        return mediaFormat;
    }

    public String j() {
        return this.d;
    }

    public boolean k() {
        return this.e;
    }
}
