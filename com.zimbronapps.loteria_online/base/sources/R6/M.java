package R6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class m extends n {
    public static final Parcelable.Creator CREATOR = new C0();
    public final x a;
    public final Uri b;
    public final byte[] c;

    public m(x xVar, Uri uri, byte[] bArr) {
        this.a = (x) com.google.android.gms.common.internal.t.l(xVar);
        P1(uri);
        this.b = uri;
        Q1(bArr);
        this.c = bArr;
    }

    private static Uri P1(Uri uri) {
        com.google.android.gms.common.internal.t.l(uri);
        com.google.android.gms.common.internal.t.b(uri.getScheme() != null, "origin scheme must be non-empty");
        com.google.android.gms.common.internal.t.b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] Q1(byte[] bArr) {
        boolean z = true;
        if (bArr != null && bArr.length != 32) {
            z = false;
        }
        com.google.android.gms.common.internal.t.b(z, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public byte[] M1() {
        return this.c;
    }

    public Uri N1() {
        return this.b;
    }

    public x O1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return com.google.android.gms.common.internal.r.b(this.a, mVar.a) && com.google.android.gms.common.internal.r.b(this.b, mVar.b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b);
    }

    public final String toString() {
        byte[] bArr = this.c;
        Uri uri = this.b;
        return "BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=" + String.valueOf(this.a) + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + E6.c.e(bArr) + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 2, O1(), i, false);
        y6.c.C(parcel, 3, N1(), i, false);
        y6.c.k(parcel, 4, M1(), false);
        y6.c.b(parcel, a);
    }
}
