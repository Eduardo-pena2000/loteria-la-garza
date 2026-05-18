package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.a3;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.p5;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.v5;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e {
    private final com.applovin.impl.sdk.k a;
    private final Map b = new HashMap(4);
    private final Object c = new Object();
    private final Map d = new HashMap(4);
    private final Object e = new Object();
    private final Map f = Collections.synchronizedMap(new HashMap(4));
    private final Map g = new HashMap();
    private final Object h = new Object();

    public class a implements p5.b {
        final /* synthetic */ long a;
        final /* synthetic */ Map b;
        final /* synthetic */ String c;
        final /* synthetic */ a3 d;
        final /* synthetic */ Context e;
        final /* synthetic */ a.a f;

        public a(long j, Map map, String str, a3 a3Var, Context context, a.a aVar) {
            this.a = j;
            this.b = map;
            this.c = str;
            this.d = a3Var;
            this.e = context;
            this.f = aVar;
        }

        public void a(JSONArray jSONArray) {
            this.b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.a));
            this.b.put("calfc", Integer.valueOf(e.this.b(this.c)));
            v5 v5Var = new v5(this.d, jSONArray, this.e, e.c(e.this), this.f);
            if (((Boolean) e.c(e.this).a(r3.o8)).booleanValue()) {
                e.c(e.this).q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                e.c(e.this).q0().a(v5Var);
            }
        }
    }

    public static class b implements a.a {
        private final com.applovin.impl.sdk.k a;
        private final WeakReference b;
        private final e c;
        private final c d;
        private final MaxAdFormat e;
        private final Map f;
        private final Map g;
        private final Map h;
        private final int i;
        private long j;
        private long k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, e eVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j, j2, eVar, kVar, context);
        }

        public static /* synthetic */ void a(b bVar, int i, String str) {
            bVar.a(i, str);
        }

        public void onAdClicked(MaxAd maxAd) {
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            this.c.d(str);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError, this.k, elapsedRealtime);
            }
            boolean z = maxError.getCode() == -5603 && n7.c(this.a) && ((Boolean) this.a.a(x4.A6)).booleanValue();
            if (this.a.a(r3.i8, this.e) && c.d(this.d) < this.i && !z) {
                c.e(this.d);
                int pow = (int) Math.pow(2.0d, c.d(this.d));
                AppLovinSdkUtils.runOnUiThreadDelayed(new u(this, pow, str), TimeUnit.SECONDS.toMillis(pow));
                return;
            }
            c.a(this.d, 0);
            c.a(this.d).set(false);
            if (c.b(this.d) != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(c.c(this.d));
                maxErrorImpl.setRequestLatencyMillis(elapsedRealtime);
                t2.a(c.b(this.d), str, maxError);
                c.a(this.d, (a.a) null);
            }
        }

        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            y2 y2Var = (y2) maxAd;
            y2Var.i(c.c(this.d));
            y2Var.a(SystemClock.elapsedRealtime() - this.j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.k, y2Var.getRequestLatencyMillis());
            }
            e.a(this.c, maxAd.getAdUnitId());
            c.a(this.d, 0);
            if (c.b(this.d) == null) {
                e.a(this.c, y2Var);
                c.a(this.d).set(false);
                int L = y2Var.L();
                synchronized (e.a(this.c)) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) e.b(this.c).get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < L) {
                    int i = sizeSafely + 1;
                    this.a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.a.O().a("MediationAdLoadManagerV2", "Preloading waterfall " + i + " of " + L);
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            y2Var.A().c().a(c.b(this.d));
            c.b(this.d).onAdLoaded(y2Var);
            e.d(this.c).put(maxAd.getAdUnitId(), y2Var);
            if (y2Var.O().endsWith("load")) {
                c.b(this.d).onAdRevenuePaid(y2Var);
            }
            c.a(this.d, (a.a) null);
            if ((!this.a.c(r3.d8).contains(maxAd.getAdUnitId()) && !this.a.a(r3.c8, maxAd.getFormat())) || this.a.s0().c() || this.a.s0().d()) {
                c.a(this.d).set(false);
                return;
            }
            int L2 = y2Var.L();
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + L2);
            }
            a(maxAd);
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, e eVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.a = kVar;
            this.b = new WeakReference(context);
            this.c = eVar;
            this.d = cVar;
            this.e = maxAdFormat;
            this.g = map2;
            this.f = map;
            this.h = map3;
            this.j = j;
            this.k = j2;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.i = Math.min(2, ((Integer) kVar.a(r3.h8)).intValue());
            } else {
                this.i = ((Integer) kVar.a(r3.h8)).intValue();
            }
        }

        private void a(MaxAd maxAd) {
            Context context = (Context) this.b.get();
            if (context == null) {
                context = com.applovin.impl.sdk.k.o();
            }
            Context context2 = context;
            this.j = SystemClock.elapsedRealtime();
            this.k = System.currentTimeMillis();
            this.h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            e.a(this.c, maxAd.getAdUnitId(), maxAd.getFormat(), this.f, this.g, this.h, context2, this);
        }

        private /* synthetic */ void a(int i, String str) {
            this.g.put("retry_delay_sec", Integer.valueOf(i));
            this.g.put("retry_attempt", Integer.valueOf(c.d(this.d)));
            Context context = (Context) this.b.get();
            if (context == null) {
                context = com.applovin.impl.sdk.k.o();
            }
            Context context2 = context;
            this.h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.h.put("era", Integer.valueOf(c.d(this.d)));
            this.k = System.currentTimeMillis();
            e.a(this.c, str, this.e, this.f, this.g, this.h, context2, this);
        }
    }

    public static class c {
        private final String a;
        private final AtomicBoolean b;
        private int c;
        private volatile a.a d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ AtomicBoolean a(c cVar) {
            return cVar.b;
        }

        public static /* synthetic */ a.a b(c cVar) {
            return cVar.d;
        }

        public static /* synthetic */ String c(c cVar) {
            return cVar.a;
        }

        public static /* synthetic */ int d(c cVar) {
            return cVar.c;
        }

        public static /* synthetic */ int e(c cVar) {
            int i = cVar.c;
            cVar.c = i + 1;
            return i;
        }

        private c(String str) {
            this.b = new AtomicBoolean();
            this.a = str;
        }

        public static /* synthetic */ a.a a(c cVar, a.a aVar) {
            cVar.d = aVar;
            return aVar;
        }

        public static /* synthetic */ int a(c cVar, int i) {
            cVar.c = i;
            return i;
        }
    }

    public e(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    public static /* synthetic */ Object a(e eVar) {
        return eVar.e;
    }

    public static /* synthetic */ Map b(e eVar) {
        return eVar.d;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k c(e eVar) {
        return eVar.a;
    }

    public static /* synthetic */ Map d(e eVar) {
        return eVar.f;
    }

    private y2 f(String str) {
        synchronized (this.e) {
            try {
                Queue queue = (Queue) this.d.get(str);
                if (CollectionUtils.isEmpty((Collection) queue)) {
                    return null;
                }
                return (y2) queue.poll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(String str) {
        boolean z;
        synchronized (this.e) {
            z = !CollectionUtils.isEmpty((Collection) this.d.get(str));
        }
        return z;
    }

    public static /* synthetic */ void a(e eVar, String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.a aVar) {
        eVar.a(str, maxAdFormat, map, map2, map3, context, aVar);
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        y2 y2Var = (y2) this.f.get(str);
        if (y2Var != null) {
            arrayDeque.add(y2Var);
        }
        synchronized (this.c) {
            try {
                Queue queue = (Queue) this.d.get(str);
                if (queue != null) {
                    arrayDeque.addAll(queue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayDeque;
    }

    public void d(String str) {
        synchronized (this.h) {
            try {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.g.get(str);
                if (num == null) {
                    num = 0;
                }
                this.g.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void a(e eVar, String str) {
        eVar.a(str);
    }

    public int b(String str) {
        int intValue;
        synchronized (this.h) {
            try {
                Integer num = (Integer) this.g.get(str);
                intValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public static /* synthetic */ void a(e eVar, y2 y2Var) {
        eVar.a(y2Var);
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.a aVar) {
        y2 f = (this.a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : f(str);
        if (f != null) {
            f.i(str2);
            f.A().c().a(aVar);
            aVar.onAdLoaded(f);
            this.f.put(str, f);
            if (f.O().endsWith("load")) {
                aVar.onAdRevenuePaid(f);
            }
        }
        c a2 = a(str, str2);
        if (c.a(a2).compareAndSet(false, true)) {
            if (f == null) {
                c.a(a2, aVar);
            }
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            synchronizedMap.put("art", iVar.b());
            if (StringUtils.isValidString(str2)) {
                synchronizedMap.put("alt", str2);
            }
            a(str, maxAdFormat, map, map2, synchronizedMap, context, new b(map, map2, synchronizedMap, a2, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.a, context, null));
            return;
        }
        if (c.b(a2) != null && c.b(a2) != aVar) {
            com.applovin.impl.sdk.o.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        c.a(a2, aVar);
    }

    public void c(String str, String str2) {
        synchronized (this.c) {
            this.b.remove(b(str, str2));
        }
    }

    private void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.a aVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.a.q0().a((i5) new p5(a3Var, context, this.a, new a(elapsedRealtime, map3, str, a3Var, context, aVar)), d6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.a.a(x4.M4)).booleanValue()) {
            u3 Y = this.a.Y();
            s3 s3Var = s3.e;
            Map a2 = Y.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.b;
            int a3 = a(a2, aVar);
            s3.a aVar2 = s3.a.c;
            int a4 = a(a2, aVar2);
            Map a5 = this.a.Y().a(s3Var, t3.a(maxAdFormat));
            return new com.applovin.impl.h(a3, a4, a(a5, aVar), a(a5, aVar2));
        }
        return new com.applovin.impl.h(-1, -1, -1, -1);
    }

    private int a(Map map, s3.a aVar) {
        Long l;
        if (map == null || (l = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l.intValue();
    }

    private void a(y2 y2Var) {
        synchronized (this.e) {
            try {
                ArrayDeque arrayDeque = (Queue) this.d.get(y2Var.getAdUnitId());
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.d.put(y2Var.getAdUnitId(), arrayDeque);
                }
                arrayDeque.add(y2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.c) {
            try {
                String b2 = b(str, str2);
                cVar = (c) this.b.get(b2);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.b.put(b2, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    private void a(String str) {
        synchronized (this.h) {
            try {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.g.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
