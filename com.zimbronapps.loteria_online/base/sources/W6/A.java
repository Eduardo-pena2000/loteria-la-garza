package w6;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class a implements b {
    public final DataHolder a;

    public a(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    public final void close() {
        release();
    }

    public int getCount() {
        DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    public Iterator iterator() {
        return new c(this);
    }

    public void release() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
