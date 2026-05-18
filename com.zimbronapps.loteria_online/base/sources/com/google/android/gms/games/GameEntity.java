package com.google.android.gms.games;

import T6.A;
import T6.f;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import y6.c;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class GameEntity extends GamesDowngradeableSafeParcel implements f {
    public static final Parcelable.Creator CREATOR = new A();
    public final boolean A;
    public final boolean B;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Uri i;
    public final Uri j;
    public final Uri k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final int o;
    public final int p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final String t;
    public final String u;
    public final String v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final String z;

    public GameEntity(f fVar) {
        this.c = fVar.G0();
        this.e = fVar.t();
        this.f = fVar.a0();
        this.g = fVar.getDescription();
        this.h = fVar.E();
        this.d = fVar.getDisplayName();
        this.i = fVar.a();
        this.t = fVar.getIconImageUrl();
        this.j = fVar.g();
        this.u = fVar.getHiResImageUrl();
        this.k = fVar.x0();
        this.v = fVar.getFeaturedImageUrl();
        this.l = fVar.zze();
        this.m = fVar.zzc();
        this.n = fVar.zza();
        this.o = 1;
        this.p = fVar.Z();
        this.q = fVar.S0();
        this.r = fVar.zzg();
        this.s = fVar.zzh();
        this.w = fVar.zzd();
        this.x = fVar.zzb();
        this.y = fVar.T();
        this.z = fVar.R();
        this.A = fVar.p0();
        this.B = fVar.zzf();
    }

    public static int Q1(f fVar) {
        return r.c(fVar.G0(), fVar.getDisplayName(), fVar.t(), fVar.a0(), fVar.getDescription(), fVar.E(), fVar.a(), fVar.g(), fVar.x0(), Boolean.valueOf(fVar.zze()), Boolean.valueOf(fVar.zzc()), fVar.zza(), Integer.valueOf(fVar.Z()), Integer.valueOf(fVar.S0()), Boolean.valueOf(fVar.zzg()), Boolean.valueOf(fVar.zzh()), Boolean.valueOf(fVar.zzd()), Boolean.valueOf(fVar.zzb()), Boolean.valueOf(fVar.T()), fVar.R(), Boolean.valueOf(fVar.p0()), Boolean.valueOf(fVar.zzf()));
    }

    public static /* synthetic */ Integer R1() {
        return DowngradeableSafeParcel.N1();
    }

    public static String S1(f fVar) {
        return r.d(fVar).a("ApplicationId", fVar.G0()).a("DisplayName", fVar.getDisplayName()).a("PrimaryCategory", fVar.t()).a("SecondaryCategory", fVar.a0()).a("Description", fVar.getDescription()).a("DeveloperName", fVar.E()).a("IconImageUri", fVar.a()).a("IconImageUrl", fVar.getIconImageUrl()).a("HiResImageUri", fVar.g()).a("HiResImageUrl", fVar.getHiResImageUrl()).a("FeaturedImageUri", fVar.x0()).a("FeaturedImageUrl", fVar.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(fVar.zze())).a("InstanceInstalled", Boolean.valueOf(fVar.zzc())).a("InstancePackageName", fVar.zza()).a("AchievementTotalCount", Integer.valueOf(fVar.Z())).a("LeaderboardCount", Integer.valueOf(fVar.S0())).a("AreSnapshotsEnabled", Boolean.valueOf(fVar.T())).a("ThemeColor", fVar.R()).a("HasGamepadSupport", Boolean.valueOf(fVar.p0())).toString();
    }

    public static /* synthetic */ boolean T1(Integer num) {
        return GamesDowngradeableSafeParcel.P1(num);
    }

    public static /* synthetic */ boolean U1(String str) {
        return DowngradeableSafeParcel.M1(str);
    }

    public static boolean V1(f fVar, Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (fVar == obj) {
            return true;
        }
        f fVar2 = (f) obj;
        return r.b(fVar2.G0(), fVar.G0()) && r.b(fVar2.getDisplayName(), fVar.getDisplayName()) && r.b(fVar2.t(), fVar.t()) && r.b(fVar2.a0(), fVar.a0()) && r.b(fVar2.getDescription(), fVar.getDescription()) && r.b(fVar2.E(), fVar.E()) && r.b(fVar2.a(), fVar.a()) && r.b(fVar2.g(), fVar.g()) && r.b(fVar2.x0(), fVar.x0()) && r.b(Boolean.valueOf(fVar2.zze()), Boolean.valueOf(fVar.zze())) && r.b(Boolean.valueOf(fVar2.zzc()), Boolean.valueOf(fVar.zzc())) && r.b(fVar2.zza(), fVar.zza()) && r.b(Integer.valueOf(fVar2.Z()), Integer.valueOf(fVar.Z())) && r.b(Integer.valueOf(fVar2.S0()), Integer.valueOf(fVar.S0())) && r.b(Boolean.valueOf(fVar2.zzg()), Boolean.valueOf(fVar.zzg())) && r.b(Boolean.valueOf(fVar2.zzh()), Boolean.valueOf(fVar.zzh())) && r.b(Boolean.valueOf(fVar2.zzd()), Boolean.valueOf(fVar.zzd())) && r.b(Boolean.valueOf(fVar2.zzb()), Boolean.valueOf(fVar.zzb())) && r.b(Boolean.valueOf(fVar2.T()), Boolean.valueOf(fVar.T())) && r.b(fVar2.R(), fVar.R()) && r.b(Boolean.valueOf(fVar2.p0()), Boolean.valueOf(fVar.p0())) && r.b(Boolean.valueOf(fVar2.zzf()), Boolean.valueOf(fVar.zzf()));
    }

    public String E() {
        return this.h;
    }

    public String G0() {
        return this.c;
    }

    public String R() {
        return this.z;
    }

    public int S0() {
        return this.q;
    }

    public boolean T() {
        return this.y;
    }

    public int Z() {
        return this.p;
    }

    public Uri a() {
        return this.i;
    }

    public String a0() {
        return this.f;
    }

    public boolean equals(Object obj) {
        return V1(this, obj);
    }

    public Uri g() {
        return this.j;
    }

    public String getDescription() {
        return this.g;
    }

    public String getDisplayName() {
        return this.d;
    }

    public String getFeaturedImageUrl() {
        return this.v;
    }

    public String getHiResImageUrl() {
        return this.u;
    }

    public String getIconImageUrl() {
        return this.t;
    }

    public int hashCode() {
        return Q1(this);
    }

    public boolean p0() {
        return this.A;
    }

    public String t() {
        return this.e;
    }

    public String toString() {
        return S1(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (O1()) {
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            Uri uri = this.i;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.j;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            Uri uri3 = this.k;
            parcel.writeString(uri3 != null ? uri3.toString() : null);
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeString(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeInt(this.q);
            return;
        }
        int a = c.a(parcel);
        c.E(parcel, 1, G0(), false);
        c.E(parcel, 2, getDisplayName(), false);
        c.E(parcel, 3, t(), false);
        c.E(parcel, 4, a0(), false);
        c.E(parcel, 5, getDescription(), false);
        c.E(parcel, 6, E(), false);
        c.C(parcel, 7, a(), i, false);
        c.C(parcel, 8, g(), i, false);
        c.C(parcel, 9, x0(), i, false);
        c.g(parcel, 10, this.l);
        c.g(parcel, 11, this.m);
        c.E(parcel, 12, this.n, false);
        c.t(parcel, 13, this.o);
        c.t(parcel, 14, Z());
        c.t(parcel, 15, S0());
        c.g(parcel, 16, this.r);
        c.g(parcel, 17, this.s);
        c.E(parcel, 18, getIconImageUrl(), false);
        c.E(parcel, 19, getHiResImageUrl(), false);
        c.E(parcel, 20, getFeaturedImageUrl(), false);
        c.g(parcel, 21, this.w);
        c.g(parcel, 22, this.x);
        c.g(parcel, 23, T());
        c.E(parcel, 24, R(), false);
        c.g(parcel, 25, p0());
        c.g(parcel, 28, this.B);
        c.b(parcel, a);
    }

    public Uri x0() {
        return this.k;
    }

    public final String zza() {
        return this.n;
    }

    public final boolean zzb() {
        return this.x;
    }

    public final boolean zzc() {
        return this.m;
    }

    public final boolean zzd() {
        return this.w;
    }

    public final boolean zze() {
        return this.l;
    }

    public final boolean zzf() {
        return this.B;
    }

    public final boolean zzg() {
        return this.r;
    }

    public final boolean zzh() {
        return this.s;
    }

    public GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i, int i2, int i3, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8, boolean z9) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = uri;
        this.t = str8;
        this.j = uri2;
        this.u = str9;
        this.k = uri3;
        this.v = str10;
        this.l = z;
        this.m = z2;
        this.n = str7;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = z3;
        this.s = z4;
        this.w = z5;
        this.x = z6;
        this.y = z7;
        this.z = str11;
        this.A = z8;
        this.B = z9;
    }
}
