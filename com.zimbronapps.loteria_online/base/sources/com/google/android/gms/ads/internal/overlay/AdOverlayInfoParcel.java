package com.google.android.gms.ads.internal.overlay;

import N6.a;
import N6.b;
import R5.l;
import R5.t;
import S5.D;
import U5.B;
import U5.C;
import U5.E;
import U5.e;
import U5.m;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdjm;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new B();
    public static final AtomicLong y = new AtomicLong(0);
    public static final ConcurrentHashMap z = new ConcurrentHashMap();
    public final m a;
    public final S5.a b;
    public final E c;
    public final zzcjl d;
    public final zzbmz e;
    public final String f;
    public final boolean g;
    public final String h;
    public final e i;
    public final int j;
    public final int k;
    public final String l;
    public final W5.a m;
    public final String n;
    public final l o;
    public final zzbmx p;
    public final String q;
    public final String r;
    public final String s;
    public final zzdbs t;
    public final zzdjm u;
    public final zzbxl v;
    public final boolean w;
    public final long x;

    public AdOverlayInfoParcel(S5.a aVar, E e, zzbmx zzbmxVar, zzbmz zzbmzVar, e eVar, zzcjl zzcjlVar, boolean z2, int i, String str, W5.a aVar2, zzdjm zzdjmVar, zzbxl zzbxlVar, boolean z3) {
        this.a = null;
        this.b = aVar;
        this.c = e;
        this.d = zzcjlVar;
        this.p = zzbmxVar;
        this.e = zzbmzVar;
        this.f = null;
        this.g = z2;
        this.h = null;
        this.i = eVar;
        this.j = i;
        this.k = 3;
        this.l = str;
        this.m = aVar2;
        this.n = null;
        this.o = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = zzdjmVar;
        this.v = zzbxlVar;
        this.w = z3;
        this.x = y.getAndIncrement();
    }

    public static AdOverlayInfoParcel M1(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (!((Boolean) D.c().zzd(zzbhe.zzot)).booleanValue()) {
                return null;
            }
            t.l().zzg(e, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    public static /* synthetic */ ConcurrentHashMap N1() {
        return z;
    }

    public static final IBinder O1(Object obj) {
        if (((Boolean) D.c().zzd(zzbhe.zzot)).booleanValue()) {
            return null;
        }
        return b.s1(obj).asBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.a, i, false);
        S5.a aVar = this.b;
        c.s(parcel, 3, O1(aVar), false);
        E e = this.c;
        c.s(parcel, 4, O1(e), false);
        zzcjl zzcjlVar = this.d;
        c.s(parcel, 5, O1(zzcjlVar), false);
        zzbmz zzbmzVar = this.e;
        c.s(parcel, 6, O1(zzbmzVar), false);
        c.E(parcel, 7, this.f, false);
        c.g(parcel, 8, this.g);
        c.E(parcel, 9, this.h, false);
        e eVar = this.i;
        c.s(parcel, 10, O1(eVar), false);
        c.t(parcel, 11, this.j);
        c.t(parcel, 12, this.k);
        c.E(parcel, 13, this.l, false);
        c.C(parcel, 14, this.m, i, false);
        c.E(parcel, 16, this.n, false);
        c.C(parcel, 17, this.o, i, false);
        zzbmx zzbmxVar = this.p;
        c.s(parcel, 18, O1(zzbmxVar), false);
        c.E(parcel, 19, this.q, false);
        c.E(parcel, 24, this.r, false);
        c.E(parcel, 25, this.s, false);
        zzdbs zzdbsVar = this.t;
        c.s(parcel, 26, O1(zzdbsVar), false);
        zzdjm zzdjmVar = this.u;
        c.s(parcel, 27, O1(zzdjmVar), false);
        zzbxl zzbxlVar = this.v;
        c.s(parcel, 28, O1(zzbxlVar), false);
        c.g(parcel, 29, this.w);
        long j = this.x;
        c.x(parcel, 30, j);
        c.b(parcel, a);
        if (((Boolean) D.c().zzd(zzbhe.zzot)).booleanValue()) {
            z.put(Long.valueOf(j), new C(aVar, e, zzcjlVar, zzbmxVar, zzbmzVar, eVar, zzdbsVar, zzdjmVar, zzbxlVar, zzcei.zzd.schedule(new U5.D(j), ((Integer) D.c().zzd(zzbhe.zzov)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(S5.a aVar, E e, zzbmx zzbmxVar, zzbmz zzbmzVar, e eVar, zzcjl zzcjlVar, boolean z2, int i, String str, String str2, W5.a aVar2, zzdjm zzdjmVar, zzbxl zzbxlVar) {
        this.a = null;
        this.b = aVar;
        this.c = e;
        this.d = zzcjlVar;
        this.p = zzbmxVar;
        this.e = zzbmzVar;
        this.f = str2;
        this.g = z2;
        this.h = str;
        this.i = eVar;
        this.j = i;
        this.k = 3;
        this.l = null;
        this.m = aVar2;
        this.n = null;
        this.o = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = zzdjmVar;
        this.v = zzbxlVar;
        this.w = false;
        this.x = y.getAndIncrement();
    }

    public AdOverlayInfoParcel(S5.a aVar, E e, e eVar, zzcjl zzcjlVar, int i, W5.a aVar2, String str, l lVar, String str2, String str3, String str4, zzdbs zzdbsVar, zzbxl zzbxlVar, String str5) {
        this.a = null;
        this.b = null;
        this.c = e;
        this.d = zzcjlVar;
        this.p = null;
        this.e = null;
        this.g = false;
        if (((Boolean) D.c().zzd(zzbhe.zzbp)).booleanValue()) {
            this.f = null;
            this.h = null;
        } else {
            this.f = str2;
            this.h = str3;
        }
        this.i = null;
        this.j = i;
        this.k = 1;
        this.l = null;
        this.m = aVar2;
        this.n = str;
        this.o = lVar;
        this.q = str5;
        this.r = null;
        this.s = str4;
        this.t = zzdbsVar;
        this.u = null;
        this.v = zzbxlVar;
        this.w = false;
        this.x = y.getAndIncrement();
    }

    public AdOverlayInfoParcel(S5.a aVar, E e, e eVar, zzcjl zzcjlVar, boolean z2, int i, W5.a aVar2, zzdjm zzdjmVar, zzbxl zzbxlVar) {
        this.a = null;
        this.b = aVar;
        this.c = e;
        this.d = zzcjlVar;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = z2;
        this.h = null;
        this.i = eVar;
        this.j = i;
        this.k = 2;
        this.l = null;
        this.m = aVar2;
        this.n = null;
        this.o = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = zzdjmVar;
        this.v = zzbxlVar;
        this.w = false;
        this.x = y.getAndIncrement();
    }

    public AdOverlayInfoParcel(m mVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z2, String str2, IBinder iBinder5, int i, int i2, String str3, W5.a aVar, String str4, l lVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z3, long j) {
        this.a = mVar;
        this.f = str;
        this.g = z2;
        this.h = str2;
        this.j = i;
        this.k = i2;
        this.l = str3;
        this.m = aVar;
        this.n = str4;
        this.o = lVar;
        this.q = str5;
        this.r = str6;
        this.s = str7;
        this.w = z3;
        this.x = j;
        if (((Boolean) D.c().zzd(zzbhe.zzot)).booleanValue()) {
            C c = (C) z.remove(Long.valueOf(j));
            if (c != null) {
                this.b = c.a();
                this.c = c.b();
                this.d = c.c();
                this.p = c.d();
                this.e = c.e();
                this.t = c.g();
                this.u = c.h();
                this.v = c.i();
                this.i = c.f();
                c.j().cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.b = (S5.a) b.r1(a.a.q1(iBinder));
        this.c = (E) b.r1(a.a.q1(iBinder2));
        this.d = (zzcjl) b.r1(a.a.q1(iBinder3));
        this.p = (zzbmx) b.r1(a.a.q1(iBinder6));
        this.e = (zzbmz) b.r1(a.a.q1(iBinder4));
        this.i = (e) b.r1(a.a.q1(iBinder5));
        this.t = (zzdbs) b.r1(a.a.q1(iBinder7));
        this.u = (zzdjm) b.r1(a.a.q1(iBinder8));
        this.v = (zzbxl) b.r1(a.a.q1(iBinder9));
    }

    public AdOverlayInfoParcel(m mVar, S5.a aVar, E e, e eVar, W5.a aVar2, zzcjl zzcjlVar, zzdjm zzdjmVar, String str) {
        this.a = mVar;
        this.b = aVar;
        this.c = e;
        this.d = zzcjlVar;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = eVar;
        this.j = -1;
        this.k = 4;
        this.l = null;
        this.m = aVar2;
        this.n = null;
        this.o = null;
        this.q = str;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = zzdjmVar;
        this.v = null;
        this.w = false;
        this.x = y.getAndIncrement();
    }

    public AdOverlayInfoParcel(E e, zzcjl zzcjlVar, int i, W5.a aVar) {
        this.c = e;
        this.d = zzcjlVar;
        this.j = 1;
        this.m = aVar;
        this.a = null;
        this.b = null;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = null;
        this.k = 1;
        this.l = null;
        this.n = null;
        this.o = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = false;
        this.x = y.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcjl zzcjlVar, W5.a aVar, String str, String str2, int i, zzbxl zzbxlVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = zzcjlVar;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = null;
        this.j = 14;
        this.k = 5;
        this.l = null;
        this.m = aVar;
        this.n = null;
        this.o = null;
        this.q = str;
        this.r = str2;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = zzbxlVar;
        this.w = false;
        this.x = y.getAndIncrement();
    }
}
