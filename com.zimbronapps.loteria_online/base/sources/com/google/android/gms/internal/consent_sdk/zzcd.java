package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcd implements zzd {
    private final Application zza;
    private final zzbz zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzao zzf;
    private final zzbe zzg;
    private final zzaq zzh;

    public zzcd(Application application, zzbz zzbzVar, Handler handler, Executor executor, zze zzeVar, zzao zzaoVar, zzbe zzbeVar, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzbzVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzaoVar;
        this.zzg = zzbeVar;
        this.zzh = zzaqVar;
    }

    public static /* synthetic */ void zzc(zzcd zzcdVar) {
        JSONObject jSONObject = new JSONObject();
        Application application = zzcdVar.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            String str = null;
            if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", str);
            JSONObject jSONObject2 = new JSONObject();
            zzaq zzaqVar = zzcdVar.zzh;
            for (String str2 : zzaqVar.zzc().keySet()) {
                jSONObject2.put(str2, zzaqVar.zzc().get(str2));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        zzcdVar.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    private final void zzg(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString)));
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString)), e);
        }
    }

    public final Executor zza() {
        Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        return new zzcb(handler);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(java.lang.String r8, org.json.JSONObject r9) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = -1
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r0) {
                case -1370505102: goto L2b;
                case -278739366: goto L21;
                case 150940456: goto L17;
                case 1671672458: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r0 = "dismiss"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L35
            r8 = r5
            goto L36
        L17:
            java.lang.String r0 = "browser"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L35
            r8 = r3
            goto L36
        L21:
            java.lang.String r0 = "configure_app_assets"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L35
            r8 = r4
            goto L36
        L2b:
            java.lang.String r0 = "load_complete"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L35
            r8 = r2
            goto L36
        L35:
            r8 = r1
        L36:
            if (r8 == 0) goto Lb2
            if (r8 == r5) goto L47
            if (r8 == r3) goto L43
            if (r8 == r4) goto L3f
            return r2
        L3f:
            r7.zzd()
            return r5
        L43:
            r7.zzg(r9)
            return r5
        L47:
            java.lang.String r8 = "status"
            java.lang.String r8 = r9.optString(r8)
            int r9 = r8.hashCode()
            r0 = 4
            r6 = 5
            switch(r9) {
                case -954325659: goto L89;
                case -258041904: goto L7f;
                case 429411856: goto L75;
                case 467888915: goto L6b;
                case 1666911234: goto L61;
                case 1725474845: goto L57;
                default: goto L56;
            }
        L56:
            goto L92
        L57:
            java.lang.String r9 = "CONSENT_SIGNAL_NOT_REQUIRED"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r6
            goto L92
        L61:
            java.lang.String r9 = "non_personalized"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r3
            goto L92
        L6b:
            java.lang.String r9 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r5
            goto L92
        L75:
            java.lang.String r9 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r0
            goto L92
        L7f:
            java.lang.String r9 = "personalized"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r2
            goto L92
        L89:
            java.lang.String r9 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r4
        L92:
            if (r1 == 0) goto Lac
            if (r1 == r5) goto Lac
            if (r1 == r3) goto Lac
            if (r1 == r4) goto Lac
            if (r1 == r0) goto Lac
            if (r1 == r6) goto Lab
            com.google.android.gms.internal.consent_sdk.zzbe r8 = r7.zzg
            com.google.android.gms.internal.consent_sdk.zzg r9 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = "We are getting something wrong with the webview."
            r9.<init>(r5, r0)
            r8.zzh(r9)
            goto Lb1
        Lab:
            r4 = r5
        Lac:
            com.google.android.gms.internal.consent_sdk.zzbe r8 = r7.zzg
            r8.zzg(r4)
        Lb1:
            return r5
        Lb2:
            com.google.android.gms.internal.consent_sdk.zzbe r8 = r7.zzg
            r8.zzi()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzcd.zzb(java.lang.String, org.json.JSONObject):boolean");
    }

    public final void zzd() {
        this.zzd.execute(new zzcc(this));
    }

    public final void zze(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        this.zze.zzb(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.zzf);
    }

    public final void zzf(int i, String str, String str2) {
        this.zzg.zzj(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", new Object[]{Integer.valueOf(i), str2, str})));
    }
}
