package za;

import android.webkit.PermissionRequest;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class r0 extends n1 {
    public r0(R3 r3) {
        super(r3);
    }

    public void b(PermissionRequest permissionRequest) {
        permissionRequest.deny();
    }

    public void d(PermissionRequest permissionRequest, List list) {
        permissionRequest.grant((String[]) list.toArray(new String[0]));
    }

    public List g(PermissionRequest permissionRequest) {
        return Arrays.asList(permissionRequest.getResources());
    }
}
