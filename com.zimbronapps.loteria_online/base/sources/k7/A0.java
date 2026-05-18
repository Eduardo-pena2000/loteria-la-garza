package K7;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzba;
import com.google.android.gms.internal.firebase-auth-api.zzcl;
import com.google.android.gms.internal.firebase-auth-api.zzco;
import com.google.android.gms.internal.firebase-auth-api.zzcv;
import com.google.android.gms.internal.firebase-auth-api.zzmy;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class a0 {
    public static a0 c;
    public final String a;
    public final zzmy b;

    public a0(String str, zzmy zzmyVar) {
        this.a = str;
        this.b = zzmyVar;
    }

    public static a0 a(Context context, String str) {
        a0 a0Var = c;
        if (a0Var == null || !Objects.equals(a0Var.a, str)) {
            c = new a0(str, e(context, str));
        }
        return c;
    }

    public static zzmy c(Context context, String str) {
        return new zzmy.zza().zza(context, "StorageCryptoKeyset", f(str)).zza(zzcv.zzb).zza(String.format("android-keystore://firebear_main_key_id_for_storage_crypto.%s", new Object[]{str})).zza();
    }

    public static zzmy e(Context context, String str) {
        try {
            zzcl.zza();
            return c(context, str);
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e.getMessage());
            if (e instanceof GeneralSecurityException) {
                context.getSharedPreferences(f(str), 0).edit().remove("StorageCryptoKeyset").apply();
                try {
                    return c(context, str);
                } catch (GeneralSecurityException | IOException e2) {
                    Log.e("FirebearStorageCryptoHelper", "Exception encountered during second attempt to crypto setup:\n" + e2.getMessage());
                    return null;
                }
            }
            return null;
        }
    }

    public static String f(String str) {
        return String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str});
    }

    public final String b(String str) {
        String str2;
        com.google.android.gms.common.internal.t.l(str);
        zzmy zzmyVar = this.b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzba) this.b.zza().zza(zzco.zza(), zzba.class)).zza(Base64.decode(str, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (GeneralSecurityException | IllegalArgumentException e) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e.getMessage());
            return null;
        }
    }

    public final String d(String str) {
        String encodeToString;
        com.google.android.gms.common.internal.t.l(str);
        zzmy zzmyVar = this.b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                encodeToString = Base64.encodeToString(((zzba) this.b.zza().zza(zzco.zza(), zzba.class)).zzb(str.getBytes(StandardCharsets.UTF_8), null), 2);
            }
            return encodeToString;
        } catch (GeneralSecurityException e) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e.getMessage());
            return null;
        }
    }
}
