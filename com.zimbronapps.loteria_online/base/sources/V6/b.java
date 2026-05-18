package v6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b extends y6.a {
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final String d;
    public final Integer e;
    public static final b f = new b(0);
    public static final Parcelable.Creator CREATOR = new r();

    public b(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
        this.e = num;
    }

    public static String S1(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public Integer M1() {
        return this.e;
    }

    public int N1() {
        return this.b;
    }

    public String O1() {
        return this.d;
    }

    public PendingIntent P1() {
        return this.c;
    }

    public boolean Q1() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public boolean R1() {
        return this.b == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.b == bVar.b && com.google.android.gms.common.internal.r.b(this.c, bVar.c) && com.google.android.gms.common.internal.r.b(this.d, bVar.d) && com.google.android.gms.common.internal.r.b(this.e, bVar.e);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(Integer.valueOf(this.b), this.c, this.d, this.e);
    }

    public String toString() {
        r.a d = com.google.android.gms.common.internal.r.d(this);
        d.a("statusCode", S1(this.b));
        d.a("resolution", this.c);
        d.a("message", this.d);
        d.a("clientMethodKey", this.e);
        return d.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.t(parcel, 2, N1());
        y6.c.C(parcel, 3, P1(), i, false);
        y6.c.E(parcel, 4, O1(), false);
        y6.c.w(parcel, 5, M1(), false);
        y6.c.b(parcel, a);
    }

    public b(int i) {
        this(i, null, null);
    }

    public b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
