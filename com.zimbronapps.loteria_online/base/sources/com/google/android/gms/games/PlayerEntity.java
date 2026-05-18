package com.google.android.gms.games;

import T6.M;
import T6.Q;
import T6.d;
import T6.n;
import T6.q;
import T6.s;
import T6.w;
import X6.a;
import X6.b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements n {
    public static final Parcelable.Creator CREATOR = new M();
    public final String A;
    public final String c;
    public final String d;
    public final Uri e;
    public final Uri f;
    public final long g;
    public final int h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;
    public final a m;
    public final q n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final String r;
    public final Uri s;
    public final String t;
    public final Uri u;
    public final String v;
    public final long w;
    public final Q x;
    public final w y;
    public final boolean z;

    public PlayerEntity(n nVar) {
        String H1 = nVar.H1();
        this.c = H1;
        String displayName = nVar.getDisplayName();
        this.d = displayName;
        this.e = nVar.a();
        this.j = nVar.getIconImageUrl();
        this.f = nVar.g();
        this.k = nVar.getHiResImageUrl();
        long u = nVar.u();
        this.g = u;
        this.h = nVar.zza();
        this.i = nVar.J();
        this.l = nVar.getTitle();
        this.o = nVar.zzi();
        b zzc = nVar.zzc();
        this.m = zzc == null ? null : new a(zzc);
        this.n = nVar.N();
        this.p = nVar.zzg();
        this.q = nVar.zze();
        this.r = nVar.zzf();
        this.s = nVar.A0();
        this.t = nVar.getBannerImageLandscapeUrl();
        this.u = nVar.x();
        this.v = nVar.getBannerImagePortraitUrl();
        this.w = nVar.zzb();
        s d0 = nVar.d0();
        this.x = d0 == null ? null : new Q((s) d0.freeze());
        d R0 = nVar.R0();
        this.y = R0 != null ? (w) R0.freeze() : null;
        this.z = nVar.zzh();
        this.A = nVar.zzd();
        c.c(H1);
        c.c(displayName);
        c.d(u > 0);
    }

    public static int Q1(n nVar) {
        return r.c(nVar.H1(), nVar.getDisplayName(), Boolean.valueOf(nVar.zzg()), nVar.a(), nVar.g(), Long.valueOf(nVar.u()), nVar.getTitle(), nVar.N(), nVar.zze(), nVar.zzf(), nVar.A0(), nVar.x(), Long.valueOf(nVar.zzb()), nVar.d0(), nVar.R0(), Boolean.valueOf(nVar.zzh()), nVar.zzd());
    }

    public static /* synthetic */ Integer R1() {
        return DowngradeableSafeParcel.N1();
    }

    public static String S1(n nVar) {
        r.a a = r.d(nVar).a("PlayerId", nVar.H1()).a("DisplayName", nVar.getDisplayName()).a("HasDebugAccess", Boolean.valueOf(nVar.zzg())).a("IconImageUri", nVar.a()).a("IconImageUrl", nVar.getIconImageUrl()).a("HiResImageUri", nVar.g()).a("HiResImageUrl", nVar.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(nVar.u())).a("Title", nVar.getTitle()).a("LevelInfo", nVar.N()).a("GamerTag", nVar.zze()).a("Name", nVar.zzf()).a("BannerImageLandscapeUri", nVar.A0()).a("BannerImageLandscapeUrl", nVar.getBannerImageLandscapeUrl()).a("BannerImagePortraitUri", nVar.x()).a("BannerImagePortraitUrl", nVar.getBannerImagePortraitUrl()).a("CurrentPlayerInfo", nVar.R0()).a("TotalUnlockedAchievement", Long.valueOf(nVar.zzb()));
        if (nVar.zzh()) {
            a.a("AlwaysAutoSignIn", Boolean.valueOf(nVar.zzh()));
        }
        if (nVar.d0() != null) {
            a.a("RelationshipInfo", nVar.d0());
        }
        if (nVar.zzd() != null) {
            a.a("GamePlayerId", nVar.zzd());
        }
        return a.toString();
    }

    public static /* synthetic */ boolean T1(Integer num) {
        return GamesDowngradeableSafeParcel.P1(num);
    }

    public static /* synthetic */ boolean U1(String str) {
        return DowngradeableSafeParcel.M1(str);
    }

    public static boolean V1(n nVar, Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (nVar == obj) {
            return true;
        }
        n nVar2 = (n) obj;
        return r.b(nVar2.H1(), nVar.H1()) && r.b(nVar2.getDisplayName(), nVar.getDisplayName()) && r.b(Boolean.valueOf(nVar2.zzg()), Boolean.valueOf(nVar.zzg())) && r.b(nVar2.a(), nVar.a()) && r.b(nVar2.g(), nVar.g()) && r.b(Long.valueOf(nVar2.u()), Long.valueOf(nVar.u())) && r.b(nVar2.getTitle(), nVar.getTitle()) && r.b(nVar2.N(), nVar.N()) && r.b(nVar2.zze(), nVar.zze()) && r.b(nVar2.zzf(), nVar.zzf()) && r.b(nVar2.A0(), nVar.A0()) && r.b(nVar2.x(), nVar.x()) && r.b(Long.valueOf(nVar2.zzb()), Long.valueOf(nVar.zzb())) && r.b(nVar2.R0(), nVar.R0()) && r.b(nVar2.d0(), nVar.d0()) && r.b(Boolean.valueOf(nVar2.zzh()), Boolean.valueOf(nVar.zzh())) && r.b(nVar2.zzd(), nVar.zzd());
    }

    public Uri A0() {
        return this.s;
    }

    public String H1() {
        return this.c;
    }

    public long J() {
        return this.i;
    }

    public q N() {
        return this.n;
    }

    public d R0() {
        return this.y;
    }

    public Uri a() {
        return this.e;
    }

    public s d0() {
        return this.x;
    }

    public boolean equals(Object obj) {
        return V1(this, obj);
    }

    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    public Uri g() {
        return this.f;
    }

    public String getBannerImageLandscapeUrl() {
        return this.t;
    }

    public String getBannerImagePortraitUrl() {
        return this.v;
    }

    public String getDisplayName() {
        return this.d;
    }

    public String getHiResImageUrl() {
        return this.k;
    }

    public String getIconImageUrl() {
        return this.j;
    }

    public String getTitle() {
        return this.l;
    }

    public int hashCode() {
        return Q1(this);
    }

    public String toString() {
        return S1(this);
    }

    public long u() {
        return this.g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (O1()) {
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            Uri uri = this.e;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f;
            parcel.writeString(uri2 != null ? uri2.toString() : null);
            parcel.writeLong(this.g);
            return;
        }
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, H1(), false);
        y6.c.E(parcel, 2, getDisplayName(), false);
        y6.c.C(parcel, 3, a(), i, false);
        y6.c.C(parcel, 4, g(), i, false);
        y6.c.x(parcel, 5, u());
        y6.c.t(parcel, 6, this.h);
        y6.c.x(parcel, 7, J());
        y6.c.E(parcel, 8, getIconImageUrl(), false);
        y6.c.E(parcel, 9, getHiResImageUrl(), false);
        y6.c.E(parcel, 14, getTitle(), false);
        y6.c.C(parcel, 15, this.m, i, false);
        y6.c.C(parcel, 16, N(), i, false);
        y6.c.g(parcel, 18, this.o);
        y6.c.g(parcel, 19, this.p);
        y6.c.E(parcel, 20, this.q, false);
        y6.c.E(parcel, 21, this.r, false);
        y6.c.C(parcel, 22, A0(), i, false);
        y6.c.E(parcel, 23, getBannerImageLandscapeUrl(), false);
        y6.c.C(parcel, 24, x(), i, false);
        y6.c.E(parcel, 25, getBannerImagePortraitUrl(), false);
        y6.c.x(parcel, 29, this.w);
        y6.c.C(parcel, 33, d0(), i, false);
        y6.c.C(parcel, 35, R0(), i, false);
        y6.c.g(parcel, 36, this.z);
        y6.c.E(parcel, 37, this.A, false);
        y6.c.b(parcel, a);
    }

    public Uri x() {
        return this.u;
    }

    public final int zza() {
        return this.h;
    }

    public final long zzb() {
        return this.w;
    }

    public final b zzc() {
        return this.m;
    }

    public final String zzd() {
        return this.A;
    }

    public final String zze() {
        return this.q;
    }

    public final String zzf() {
        return this.r;
    }

    public final boolean zzg() {
        return this.p;
    }

    public final boolean zzh() {
        return this.z;
    }

    public final boolean zzi() {
        return this.o;
    }

    public PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j, int i, long j2, String str3, String str4, String str5, a aVar, q qVar, boolean z, boolean z2, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, long j3, Q q, w wVar, boolean z3, String str10) {
        this.c = str;
        this.d = str2;
        this.e = uri;
        this.j = str3;
        this.f = uri2;
        this.k = str4;
        this.g = j;
        this.h = i;
        this.i = j2;
        this.l = str5;
        this.o = z;
        this.m = aVar;
        this.n = qVar;
        this.p = z2;
        this.q = str6;
        this.r = str7;
        this.s = uri3;
        this.t = str8;
        this.u = uri4;
        this.v = str9;
        this.w = j3;
        this.x = q;
        this.y = wVar;
        this.z = z3;
        this.A = str10;
    }
}
