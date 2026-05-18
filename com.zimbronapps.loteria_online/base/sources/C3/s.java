package c3;

import M2.q;
import P2.K;
import android.media.MediaCodecInfo;
import c3.F;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {
    public static Boolean a;

    public static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List a = p.a(videoCapabilities);
            if (a == null || a.isEmpty()) {
                return 0;
            }
            o.a();
            int b = b(a, n.a(i, i2, (int) d));
            if (b == 1 && s.a() == null) {
                s.b(Boolean.valueOf(c()));
                if (s.a().booleanValue()) {
                    return 0;
                }
            }
            return b;
        }

        public static int b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i = 0; i < list.size(); i++) {
                if (r.a(q.a(list.get(i)), performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        public static boolean c() {
            List a;
            if (K.a >= 35) {
                return false;
            }
            try {
                M2.q K = new q.b().o0("video/avc").K();
                if (K.n != null) {
                    List v = F.v(w.a, K, false, false);
                    for (int i = 0; i < v.size(); i++) {
                        if (((m) v.get(i)).d != null && ((m) v.get(i)).d.getVideoCapabilities() != null && (a = p.a(((m) v.get(i)).d.getVideoCapabilities())) != null && !a.isEmpty()) {
                            o.a();
                            return b(a, n.a(1280, 720, 60)) == 1;
                        }
                    }
                }
            } catch (F.c unused) {
            }
            return true;
        }
    }

    public static /* synthetic */ Boolean a() {
        return a;
    }

    public static /* synthetic */ Boolean b(Boolean bool) {
        a = bool;
        return bool;
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (K.a < 29) {
            return 0;
        }
        Boolean bool = a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
