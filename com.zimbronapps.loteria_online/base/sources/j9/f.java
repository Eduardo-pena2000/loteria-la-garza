package j9;

import Ca.q;
import Da.M;
import Da.r;
import Da.w;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.Log;
import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class f {
    public static final a a = new a(null);
    public static final String b = f.class.getSimpleName();

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ f(k kVar) {
        this();
    }

    public final void a(MediaFormat mediaFormat, int i) {
        mediaFormat.setInteger("bitrate", i);
    }

    public final boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities, e9.e eVar, MediaFormat mediaFormat) {
        if (codecCapabilities.isFormatSupported(mediaFormat)) {
            return true;
        }
        Range bitrateRange = codecCapabilities.getAudioCapabilities().getBitrateRange();
        t.f(bitrateRange, "getBitrateRange(...)");
        a(mediaFormat, e(bitrateRange, eVar.e()));
        if (codecCapabilities.getAudioCapabilities().getSupportedSampleRates() != null) {
            int[] supportedSampleRates = codecCapabilities.getAudioCapabilities().getSupportedSampleRates();
            t.f(supportedSampleRates, "getSupportedSampleRates(...)");
            d(mediaFormat, l(supportedSampleRates, eVar.n()));
        }
        c(mediaFormat, l(new int[]{1, codecCapabilities.getAudioCapabilities().getMaxInputChannelCount()}, eVar.l()));
        return codecCapabilities.isFormatSupported(mediaFormat);
    }

    public void c(MediaFormat mediaFormat, int i) {
        t.g(mediaFormat, "format");
        mediaFormat.setInteger("channel-mask", i);
    }

    public void d(MediaFormat mediaFormat, int i) {
        t.g(mediaFormat, "format");
        mediaFormat.setInteger("sample-rate", i);
    }

    public final int e(Range range, int i) {
        if (range.getLower().intValue() > i) {
            Number lower = range.getLower();
            t.f(lower, "getLower(...)");
            return lower.intValue();
        }
        if (range.getUpper().intValue() >= i) {
            return i;
        }
        Number upper = range.getUpper();
        t.f(upper, "getUpper(...)");
        return upper.intValue();
    }

    public final String f(e9.e eVar, MediaFormat mediaFormat) {
        Iterator a2 = kotlin.jvm.internal.c.a(new MediaCodecList(0).getCodecInfos());
        while (a2.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) a2.next();
            if (mediaCodecInfo.isEncoder()) {
                try {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(j());
                    if (capabilitiesForType != null && b(capabilitiesForType, eVar, mediaFormat)) {
                        return mediaCodecInfo.getName();
                    }
                } catch (IllegalArgumentException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public abstract g9.e g(String str);

    public final q h(e9.e eVar, i9.a aVar) {
        t.g(eVar, "config");
        t.g(aVar, "listener");
        MediaFormat i = i(eVar);
        if (k()) {
            return new q(new i9.d(eVar, this, i, aVar), i);
        }
        String f = f(eVar, i);
        if (f != null) {
            return new q(new i9.c(eVar, this, i, aVar, f), i);
        }
        throw new Exception("No codec found for given config " + i + ". You should try with other values.");
    }

    public abstract MediaFormat i(e9.e eVar);

    public abstract String j();

    public abstract boolean k();

    public final int l(int[] iArr, int i) {
        t.g(iArr, "values");
        int i2 = 0;
        int abs = Math.abs(iArr[0] - i);
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            int abs2 = Math.abs(iArr[i3] - i);
            if (abs2 < abs) {
                i2 = i3;
                abs = abs2;
            }
        }
        if (i != iArr[i2]) {
            String str = b;
            Wa.i W = r.W(iArr);
            ArrayList arrayList = new ArrayList(w.y(W, 10));
            M it = W.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(iArr[it.a()]));
            }
            Log.d(str, "Available values: " + arrayList);
            Log.d(b, "Adjusted to: " + iArr[i2]);
        }
        return iArr[i2];
    }

    public f() {
    }
}
