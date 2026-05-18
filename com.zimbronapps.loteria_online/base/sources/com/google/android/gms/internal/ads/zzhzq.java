package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhzq implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private String[] zzm;
    private int[] zzn;
    private zzhyq zzc = zzhyq.LEGACY_STRICT;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzl = 1;

    static {
        zzhyt.zza = new zzhzp();
    }

    public zzhzq(Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new String[32];
        this.zzn = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.zzb = reader;
    }

    private final boolean zzn(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zzt();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x013c, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x013e, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0140, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x014c, code lost:
    
        r0.append(r4, r2, r3);
        r11.zze = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        throw zzv("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r11.zze, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzo(char r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhzq.zzo(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        zzt();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzp() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r5.zze
            int r3 = r3 + r2
            int r4 = r5.zzf
            if (r3 >= r4) goto L4c
            char[] r4 = r5.zzd
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.zzt()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.zzr(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.zzd
            int r4 = r5.zze
            r1.append(r3, r4, r2)
            int r3 = r5.zze
            int r3 = r3 + r2
            r5.zze = r3
            r2 = 1
            boolean r2 = r5.zzr(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            char[] r1 = r5.zzd
            java.lang.String r2 = new java.lang.String
            int r3 = r5.zze
            r2.<init>(r1, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.zzd
            int r3 = r5.zze
            r1.append(r2, r3, r0)
            java.lang.String r2 = r1.toString()
        L92:
            int r1 = r5.zze
            int r1 = r1 + r0
            r5.zze = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhzq.zzp():java.lang.String");
    }

    private final void zzq(int i) throws zzhzt {
        int i2 = this.zzl;
        if (i2 - 1 >= 1280) {
            String zzl = zzl();
            StringBuilder sb = new StringBuilder(zzl.length() + 26);
            sb.append("Nesting limit 1280 reached");
            sb.append(zzl);
            throw new zzhzt(sb.toString());
        }
        int[] iArr = this.zzk;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.zzk = Arrays.copyOf(iArr, i3);
            this.zzn = Arrays.copyOf(this.zzn, i3);
            this.zzm = (String[]) Arrays.copyOf(this.zzm, i3);
        }
        int[] iArr2 = this.zzk;
        int i4 = this.zzl;
        this.zzl = i4 + 1;
        iArr2[i4] = i;
    }

    private final boolean zzr(int i) throws IOException {
        int i2;
        int i3 = this.zzh;
        int i4 = this.zze;
        this.zzh = i3 - i4;
        char[] cArr = this.zzd;
        int i5 = this.zzf;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.zzf = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i7 = this.zzf;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.zzf + read;
            this.zzf = i2;
            if (this.zzg == 0 && this.zzh == 0 && i2 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final int zzs(boolean z) throws IOException {
        int i;
        int i2 = this.zze;
        int i3 = this.zzf;
        while (true) {
            if (i2 == i3) {
                this.zze = i2;
                if (!zzr(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(zzl()));
                    }
                    return -1;
                }
                i2 = this.zze;
                i3 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '\n') {
                this.zzg++;
                this.zzh = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.zze = i4;
                    if (i4 == i3) {
                        this.zze = i2;
                        boolean zzr = zzr(2);
                        this.zze++;
                        if (!zzr) {
                            return 47;
                        }
                    }
                    zzt();
                    int i5 = this.zze;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.zze = i5 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzr(2)) {
                                throw zzv("Unterminated comment");
                            }
                            int i6 = this.zze;
                            if (cArr[i6] != '\n') {
                                while (i < 2) {
                                    i = cArr[this.zze + i] == "*/".charAt(i) ? i + 1 : 0;
                                }
                                i2 = this.zze + 2;
                                i3 = this.zzf;
                                break;
                            }
                            this.zzg++;
                            this.zzh = i6 + 1;
                            this.zze++;
                        }
                    } else {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.zze = i5 + 1;
                        zzu();
                        i2 = this.zze;
                        i3 = this.zzf;
                    }
                } else {
                    if (c != '#') {
                        this.zze = i4;
                        return c;
                    }
                    this.zze = i4;
                    zzt();
                    zzu();
                    i2 = this.zze;
                    i3 = this.zzf;
                }
            }
            i2 = i4;
        }
    }

    private final void zzt() throws zzhzt {
        if (this.zzc != zzhyq.LENIENT) {
            throw zzv("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzu() throws IOException {
        char c;
        do {
            if (this.zze >= this.zzf && !zzr(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i = this.zze;
            int i2 = i + 1;
            this.zze = i2;
            c = cArr[i];
            if (c == '\n') {
                this.zzg++;
                this.zzh = i2;
                return;
            }
        } while (c != '\r');
    }

    private final zzhzt zzv(String str) throws zzhzt {
        String zzl = zzl();
        StringBuilder sb = new StringBuilder(str.length() + zzl.length() + 79);
        sb.append(str);
        sb.append(zzl);
        sb.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        throw new zzhzt(sb.toString());
    }

    private final IllegalStateException zzw(String str) throws IOException {
        int zzm = zzm();
        String zza = zzhzr.zza(zzm());
        String zzl = zzl();
        int length = str.length() + 18 + zza.length() + zzl.length();
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(zzm == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(length + 5 + concat.length());
        sb.append("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(zza);
        sb.append(zzl);
        sb.append("\nSee ");
        sb.append(concat);
        return new IllegalStateException(sb.toString());
    }

    public final void close() throws IOException {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    public final String toString() {
        return zzhzq.class.getSimpleName().concat(zzl());
    }

    public final void zza(zzhyq zzhyqVar) {
        Objects.requireNonNull(zzhyqVar);
        this.zzc = zzhyqVar;
    }

    public final void zzb() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 3) {
            throw zzw("BEGIN_ARRAY");
        }
        zzq(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzc() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 4) {
            throw zzw("END_ARRAY");
        }
        int i2 = this.zzl;
        this.zzl = i2 - 1;
        int[] iArr = this.zzn;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.zza = 0;
    }

    public final void zzd() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 1) {
            throw zzw("BEGIN_OBJECT");
        }
        zzq(3);
        this.zza = 0;
    }

    public final void zze() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 2) {
            throw zzw("END_OBJECT");
        }
        int i2 = this.zzl;
        int i3 = i2 - 1;
        this.zzl = i3;
        this.zzm[i3] = null;
        int[] iArr = this.zzn;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.zza = 0;
    }

    public final boolean zzf() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0214, code lost:
    
        if (zzn(r1) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a4, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0217, code lost:
    
        if (r6 != 2) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0219, code lost:
    
        if (r15 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021f, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0221, code lost:
    
        if (r16 == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022e, code lost:
    
        if (r11 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0230, code lost:
    
        if (r14 != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0236, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0237, code lost:
    
        r21.zzi = r11;
        r21.zze += r10;
        r14 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0240, code lost:
    
        r21.zza = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0233, code lost:
    
        if (r14 == 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0229, code lost:
    
        r14 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0226, code lost:
    
        r1 = 2;
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0243, code lost:
    
        if (r6 == r1) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0246, code lost:
    
        if (r6 == 4) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0249, code lost:
    
        if (r6 != 7) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024b, code lost:
    
        r21.zzj = r10;
        r14 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0291 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0277 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzg() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhzq.zzg():int");
    }

    public final String zzh() throws IOException {
        String zzo;
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 14) {
            zzo = zzp();
        } else if (i == 12) {
            zzo = zzo('\'');
        } else {
            if (i != 13) {
                throw zzw("a name");
            }
            zzo = zzo('\"');
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = zzo;
        return zzo;
    }

    public final String zzi() throws IOException {
        String str;
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 10) {
            str = zzp();
        } else if (i == 8) {
            str = zzo('\'');
        } else if (i == 9) {
            str = zzo('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.zzi);
        } else {
            if (i != 16) {
                throw zzw("a string");
            }
            String str2 = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
            str = str2;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final boolean zzj() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i2 = this.zzl - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw zzw("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i3 = this.zzl - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final void zzk() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 7) {
            throw zzw("null");
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final String zzl() {
        int i = this.zzg + 1;
        int i2 = this.zze - this.zzh;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i3 = 0; i3 < this.zzl; i3++) {
            int i4 = this.zzk[i3];
            switch (i4) {
                case 1:
                case 2:
                    int i5 = this.zzn[i3];
                    sb.append('[');
                    sb.append(i5);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.zzm[i3];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 21);
                    sb2.append("Unknown scope value: ");
                    sb2.append(i4);
                    throw new AssertionError(sb2.toString());
            }
        }
        int i6 = i2 + 1;
        String sb3 = sb.toString();
        StringBuilder sb4 = new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i6).length() + 6 + sb3.length());
        sb4.append(" at line ");
        sb4.append(i);
        sb4.append(" column ");
        sb4.append(i6);
        sb4.append(" path ");
        sb4.append(sb3);
        return sb4.toString();
    }

    public final int zzm() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
