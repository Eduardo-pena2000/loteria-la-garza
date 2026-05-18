package c3;

import P2.K;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = (String) P2.a.e(str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = M2.y.s(str2);
    }

    public static boolean A(String str, int i) {
        if ("video/hevc".equals(str) && 2 == i) {
            String str2 = K.b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean B(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(K.b)) ? false : true;
    }

    public static m C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new m(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !h(codecCapabilities) || z(str)) ? false : true, codecCapabilities != null && s(codecCapabilities), z5 || (codecCapabilities != null && q(codecCapabilities)));
    }

    public static int a(String str, String str2, int i) {
        if (i > 1 || ((K.a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        P2.o.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    public static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(K.k(i, widthAlignment) * widthAlignment, K.k(i2, heightAlignment) * heightAlignment);
    }

    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point c = c(videoCapabilities, i, i2);
        int i3 = c.x;
        int i4 = c.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return K.a >= 21 && r(codecCapabilities);
    }

    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return K.a >= 21 && t(codecCapabilities);
    }

    public static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean y(String str) {
        return K.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean z(String str) {
        if (K.a <= 22) {
            String str2 = K.d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public Point b(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i, i2);
    }

    public T2.p e(M2.q qVar, M2.q qVar2) {
        int i = !K.c(qVar.n, qVar2.n) ? 8 : 0;
        if (this.k) {
            if (qVar.w != qVar2.w) {
                i |= 1024;
            }
            if (!this.e && (qVar.t != qVar2.t || qVar.u != qVar2.u)) {
                i |= 512;
            }
            if ((!M2.h.h(qVar.A) || !M2.h.h(qVar2.A)) && !K.c(qVar.A, qVar2.A)) {
                i |= 2048;
            }
            if (y(this.a) && !qVar.e(qVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new T2.p(this.a, qVar, qVar2, qVar.e(qVar2) ? 3 : 2, 0);
            }
        } else {
            if (qVar.B != qVar2.B) {
                i |= 4096;
            }
            if (qVar.C != qVar2.C) {
                i |= 8192;
            }
            if (qVar.D != qVar2.D) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair r = F.r(qVar);
                Pair r2 = F.r(qVar2);
                if (r != null && r2 != null) {
                    int intValue = ((Integer) r.first).intValue();
                    int intValue2 = ((Integer) r2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new T2.p(this.a, qVar, qVar2, 3, 0);
                    }
                }
            }
            if (!qVar.e(qVar2)) {
                i |= 32;
            }
            if (x(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new T2.p(this.a, qVar, qVar2, 1, 0);
            }
        }
        return new T2.p(this.a, qVar, qVar2, 0, i);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean i(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        }
        if (a(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        w("channelCount.support, " + i);
        return false;
    }

    public boolean j(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        w("sampleRate.support, " + i);
        return false;
    }

    public final boolean k(M2.q qVar, boolean z) {
        Pair r = F.r(qVar);
        if (r == null) {
            return true;
        }
        int intValue = ((Integer) r.first).intValue();
        int intValue2 = ((Integer) r.second).intValue();
        if ("video/dolby-vision".equals(qVar.n)) {
            if (!"video/avc".equals(this.b)) {
                intValue = "video/hevc".equals(this.b) ? 2 : 8;
            }
            intValue2 = 0;
        }
        if (!this.k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g = g();
        if (K.a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && g.length == 0) {
            g = f(this.d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z) && !A(this.b, intValue))) {
                return true;
            }
        }
        w("codec.profileLevel, " + qVar.j + ", " + this.c);
        return false;
    }

    public boolean l(M2.q qVar) {
        return o(qVar) && k(qVar, false);
    }

    public boolean m(M2.q qVar) {
        int i;
        if (!o(qVar) || !k(qVar, true)) {
            return false;
        }
        if (!this.k) {
            if (K.a >= 21) {
                int i2 = qVar.C;
                if (i2 != -1 && !j(i2)) {
                    return false;
                }
                int i3 = qVar.B;
                if (i3 != -1 && !i(i3)) {
                    return false;
                }
            }
            return true;
        }
        int i4 = qVar.t;
        if (i4 <= 0 || (i = qVar.u) <= 0) {
            return true;
        }
        if (K.a >= 21) {
            return u(i4, i, qVar.v);
        }
        boolean z = i4 * i <= F.P();
        if (!z) {
            w("legacyFrameSize, " + qVar.t + "x" + qVar.u);
        }
        return z;
    }

    public boolean n() {
        if (K.a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o(M2.q qVar) {
        return this.b.equals(qVar.n) || this.b.equals(F.m(qVar));
    }

    public boolean p(M2.q qVar) {
        if (this.k) {
            return this.e;
        }
        Pair r = F.r(qVar);
        return r != null && ((Integer) r.first).intValue() == 42;
    }

    public String toString() {
        return this.a;
    }

    public boolean u(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w("sizeAndRate.vCaps");
            return false;
        }
        if (K.a >= 29) {
            int c = s.c(videoCapabilities, i, i2, d);
            if (c == 2) {
                return true;
            }
            if (c == 1) {
                w("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!d(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !B(this.a) || !d(videoCapabilities, i2, i, d)) {
                w("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            v("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d);
        }
        return true;
    }

    public final void v(String str) {
        P2.o.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + K.e + "]");
    }

    public final void w(String str) {
        P2.o.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + K.e + "]");
    }
}
