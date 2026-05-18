package I2;

import android.os.Bundle;
import androidx.lifecycle.Z;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {

    public interface a {
        void a(J2.b bVar);

        J2.b b(int i, Bundle bundle);

        void c(J2.b bVar, Object obj);
    }

    public static a b(r rVar) {
        return new b(rVar, ((Z) rVar).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract J2.b c(int i, Bundle bundle, a aVar);

    public abstract void d();
}
