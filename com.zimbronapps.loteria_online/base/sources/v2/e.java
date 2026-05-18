package V2;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t7.r;
import t7.s;
import t7.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public static final e c = new e(t7.r.t(e.d));
    public static final t7.r d = t7.r.v(2, 5, 6);
    public static final t7.s e = new s.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();
    public final SparseArray a;
    public final int b;

    public static final class b {
        private static t7.t a() {
            t.a i = new t.a().i(new Integer[]{8, 7});
            int i2 = P2.K.a;
            if (i2 >= 31) {
                i.i(new Integer[]{26, 27});
            }
            if (i2 >= 33) {
                i.h(30);
            }
            return i.l();
        }

        public static boolean b(AudioManager audioManager, j jVar) {
            AudioDeviceInfo[] devices = jVar == null ? ((AudioManager) P2.a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{jVar.a};
            t7.t a = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class c {
        public static t7.r a(M2.b bVar) {
            r.a j = t7.r.j();
            t7.U q = e.e.n().q();
            while (q.hasNext()) {
                Integer num = (Integer) q.next();
                int intValue = num.intValue();
                if (P2.K.a >= P2.K.K(intValue) && f.a(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), bVar.a().a)) {
                    j.h(num);
                }
            }
            j.h(2);
            return j.k();
        }

        public static int b(int i, int i2, M2.b bVar) {
            for (int i3 = 10; i3 > 0; i3--) {
                int M = P2.K.M(i3);
                if (M != 0 && f.a(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(M).build(), bVar.a().a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public static final class d {
        public static e a(AudioManager audioManager, M2.b bVar) {
            return new e(e.a(h.a(audioManager, bVar.a().a)), null);
        }

        public static j b(AudioManager audioManager, M2.b bVar) {
            try {
                List a = g.a((AudioManager) P2.a.e(audioManager), bVar.a().a);
                if (a.isEmpty()) {
                    return null;
                }
                return new j((AudioDeviceInfo) a.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    public /* synthetic */ e(List list, a aVar) {
        this(list);
    }

    public static /* synthetic */ t7.r a(List list) {
        return c(list);
    }

    public static boolean b() {
        String str = P2.K.c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    public static t7.r c(List list) {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(w7.f.c(new int[]{12})));
        for (int i = 0; i < list.size(); i++) {
            AudioProfile a2 = V2.a.a(list.get(i));
            if (V2.b.a(a2) != 1) {
                int a3 = V2.c.a(a2);
                if (P2.K.A0(a3) || e.containsKey(Integer.valueOf(a3))) {
                    if (hashMap.containsKey(Integer.valueOf(a3))) {
                        ((Set) P2.a.e((Set) hashMap.get(Integer.valueOf(a3)))).addAll(w7.f.c(V2.d.a(a2)));
                    } else {
                        hashMap.put(Integer.valueOf(a3), new HashSet(w7.f.c(V2.d.a(a2))));
                    }
                }
            }
        }
        r.a j = t7.r.j();
        for (Map.Entry entry : hashMap.entrySet()) {
            j.h(new e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return j.k();
    }

    public static t7.r d(int[] iArr, int i) {
        r.a j = t7.r.j();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            j.h(new e(i2, i));
        }
        return j.k();
    }

    public static e e(Context context, M2.b bVar, AudioDeviceInfo audioDeviceInfo) {
        return f(context, bVar, (P2.K.a < 23 || audioDeviceInfo == null) ? null : new j(audioDeviceInfo));
    }

    public static e f(Context context, M2.b bVar, j jVar) {
        return g(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), bVar, jVar);
    }

    public static e g(Context context, Intent intent, M2.b bVar, j jVar) {
        AudioManager audioManager = (AudioManager) P2.a.e(context.getSystemService("audio"));
        if (jVar == null) {
            jVar = P2.K.a >= 33 ? d.b(audioManager, bVar) : null;
        }
        int i = P2.K.a;
        if (i >= 33 && (P2.K.E0(context) || P2.K.x0(context))) {
            return d.a(audioManager, bVar);
        }
        if (i >= 23 && b.b(audioManager, jVar)) {
            return c;
        }
        t.a aVar = new t.a();
        aVar.h(2);
        if (i >= 29 && (P2.K.E0(context) || P2.K.x0(context))) {
            aVar.j(c.a(bVar));
            return new e(d(w7.f.m(aVar.l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.j(d);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new e(d(w7.f.m(aVar.l()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(w7.f.c(intArrayExtra));
        }
        return new e(d(w7.f.m(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static int h(int i) {
        int i2 = P2.K.a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(P2.K.b) && i == 1) {
            i = 2;
        }
        return P2.K.M(i);
    }

    public static Uri j() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return P2.K.t(this.a, eVar.a) && this.b == eVar.b;
    }

    public int hashCode() {
        return this.b + (P2.K.u(this.a) * 31);
    }

    public Pair i(M2.q qVar, M2.b bVar) {
        int f = M2.y.f((String) P2.a.e(qVar.n), qVar.j);
        if (!e.containsKey(Integer.valueOf(f))) {
            return null;
        }
        if (f == 18 && !l(18)) {
            f = 6;
        } else if ((f == 8 && !l(8)) || (f == 30 && !l(30))) {
            f = 7;
        }
        if (!l(f)) {
            return null;
        }
        e eVar = (e) P2.a.e((e) this.a.get(f));
        int i = qVar.B;
        if (i == -1 || f == 18) {
            int i2 = qVar.C;
            if (i2 == -1) {
                i2 = 48000;
            }
            i = eVar.b(i2, bVar);
        } else if (!qVar.n.equals("audio/vnd.dts.uhd;profile=p2") || P2.K.a >= 33) {
            if (!eVar.c(i)) {
                return null;
            }
        } else if (i > 10) {
            return null;
        }
        int h = h(i);
        if (h == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f), Integer.valueOf(h));
    }

    public boolean k(M2.q qVar, M2.b bVar) {
        return i(qVar, bVar) != null;
    }

    public boolean l(int i) {
        return P2.K.r(this.a, i);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }

    public e(List list) {
        this.a = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            e eVar = (e) list.get(i);
            this.a.put(eVar.a, eVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((e) this.a.valueAt(i3)).b);
        }
        this.b = i2;
    }

    public static final class e {
        public static final e d;
        public final int a;
        public final int b;
        public final t7.t c;

        static {
            d = P2.K.a >= 33 ? new e(2, (Set) a(10)) : new e(2, 10);
        }

        public e(int i, Set set) {
            this.a = i;
            t7.t l = t7.t.l(set);
            this.c = l;
            t7.U q = l.q();
            int i2 = 0;
            while (q.hasNext()) {
                i2 = Math.max(i2, Integer.bitCount(((Integer) q.next()).intValue()));
            }
            this.b = i2;
        }

        public static t7.t a(int i) {
            t.a aVar = new t.a();
            for (int i2 = 1; i2 <= i; i2++) {
                aVar.h(Integer.valueOf(P2.K.M(i2)));
            }
            return aVar.l();
        }

        public int b(int i, M2.b bVar) {
            return this.c != null ? this.b : P2.K.a >= 29 ? c.b(this.a, i, bVar) : ((Integer) P2.a.e((Integer) e.e.getOrDefault(Integer.valueOf(this.a), 0))).intValue();
        }

        public boolean c(int i) {
            if (this.c == null) {
                return i <= this.b;
            }
            int M = P2.K.M(i);
            if (M == 0) {
                return false;
            }
            return this.c.contains(Integer.valueOf(M));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && P2.K.c(this.c, eVar.c);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            t7.t tVar = this.c;
            return i + (tVar == null ? 0 : tVar.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
        }

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
        }
    }
}
