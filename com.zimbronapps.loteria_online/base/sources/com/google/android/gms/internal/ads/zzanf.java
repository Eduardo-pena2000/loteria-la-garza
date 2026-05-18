package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzanf implements zzamf {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzand zzh = new zzand(30.0f, 1, 1);

    public zzanf() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static String[] zzc(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfj.zza;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0382 A[Catch: zzamb -> 0x03cf, TryCatch #0 {zzamb -> 0x03cf, blocks: (B:159:0x02e2, B:161:0x02fb, B:162:0x0311, B:164:0x0317, B:166:0x031d, B:179:0x0353, B:180:0x037c, B:182:0x0382, B:186:0x038c, B:188:0x0357, B:189:0x0374, B:190:0x0375, B:191:0x0379, B:201:0x038e, B:203:0x038f, B:204:0x03ac, B:206:0x0304, B:208:0x03ad, B:209:0x03ce), top: B:158:0x02e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0379 A[Catch: zzamb -> 0x03cf, TryCatch #0 {zzamb -> 0x03cf, blocks: (B:159:0x02e2, B:161:0x02fb, B:162:0x0311, B:164:0x0317, B:166:0x031d, B:179:0x0353, B:180:0x037c, B:182:0x0382, B:186:0x038c, B:188:0x0357, B:189:0x0374, B:190:0x0375, B:191:0x0379, B:201:0x038e, B:203:0x038f, B:204:0x03ac, B:206:0x0304, B:208:0x03ad, B:209:0x03ce), top: B:158:0x02e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00de  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzani zzd(org.xmlpull.v1.XmlPullParser r17, com.google.android.gms.internal.ads.zzani r18) {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzd(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzani):com.google.android.gms.internal.ads.zzani");
    }

    private static zzani zze(zzani zzaniVar) {
        return zzaniVar == null ? new zzani() : zzaniVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.text.Layout.Alignment zzf(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.zzgql.zza(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzf(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzg(java.lang.String r13, com.google.android.gms.internal.ads.zzand r14) throws com.google.android.gms.internal.ads.zzamb {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzg(java.lang.String, com.google.android.gms.internal.ads.zzand):long");
    }

    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        zzalz.zza(zzb(bArr, i, i2), zzameVar, zzdrVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(9:264|(6:265|266|267|(8:269|270|271|(2:275|(2:277|(3:279|(2:281|(2:283|(3:295|296|(1:298)))(2:302|(1:304)))(2:305|(1:307))|285)(2:308|309))(1:310))(1:311)|286|287|288|290)|333|334)|(4:(3:336|337|(4:339|(1:341)(1:378)|342|(1:344)(9:377|346|(2:348|(1:350)(2:(5:365|366|367|368|(1:370))(1:375)|371))(1:376)|351|352|353|354|355|(1:357)))(1:379))(1:380)|354|355|(0))|345|346|(0)(0)|351|352|353) */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x06ff, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0700, code lost:
    
        r6 = r27;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x051c A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:16:0x00a1, B:18:0x00a9, B:21:0x00be, B:22:0x00da, B:24:0x00e4, B:25:0x00e8, B:27:0x00f4, B:28:0x00ff, B:32:0x0176, B:36:0x01d1, B:39:0x01e5, B:41:0x01eb, B:43:0x01f3, B:45:0x01fb, B:47:0x0203, B:49:0x020b, B:51:0x0213, B:53:0x0219, B:55:0x0221, B:57:0x0229, B:59:0x022f, B:61:0x0235, B:63:0x023b, B:65:0x0243, B:68:0x024c, B:71:0x0773, B:72:0x027d, B:74:0x0283, B:76:0x028c, B:78:0x029b, B:80:0x02a8, B:82:0x02be, B:84:0x02c4, B:86:0x056c, B:96:0x02d3, B:99:0x02df, B:104:0x051c, B:107:0x02fb, B:109:0x0303, B:111:0x030b, B:113:0x0313, B:116:0x0320, B:120:0x0339, B:122:0x033f, B:124:0x034c, B:126:0x03b4, B:128:0x03ba, B:130:0x03c0, B:132:0x03c8, B:134:0x03ce, B:138:0x03e1, B:140:0x03e7, B:142:0x03f4, B:143:0x046c, B:145:0x0474, B:158:0x04c0, B:160:0x04c8, B:176:0x050f, B:194:0x0400, B:198:0x0402, B:199:0x0403, B:201:0x0410, B:204:0x0418, B:207:0x0426, B:209:0x042c, B:211:0x0437, B:214:0x044b, B:217:0x044d, B:218:0x044e, B:219:0x045b, B:223:0x0356, B:226:0x0358, B:227:0x0359, B:228:0x0363, B:231:0x036d, B:234:0x0376, B:236:0x037c, B:238:0x0387, B:241:0x0398, B:244:0x039a, B:245:0x039b, B:246:0x03a3, B:250:0x052f, B:252:0x053c, B:254:0x0547, B:256:0x054d, B:257:0x0559, B:266:0x058d, B:270:0x05af, B:296:0x0619, B:298:0x0621, B:288:0x0667, B:294:0x0709, B:302:0x0635, B:305:0x063f, B:309:0x064d, B:310:0x0657, B:311:0x065f, B:336:0x0678, B:352:0x06db, B:355:0x06e9, B:357:0x06ee, B:367:0x06c4, B:384:0x0183, B:386:0x018f, B:389:0x0198, B:391:0x019e, B:393:0x01a9, B:396:0x01b6, B:399:0x01b8, B:400:0x01b9, B:401:0x0118, B:403:0x0124, B:406:0x012d, B:408:0x0133, B:411:0x013a, B:413:0x0140, B:418:0x0156, B:420:0x016e, B:425:0x0164, B:431:0x016d, B:442:0x0729, B:445:0x0736, B:448:0x073a, B:450:0x0744, B:452:0x074e, B:455:0x0755, B:456:0x0756, B:459:0x0768, B:462:0x0770, B:468:0x078f), top: B:2:0x0009, inners: #4, #6, #8, #9, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0320 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TRY_LEAVE, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:16:0x00a1, B:18:0x00a9, B:21:0x00be, B:22:0x00da, B:24:0x00e4, B:25:0x00e8, B:27:0x00f4, B:28:0x00ff, B:32:0x0176, B:36:0x01d1, B:39:0x01e5, B:41:0x01eb, B:43:0x01f3, B:45:0x01fb, B:47:0x0203, B:49:0x020b, B:51:0x0213, B:53:0x0219, B:55:0x0221, B:57:0x0229, B:59:0x022f, B:61:0x0235, B:63:0x023b, B:65:0x0243, B:68:0x024c, B:71:0x0773, B:72:0x027d, B:74:0x0283, B:76:0x028c, B:78:0x029b, B:80:0x02a8, B:82:0x02be, B:84:0x02c4, B:86:0x056c, B:96:0x02d3, B:99:0x02df, B:104:0x051c, B:107:0x02fb, B:109:0x0303, B:111:0x030b, B:113:0x0313, B:116:0x0320, B:120:0x0339, B:122:0x033f, B:124:0x034c, B:126:0x03b4, B:128:0x03ba, B:130:0x03c0, B:132:0x03c8, B:134:0x03ce, B:138:0x03e1, B:140:0x03e7, B:142:0x03f4, B:143:0x046c, B:145:0x0474, B:158:0x04c0, B:160:0x04c8, B:176:0x050f, B:194:0x0400, B:198:0x0402, B:199:0x0403, B:201:0x0410, B:204:0x0418, B:207:0x0426, B:209:0x042c, B:211:0x0437, B:214:0x044b, B:217:0x044d, B:218:0x044e, B:219:0x045b, B:223:0x0356, B:226:0x0358, B:227:0x0359, B:228:0x0363, B:231:0x036d, B:234:0x0376, B:236:0x037c, B:238:0x0387, B:241:0x0398, B:244:0x039a, B:245:0x039b, B:246:0x03a3, B:250:0x052f, B:252:0x053c, B:254:0x0547, B:256:0x054d, B:257:0x0559, B:266:0x058d, B:270:0x05af, B:296:0x0619, B:298:0x0621, B:288:0x0667, B:294:0x0709, B:302:0x0635, B:305:0x063f, B:309:0x064d, B:310:0x0657, B:311:0x065f, B:336:0x0678, B:352:0x06db, B:355:0x06e9, B:357:0x06ee, B:367:0x06c4, B:384:0x0183, B:386:0x018f, B:389:0x0198, B:391:0x019e, B:393:0x01a9, B:396:0x01b6, B:399:0x01b8, B:400:0x01b9, B:401:0x0118, B:403:0x0124, B:406:0x012d, B:408:0x0133, B:411:0x013a, B:413:0x0140, B:418:0x0156, B:420:0x016e, B:425:0x0164, B:431:0x016d, B:442:0x0729, B:445:0x0736, B:448:0x073a, B:450:0x0744, B:452:0x074e, B:455:0x0755, B:456:0x0756, B:459:0x0768, B:462:0x0770, B:468:0x078f), top: B:2:0x0009, inners: #4, #6, #8, #9, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ce A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TRY_LEAVE, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:16:0x00a1, B:18:0x00a9, B:21:0x00be, B:22:0x00da, B:24:0x00e4, B:25:0x00e8, B:27:0x00f4, B:28:0x00ff, B:32:0x0176, B:36:0x01d1, B:39:0x01e5, B:41:0x01eb, B:43:0x01f3, B:45:0x01fb, B:47:0x0203, B:49:0x020b, B:51:0x0213, B:53:0x0219, B:55:0x0221, B:57:0x0229, B:59:0x022f, B:61:0x0235, B:63:0x023b, B:65:0x0243, B:68:0x024c, B:71:0x0773, B:72:0x027d, B:74:0x0283, B:76:0x028c, B:78:0x029b, B:80:0x02a8, B:82:0x02be, B:84:0x02c4, B:86:0x056c, B:96:0x02d3, B:99:0x02df, B:104:0x051c, B:107:0x02fb, B:109:0x0303, B:111:0x030b, B:113:0x0313, B:116:0x0320, B:120:0x0339, B:122:0x033f, B:124:0x034c, B:126:0x03b4, B:128:0x03ba, B:130:0x03c0, B:132:0x03c8, B:134:0x03ce, B:138:0x03e1, B:140:0x03e7, B:142:0x03f4, B:143:0x046c, B:145:0x0474, B:158:0x04c0, B:160:0x04c8, B:176:0x050f, B:194:0x0400, B:198:0x0402, B:199:0x0403, B:201:0x0410, B:204:0x0418, B:207:0x0426, B:209:0x042c, B:211:0x0437, B:214:0x044b, B:217:0x044d, B:218:0x044e, B:219:0x045b, B:223:0x0356, B:226:0x0358, B:227:0x0359, B:228:0x0363, B:231:0x036d, B:234:0x0376, B:236:0x037c, B:238:0x0387, B:241:0x0398, B:244:0x039a, B:245:0x039b, B:246:0x03a3, B:250:0x052f, B:252:0x053c, B:254:0x0547, B:256:0x054d, B:257:0x0559, B:266:0x058d, B:270:0x05af, B:296:0x0619, B:298:0x0621, B:288:0x0667, B:294:0x0709, B:302:0x0635, B:305:0x063f, B:309:0x064d, B:310:0x0657, B:311:0x065f, B:336:0x0678, B:352:0x06db, B:355:0x06e9, B:357:0x06ee, B:367:0x06c4, B:384:0x0183, B:386:0x018f, B:389:0x0198, B:391:0x019e, B:393:0x01a9, B:396:0x01b6, B:399:0x01b8, B:400:0x01b9, B:401:0x0118, B:403:0x0124, B:406:0x012d, B:408:0x0133, B:411:0x013a, B:413:0x0140, B:418:0x0156, B:420:0x016e, B:425:0x0164, B:431:0x016d, B:442:0x0729, B:445:0x0736, B:448:0x073a, B:450:0x0744, B:452:0x074e, B:455:0x0755, B:456:0x0756, B:459:0x0768, B:462:0x0770, B:468:0x078f), top: B:2:0x0009, inners: #4, #6, #8, #9, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0474 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TRY_LEAVE, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:16:0x00a1, B:18:0x00a9, B:21:0x00be, B:22:0x00da, B:24:0x00e4, B:25:0x00e8, B:27:0x00f4, B:28:0x00ff, B:32:0x0176, B:36:0x01d1, B:39:0x01e5, B:41:0x01eb, B:43:0x01f3, B:45:0x01fb, B:47:0x0203, B:49:0x020b, B:51:0x0213, B:53:0x0219, B:55:0x0221, B:57:0x0229, B:59:0x022f, B:61:0x0235, B:63:0x023b, B:65:0x0243, B:68:0x024c, B:71:0x0773, B:72:0x027d, B:74:0x0283, B:76:0x028c, B:78:0x029b, B:80:0x02a8, B:82:0x02be, B:84:0x02c4, B:86:0x056c, B:96:0x02d3, B:99:0x02df, B:104:0x051c, B:107:0x02fb, B:109:0x0303, B:111:0x030b, B:113:0x0313, B:116:0x0320, B:120:0x0339, B:122:0x033f, B:124:0x034c, B:126:0x03b4, B:128:0x03ba, B:130:0x03c0, B:132:0x03c8, B:134:0x03ce, B:138:0x03e1, B:140:0x03e7, B:142:0x03f4, B:143:0x046c, B:145:0x0474, B:158:0x04c0, B:160:0x04c8, B:176:0x050f, B:194:0x0400, B:198:0x0402, B:199:0x0403, B:201:0x0410, B:204:0x0418, B:207:0x0426, B:209:0x042c, B:211:0x0437, B:214:0x044b, B:217:0x044d, B:218:0x044e, B:219:0x045b, B:223:0x0356, B:226:0x0358, B:227:0x0359, B:228:0x0363, B:231:0x036d, B:234:0x0376, B:236:0x037c, B:238:0x0387, B:241:0x0398, B:244:0x039a, B:245:0x039b, B:246:0x03a3, B:250:0x052f, B:252:0x053c, B:254:0x0547, B:256:0x054d, B:257:0x0559, B:266:0x058d, B:270:0x05af, B:296:0x0619, B:298:0x0621, B:288:0x0667, B:294:0x0709, B:302:0x0635, B:305:0x063f, B:309:0x064d, B:310:0x0657, B:311:0x065f, B:336:0x0678, B:352:0x06db, B:355:0x06e9, B:357:0x06ee, B:367:0x06c4, B:384:0x0183, B:386:0x018f, B:389:0x0198, B:391:0x019e, B:393:0x01a9, B:396:0x01b6, B:399:0x01b8, B:400:0x01b9, B:401:0x0118, B:403:0x0124, B:406:0x012d, B:408:0x0133, B:411:0x013a, B:413:0x0140, B:418:0x0156, B:420:0x016e, B:425:0x0164, B:431:0x016d, B:442:0x0729, B:445:0x0736, B:448:0x073a, B:450:0x0744, B:452:0x074e, B:455:0x0755, B:456:0x0756, B:459:0x0768, B:462:0x0770, B:468:0x078f), top: B:2:0x0009, inners: #4, #6, #8, #9, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04c8 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TRY_LEAVE, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:16:0x00a1, B:18:0x00a9, B:21:0x00be, B:22:0x00da, B:24:0x00e4, B:25:0x00e8, B:27:0x00f4, B:28:0x00ff, B:32:0x0176, B:36:0x01d1, B:39:0x01e5, B:41:0x01eb, B:43:0x01f3, B:45:0x01fb, B:47:0x0203, B:49:0x020b, B:51:0x0213, B:53:0x0219, B:55:0x0221, B:57:0x0229, B:59:0x022f, B:61:0x0235, B:63:0x023b, B:65:0x0243, B:68:0x024c, B:71:0x0773, B:72:0x027d, B:74:0x0283, B:76:0x028c, B:78:0x029b, B:80:0x02a8, B:82:0x02be, B:84:0x02c4, B:86:0x056c, B:96:0x02d3, B:99:0x02df, B:104:0x051c, B:107:0x02fb, B:109:0x0303, B:111:0x030b, B:113:0x0313, B:116:0x0320, B:120:0x0339, B:122:0x033f, B:124:0x034c, B:126:0x03b4, B:128:0x03ba, B:130:0x03c0, B:132:0x03c8, B:134:0x03ce, B:138:0x03e1, B:140:0x03e7, B:142:0x03f4, B:143:0x046c, B:145:0x0474, B:158:0x04c0, B:160:0x04c8, B:176:0x050f, B:194:0x0400, B:198:0x0402, B:199:0x0403, B:201:0x0410, B:204:0x0418, B:207:0x0426, B:209:0x042c, B:211:0x0437, B:214:0x044b, B:217:0x044d, B:218:0x044e, B:219:0x045b, B:223:0x0356, B:226:0x0358, B:227:0x0359, B:228:0x0363, B:231:0x036d, B:234:0x0376, B:236:0x037c, B:238:0x0387, B:241:0x0398, B:244:0x039a, B:245:0x039b, B:246:0x03a3, B:250:0x052f, B:252:0x053c, B:254:0x0547, B:256:0x054d, B:257:0x0559, B:266:0x058d, B:270:0x05af, B:296:0x0619, B:298:0x0621, B:288:0x0667, B:294:0x0709, B:302:0x0635, B:305:0x063f, B:309:0x064d, B:310:0x0657, B:311:0x065f, B:336:0x0678, B:352:0x06db, B:355:0x06e9, B:357:0x06ee, B:367:0x06c4, B:384:0x0183, B:386:0x018f, B:389:0x0198, B:391:0x019e, B:393:0x01a9, B:396:0x01b6, B:399:0x01b8, B:400:0x01b9, B:401:0x0118, B:403:0x0124, B:406:0x012d, B:408:0x0133, B:411:0x013a, B:413:0x0140, B:418:0x0156, B:420:0x016e, B:425:0x0164, B:431:0x016d, B:442:0x0729, B:445:0x0736, B:448:0x073a, B:450:0x0744, B:452:0x074e, B:455:0x0755, B:456:0x0756, B:459:0x0768, B:462:0x0770, B:468:0x078f), top: B:2:0x0009, inners: #4, #6, #8, #9, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06ee A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, zzamb -> 0x06f2, TRY_LEAVE, TryCatch #13 {zzamb -> 0x06f2, blocks: (B:355:0x06e9, B:357:0x06ee), top: B:354:0x06e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0183 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009b, TryCatch #17 {IOException -> 0x0097, XmlPullParserException -> 0x009b, blocks: (B:3:0x0009, B:5:0x0069, B:7:0x0074, B:10:0x007c, B:13:0x008a, B:15:0x0092, B:16:0x00a1, B:18:0x00a9, B:21:0x00be, B:22:0x00da, B:24:0x00e4, B:25:0x00e8, B:27:0x00f4, B:28:0x00ff, B:32:0x0176, B:36:0x01d1, B:39:0x01e5, B:41:0x01eb, B:43:0x01f3, B:45:0x01fb, B:47:0x0203, B:49:0x020b, B:51:0x0213, B:53:0x0219, B:55:0x0221, B:57:0x0229, B:59:0x022f, B:61:0x0235, B:63:0x023b, B:65:0x0243, B:68:0x024c, B:71:0x0773, B:72:0x027d, B:74:0x0283, B:76:0x028c, B:78:0x029b, B:80:0x02a8, B:82:0x02be, B:84:0x02c4, B:86:0x056c, B:96:0x02d3, B:99:0x02df, B:104:0x051c, B:107:0x02fb, B:109:0x0303, B:111:0x030b, B:113:0x0313, B:116:0x0320, B:120:0x0339, B:122:0x033f, B:124:0x034c, B:126:0x03b4, B:128:0x03ba, B:130:0x03c0, B:132:0x03c8, B:134:0x03ce, B:138:0x03e1, B:140:0x03e7, B:142:0x03f4, B:143:0x046c, B:145:0x0474, B:158:0x04c0, B:160:0x04c8, B:176:0x050f, B:194:0x0400, B:198:0x0402, B:199:0x0403, B:201:0x0410, B:204:0x0418, B:207:0x0426, B:209:0x042c, B:211:0x0437, B:214:0x044b, B:217:0x044d, B:218:0x044e, B:219:0x045b, B:223:0x0356, B:226:0x0358, B:227:0x0359, B:228:0x0363, B:231:0x036d, B:234:0x0376, B:236:0x037c, B:238:0x0387, B:241:0x0398, B:244:0x039a, B:245:0x039b, B:246:0x03a3, B:250:0x052f, B:252:0x053c, B:254:0x0547, B:256:0x054d, B:257:0x0559, B:266:0x058d, B:270:0x05af, B:296:0x0619, B:298:0x0621, B:288:0x0667, B:294:0x0709, B:302:0x0635, B:305:0x063f, B:309:0x064d, B:310:0x0657, B:311:0x065f, B:336:0x0678, B:352:0x06db, B:355:0x06e9, B:357:0x06ee, B:367:0x06c4, B:384:0x0183, B:386:0x018f, B:389:0x0198, B:391:0x019e, B:393:0x01a9, B:396:0x01b6, B:399:0x01b8, B:400:0x01b9, B:401:0x0118, B:403:0x0124, B:406:0x012d, B:408:0x0133, B:411:0x013a, B:413:0x0140, B:418:0x0156, B:420:0x016e, B:425:0x0164, B:431:0x016d, B:442:0x0729, B:445:0x0736, B:448:0x073a, B:450:0x0744, B:452:0x074e, B:455:0x0755, B:456:0x0756, B:459:0x0768, B:462:0x0770, B:468:0x078f), top: B:2:0x0009, inners: #4, #6, #8, #9, #16 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzama zzb(byte[] r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzama");
    }
}
