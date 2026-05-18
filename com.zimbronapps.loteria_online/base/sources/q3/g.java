package q3;

import M2.q;
import P2.K;
import P2.o;
import P2.z;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements a {
    public final q a;

    public g(q qVar) {
        this.a = qVar;
    }

    public static String a(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    public static String b(int i) {
        if (i == 1) {
            return "audio/raw";
        }
        if (i == 85) {
            return "audio/mpeg";
        }
        if (i == 255) {
            return "audio/mp4a-latm";
        }
        if (i == 8192) {
            return "audio/ac3";
        }
        if (i != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    public static a c(z zVar) {
        zVar.U(4);
        int t = zVar.t();
        int t2 = zVar.t();
        zVar.U(4);
        int t3 = zVar.t();
        String a = a(t3);
        if (a != null) {
            q.b bVar = new q.b();
            bVar.v0(t).Y(t2).o0(a);
            return new g(bVar.K());
        }
        o.h("StreamFormatChunk", "Ignoring track with unsupported compression " + t3);
        return null;
    }

    public static a d(int i, z zVar) {
        if (i == 2) {
            return c(zVar);
        }
        if (i == 1) {
            return e(zVar);
        }
        o.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + K.p0(i));
        return null;
    }

    public static a e(z zVar) {
        int y = zVar.y();
        String b = b(y);
        if (b == null) {
            o.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + y);
            return null;
        }
        int y2 = zVar.y();
        int t = zVar.t();
        zVar.U(6);
        int e0 = K.e0(zVar.y());
        int y3 = zVar.a() > 0 ? zVar.y() : 0;
        byte[] bArr = new byte[y3];
        zVar.l(bArr, 0, y3);
        q.b bVar = new q.b();
        bVar.o0(b).N(y2).p0(t);
        if ("audio/raw".equals(b) && e0 != 0) {
            bVar.i0(e0);
        }
        if ("audio/mp4a-latm".equals(b) && y3 > 0) {
            bVar.b0(r.t(bArr));
        }
        return new g(bVar.K());
    }

    public int getType() {
        return 1718776947;
    }
}
