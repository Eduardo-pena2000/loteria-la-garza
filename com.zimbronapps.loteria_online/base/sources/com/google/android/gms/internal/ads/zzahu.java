package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzahu {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzaht zza(java.lang.String r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahu.zza(java.lang.String):com.google.android.gms.internal.ads.zzaht");
    }

    public static boolean zzb(String str) {
        if (str == null) {
            return false;
        }
        String[] strArr = zza;
        for (int i = 0; i < 4; i++) {
            if (str.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    private static zzguf zzc(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfq.zzb(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zzc2 = zzfq.zzc(xmlPullParser, concat2);
                String zzc3 = zzfq.zzc(xmlPullParser, concat3);
                String zzc4 = zzfq.zzc(xmlPullParser, concat4);
                String zzc5 = zzfq.zzc(xmlPullParser, concat5);
                if (zzc2 == null || zzc3 == null) {
                    return zzguf.zzi();
                }
                zzgucVar.zzf(new zzahs(zzc2, zzc3, zzc4 != null ? Long.parseLong(zzc4) : 0L, zzc5 != null ? Long.parseLong(zzc5) : 0L));
            }
        } while (!zzfq.zza(xmlPullParser, str.concat(":Directory")));
        return zzgucVar.zzi();
    }
}
