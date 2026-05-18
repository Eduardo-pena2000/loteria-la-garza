package T2;

import V2.M;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b3.c;
import c3.j;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class t implements Z0 {
    public final Context a;
    public final c3.i b;
    public boolean e;
    public boolean g;
    public boolean h;
    public int c = 0;
    public long d = 5000;
    public c3.w f = c3.w.a;

    public t(Context context) {
        this.a = context;
        this.b = new c3.i(context);
    }

    public W0[] a(Handler handler, m3.C c, V2.x xVar, i3.h hVar, d3.b bVar) {
        ArrayList arrayList = new ArrayList();
        i(this.a, this.c, this.f, this.e, handler, c, this.d, arrayList);
        V2.y c2 = c(this.a, this.g, this.h);
        if (c2 != null) {
            b(this.a, this.c, this.f, this.e, c2, handler, xVar, arrayList);
        }
        h(this.a, hVar, handler.getLooper(), this.c, arrayList);
        f(this.a, bVar, handler.getLooper(), this.c, arrayList);
        d(this.a, this.c, arrayList);
        e(arrayList);
        g(this.a, handler, this.c, arrayList);
        return (W0[]) arrayList.toArray(new W0[0]);
    }

    public void b(Context context, int i, c3.w wVar, boolean z, V2.y yVar, Handler handler, V2.x xVar, ArrayList arrayList) {
        int i2;
        V2.y yVar2;
        Handler handler2;
        String str;
        int i3;
        arrayList.add(new V2.W(context, j(), wVar, z, handler, xVar, yVar));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (W0) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
                    P2.o.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                    try {
                        yVar2 = yVar;
                        handler2 = handler;
                        str = "DefaultRenderersFactory";
                        try {
                            i3 = i2 + 1;
                            try {
                                arrayList.add(i2, (W0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(new Class[]{Handler.class, V2.x.class, V2.y.class}).newInstance(new Object[]{handler2, xVar, yVar2}));
                                P2.o.f(str, "Loaded LibopusAudioRenderer.");
                            } catch (ClassNotFoundException unused2) {
                                i2 = i3;
                                i3 = i2;
                                try {
                                    int i4 = i3 + 1;
                                    arrayList.add(i3, (W0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(new Class[]{Handler.class, V2.x.class, V2.y.class}).newInstance(new Object[]{handler2, xVar, yVar2}));
                                    P2.o.f(str, "Loaded LibflacAudioRenderer.");
                                } catch (ClassNotFoundException unused3) {
                                }
                                arrayList.add(i4, (W0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(new Class[]{Handler.class, V2.x.class, V2.y.class}).newInstance(new Object[]{handler2, xVar, yVar2}));
                                P2.o.f(str, "Loaded FfmpegAudioRenderer.");
                            }
                        } catch (ClassNotFoundException unused4) {
                        }
                    } catch (ClassNotFoundException unused5) {
                        yVar2 = yVar;
                        handler2 = handler;
                        str = "DefaultRenderersFactory";
                    }
                    try {
                        int i42 = i3 + 1;
                        try {
                            arrayList.add(i3, (W0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(new Class[]{Handler.class, V2.x.class, V2.y.class}).newInstance(new Object[]{handler2, xVar, yVar2}));
                            P2.o.f(str, "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused6) {
                            i3 = i42;
                            i42 = i3;
                            arrayList.add(i42, (W0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(new Class[]{Handler.class, V2.x.class, V2.y.class}).newInstance(new Object[]{handler2, xVar, yVar2}));
                            P2.o.f(str, "Loaded FfmpegAudioRenderer.");
                        }
                        arrayList.add(i42, (W0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(new Class[]{Handler.class, V2.x.class, V2.y.class}).newInstance(new Object[]{handler2, xVar, yVar2}));
                        P2.o.f(str, "Loaded FfmpegAudioRenderer.");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating FLAC extension", e);
                    }
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating MIDI extension", e2);
            }
        } catch (ClassNotFoundException unused7) {
        }
        try {
            yVar2 = yVar;
            handler2 = handler;
            str = "DefaultRenderersFactory";
            i3 = i2 + 1;
            arrayList.add(i2, (W0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(new Class[]{Handler.class, V2.x.class, V2.y.class}).newInstance(new Object[]{handler2, xVar, yVar2}));
            P2.o.f(str, "Loaded LibopusAudioRenderer.");
            int i422 = i3 + 1;
            arrayList.add(i3, (W0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(new Class[]{Handler.class, V2.x.class, V2.y.class}).newInstance(new Object[]{handler2, xVar, yVar2}));
            P2.o.f(str, "Loaded LibflacAudioRenderer.");
            try {
                arrayList.add(i422, (W0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(new Class[]{Handler.class, V2.x.class, V2.y.class}).newInstance(new Object[]{handler2, xVar, yVar2}));
                P2.o.f(str, "Loaded FfmpegAudioRenderer.");
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e3);
            } catch (ClassNotFoundException unused8) {
            }
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating Opus extension", e4);
        }
    }

    public V2.y c(Context context, boolean z, boolean z2) {
        return new M.f(context).k(z).j(z2).i();
    }

    public void d(Context context, int i, ArrayList arrayList) {
        arrayList.add(new n3.b());
    }

    public void e(ArrayList arrayList) {
        arrayList.add(new b3.g(c.a.a, null));
    }

    public void f(Context context, d3.b bVar, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new d3.c(bVar, looper));
    }

    public void h(Context context, i3.h hVar, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new i3.i(hVar, looper));
    }

    public void i(Context context, int i, c3.w wVar, boolean z, Handler handler, m3.C c, long j, ArrayList arrayList) {
        Handler handler2;
        Class cls;
        String str;
        int i2;
        int i3;
        arrayList.add(new m3.k(context, j(), wVar, j, z, handler, c, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                handler2 = handler;
                cls = Handler.class;
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (W0) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Long.TYPE, Handler.class, m3.C.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j), handler2, c, 50}));
                        str = "DefaultRenderersFactory";
                        try {
                            P2.o.f(str, "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i2;
                            i2 = size;
                            try {
                                i3 = i2 + 1;
                                try {
                                    arrayList.add(i2, (W0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(new Class[]{Long.TYPE, cls, m3.C.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j), handler2, c, 50}));
                                    P2.o.f(str, "Loaded Libgav1VideoRenderer.");
                                } catch (ClassNotFoundException unused2) {
                                    i2 = i3;
                                    i3 = i2;
                                    arrayList.add(i3, (W0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(new Class[]{Long.TYPE, cls, m3.C.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j), handler2, c, 50}));
                                    P2.o.f(str, "Loaded FfmpegVideoRenderer.");
                                }
                            } catch (ClassNotFoundException unused3) {
                            }
                            arrayList.add(i3, (W0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(new Class[]{Long.TYPE, cls, m3.C.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j), handler2, c, 50}));
                            P2.o.f(str, "Loaded FfmpegVideoRenderer.");
                        }
                    } catch (ClassNotFoundException unused4) {
                        str = "DefaultRenderersFactory";
                    }
                } catch (ClassNotFoundException unused5) {
                    str = "DefaultRenderersFactory";
                    i2 = size;
                    i3 = i2 + 1;
                    arrayList.add(i2, (W0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(new Class[]{Long.TYPE, cls, m3.C.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j), handler2, c, 50}));
                    P2.o.f(str, "Loaded Libgav1VideoRenderer.");
                    arrayList.add(i3, (W0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(new Class[]{Long.TYPE, cls, m3.C.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j), handler2, c, 50}));
                    P2.o.f(str, "Loaded FfmpegVideoRenderer.");
                }
            } catch (ClassNotFoundException unused6) {
                handler2 = handler;
                cls = Handler.class;
            }
            try {
                i3 = i2 + 1;
                arrayList.add(i2, (W0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(new Class[]{Long.TYPE, cls, m3.C.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j), handler2, c, 50}));
                P2.o.f(str, "Loaded Libgav1VideoRenderer.");
                try {
                    arrayList.add(i3, (W0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(new Class[]{Long.TYPE, cls, m3.C.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j), handler2, c, 50}));
                    P2.o.f(str, "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e);
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating AV1 extension", e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating VP9 extension", e3);
        }
    }

    public j.b j() {
        return this.b;
    }

    public void g(Context context, Handler handler, int i, ArrayList arrayList) {
    }
}
