package com.google.android.gms.internal.ads;

import V5.F0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeap {
    private final Context zza;
    private final ApplicationInfo zzb;
    private String zze = "";
    private final int zzc = ((Integer) S5.D.c().zzd(zzbhe.zzkD)).intValue();
    private final int zzd = ((Integer) S5.D.c().zzd(zzbhe.zzkE)).intValue();

    public zzeap(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
    }

    public final JSONObject zza() throws JSONException {
        String str;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str2 = this.zzb.packageName;
            zzfyn zzfynVar = F0.l;
            jSONObject.put("name", G6.e.a(context).d(str2));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.zzb.packageName);
        R5.t.g();
        Drawable drawable = null;
        try {
            str = F0.g0(this.zza);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (this.zze.isEmpty()) {
            try {
                drawable = (Drawable) G6.e.a(this.zza).e(this.zzb.packageName).b;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                int i = this.zzc;
                int i2 = this.zzd;
                drawable.setBounds(0, 0, i, i2);
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = encodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
