package com.google.android.gms.internal.ads;

import V5.F0;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbwu extends zzbwx {
    private final Map zza;
    private final Context zzb;

    public zzbwu(zzcjl zzcjlVar, Map map) {
        super(zzcjlVar, "storePicture");
        this.zza = map;
        this.zzb = zzcjlVar.zzj();
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available");
            return;
        }
        R5.t.g();
        if (!new zzbgl(context).zza()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        R5.t.g();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources zzf = R5.t.l().zzf();
        R5.t.g();
        AlertDialog.Builder p = F0.p(context);
        p.setTitle(zzf != null ? zzf.getString(Q5.d.n) : "Save image");
        p.setMessage(zzf != null ? zzf.getString(Q5.d.o) : "Allow Ad to store image in Picture gallery?");
        p.setPositiveButton(zzf != null ? zzf.getString(Q5.d.p) : "Accept", new zzbws(this, str, lastPathSegment));
        p.setNegativeButton(zzf != null ? zzf.getString(Q5.d.q) : "Decline", new zzbwt(this));
        p.create().show();
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }
}
