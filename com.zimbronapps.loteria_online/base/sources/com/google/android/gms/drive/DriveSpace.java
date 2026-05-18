package com.google.android.gms.drive;

import E6.g;
import H6.G;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import java.util.Set;
import java.util.regex.Pattern;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class DriveSpace extends a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new G();
    public static final DriveSpace b;
    public static final DriveSpace c;
    public static final DriveSpace d;
    public static final Set e;
    public static final String f;
    public static final Pattern g;
    public final String a;

    static {
        DriveSpace driveSpace = new DriveSpace("DRIVE");
        b = driveSpace;
        DriveSpace driveSpace2 = new DriveSpace("APP_DATA_FOLDER");
        c = driveSpace2;
        DriveSpace driveSpace3 = new DriveSpace("PHOTOS");
        d = driveSpace3;
        Set e2 = g.e(driveSpace, driveSpace2, driveSpace3);
        e = e2;
        f = TextUtils.join(",", e2.toArray());
        g = Pattern.compile("[A-Z0-9_]*");
    }

    public DriveSpace(String str) {
        this.a = (String) t.l(str);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != DriveSpace.class) {
            return false;
        }
        return this.a.equals(((DriveSpace) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1247068382;
    }

    public String toString() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.E(parcel, 2, this.a, false);
        c.b(parcel, a);
    }
}
