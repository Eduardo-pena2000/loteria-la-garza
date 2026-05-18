package org.apache.tika.mime;

import java.util.List;
import org.apache.tika.detect.Detector;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ProbabilisticMimeDetectionSelector implements Detector {
    private static final float DEFAULT_EXTENSION_TRUST = 0.8f;
    private static final float DEFAULT_MAGIC_TRUST = 0.9f;
    private static final float DEFAULT_META_TRUST = 0.8f;
    private static final long serialVersionUID = 224589862960269260L;
    private final float changeRate;
    private float extension_neg;
    private float extension_trust;
    private float magic_neg;
    private float magic_trust;
    private float meta_neg;
    private float meta_trust;
    private final MimeTypes mimeTypes;
    private float priorExtensionFileType;
    private float priorMagicFileType;
    private float priorMetaFileType;
    private final MediaType rootMediaType;
    private float threshold;

    public static class Builder {
        private float extension_neg;
        private float extension_trust;
        private float magic_neg;
        private float magic_trust;
        private float meta_neg;
        private float meta_trust;
        private float priorExtensionFileType;
        private float priorMagicFileType;
        private float priorMetaFileType;
        private float threshold;

        public static /* bridge */ /* synthetic */ float a(Builder builder) {
            return builder.extension_neg;
        }

        public static /* bridge */ /* synthetic */ float b(Builder builder) {
            return builder.extension_trust;
        }

        public static /* bridge */ /* synthetic */ float c(Builder builder) {
            return builder.magic_neg;
        }

        public static /* bridge */ /* synthetic */ float d(Builder builder) {
            return builder.magic_trust;
        }

        public static /* bridge */ /* synthetic */ float e(Builder builder) {
            return builder.meta_neg;
        }

        public static /* bridge */ /* synthetic */ float f(Builder builder) {
            return builder.meta_trust;
        }

        public static /* bridge */ /* synthetic */ float g(Builder builder) {
            return builder.priorExtensionFileType;
        }

        public static /* bridge */ /* synthetic */ float h(Builder builder) {
            return builder.priorMagicFileType;
        }

        public static /* bridge */ /* synthetic */ float i(Builder builder) {
            return builder.priorMetaFileType;
        }

        public static /* bridge */ /* synthetic */ float j(Builder builder) {
            return builder.threshold;
        }

        public ProbabilisticMimeDetectionSelector build2() {
            return new ProbabilisticMimeDetectionSelector(this);
        }

        public synchronized Builder extension_neg(float f) {
            this.extension_neg = f;
            return this;
        }

        public synchronized Builder extension_trust(float f) {
            this.extension_trust = f;
            return this;
        }

        public synchronized Builder magic_neg(float f) {
            this.magic_neg = f;
            return this;
        }

        public synchronized Builder magic_trust(float f) {
            this.magic_trust = f;
            return this;
        }

        public synchronized Builder meta_neg(float f) {
            this.meta_neg = f;
            return this;
        }

        public synchronized Builder meta_trust(float f) {
            this.meta_trust = f;
            return this;
        }

        public synchronized Builder priorExtensionFileType(float f) {
            this.priorExtensionFileType = f;
            return this;
        }

        public synchronized Builder priorMagicFileType(float f) {
            this.priorMagicFileType = f;
            return this;
        }

        public synchronized Builder priorMetaFileType(float f) {
            this.priorMetaFileType = f;
            return this;
        }

        public synchronized Builder threshold(float f) {
            this.threshold = f;
            return this;
        }
    }

    public ProbabilisticMimeDetectionSelector() {
        this(MimeTypes.getDefaultMimeTypes(), null);
    }

    private MediaType applyProbilities(List list, MimeType mimeType, MimeType mimeType2) {
        MediaType mediaType;
        float f;
        MediaType mediaType2;
        MediaType mediaType3;
        int i;
        List list2 = list;
        MimeType mimeType3 = mimeType;
        MimeType mimeType4 = mimeType2;
        MediaType type = mimeType3 == null ? null : mimeType.getType();
        MediaType type2 = mimeType4 != null ? mimeType2.getType() : null;
        int size = list.size();
        float f2 = this.magic_trust;
        float f3 = this.magic_neg;
        float f4 = this.extension_trust;
        float f5 = this.extension_neg;
        float f6 = this.meta_trust;
        float f7 = this.meta_neg;
        if (type == null || type.compareTo(this.rootMediaType) == 0) {
            f4 = 1.0f;
            f5 = 1.0f;
        }
        if (type2 == null || type2.compareTo(this.rootMediaType) == 0) {
            f6 = 1.0f;
            f7 = 1.0f;
        }
        MediaType mediaType4 = this.rootMediaType;
        float f8 = -1.0f;
        if (!list.isEmpty()) {
            int i2 = 0;
            MediaType mediaType5 = type2;
            while (i2 < size) {
                MediaType type3 = ((MimeType) list2.get(i2)).getType();
                int i3 = size;
                MediaTypeRegistry mediaTypeRegistry = this.mimeTypes.getMediaTypeRegistry();
                float f9 = f2;
                if (type3 == null || !type3.equals(this.rootMediaType)) {
                    if (type != null) {
                        if (type.equals(type3) || mediaTypeRegistry.isSpecializationOf(type, type3)) {
                            list2.set(i2, mimeType3);
                        } else if (mediaTypeRegistry.isSpecializationOf(type3, type)) {
                            type = type3;
                        }
                    }
                    if (mediaType5 != null) {
                        if (mediaType5.equals(type3) || mediaTypeRegistry.isSpecializationOf(mediaType5, type3)) {
                            list2.set(i2, mimeType4);
                        } else if (mediaTypeRegistry.isSpecializationOf(type3, mediaType5)) {
                            mediaType5 = type3;
                        }
                    }
                    f2 = f9;
                    mediaType = mediaType5;
                } else {
                    f2 = 1.0f;
                    f3 = 1.0f;
                    mediaType = mediaType5;
                }
                float[] fArr = new float[3];
                float[] fArr2 = new float[3];
                MediaType mediaType6 = mediaType4;
                float[] fArr3 = new float[3];
                MediaType type4 = ((MimeType) list2.get(i2)).getType();
                if (i2 > 0) {
                    float f10 = this.changeRate;
                    f = 1.0f;
                    f2 *= 1.0f - f10;
                    f3 *= f10 + 1.0f;
                } else {
                    f = 1.0f;
                }
                if (type4 == null || f2 == f) {
                    fArr[0] = 0.1f;
                } else {
                    fArr2[0] = f2;
                    fArr3[0] = f3;
                    if (mediaType == null || f6 == f) {
                        fArr2[1] = f;
                        fArr3[1] = f;
                    } else if (type4.equals(mediaType)) {
                        fArr2[1] = f6;
                        fArr3[1] = f7;
                    } else {
                        fArr2[1] = f - f6;
                        fArr3[1] = f - f7;
                    }
                    if (type == null || f4 == f) {
                        fArr2[2] = f;
                        fArr3[2] = f;
                    } else if (type4.equals(type)) {
                        fArr2[2] = f4;
                        fArr3[2] = f5;
                    } else {
                        fArr2[2] = f - f4;
                        fArr3[2] = f - f5;
                    }
                }
                int i4 = i2;
                float[] fArr4 = new float[3];
                float[] fArr5 = new float[3];
                if (mimeType4 == null || f6 == f) {
                    fArr[1] = 0.1f;
                } else {
                    fArr4[1] = f6;
                    fArr5[1] = f7;
                    if (type4 == null || f2 == f) {
                        fArr4[0] = f;
                        fArr5[0] = f;
                    } else if (mediaType.equals(type4)) {
                        fArr4[0] = f2;
                        fArr5[0] = f3;
                    } else {
                        fArr4[0] = f - f2;
                        fArr5[0] = f - f3;
                    }
                    if (type == null || f4 == f) {
                        fArr4[2] = f;
                        fArr5[2] = f;
                    } else if (mediaType.equals(type)) {
                        fArr4[2] = f4;
                        fArr5[2] = f5;
                    } else {
                        fArr4[2] = f - f4;
                        fArr5[2] = f - f5;
                    }
                }
                float[] fArr6 = new float[3];
                float[] fArr7 = new float[3];
                if (type == null || f4 == f) {
                    fArr[2] = 0.1f;
                } else {
                    fArr6[2] = f4;
                    fArr7[2] = f5;
                    if (type4 == null || f2 == f) {
                        fArr6[0] = f;
                        fArr7[0] = f;
                    } else if (type4.equals(type)) {
                        fArr6[0] = f2;
                        fArr7[0] = f3;
                    } else {
                        fArr6[0] = f - f2;
                        fArr7[0] = f - f3;
                    }
                    if (mediaType == null || f6 == f) {
                        fArr6[1] = f;
                        fArr7[1] = f;
                    } else if (mediaType.equals(type)) {
                        fArr6[1] = f6;
                        fArr7[1] = f7;
                    } else {
                        fArr6[1] = f - f6;
                        fArr7[1] = f - f7;
                    }
                }
                float f11 = this.priorMagicFileType;
                float f12 = f - f11;
                if (fArr[0] == 0.0f) {
                    mediaType3 = type;
                    float f13 = f12;
                    int i5 = 3;
                    mediaType2 = mediaType;
                    int i6 = 0;
                    while (i6 < i5) {
                        float f14 = fArr2[i6];
                        f11 *= f14;
                        if (f14 != f) {
                            f13 *= fArr3[i6];
                        }
                        i6++;
                        i5 = 3;
                        f = 1.0f;
                    }
                    i = 0;
                    fArr[0] = f11 / (f11 + f13);
                } else {
                    mediaType2 = mediaType;
                    mediaType3 = type;
                    i = 0;
                }
                float f15 = fArr[i];
                if (f8 < f15) {
                    f8 = f15;
                    mediaType6 = type4;
                }
                float f16 = this.priorMetaFileType;
                float f17 = 1.0f;
                float f18 = 1.0f - f16;
                if (fArr[1] == 0.0f) {
                    int i7 = i;
                    while (i7 < 3) {
                        float f19 = fArr4[i7];
                        f16 *= f19;
                        if (f19 != f17) {
                            f18 *= fArr5[i7];
                        }
                        i7++;
                        f17 = 1.0f;
                    }
                    fArr[1] = f16 / (f18 + f16);
                }
                float f20 = fArr[1];
                if (f8 < f20) {
                    f8 = f20;
                    mediaType6 = mediaType2;
                }
                float f21 = this.priorExtensionFileType;
                float f22 = 1.0f - f21;
                if (fArr[2] == 0.0f) {
                    for (int i8 = i; i8 < 3; i8++) {
                        float f23 = fArr6[i8];
                        f21 *= f23;
                        if (f23 != 1.0f) {
                            f22 *= fArr7[i8];
                        }
                    }
                    fArr[2] = f21 / (f22 + f21);
                }
                float f24 = fArr[2];
                if (f8 < f24) {
                    f8 = f24;
                    mediaType4 = mediaType3;
                } else {
                    mediaType4 = mediaType6;
                }
                i2 = i4 + 1;
                list2 = list;
                mimeType3 = mimeType;
                mimeType4 = mimeType2;
                size = i3;
                mediaType5 = mediaType2;
                type = mediaType3;
            }
        }
        return f8 < this.threshold ? this.rootMediaType : mediaType4;
    }

    private void initializeDefaultProbabilityParameters() {
        this.priorMagicFileType = 0.5f;
        this.priorExtensionFileType = 0.5f;
        this.priorMetaFileType = 0.5f;
        this.magic_trust = 0.9f;
        this.extension_trust = 0.8f;
        this.meta_trust = 0.8f;
        this.magic_neg = 0.100000024f;
        this.extension_neg = 0.19999999f;
        this.meta_neg = 0.19999999f;
        this.threshold = 0.5001f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.tika.mime.MediaType detect(java.io.InputStream r6, org.apache.tika.metadata.Metadata r7) throws java.io.IOException {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r6 == 0) goto L28
            org.apache.tika.mime.MimeTypes r1 = r5.mimeTypes
            int r1 = r1.getMinLength()
            r6.mark(r1)
            org.apache.tika.mime.MimeTypes r1 = r5.mimeTypes     // Catch: java.lang.Throwable -> L23
            byte[] r1 = r1.readMagicHeader(r6)     // Catch: java.lang.Throwable -> L23
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes     // Catch: java.lang.Throwable -> L23
            java.util.List r1 = r2.getMimeType(r1)     // Catch: java.lang.Throwable -> L23
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L23
            r6.reset()
            goto L28
        L23:
            r7 = move-exception
            r6.reset()
            throw r7
        L28:
            java.lang.String r6 = "resourceName"
            java.lang.String r6 = r7.get(r6)
            r1 = 0
            if (r6 == 0) goto L59
            java.net.URI r2 = new java.net.URI     // Catch: java.net.URISyntaxException -> L50
            r2.<init>(r6)     // Catch: java.net.URISyntaxException -> L50
            java.lang.String r2 = r2.getPath()     // Catch: java.net.URISyntaxException -> L50
            if (r2 == 0) goto L4f
            r3 = 47
            int r3 = r2.lastIndexOf(r3)     // Catch: java.net.URISyntaxException -> L50
            int r3 = r3 + 1
            int r4 = r2.length()     // Catch: java.net.URISyntaxException -> L50
            if (r3 >= r4) goto L4f
            java.lang.String r6 = r2.substring(r3)     // Catch: java.net.URISyntaxException -> L50
            goto L50
        L4f:
            r6 = r1
        L50:
            if (r6 == 0) goto L59
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes
            org.apache.tika.mime.MimeType r6 = r2.getMimeType(r6)
            goto L5a
        L59:
            r6 = r1
        L5a:
            java.lang.String r2 = "Content-Type"
            java.lang.String r7 = r7.get(r2)
            if (r7 == 0) goto L68
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes     // Catch: org.apache.tika.mime.MimeTypeException -> L68
            org.apache.tika.mime.MimeType r1 = r2.forName(r7)     // Catch: org.apache.tika.mime.MimeTypeException -> L68
        L68:
            org.apache.tika.mime.MediaType r6 = r5.applyProbilities(r0, r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.mime.ProbabilisticMimeDetectionSelector.detect(java.io.InputStream, org.apache.tika.metadata.Metadata):org.apache.tika.mime.MediaType");
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.mimeTypes.getMediaTypeRegistry();
    }

    public ProbabilisticMimeDetectionSelector(Builder builder) {
        this(MimeTypes.getDefaultMimeTypes(), builder);
    }

    public ProbabilisticMimeDetectionSelector(MimeTypes mimeTypes) {
        this(mimeTypes, null);
    }

    public ProbabilisticMimeDetectionSelector(MimeTypes mimeTypes, Builder builder) {
        this.mimeTypes = mimeTypes;
        this.rootMediaType = MediaType.OCTET_STREAM;
        initializeDefaultProbabilityParameters();
        this.changeRate = 0.1f;
        if (builder != null) {
            this.priorMagicFileType = Builder.h(builder) == 0.0f ? this.priorMagicFileType : Builder.h(builder);
            this.priorExtensionFileType = Builder.g(builder) == 0.0f ? this.priorExtensionFileType : Builder.g(builder);
            this.priorMetaFileType = Builder.i(builder) == 0.0f ? this.priorMetaFileType : Builder.i(builder);
            this.magic_trust = Builder.d(builder) == 0.0f ? this.magic_trust : Builder.a(builder);
            this.extension_trust = Builder.b(builder) == 0.0f ? this.extension_trust : Builder.b(builder);
            this.meta_trust = Builder.f(builder) == 0.0f ? this.meta_trust : Builder.f(builder);
            this.magic_neg = Builder.c(builder) == 0.0f ? this.magic_neg : Builder.c(builder);
            this.extension_neg = Builder.a(builder) == 0.0f ? this.extension_neg : Builder.a(builder);
            this.meta_neg = Builder.e(builder) == 0.0f ? this.meta_neg : Builder.e(builder);
            this.threshold = Builder.j(builder) == 0.0f ? this.threshold : Builder.j(builder);
        }
    }
}
