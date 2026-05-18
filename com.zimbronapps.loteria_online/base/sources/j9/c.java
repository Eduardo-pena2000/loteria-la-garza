package j9;

import android.media.MediaFormat;
import android.os.Build;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c extends f {
    public final int[] c;
    public final String d;
    public final boolean e;

    public c() {
        super(null);
        this.c = new int[]{6600, 8850, 12650, 14250, 15850, 18250, 19850, 23050, 23850};
        this.d = "audio/amr-wb";
    }

    public g9.e g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Path not provided. Stream is not supported.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return new g9.f(str, false, 2);
        }
        throw new IllegalAccessException("AmrWb requires min API version: 26");
    }

    public MediaFormat i(e9.e eVar) {
        t.g(eVar, "config");
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", j());
        mediaFormat.setInteger("sample-rate", 16000);
        mediaFormat.setInteger("channel-count", 1);
        mediaFormat.setInteger("bitrate", l(this.c, eVar.e()));
        return mediaFormat;
    }

    public String j() {
        return this.d;
    }

    public boolean k() {
        return this.e;
    }
}
