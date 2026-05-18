package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzchg implements zzboh {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcge zzcgeVar = (zzcge) obj;
        zzckr zzh = zzcgeVar.zzh();
        if (zzh == null) {
            try {
                zzckr zzckrVar = new zzckr(zzcgeVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcgeVar.zzw(zzckrVar);
                zzh = zzckrVar;
            } catch (NullPointerException e) {
                e = e;
                int i = o0.b;
                W5.p.d("Unable to parse videoMeta message.", e);
                R5.t.l().zzg(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                int i2 = o0.b;
                W5.p.d("Unable to parse videoMeta message.", e);
                R5.t.l().zzg(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i3 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i3 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (W5.p.j(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(parseFloat2).length() + 45 + String.valueOf(parseFloat).length() + 13 + String.valueOf(equals).length() + 19 + String.valueOf(i3).length() + 17 + String.valueOf(str).length());
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(i3);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            W5.p.a(sb.toString());
        }
        zzh.zzs(parseFloat2, parseFloat, i3, equals, parseFloat3);
    }
}
