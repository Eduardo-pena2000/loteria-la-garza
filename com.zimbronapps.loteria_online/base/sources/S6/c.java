package s6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface c extends IInterface {

    public static abstract class a extends zzb implements c {

        public static class a extends zza implements c {
            public a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            }

            public void Z(r6.a aVar, s6.a aVar2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(obtainAndWriteInterfaceToken, aVar);
                zzc.zzc(obtainAndWriteInterfaceToken, aVar2);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            public void x0(r6.c cVar, b bVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(obtainAndWriteInterfaceToken, cVar);
                zzc.zzc(obtainAndWriteInterfaceToken, bVar);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public static c q1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            return queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(iBinder);
        }
    }

    void Z(r6.a aVar, s6.a aVar2);

    void x0(r6.c cVar, b bVar);
}
