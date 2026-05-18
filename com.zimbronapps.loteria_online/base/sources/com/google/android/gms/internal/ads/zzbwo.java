package com.google.android.gms.internal.ads;

import V5.F0;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbwo extends zzbwx {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbwo(zzcjl zzcjlVar, Map map) {
        super(zzcjlVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcjlVar.zzj();
        this.zzc = zzd("description");
        this.zzf = zzd("summary");
        this.zzd = zze("start_ticks");
        this.zze = zze("end_ticks");
        this.zzg = zzd("location");
    }

    private final String zzd(String str) {
        Map map = this.zza;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    private final long zze(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available.");
            return;
        }
        R5.t.g();
        if (!new zzbgl(context).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        R5.t.g();
        AlertDialog.Builder p = F0.p(context);
        Resources zzf = R5.t.l().zzf();
        p.setTitle(zzf != null ? zzf.getString(Q5.d.r) : "Create calendar event");
        p.setMessage(zzf != null ? zzf.getString(Q5.d.s) : "Allow Ad to create a calendar event?");
        p.setPositiveButton(zzf != null ? zzf.getString(Q5.d.p) : "Accept", new zzbwm(this));
        p.setNegativeButton(zzf != null ? zzf.getString(Q5.d.q) : "Decline", new zzbwn(this));
        p.create().show();
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final /* synthetic */ Context zzc() {
        return this.zzb;
    }
}
