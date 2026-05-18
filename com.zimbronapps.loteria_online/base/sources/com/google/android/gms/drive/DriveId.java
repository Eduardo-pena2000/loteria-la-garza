package com.google.android.gms.drive;

import H6.E;
import H6.h;
import H6.i;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.drive.zzbn;
import com.google.android.gms.internal.drive.zzbs;
import com.google.android.gms.internal.drive.zzfb;
import com.google.android.gms.internal.drive.zzkk;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class DriveId extends a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new E();
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public volatile String e = null;
    public volatile String f = null;

    public DriveId(String str, long j, long j2, int i) {
        this.a = str;
        boolean z = true;
        t.a(!"".equals(str));
        if (str == null && j == -1) {
            z = false;
        }
        t.a(z);
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public static DriveId P1(String str) {
        t.l(str);
        return new DriveId(str, -1L, -1L, -1);
    }

    public h M1() {
        if (this.d != 1) {
            return new zzbn(this);
        }
        throw new IllegalStateException("This DriveId corresponds to a folder. Call asDriveFolder instead.");
    }

    public i N1() {
        if (this.d != 0) {
            return new zzbs(this);
        }
        throw new IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
    }

    public final String O1() {
        if (this.e == null) {
            zzfb.zza zzm = zzfb.zzan().zzm(1);
            String str = this.a;
            if (str == null) {
                str = "";
            }
            String valueOf = String.valueOf(Base64.encodeToString(((zzkk) zzm.zze(str).zzg(this.b).zzh(this.c).zzn(this.d).zzdf()).toByteArray(), 10));
            this.e = valueOf.length() != 0 ? "DriveId:".concat(valueOf) : new String("DriveId:");
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            if (driveId.c != this.c) {
                return false;
            }
            long j = driveId.b;
            if (j == -1 && this.b == -1) {
                return driveId.a.equals(this.a);
            }
            String str2 = this.a;
            if (str2 != null && (str = driveId.a) != null) {
                return j == this.b && str.equals(str2);
            }
            if (j == this.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.b == -1) {
            return this.a.hashCode();
        }
        String valueOf = String.valueOf(String.valueOf(this.c));
        String valueOf2 = String.valueOf(String.valueOf(this.b));
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }

    public String toString() {
        return O1();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.E(parcel, 2, this.a, false);
        c.x(parcel, 3, this.b);
        c.x(parcel, 4, this.c);
        c.t(parcel, 5, this.d);
        c.b(parcel, a);
    }
}
