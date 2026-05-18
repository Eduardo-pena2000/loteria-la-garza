package i6;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends zza implements g {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    public final void L(d dVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, dVar);
        zza.writeString(str);
        zzc(2, zza);
    }

    public final void c(d dVar, Account account) {
        Parcel zza = zza();
        zzc.zzd(zza, dVar);
        zzc.zzc(zza, account);
        zzc(3, zza);
    }

    public final void zzf(boolean z) {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(1, zza);
    }
}
