package s6;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface a extends IInterface {

    public static abstract class a extends zzb implements a {
        public a() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback");
        }

        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            boolean zzd = zzc.zzd(parcel);
            enforceNoDataAvail(parcel);
            i1(status, zzd);
            return true;
        }
    }

    void i1(Status status, boolean z);
}
