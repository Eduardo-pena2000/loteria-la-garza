package R6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public enum q implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator CREATOR = new K0();
    public final int a;

    public static class a extends Exception {
        public a(int i) {
            super(String.format(Locale.US, "Error code %d is not supported", new Object[]{Integer.valueOf(i)}));
        }
    }

    q(int i) {
        this.a = i;
    }

    public static q c(int i) {
        for (q qVar : values()) {
            if (i == qVar.a) {
                return qVar;
            }
        }
        throw new a(i);
    }

    public int b() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
