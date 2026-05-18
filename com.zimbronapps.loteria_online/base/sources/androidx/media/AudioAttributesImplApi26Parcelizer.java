package androidx.media;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(s4.a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = aVar.r(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = aVar.p(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, s4.a aVar) {
        aVar.x(false, false);
        aVar.H(audioAttributesImplApi26.a, 1);
        aVar.F(audioAttributesImplApi26.b, 2);
    }
}
