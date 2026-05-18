package io.flutter.embedding.engine;

import Aa.g;
import T9.a;
import W9.f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import ca.c;
import ca.h;
import ca.i;
import ca.j;
import ca.k;
import ca.q;
import ca.r;
import ca.s;
import ca.t;
import ca.u;
import ca.v;
import ca.w;
import ca.x;
import ea.d;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.N;
import io.flutter.plugin.platform.O;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a implements g.a {
    public static long B = 1;
    public static final Map C = new HashMap();
    public final b A;
    public final FlutterJNI a;
    public final FlutterRenderer b;
    public final T9.a c;
    public final S9.b d;
    public final d e;
    public final ca.a f;
    public final c g;
    public final ca.g h;
    public final h i;
    public final i j;
    public final j k;
    public final ca.b l;
    public final r m;
    public final k n;
    public final q o;
    public final s p;
    public final t q;
    public final u r;
    public final v s;
    public final w t;
    public final x u;
    public final io.flutter.plugin.platform.u v;
    public final N w;
    public final O x;
    public final Set y;
    public final long z;

    public class a implements b {
        public a() {
        }

        public void a() {
            Q9.b.f("FlutterEngine", "onPreEngineRestart()");
            Iterator it = a.b(a.this).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
            a.c(a.this).m0();
            a.d(a.this).E();
            a.e(a.this).g();
        }

        public void b() {
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Set b(a aVar) {
        return aVar.y;
    }

    public static /* synthetic */ io.flutter.plugin.platform.u c(a aVar) {
        return aVar.v;
    }

    public static /* synthetic */ N d(a aVar) {
        return aVar.w;
    }

    public static /* synthetic */ r e(a aVar) {
        return aVar.m;
    }

    public v A() {
        return this.s;
    }

    public w B() {
        return this.t;
    }

    public x C() {
        return this.u;
    }

    public final boolean D() {
        return this.a.isAttached();
    }

    public a E(Context context, a.c cVar, String str, List list, io.flutter.plugin.platform.u uVar, boolean z, boolean z2) {
        if (D()) {
            return new a(context, null, this.a.spawn(cVar.c, cVar.b, str, list, B), uVar, null, z, z2);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    public void a(float f, float f2, float f3) {
        this.a.updateDisplayMetrics(0, f, f2, f3);
    }

    public void f(b bVar) {
        this.y.add(bVar);
    }

    public final void g() {
        Q9.b.f("FlutterEngine", "Attaching to JNI.");
        this.a.attachToNative();
        if (!D()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    public void h() {
        Q9.b.f("FlutterEngine", "Destroying.");
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        this.d.l();
        this.v.i0();
        this.w.B();
        this.c.n();
        this.a.removeEngineLifecycleListener(this.A);
        this.a.setDeferredComponentManager(null);
        this.a.detachFromNativeAndReleaseResources();
        Q9.a.e().a();
        C.remove(Long.valueOf(this.z));
    }

    public ca.a i() {
        return this.f;
    }

    public Z9.b j() {
        return this.d;
    }

    public T9.a k() {
        return this.c;
    }

    public ca.g l() {
        return this.h;
    }

    public d m() {
        return this.e;
    }

    public i n() {
        return this.j;
    }

    public j o() {
        return this.k;
    }

    public k p() {
        return this.n;
    }

    public io.flutter.plugin.platform.u q() {
        return this.v;
    }

    public N r() {
        return this.w;
    }

    public O s() {
        return this.x;
    }

    public Y9.b t() {
        return this.d;
    }

    public q u() {
        return this.o;
    }

    public FlutterRenderer v() {
        return this.b;
    }

    public r w() {
        return this.m;
    }

    public s x() {
        return this.p;
    }

    public t y() {
        return this.q;
    }

    public u z() {
        return this.r;
    }

    public a(Context context, String[] strArr) {
        this(context, null, null, strArr, true);
    }

    public a(Context context, f fVar, FlutterJNI flutterJNI, String[] strArr, boolean z) {
        this(context, fVar, flutterJNI, new io.flutter.plugin.platform.u(), strArr, z);
    }

    public a(Context context, f fVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.u uVar, String[] strArr, boolean z) {
        this(context, fVar, flutterJNI, uVar, strArr, z, false);
    }

    public a(Context context, f fVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.u uVar, String[] strArr, boolean z, boolean z2) {
        this(context, fVar, flutterJNI, uVar, strArr, z, z2, null);
    }

    public a(Context context, f fVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.u uVar, String[] strArr, boolean z, boolean z2, io.flutter.embedding.engine.b bVar) {
        AssetManager assets;
        this.y = new HashSet();
        this.A = new a();
        long j = B;
        B = 1 + j;
        this.z = j;
        C.put(Long.valueOf(j), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        Q9.a e = Q9.a.e();
        flutterJNI = flutterJNI == null ? e.d().a() : flutterJNI;
        this.a = flutterJNI;
        T9.a aVar = new T9.a(flutterJNI, assets, this.z);
        this.c = aVar;
        aVar.m();
        Q9.a.e().a();
        this.f = new ca.a(aVar, flutterJNI);
        this.g = new c(aVar);
        this.h = new ca.g(aVar);
        h hVar = new h(aVar);
        this.i = hVar;
        this.j = new i(aVar);
        this.k = new j(aVar);
        this.l = new ca.b(aVar);
        this.n = new k(aVar);
        this.o = new q(aVar, context.getPackageManager());
        this.m = new r(aVar, z2);
        this.p = new s(aVar);
        this.q = new t(aVar);
        u uVar2 = new u(aVar);
        this.r = uVar2;
        this.s = new v(aVar);
        this.t = new w(aVar);
        this.u = new x(aVar);
        d dVar = new d(context, hVar);
        this.e = dVar;
        fVar = fVar == null ? e.c() : fVar;
        if (!flutterJNI.isAttached()) {
            fVar.t(context.getApplicationContext());
            fVar.h(context, strArr);
        }
        N n = new N();
        n.K(uVar.X());
        n.J(flutterJNI);
        uVar.u0(flutterJNI);
        flutterJNI.addEngineLifecycleListener(this.A);
        flutterJNI.setPlatformViewsController(uVar);
        flutterJNI.setPlatformViewsController2(n);
        flutterJNI.setLocalizationPlugin(dVar);
        e.a();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(uVar2);
        if (!flutterJNI.isAttached()) {
            g();
        }
        this.b = new FlutterRenderer(flutterJNI);
        this.v = uVar;
        this.w = n;
        this.x = new O(uVar, n);
        S9.b bVar2 = new S9.b(context.getApplicationContext(), this, fVar, bVar);
        this.d = bVar2;
        dVar.d(context.getResources().getConfiguration());
        if (z && fVar.g()) {
            ba.a.a(this);
        }
        g.c(context, this);
        bVar2.d(new ga.c(u()));
    }
}
