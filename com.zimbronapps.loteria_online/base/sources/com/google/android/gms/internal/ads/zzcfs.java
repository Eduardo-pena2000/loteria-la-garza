package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcfs extends FrameLayout implements zzcfj {
    final zzcgg zza;
    private final zzcge zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbht zze;
    private final long zzf;
    private final zzcfk zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcfs(Context context, zzcge zzcgeVar, int i, boolean z, zzbht zzbhtVar, zzcgd zzcgdVar, zzdxz zzdxzVar) {
        super(context);
        this.zzb = zzcgeVar;
        this.zze = zzbhtVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.t.l(zzcgeVar.zzk());
        zzcfl zzcflVar = zzcgeVar.zzk().a;
        zzcgf zzcgfVar = new zzcgf(context, zzcgeVar.zzs(), zzcgeVar.zzm(), zzbhtVar, zzcgeVar.zzi());
        zzcfk zzcjaVar = i == 3 ? new zzcja(context, zzcgfVar) : i == 2 ? new zzcgw(context, zzcgfVar, zzcgeVar, z, zzcfl.zza(zzcgeVar), zzcgdVar, zzdxzVar) : new zzcfi(context, zzcgeVar, z, zzcfl.zza(zzcgeVar), zzcgdVar, new zzcgf(context, zzcgeVar.zzs(), zzcgeVar.zzm(), zzbhtVar, zzcgeVar.zzi()), zzdxzVar);
        this.zzg = zzcjaVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcjaVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) S5.D.c().zzd(zzbhe.zzap)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzam)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) S5.D.c().zzd(zzbhe.zzar)).longValue();
        boolean booleanValue = ((Boolean) S5.D.c().zzd(zzbhe.zzao)).booleanValue();
        this.zzk = booleanValue;
        if (zzbhtVar != null) {
            zzbhtVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcgg(this);
        zzcjaVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        Map hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", hashMap);
    }

    private final void zzL() {
        zzcge zzcgeVar = this.zzb;
        if (zzcgeVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcgeVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            zzcfk zzcfkVar = this.zzg;
            if (zzcfkVar != null) {
                zzcei.zzf.execute(new zzcfp(zzcfkVar));
            }
        } finally {
            super.finalize();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super/*android.view.View*/.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        F0.l.post(new zzcfr(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super/*android.view.View*/.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        F0.l.post(new zzcfo(this, z));
    }

    public final void zzA(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzB(i);
    }

    public final void zzB(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzC(i);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        TextView textView = new TextView(zzcfkVar.getContext());
        Resources zzf = R5.t.l().zzf();
        textView.setText(String.valueOf(zzf == null ? "AdMob - " : zzf.getString(Q5.d.u)).concat(zzcfkVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            zzcfkVar.zzd();
        }
        zzL();
    }

    public final void zzF() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        long zzh = zzcfkVar.zzh();
        if (this.zzl == zzh || zzh <= 0) {
            return;
        }
        float f = zzh / 1000.0f;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcw)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzcfkVar.zzo()), "qoeCachedBytes", String.valueOf(zzcfkVar.zzn()), "qoeLoadedBytes", String.valueOf(zzcfkVar.zzm()), "droppedFrames", String.valueOf(zzcfkVar.zzp()), "reportTime", String.valueOf(R5.t.o().a()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = zzh;
    }

    public final /* synthetic */ void zzG(boolean z) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    public final void zza() {
        this.zza.zzb();
        F0.l.post(new zzcfm(this));
    }

    public final void zzb() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzcfkVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzcfkVar.zzk()), "videoHeight", String.valueOf(zzcfkVar.zzl()));
        }
    }

    public final void zzc() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcy)).booleanValue()) {
            this.zza.zzb();
        }
        zzcge zzcgeVar = this.zzb;
        if (zzcgeVar.zzj() != null && !this.zzi) {
            boolean z = (zzcgeVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                zzcgeVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    public final void zze() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcy)).booleanValue()) {
            this.zza.zza();
        }
        zzI("ended", new String[0]);
        zzL();
    }

    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    public final void zzg(String str, String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        F0.l.post(new zzcfn(this));
    }

    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null || this.zzp == null) {
            return;
        }
        long b = R5.t.o().b();
        if (zzcfkVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long b2 = R5.t.o().b() - b;
        if (o0.m()) {
            StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(b2);
            sb.append("ms");
            o0.k(sb.toString());
        }
        if (b2 > this.zzf) {
            W5.p.f("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbht zzbhtVar = this.zze;
            if (zzbhtVar != null) {
                zzbhtVar.zzd("spinner_jank", Long.toString(b2));
            }
        }
    }

    public final void zzj(int i, int i2) {
        if (this.zzk) {
            zzbgv zzbgvVar = zzbhe.zzaq;
            int max = Math.max(i / ((Integer) S5.D.c().zzd(zzbgvVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) S5.D.c().zzd(zzbgvVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    public final void zzk() {
        this.zzd.setVisibility(4);
        F0.l.post(new zzcfq(this));
    }

    public final Integer zzl() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            return zzcfkVar.zzw();
        }
        return null;
    }

    public final void zzm(int i) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzap)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzn(int i, int i2, int i3, int i4) {
        if (o0.m()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i2).length() + 3 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length());
            sb.append("Set video bounds to x:");
            sb.append(i);
            sb.append(";y:");
            sb.append(i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            o0.k(sb.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f, float f2) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            zzcfkVar.zzj(f, f2);
        }
    }

    public final void zzq(Integer num) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzcfkVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzf();
    }

    public final void zzs() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zze();
    }

    public final void zzt(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzi(i);
    }

    public final void zzu() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zza(true);
        zzcfkVar.zzq();
    }

    public final void zzv() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zza(false);
        zzcfkVar.zzq();
    }

    public final void zzw(float f) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zzb(f);
        zzcfkVar.zzq();
    }

    public final void zzx(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzy(i);
    }

    public final void zzy(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzz(i);
    }

    public final void zzz(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzA(i);
    }
}
