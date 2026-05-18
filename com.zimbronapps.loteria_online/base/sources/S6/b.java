package s6;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface b extends IInterface {

    public static abstract class a extends zzb implements b {
        public a() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
        }

        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            r6.e eVar = (r6.e) zzc.zza(parcel, r6.e.CREATOR);
            enforceNoDataAvail(parcel);
            U0(status, eVar);
            return true;
        }
    }

    void U0(Status status, r6.e eVar);
}
