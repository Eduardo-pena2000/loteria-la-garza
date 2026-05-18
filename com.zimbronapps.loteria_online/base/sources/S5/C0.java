package S5;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzbct;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c0 extends zzbct implements d0 {
    public static d0 q1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof d0 ? (d0) queryLocalInterface : new a0(iBinder);
    }
}
