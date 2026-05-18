package u4;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class o implements ProfileStore {
    public static ProfileStore b;
    public final ProfileStoreBoundaryInterface a;

    public o(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.a = profileStoreBoundaryInterface;
    }

    public static ProfileStore getInstance() {
        if (b == null) {
            b = new o(z.d().getProfileStore());
        }
        return b;
    }

    public boolean deleteProfile(String str) {
        if (y.e0.c()) {
            return this.a.deleteProfile(str);
        }
        throw y.a();
    }

    public List getAllProfileNames() {
        if (y.e0.c()) {
            return this.a.getAllProfileNames();
        }
        throw y.a();
    }

    public t4.b getOrCreateProfile(String str) {
        if (y.e0.c()) {
            return new n((ProfileBoundaryInterface) Lb.a.a(ProfileBoundaryInterface.class, this.a.getOrCreateProfile(str)));
        }
        throw y.a();
    }

    public t4.b getProfile(String str) {
        if (!y.e0.c()) {
            throw y.a();
        }
        InvocationHandler profile = this.a.getProfile(str);
        if (profile != null) {
            return new n((ProfileBoundaryInterface) Lb.a.a(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }
}
