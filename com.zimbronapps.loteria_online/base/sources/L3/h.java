package L3;

import L3.s;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements s.a {
    public boolean a(M2.q qVar) {
        String str = qVar.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public s b(M2.q qVar) {
        String str = qVar.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new N3.a(qVar.q);
                case "application/pgs":
                    return new O3.a();
                case "application/x-mp4-vtt":
                    return new T3.a();
                case "text/vtt":
                    return new T3.g();
                case "application/x-quicktime-tx3g":
                    return new S3.a(qVar.q);
                case "text/x-ssa":
                    return new P3.b(qVar.q);
                case "application/x-subrip":
                    return new Q3.a();
                case "application/ttml+xml":
                    return new R3.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    public int c(M2.q qVar) {
        String str = qVar.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
