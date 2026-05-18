package m4;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface b extends Closeable {
    void I();

    f J0(String str);

    void K(String str, Object[] objArr);

    Cursor S(e eVar, CancellationSignal cancellationSignal);

    void U();

    String e0();

    Cursor f1(String str);

    void i();

    boolean isOpen();

    List n();

    void p(String str);

    Cursor s0(e eVar);

    boolean v1();
}
