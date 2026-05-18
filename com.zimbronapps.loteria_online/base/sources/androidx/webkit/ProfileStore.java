package androidx.webkit;

import java.util.List;
import t4.b;
import u4.o;
import u4.y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (y.e0.c()) {
            return o.getInstance();
        }
        throw y.a();
    }

    boolean deleteProfile(String str);

    List getAllProfileNames();

    b getOrCreateProfile(String str);

    b getProfile(String str);
}
