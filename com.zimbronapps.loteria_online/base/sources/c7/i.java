package c7;

import W6.y;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i extends y implements e {
    public static final Parcelable.Creator CREATOR = new n();
    public final GameEntity a;
    public final PlayerEntity b;
    public final String c;
    public final Uri d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final float j;
    public final String k;
    public final boolean l;
    public final long m;
    public final String n;

    public i(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j, long j2, float f, String str5, boolean z, long j3, String str6) {
        this.a = gameEntity;
        this.b = playerEntity;
        this.c = str;
        this.d = uri;
        this.e = str2;
        this.j = f;
        this.f = str3;
        this.g = str4;
        this.h = j;
        this.i = j2;
        this.k = str5;
        this.l = z;
        this.m = j3;
        this.n = str6;
    }

    public static int M1(e eVar) {
        return r.c(eVar.L1(), eVar.c0(), eVar.J1(), eVar.b0(), Float.valueOf(eVar.F1()), eVar.zza(), eVar.getDescription(), Long.valueOf(eVar.y()), Long.valueOf(eVar.K0()), eVar.w0(), Boolean.valueOf(eVar.w1()), Long.valueOf(eVar.O()), eVar.getDeviceName());
    }

    public static String N1(e eVar) {
        return r.d(eVar).a("Game", eVar.L1()).a("Owner", eVar.c0()).a("SnapshotId", eVar.J1()).a("CoverImageUri", eVar.b0()).a("CoverImageUrl", eVar.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(eVar.F1())).a("Description", eVar.getDescription()).a("LastModifiedTimestamp", Long.valueOf(eVar.y())).a("PlayedTime", Long.valueOf(eVar.K0())).a("UniqueName", eVar.w0()).a("ChangePending", Boolean.valueOf(eVar.w1())).a("ProgressValue", Long.valueOf(eVar.O())).a("DeviceName", eVar.getDeviceName()).toString();
    }

    public static boolean O1(e eVar, Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (eVar == obj) {
            return true;
        }
        e eVar2 = (e) obj;
        return r.b(eVar2.L1(), eVar.L1()) && r.b(eVar2.c0(), eVar.c0()) && r.b(eVar2.J1(), eVar.J1()) && r.b(eVar2.b0(), eVar.b0()) && r.b(Float.valueOf(eVar2.F1()), Float.valueOf(eVar.F1())) && r.b(eVar2.zza(), eVar.zza()) && r.b(eVar2.getDescription(), eVar.getDescription()) && r.b(Long.valueOf(eVar2.y()), Long.valueOf(eVar.y())) && r.b(Long.valueOf(eVar2.K0()), Long.valueOf(eVar.K0())) && r.b(eVar2.w0(), eVar.w0()) && r.b(Boolean.valueOf(eVar2.w1()), Boolean.valueOf(eVar.w1())) && r.b(Long.valueOf(eVar2.O()), Long.valueOf(eVar.O())) && r.b(eVar2.getDeviceName(), eVar.getDeviceName());
    }

    public float F1() {
        return this.j;
    }

    public String J1() {
        return this.c;
    }

    public long K0() {
        return this.i;
    }

    public T6.f L1() {
        return this.a;
    }

    public long O() {
        return this.m;
    }

    public Uri b0() {
        return this.d;
    }

    public T6.n c0() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return O1(this, obj);
    }

    public String getCoverImageUrl() {
        return this.e;
    }

    public String getDescription() {
        return this.g;
    }

    public String getDeviceName() {
        return this.n;
    }

    public int hashCode() {
        return M1(this);
    }

    public String toString() {
        return N1(this);
    }

    public String w0() {
        return this.k;
    }

    public boolean w1() {
        return this.l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, L1(), i, false);
        y6.c.C(parcel, 2, c0(), i, false);
        y6.c.E(parcel, 3, J1(), false);
        y6.c.C(parcel, 5, b0(), i, false);
        y6.c.E(parcel, 6, getCoverImageUrl(), false);
        y6.c.E(parcel, 7, this.f, false);
        y6.c.E(parcel, 8, getDescription(), false);
        y6.c.x(parcel, 9, y());
        y6.c.x(parcel, 10, K0());
        y6.c.p(parcel, 11, F1());
        y6.c.E(parcel, 12, w0(), false);
        y6.c.g(parcel, 13, w1());
        y6.c.x(parcel, 14, O());
        y6.c.E(parcel, 15, getDeviceName(), false);
        y6.c.b(parcel, a);
    }

    public long y() {
        return this.h;
    }

    public final String zza() {
        return this.f;
    }

    public i(e eVar) {
        PlayerEntity playerEntity = new PlayerEntity(eVar.c0());
        this.a = new GameEntity(eVar.L1());
        this.b = playerEntity;
        this.c = eVar.J1();
        this.d = eVar.b0();
        this.e = eVar.getCoverImageUrl();
        this.j = eVar.F1();
        this.f = eVar.zza();
        this.g = eVar.getDescription();
        this.h = eVar.y();
        this.i = eVar.K0();
        this.k = eVar.w0();
        this.l = eVar.w1();
        this.m = eVar.O();
        this.n = eVar.getDeviceName();
    }
}
