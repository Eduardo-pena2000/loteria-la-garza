package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcfi extends zzcfk implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcge zzd;
    private final zzcgf zze;
    private final boolean zzf;
    private final zzdxz zzg;
    private int zzh;
    private int zzi;
    private MediaPlayer zzj;
    private Uri zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzcgc zzo;
    private final boolean zzp;
    private int zzq;
    private zzcfj zzr;
    private boolean zzs;
    private Integer zzt;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcfi(Context context, zzcge zzcgeVar, boolean z, boolean z2, zzcgd zzcgdVar, zzcgf zzcgfVar, zzdxz zzdxzVar) {
        super(context);
        this.zzh = 0;
        this.zzi = 0;
        this.zzs = false;
        this.zzt = null;
        this.zzd = zzcgeVar;
        this.zze = zzcgfVar;
        this.zzp = z;
        this.zzf = z2;
        zzcgfVar.zza(this);
        this.zzg = zzdxzVar;
    }

    private final void zzD() {
        zzdxz zzdxzVar;
        o0.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzk == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            R5.t.z();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzj = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzj.setOnCompletionListener(this);
            this.zzj.setOnErrorListener(this);
            this.zzj.setOnInfoListener(this);
            this.zzj.setOnPreparedListener(this);
            this.zzj.setOnVideoSizeChangedListener(this);
            this.zzn = 0;
            if (this.zzp) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzoK)).booleanValue() && (zzdxzVar = this.zzg) != null) {
                    zzdxy zza = zzdxzVar.zza();
                    zza.zzc("action", "svp_ampv");
                    zza.zzd();
                }
                zzcgc zzcgcVar = new zzcgc(getContext());
                this.zzo = zzcgcVar;
                zzcgcVar.zzb(surfaceTexture, getWidth(), getHeight());
                zzcgc zzcgcVar2 = this.zzo;
                zzcgcVar2.start();
                SurfaceTexture zze = zzcgcVar2.zze();
                if (zze != null) {
                    surfaceTexture = zze;
                } else {
                    this.zzo.zzd();
                    this.zzo = null;
                }
            }
            this.zzj.setDataSource(getContext(), this.zzk);
            R5.t.A();
            this.zzj.setSurface(new Surface(surfaceTexture));
            this.zzj.setAudioStreamType(3);
            this.zzj.setScreenOnWhilePlaying(true);
            this.zzj.prepareAsync();
            zzH(1);
        } catch (IllegalArgumentException e) {
            e = e;
            W5.p.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalStateException e2) {
            e = e2;
            W5.p.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IOException e3) {
            e = e3;
            W5.p.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        }
    }

    private final void zzE(boolean z) {
        o0.k("AdMediaPlayerView release");
        zzcgc zzcgcVar = this.zzo;
        if (zzcgcVar != null) {
            zzcgcVar.zzd();
            this.zzo = null;
        }
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            if (z) {
                this.zzi = 0;
            }
        }
    }

    private final boolean zzF() {
        int i;
        return (this.zzj == null || (i = this.zzh) == -1 || i == 0 || i == 1) ? false : true;
    }

    private final void zzG(float f) {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i = o0.b;
            W5.p.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void zzH(int i) {
        if (i == 3) {
            this.zze.zze();
            this.zzb.zzd();
        } else if (this.zzh == 3) {
            this.zze.zzf();
            this.zzb.zze();
        }
        this.zzh = i;
    }

    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzn = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        o0.k("AdMediaPlayerView completion");
        zzH(5);
        this.zzi = 5;
        F0.l.post(new zzcfa(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        String sb2 = sb.toString();
        int i3 = o0.b;
        W5.p.f(sb2);
        zzH(-1);
        this.zzi = -1;
        F0.l.post(new zzcfb(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        o0.k(sb.toString());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzl
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.zzm
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.zzl
            if (r2 <= 0) goto L7a
            int r2 = r5.zzm
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.zzcgc r2 = r5.zzo
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.zzl
            int r1 = r0 * r7
            int r2 = r5.zzm
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.zzm
            int r0 = r0 * r6
            int r2 = r5.zzl
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.zzl
            int r1 = r1 * r7
            int r2 = r5.zzm
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.zzl
            int r4 = r5.zzm
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzcgc r6 = r5.zzo
            if (r6 == 0) goto L84
            r6.zzc(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfi.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        o0.k("AdMediaPlayerView prepared");
        zzH(2);
        this.zze.zzb();
        F0.l.post(new zzcez(this, mediaPlayer));
        this.zzl = mediaPlayer.getVideoWidth();
        this.zzm = mediaPlayer.getVideoHeight();
        int i = this.zzq;
        if (i != 0) {
            zzi(i);
        }
        if (this.zzf && zzF() && this.zzj.getCurrentPosition() > 0 && this.zzi != 3) {
            o0.k("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzj.start();
            int currentPosition = this.zzj.getCurrentPosition();
            long a = R5.t.o().a();
            while (zzF() && this.zzj.getCurrentPosition() == currentPosition && R5.t.o().a() - a <= 250) {
            }
            this.zzj.pause();
            zzq();
        }
        int i2 = this.zzl;
        int i3 = this.zzm;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40 + String.valueOf(i3).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        W5.p.e(sb.toString());
        if (this.zzi == 3) {
            zze();
        }
        zzq();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        o0.k("AdMediaPlayerView surface created");
        zzD();
        F0.l.post(new zzcfc(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        o0.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null && this.zzq == 0) {
            this.zzq = mediaPlayer.getCurrentPosition();
        }
        zzcgc zzcgcVar = this.zzo;
        if (zzcgcVar != null) {
            zzcgcVar.zzd();
        }
        F0.l.post(new zzcfe(this));
        zzE(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        o0.k("AdMediaPlayerView surface changed");
        int i3 = this.zzi;
        boolean z = false;
        if (this.zzl == i && this.zzm == i2) {
            z = true;
        }
        if (this.zzj != null && i3 == 3 && z) {
            int i4 = this.zzq;
            if (i4 != 0) {
                zzi(i4);
            }
            zze();
        }
        zzcgc zzcgcVar = this.zzo;
        if (zzcgcVar != null) {
            zzcgcVar.zzc(i, i2);
        }
        F0.l.post(new zzcfd(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzr);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i2).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        o0.k(sb.toString());
        this.zzl = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzm = videoHeight;
        if (this.zzl == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        o0.k(sb.toString());
        F0.l.post(new zzcfh(this, i));
        super/*android.view.View*/.onWindowVisibilityChanged(i);
    }

    public final String toString() {
        String name = zzcfi.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    public final String zza() {
        return "MediaPlayer".concat(true != this.zzp ? "" : " spherical");
    }

    public final void zzb(zzcfj zzcfjVar) {
        this.zzr = zzcfjVar;
    }

    public final void zzc(String str) {
        Uri parse = Uri.parse(str);
        zzbfp zza = zzbfp.zza(parse);
        if (zza == null || zza.zza != null) {
            if (zza != null) {
                parse = Uri.parse(zza.zza);
            }
            this.zzk = parse;
            this.zzq = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    public final void zzd() {
        o0.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            this.zzi = 0;
        }
        this.zze.zzc();
    }

    public final void zze() {
        o0.k("AdMediaPlayerView play");
        if (zzF()) {
            this.zzj.start();
            zzH(3);
            this.zza.zza();
            F0.l.post(new zzcff(this));
        }
        this.zzi = 3;
    }

    public final void zzf() {
        o0.k("AdMediaPlayerView pause");
        if (zzF() && this.zzj.isPlaying()) {
            this.zzj.pause();
            zzH(4);
            F0.l.post(new zzcfg(this));
        }
        this.zzi = 4;
    }

    public final int zzg() {
        if (zzF()) {
            return this.zzj.getDuration();
        }
        return -1;
    }

    public final int zzh() {
        if (zzF()) {
            return this.zzj.getCurrentPosition();
        }
        return 0;
    }

    public final void zzi(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        o0.k(sb.toString());
        if (!zzF()) {
            this.zzq = i;
        } else {
            this.zzj.seekTo(i);
            this.zzq = 0;
        }
    }

    public final void zzj(float f, float f2) {
        zzcgc zzcgcVar = this.zzo;
        if (zzcgcVar != null) {
            zzcgcVar.zzf(f, f2);
        }
    }

    public final int zzk() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final int zzl() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final long zzm() {
        if (this.zzt != null) {
            return (zzo() * this.zzn) / 100;
        }
        return -1L;
    }

    public final long zzn() {
        return 0L;
    }

    public final long zzo() {
        if (this.zzt != null) {
            return zzg() * this.zzt.intValue();
        }
        return -1L;
    }

    public final int zzp() {
        if (Build.VERSION.SDK_INT < 26 || !zzF()) {
            return -1;
        }
        return q.a(this.zzj).getInt("android.media.mediaplayer.dropped");
    }

    public final void zzq() {
        zzG(this.zzb.zzc());
    }

    public final /* synthetic */ void zzr(int i) {
        zzcfj zzcfjVar = this.zzr;
        if (zzcfjVar != null) {
            zzcfjVar.onWindowVisibilityChanged(i);
        }
    }

    public final /* synthetic */ void zzs(MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzcw)).booleanValue() || this.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                Map hashMap = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    this.zzt = valueOf;
                                    hashMap.put("bitRate", String.valueOf(valueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    int integer = format2.getInteger("width");
                                    int integer2 = format2.getInteger("height");
                                    StringBuilder sb = new StringBuilder(String.valueOf(integer).length() + 1 + String.valueOf(integer2).length());
                                    sb.append(integer);
                                    sb.append("x");
                                    sb.append(integer2);
                                    hashMap.put("resolution", sb.toString());
                                }
                                if (format2.containsKey("mime")) {
                                    hashMap.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    hashMap.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                hashMap.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                hashMap.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                this.zzd.zze("onMetadataEvent", hashMap);
            }
        } catch (RuntimeException e) {
            R5.t.l().zzg(e, "AdMediaPlayerView.reportMetadata");
        }
    }

    public final /* synthetic */ zzcfj zzt() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzu() {
        return this.zzs;
    }

    public final /* synthetic */ void zzv(boolean z) {
        this.zzs = true;
    }
}
