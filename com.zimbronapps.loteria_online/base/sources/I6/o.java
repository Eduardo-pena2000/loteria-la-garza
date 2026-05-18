package I6;

import com.google.android.gms.drive.DriveId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class o {
    public static boolean a(int i, DriveId driveId) {
        if (i != 1) {
            if (i == 4 || i == 7) {
                return driveId == null;
            }
            if (i != 8) {
                return false;
            }
        }
        return driveId != null;
    }
}
