package q9;

import M2.A;
import M2.B;
import M2.C;
import M2.G;
import M2.H;
import M2.I;
import M2.J;
import M2.b;
import M2.u;
import R2.f;
import R2.k;
import R2.l;
import T2.S0;
import T2.W0;
import T2.q;
import T2.r;
import T2.t;
import T2.v;
import T2.v0;
import T2.w0;
import V2.x;
import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import da.j;
import g3.K;
import g3.S;
import g3.T;
import g3.l;
import g3.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class e implements j.c, C.d, d3.b {
    public static Random H = new Random();
    public v A;
    public Integer B;
    public Integer C;
    public String D;
    public Integer E;
    public final Context a;
    public final j b;
    public final g c;
    public final g d;
    public d e;
    public long f;
    public long g;
    public long h;
    public Long i;
    public j.d j;
    public j.d k;
    public j.d l;
    public B3.c n;
    public B3.b o;
    public M2.b p;
    public w0 q;
    public boolean r;
    public I.b s;
    public boolean t;
    public v0 u;
    public List v;
    public Map z;
    public Map m = new HashMap();
    public List w = new ArrayList();
    public Map x = new HashMap();
    public int y = 0;
    public final Handler F = new Handler(Looper.getMainLooper());
    public final Runnable G = new a();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (e.a0(e.this) == null) {
                return;
            }
            if (e.a0(e.this).H() != e.X(e.this)) {
                e.e0(e.this);
            }
            int J = e.a0(e.this).J();
            if (J == 2) {
                e.Y(e.this).postDelayed(this, 200L);
            } else {
                if (J != 3) {
                    return;
                }
                if (e.a0(e.this).z()) {
                    e.Y(e.this).postDelayed(this, 500L);
                } else {
                    e.Y(e.this).postDelayed(this, 1000L);
                }
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class c extends S0 {
        public long f = 0;
        public int g = 0;

        public c() {
        }

        public static /* synthetic */ void R(c cVar) {
            cVar.S();
        }

        public final /* synthetic */ void S() {
            if (e.f0(e.this)) {
                e.e0(e.this);
            }
        }

        public String getName() {
            return "ObserverRenderer";
        }

        public void h(long j, long j2) {
            if (j == this.f) {
                this.g++;
            } else {
                if (this.g >= 3) {
                    e.Y(e.this).post(new f(this));
                }
                this.g = 0;
            }
            this.f = j;
        }
    }

    public enum d {
        idle,
        loading,
        buffering,
        ready,
        completed
    }

    public e(Context context, da.b bVar, String str, Map map, List list, Map map2, Boolean bool, boolean z) {
        this.a = context;
        this.v = list;
        this.r = bool != null ? bool.booleanValue() : false;
        this.t = z;
        if (map2 != null) {
            this.s = new I.b.a().f(((Boolean) map2.get("isGaplessSupportRequired")).booleanValue()).g(((Boolean) map2.get("isSpeedChangeSupportRequired")).booleanValue()).e(((Integer) map2.get("audioOffloadMode")).intValue()).d();
        } else {
            this.s = new I.b.a().f(!bool.booleanValue()).g(!bool.booleanValue()).e(bool.booleanValue() ? 1 : 0).d();
        }
        j jVar = new j(bVar, "com.ryanheise.just_audio.methods." + str);
        this.b = jVar;
        jVar.e(this);
        this.c = new g(bVar, "com.ryanheise.just_audio.events." + str);
        this.d = new g(bVar, "com.ryanheise.just_audio.data." + str);
        this.e = d.idle;
        if (map != null) {
            Map map3 = (Map) map.get("androidLoadControl");
            if (map3 != null) {
                r.b b2 = new r.b().c((int) (N0(map3.get("minBufferDuration")).longValue() / 1000), (int) (N0(map3.get("maxBufferDuration")).longValue() / 1000), (int) (N0(map3.get("bufferForPlaybackDuration")).longValue() / 1000), (int) (N0(map3.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000)).d(((Boolean) map3.get("prioritizeTimeOverSizeThresholds")).booleanValue()).b((int) (N0(map3.get("backBufferDuration")).longValue() / 1000), false);
                if (map3.get("targetBufferBytes") != null) {
                    b2.e(((Integer) map3.get("targetBufferBytes")).intValue());
                }
                this.q = b2.a();
            }
            Map map4 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map4 != null) {
                this.u = new q.b().c((float) ((Double) map4.get("fallbackMinPlaybackSpeed")).doubleValue()).b((float) ((Double) map4.get("fallbackMaxPlaybackSpeed")).doubleValue()).f(N0(map4.get("minUpdateInterval")).longValue() / 1000).g((float) ((Double) map4.get("proportionalControlFactor")).doubleValue()).d(N0(map4.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000).h(N0(map4.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000).e((float) ((Double) map4.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue()).a();
            }
        }
    }

    public static /* synthetic */ void E(j.d dVar) {
        P0(dVar);
    }

    public static /* synthetic */ W0[] I(e eVar, Handler handler, m3.C c2, x xVar, i3.h hVar, d3.b bVar) {
        return eVar.O0(handler, c2, xVar, hVar, bVar);
    }

    private long M0() {
        v vVar;
        d dVar = this.e;
        if (dVar == d.idle || dVar == d.loading || (vVar = this.A) == null) {
            return -9223372036854775807L;
        }
        return vVar.getDuration();
    }

    public static Long N0(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static /* synthetic */ void P(j.d dVar) {
        Q0(dVar);
    }

    public static /* synthetic */ void P0(j.d dVar) {
        dVar.a(new HashMap());
    }

    public static /* synthetic */ void Q(j.d dVar) {
        R0(dVar);
    }

    public static /* synthetic */ void Q0(j.d dVar) {
        dVar.a(new HashMap());
    }

    public static /* synthetic */ void R0(j.d dVar) {
        dVar.a(new HashMap());
    }

    public static Object U0(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        return null;
    }

    public static Map V0(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            hashMap.put((String) objArr[i], objArr[i + 1]);
        }
        return hashMap;
    }

    public static /* bridge */ /* synthetic */ long X(e eVar) {
        return eVar.h;
    }

    public static /* bridge */ /* synthetic */ Handler Y(e eVar) {
        return eVar.F;
    }

    public static /* bridge */ /* synthetic */ v a0(e eVar) {
        return eVar.A;
    }

    public static /* bridge */ /* synthetic */ void e0(e eVar) {
        eVar.m0();
    }

    public static /* bridge */ /* synthetic */ boolean f0(e eVar) {
        return eVar.n1();
    }

    private void m1() {
        this.f = L0();
        this.g = System.currentTimeMillis();
    }

    public static Map u0(Map map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            hashMap.put((String) obj, (String) map.get(obj));
        }
        return hashMap;
    }

    public final AudioEffect A0(Object obj, int i) {
        Map map = (Map) obj;
        String str = (String) map.get("type");
        str.hashCode();
        if (str.equals("AndroidEqualizer")) {
            return new Equalizer(0, i);
        }
        if (str.equals("AndroidLoudnessEnhancer")) {
            int round = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 100.0d);
            LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(i);
            loudnessEnhancer.setTargetGain(round);
            return loudnessEnhancer;
        }
        throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
    }

    public final w B0(Object obj) {
        Map map;
        String str;
        int i;
        map = (Map) obj;
        str = (String) map.get("id");
        String str2 = (String) map.get("type");
        str2.hashCode();
        switch (str2) {
            case "concatenating":
                return new l(false, ((Boolean) map.get("useLazyPreparation")).booleanValue(), C0((List) U0(map, "shuffleOrder")), K0(map.get("children")));
            case "hls":
                return new HlsMediaSource.Factory(s0((Map) U0(map, "headers"))).a(new u.c().e(Uri.parse((String) map.get("uri"))).c("application/x-mpegURL").a());
            case "dash":
                return new DashMediaSource.Factory(s0((Map) U0(map, "headers"))).a(new u.c().e(Uri.parse((String) map.get("uri"))).c("application/dash+xml").d(str).a());
            case "looping":
                Integer num = (Integer) map.get("count");
                w I0 = I0(map.get("child"));
                int intValue = num.intValue();
                w[] wVarArr = new w[intValue];
                for (i = 0; i < intValue; i++) {
                    wVarArr[i] = I0;
                }
                return new l(wVarArr);
            case "clipping":
                Long N0 = N0(map.get("start"));
                Long N02 = N0(map.get("end"));
                return new g3.f(I0(map.get("child")), N0 != null ? N0.longValue() : 0L, N02 != null ? N02.longValue() : Long.MIN_VALUE);
            case "progressive":
                return new K.b(s0((Map) U0(map, "headers")), t0((Map) U0(map, "options"))).b(new u.c().e(Uri.parse((String) map.get("uri"))).d(str).a());
            case "silence":
                return new T.b().b(N0(map.get("duration")).longValue()).c(str).a();
            default:
                throw new IllegalArgumentException("Unknown AudioSource type: " + map.get("type"));
        }
    }

    public void C(C.e eVar, C.e eVar2, int i) {
        m1();
        if (i == 0 || i == 1) {
            l1();
        }
        m0();
    }

    public final S C0(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return new S.a(iArr, H.nextLong());
    }

    public void D(int i) {
        if (i == 2) {
            n1();
            d dVar = this.e;
            d dVar2 = d.buffering;
            if (dVar != dVar2 && dVar != d.loading) {
                this.e = dVar2;
                this.C = null;
                this.D = null;
                m0();
            }
            k1();
            return;
        }
        if (i == 3) {
            if (this.A.z()) {
                m1();
            }
            this.e = d.ready;
            this.C = null;
            this.D = null;
            m0();
            if (this.j != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", M0() == -9223372036854775807L ? null : Long.valueOf(M0() * 1000));
                this.j.a(hashMap);
                this.j = null;
                M2.b bVar = this.p;
                if (bVar != null) {
                    this.A.K(bVar, false);
                    this.p = null;
                }
            }
            if (this.l != null) {
                x0();
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        d dVar3 = this.e;
        d dVar4 = d.completed;
        if (dVar3 != dVar4) {
            m1();
            this.e = dVar4;
            this.C = null;
            this.D = null;
            m0();
        }
        if (this.j != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("duration", M0() == -9223372036854775807L ? null : Long.valueOf(M0() * 1000));
            this.j.a(hashMap2);
            this.j = null;
            M2.b bVar2 = this.p;
            if (bVar2 != null) {
                this.A.K(bVar2, false);
                this.p = null;
            }
        }
        j.d dVar5 = this.k;
        if (dVar5 != null) {
            dVar5.a(new HashMap());
            this.k = null;
        }
    }

    public void D0() {
        if (this.e == d.loading) {
            h0(true);
        }
        j.d dVar = this.k;
        if (dVar != null) {
            dVar.a(new HashMap());
            this.k = null;
        }
        this.m.clear();
        v0();
        v vVar = this.A;
        if (vVar != null) {
            vVar.release();
            this.A = null;
            this.e = d.idle;
            m0();
        }
        this.c.c();
        this.d.c();
    }

    public final void E0() {
        this.z = z0();
    }

    public void F(G g, int i) {
        if (l1()) {
            m0();
        }
        if (this.A.J() == 4) {
            try {
                if (this.A.z()) {
                    if (this.y == 0 && this.A.j() > 0) {
                        this.A.y(0, 0L);
                    } else if (this.A.q()) {
                        this.A.o();
                    }
                } else if (this.A.L() < this.A.j()) {
                    v vVar = this.A;
                    vVar.y(vVar.L(), 0L);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.y = this.A.j();
    }

    public final void F0() {
        if (this.A == null) {
            v.b bVar = new v.b(this.a, new q9.d(this));
            bVar.n(this.t);
            w0 w0Var = this.q;
            if (w0Var != null) {
                bVar.m(w0Var);
            }
            v0 v0Var = this.u;
            if (v0Var != null) {
                bVar.l(v0Var);
            }
            v f = bVar.f();
            this.A = f;
            f.w(f.x().a().F(this.s).C());
            c1(this.A.getAudioSessionId());
            this.A.l(this);
        }
    }

    public final Map G0() {
        Equalizer equalizer = (Equalizer) this.x.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s = 0; s < equalizer.getNumberOfBands(); s = (short) (s + 1)) {
            arrayList.add(V0("index", Short.valueOf(s), "lowerFrequency", Double.valueOf(equalizer.getBandFreqRange(s)[0] / 1000.0d), "upperFrequency", Double.valueOf(equalizer.getBandFreqRange(s)[1] / 1000.0d), "centerFrequency", Double.valueOf(equalizer.getCenterFreq(s) / 1000.0d), "gain", Double.valueOf(equalizer.getBandLevel(s) / 100.0d)));
        }
        return V0("parameters", V0("minDecibels", Double.valueOf(equalizer.getBandLevelRange()[0] / 100.0d), "maxDecibels", Double.valueOf(equalizer.getBandLevelRange()[1] / 100.0d), "bands", arrayList));
    }

    public final void H0(int i, double d2) {
        ((Equalizer) this.x.get("AndroidEqualizer")).setBandLevel((short) i, (short) Math.round(d2 * 100.0d));
    }

    public final w I0(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        w wVar = (w) this.m.get(str);
        if (wVar != null) {
            return wVar;
        }
        w B0 = B0(map);
        this.m.put(str, B0);
        return B0;
    }

    public final List J0(Object obj) {
        if (!(obj instanceof List)) {
            throw new RuntimeException("List expected: " + obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(I0(list.get(i)));
        }
        return arrayList;
    }

    public final w[] K0(Object obj) {
        List J0 = J0(obj);
        w[] wVarArr = new w[J0.size()];
        J0.toArray(wVarArr);
        return wVarArr;
    }

    public final long L0() {
        d dVar = this.e;
        if (dVar != d.idle && dVar != d.loading) {
            Long l = this.i;
            return (l == null || l.longValue() == -9223372036854775807L) ? this.A.getCurrentPosition() : this.i.longValue();
        }
        long currentPosition = this.A.getCurrentPosition();
        if (currentPosition < 0) {
            return 0L;
        }
        return currentPosition;
    }

    public final /* synthetic */ W0[] O0(Handler handler, m3.C c2, x xVar, i3.h hVar, d3.b bVar) {
        W0[] a2 = new t(this.a).a(handler, c2, xVar, hVar, bVar);
        W0[] w0Arr = (W0[]) Arrays.copyOf(a2, a2.length + 1);
        w0Arr[a2.length] = new c();
        return w0Arr;
    }

    public final void S0(List list, S s, long j, Integer num, j.d dVar) {
        this.E = Integer.valueOf(num != null ? num.intValue() : 0);
        int i = b.a[this.e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.A.stop();
            } else {
                h0(false);
                this.A.stop();
            }
        }
        this.j = dVar;
        m1();
        this.e = d.loading;
        this.C = null;
        this.D = null;
        E0();
        this.A.s(list, num != null ? num.intValue() : 0, j);
        this.A.B(s);
        this.A.e();
    }

    public final void T0(double d2) {
        ((LoudnessEnhancer) this.x.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d2 * 100.0d));
    }

    public void U(J j) {
        for (int i = 0; i < j.a().size(); i++) {
            H a2 = ((J.a) j.a().get(i)).a();
            for (int i2 = 0; i2 < a2.a; i2++) {
                M2.x xVar = a2.a(i2).k;
                if (xVar != null) {
                    for (int i3 = 0; i3 < xVar.j(); i3++) {
                        B3.b i4 = xVar.i(i3);
                        if (i4 instanceof B3.b) {
                            this.o = i4;
                            m0();
                        }
                    }
                }
            }
        }
    }

    public void W0() {
        if (this.A.z()) {
            this.A.n(false);
            m1();
            E0();
            j.d dVar = this.k;
            if (dVar != null) {
                dVar.a(new HashMap());
                this.k = null;
            }
        }
    }

    public void X0(j.d dVar) {
        j.d dVar2;
        if (this.A.z()) {
            dVar.a(new HashMap());
            return;
        }
        j.d dVar3 = this.k;
        if (dVar3 != null) {
            dVar3.a(new HashMap());
        }
        this.k = dVar;
        this.A.n(true);
        m1();
        if (this.e != d.completed || (dVar2 = this.k) == null) {
            return;
        }
        dVar2.a(new HashMap());
        this.k = null;
    }

    public void Y0(long j, Integer num, j.d dVar) {
        d dVar2 = this.e;
        if (dVar2 == d.idle || dVar2 == d.loading) {
            dVar.a(new HashMap());
            return;
        }
        i0();
        this.i = Long.valueOf(j);
        this.l = dVar;
        try {
            this.A.y(num != null ? num.intValue() : this.A.L(), j);
        } catch (RuntimeException e) {
            this.l = null;
            this.i = null;
            throw e;
        }
    }

    public final void Z0(int i, String str, Object obj) {
        a1(i, str, obj, true);
    }

    public final void a1(int i, String str, Object obj, boolean z) {
        this.c.b(String.valueOf(i), str, obj);
        this.C = Integer.valueOf(i);
        this.D = str;
        if (z) {
            this.e = d.idle;
        }
        m0();
        j.d dVar = this.j;
        if (dVar != null) {
            dVar.b(String.valueOf(i), str, obj);
            this.j = null;
        }
    }

    public final void b1(int i, int i2, int i3) {
        b.e eVar = new b.e();
        eVar.b(i);
        eVar.c(i2);
        eVar.d(i3);
        M2.b a2 = eVar.a();
        if (this.e == d.loading) {
            this.p = a2;
        } else {
            this.A.K(a2, false);
        }
    }

    public final void c1(int i) {
        if (i == 0) {
            this.B = null;
        } else {
            this.B = Integer.valueOf(i);
        }
        v0();
        if (this.B != null) {
            for (Object obj : this.v) {
                Map map = (Map) obj;
                AudioEffect A0 = A0(obj, this.B.intValue());
                if (((Boolean) map.get("enabled")).booleanValue()) {
                    A0.setEnabled(true);
                }
                this.w.add(A0);
                this.x.put((String) map.get("type"), A0);
            }
        }
        E0();
    }

    public void d1(int i) {
        this.A.M(i);
    }

    public void e1(float f) {
        B c2 = this.A.c();
        if (c2.b == f) {
            return;
        }
        this.A.d(new B(c2.a, f));
        E0();
    }

    public void f1(boolean z) {
        this.A.A(z);
    }

    public final void g1(Object obj) {
        Map map = (Map) obj;
        l lVar = (w) this.m.get((String) U0(map, "id"));
        if (lVar == null) {
            return;
        }
        String str = (String) U0(map, "type");
        str.hashCode();
        if (!str.equals("concatenating")) {
            if (str.equals("looping")) {
                g1(U0(map, "child"));
            }
        } else {
            lVar.r0(C0((List) U0(map, "shuffleOrder")));
            Iterator it = ((List) U0(map, "children")).iterator();
            while (it.hasNext()) {
                g1(it.next());
            }
        }
    }

    public void h(M2.x xVar) {
        for (int i = 0; i < xVar.j(); i++) {
            B3.c i2 = xVar.i(i);
            if (i2 instanceof B3.c) {
                this.n = i2;
                m0();
            }
        }
    }

    public final void h0(boolean z) {
        a1(10000000, "Connection aborted", null, z);
    }

    public void h1(boolean z) {
        this.A.g(z);
    }

    public final void i0() {
        j.d dVar = this.l;
        if (dVar != null) {
            try {
                dVar.a(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.l = null;
            this.i = null;
        }
    }

    public void i1(float f) {
        B c2 = this.A.c();
        if (c2.a == f) {
            return;
        }
        this.A.d(new B(f, c2.b));
        if (this.A.z()) {
            m1();
        }
        E0();
    }

    public void j1(float f) {
        this.A.f(f);
    }

    public void k0(A a2) {
        if (!(a2 instanceof T2.u)) {
            Q9.b.b("AudioPlayer", "default PlaybackException: " + a2.getMessage());
            Z0(a2.a, a2.getMessage(), V0("index", this.E));
            return;
        }
        T2.u uVar = (T2.u) a2;
        int i = uVar.j;
        if (i == 0) {
            Q9.b.b("AudioPlayer", "TYPE_SOURCE: " + uVar.g().getMessage());
        } else if (i == 1) {
            Q9.b.b("AudioPlayer", "TYPE_RENDERER: " + uVar.f().getMessage());
        } else if (i != 2) {
            Q9.b.b("AudioPlayer", "default ExoPlaybackException: " + uVar.h().getMessage());
        } else {
            Q9.b.b("AudioPlayer", "TYPE_UNEXPECTED: " + uVar.h().getMessage());
        }
        Z0(uVar.j, uVar.getMessage(), V0("index", this.E));
    }

    public final void k1() {
        this.F.removeCallbacks(this.G);
        this.F.post(this.G);
    }

    public final void l0(String str, boolean z) {
        ((AudioEffect) this.x.get(str)).setEnabled(z);
    }

    public final boolean l1() {
        Integer valueOf = Integer.valueOf(this.A.L());
        if (valueOf.equals(this.E)) {
            return false;
        }
        this.E = valueOf;
        return true;
    }

    public final void m0() {
        E0();
        p0();
    }

    public final boolean n1() {
        v vVar = this.A;
        if (vVar == null) {
            return false;
        }
        if (!(vVar.z() && this.e == d.ready) && L0() == this.f) {
            return false;
        }
        this.f = L0();
        this.g = System.currentTimeMillis();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(da.i r19, da.j.d r20) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.e.onMethodCall(da.i, da.j$d):void");
    }

    public final void p0() {
        Map map = this.z;
        if (map != null) {
            this.c.a(map);
            this.z = null;
        }
    }

    public final f.a s0(Map map) {
        String str;
        Map u0 = u0(map);
        if (u0 != null) {
            str = (String) u0.remove("User-Agent");
            if (str == null) {
                str = (String) u0.remove("user-agent");
            }
        } else {
            str = null;
        }
        if (str == null) {
            str = P2.K.q0(this.a, "just_audio");
        }
        l.b c2 = new l.b().e(str).c(true);
        if (u0 != null && u0.size() > 0) {
            c2.d(u0);
        }
        return new k.a(this.a, c2);
    }

    public final o3.l t0(Map map) {
        boolean z;
        boolean z2;
        int i;
        Map map2;
        o3.l lVar = new o3.l();
        if (map == null || (map2 = (Map) map.get("androidExtractorOptions")) == null) {
            z = true;
            z2 = false;
            i = 0;
        } else {
            z = ((Boolean) map2.get("constantBitrateSeekingEnabled")).booleanValue();
            z2 = ((Boolean) map2.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
            i = ((Integer) map2.get("mp3Flags")).intValue();
        }
        lVar.k(z);
        lVar.j(z2);
        lVar.l(i);
        return lVar;
    }

    public final void v0() {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((AudioEffect) it.next()).release();
            it.remove();
        }
        this.x.clear();
    }

    public final Map w0() {
        HashMap hashMap = new HashMap();
        if (this.n != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("title", this.n.b);
            hashMap2.put("url", this.n.c);
            hashMap.put("info", hashMap2);
        }
        if (this.o != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("bitrate", Integer.valueOf(this.o.a));
            hashMap3.put("genre", this.o.b);
            hashMap3.put("name", this.o.c);
            hashMap3.put("metadataInterval", Integer.valueOf(this.o.f));
            hashMap3.put("url", this.o.d);
            hashMap3.put("isPublic", Boolean.valueOf(this.o.e));
            hashMap.put("headers", hashMap3);
        }
        return hashMap;
    }

    public final void x0() {
        this.i = null;
        this.l.a(new HashMap());
        this.l = null;
    }

    public final g3.l y0(Object obj) {
        return (g3.l) this.m.get((String) obj);
    }

    public final Map z0() {
        HashMap hashMap = new HashMap();
        Long valueOf = M0() == -9223372036854775807L ? null : Long.valueOf(M0() * 1000);
        v vVar = this.A;
        this.h = vVar != null ? vVar.H() : 0L;
        hashMap.put("processingState", Integer.valueOf(this.e.ordinal()));
        hashMap.put("updatePosition", Long.valueOf(this.f * 1000));
        hashMap.put("updateTime", Long.valueOf(this.g));
        hashMap.put("bufferedPosition", Long.valueOf(Math.max(this.f, this.h) * 1000));
        hashMap.put("icyMetadata", w0());
        hashMap.put("duration", valueOf);
        hashMap.put("currentIndex", this.E);
        hashMap.put("androidAudioSessionId", this.B);
        hashMap.put("errorCode", this.C);
        hashMap.put("errorMessage", this.D);
        return hashMap;
    }
}
