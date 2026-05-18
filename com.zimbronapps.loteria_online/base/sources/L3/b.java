package L3;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public e a(long j, byte[] bArr, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i, i2);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new e(P2.b.a(new a(), (ArrayList) P2.a.e(readBundle.getParcelableArrayList("c"))), j, readBundle.getLong("d"));
    }
}
