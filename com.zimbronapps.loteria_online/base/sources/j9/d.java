package j9;

import Za.B;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d {
    public static final d a = new d();

    public final String a(String str) {
        if (t.c(str, e9.b.b.b()) || t.c(str, e9.b.c.b()) || t.c(str, e9.b.d.b())) {
            return "audio/mp4a-latm";
        }
        if (t.c(str, e9.b.e.b())) {
            return "audio/3gpp";
        }
        if (t.c(str, e9.b.f.b())) {
            return "audio/amr-wb";
        }
        if (t.c(str, e9.b.j.b()) || t.c(str, e9.b.h.b())) {
            return "audio/raw";
        }
        if (t.c(str, e9.b.i.b())) {
            return "audio/opus";
        }
        if (t.c(str, e9.b.g.b())) {
            return "audio/flac";
        }
        return null;
    }

    public final boolean b(String str) {
        if (str == null) {
            return false;
        }
        if (t.c(str, "audio/raw")) {
            return true;
        }
        Iterator a2 = kotlin.jvm.internal.c.a(new MediaCodecList(0).getCodecInfos());
        while (a2.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) a2.next();
            if (mediaCodecInfo.isEncoder()) {
                Iterator a3 = kotlin.jvm.internal.c.a(mediaCodecInfo.getSupportedTypes());
                while (a3.hasNext()) {
                    if (B.z((String) a3.next(), str, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
