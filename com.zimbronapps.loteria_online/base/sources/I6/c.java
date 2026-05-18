package i6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c extends zzb implements d {
    public c() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int i3 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzb(parcel);
            zzc(readInt != 0);
        } else {
            Account account = (Account) zzc.zza(parcel, Account.CREATOR);
            zzc.zzb(parcel);
            zzb(account);
        }
        return true;
    }
}
