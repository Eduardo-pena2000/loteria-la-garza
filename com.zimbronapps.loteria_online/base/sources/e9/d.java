package e9;

import Da.r;
import android.media.AudioRecord;
import android.media.MediaFormat;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d {
    public static final a i = new a(null);
    public static final String j = d.class.getSimpleName();
    public final e a;
    public final MediaFormat b;
    public final AudioRecord c;
    public AutomaticGainControl d;
    public AcousticEchoCanceler e;
    public NoiseSuppressor f;
    public int g;
    public double h;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public d(e eVar, MediaFormat mediaFormat) {
        t.g(eVar, "config");
        t.g(mediaFormat, "mediaFormat");
        this.a = eVar;
        this.b = mediaFormat;
        this.c = a();
        this.h = -160.0d;
        b();
        c();
        d();
    }

    public final AudioRecord a() {
        int integer = this.b.getInteger("sample-rate");
        Integer q = this.a.q();
        this.g = q != null ? q.intValue() : i(integer, h(), g());
        try {
            AudioRecord audioRecord = new AudioRecord(this.a.c(), integer, h(), g(), this.g);
            if (audioRecord.getState() != 1) {
                throw new Exception("PCM reader failed to initialize.");
            }
            if (this.a.f() != null && !audioRecord.setPreferredDevice(this.a.f())) {
                Log.w(j, "Unable to set device " + this.a.f().getProductName());
            }
            return audioRecord;
        } catch (IllegalArgumentException e) {
            throw new Exception("Unable to instantiate PCM reader.", e);
        }
    }

    public final void b() {
        if (!AutomaticGainControl.isAvailable()) {
            if (this.a.d()) {
                Log.d(j, "Auto gain effect is not available.");
            }
        } else {
            AutomaticGainControl create = AutomaticGainControl.create(this.c.getAudioSessionId());
            this.d = create;
            if (create != null) {
                create.setEnabled(this.a.d());
            }
        }
    }

    public final void c() {
        if (!AcousticEchoCanceler.isAvailable()) {
            if (this.a.g()) {
                Log.d(j, "Echo canceler effect is not available.");
            }
        } else {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(this.c.getAudioSessionId());
            this.e = create;
            if (create != null) {
                create.setEnabled(this.a.g());
            }
        }
    }

    public final void d() {
        if (!NoiseSuppressor.isAvailable()) {
            if (this.a.k()) {
                Log.d(j, "Noise suppressor effect is not available.");
            }
        } else {
            NoiseSuppressor create = NoiseSuppressor.create(this.c.getAudioSessionId());
            this.f = create;
            if (create != null) {
                create.setEnabled(this.a.k());
            }
        }
    }

    public final double e() {
        return this.h;
    }

    public final double f(short[] sArr, int i2) {
        Iterator it = r.K0(sArr, i2).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int abs = Math.abs(((Number) it.next()).shortValue());
        while (it.hasNext()) {
            int abs2 = Math.abs(((Number) it.next()).shortValue());
            if (abs < abs2) {
                abs = abs2;
            }
        }
        return 20 * Math.log10(abs / 32767.0d);
    }

    public final int g() {
        return 2;
    }

    public final int h() {
        return this.b.getInteger("channel-count") == 1 ? 16 : 12;
    }

    public final int i(int i2, int i3, int i4) {
        int minBufferSize = AudioRecord.getMinBufferSize(i2, i3, i4);
        if (minBufferSize == -2 || minBufferSize == -1) {
            throw new Exception("Recording config is not supported by the hardware, or an invalid config was provided.");
        }
        return minBufferSize * 2;
    }

    public final String j(int i2) {
        StringBuilder sb = new StringBuilder("Error when reading audio data:");
        sb.append('\n');
        if (i2 == -6) {
            sb.append("ERROR_DEAD_OBJECT: Object is no longer valid and needs to be recreated.");
        } else if (i2 == -3) {
            sb.append("ERROR_INVALID_OPERATION: Failure due to the improper use of a method.");
        } else if (i2 == -2) {
            sb.append("ERROR_BAD_VALUE: Failure due to the use of an invalid value.");
        } else if (i2 != -1) {
            sb.append("Unknown errorCode: (");
            sb.append(i2);
            sb.append(")");
        } else {
            sb.append("ERROR: Generic operation failure");
        }
        String sb2 = sb.toString();
        t.f(sb2, "toString(...)");
        return sb2;
    }

    public final byte[] k() {
        int i2 = this.g / 2;
        short[] sArr = new short[i2];
        int read = this.c.read(sArr, 0, i2);
        if (read < 0) {
            throw new Exception(j(read));
        }
        if (read > 0) {
            this.h = f(sArr, read);
        }
        return m(sArr, read);
    }

    public final void l() {
        this.c.release();
        AutomaticGainControl automaticGainControl = this.d;
        if (automaticGainControl != null) {
            automaticGainControl.release();
        }
        AcousticEchoCanceler acousticEchoCanceler = this.e;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
        }
        NoiseSuppressor noiseSuppressor = this.f;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
        }
    }

    public final byte[] m(short[] sArr, int i2) {
        ByteBuffer order = ByteBuffer.allocate(i2 * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i3 = 0; i3 < i2; i3++) {
            order.putShort(sArr[i3]);
        }
        byte[] array = order.array();
        t.f(array, "array(...)");
        return array;
    }

    public final void n() {
        this.c.startRecording();
    }

    public final void o() {
        try {
            if (this.c.getRecordingState() == 3) {
                this.c.stop();
            }
        } catch (IllegalStateException unused) {
        }
    }
}
