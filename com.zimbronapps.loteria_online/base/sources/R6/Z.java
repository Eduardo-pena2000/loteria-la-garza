package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public enum z implements Parcelable {
    PUBLIC_KEY("public-key");

    public static final Parcelable.Creator CREATOR = new d0();
    public final String a = "public-key";

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    z(String str) {
    }

    public static z b(String str) {
        for (z zVar : values()) {
            if (str.equals(zVar.a)) {
                return zVar;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", new Object[]{str}));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
