package P4;

import G4.c;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class v {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[G4.q.values().length];
            d = iArr;
            try {
                iArr[G4.q.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[G4.q.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[G4.n.values().length];
            c = iArr2;
            try {
                iArr2[G4.n.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[G4.n.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[G4.n.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[G4.n.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[G4.n.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[G4.a.values().length];
            b = iArr3;
            try {
                iArr3[G4.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[G4.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[G4.v.values().length];
            a = iArr4;
            try {
                iArr4[G4.v.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[G4.v.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[G4.v.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[G4.v.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[G4.v.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[G4.v.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(G4.a aVar) {
        int i = a.b[aVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static G4.c b(byte[] r6) {
        /*
            G4.c r0 = new G4.c
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L17:
            if (r6 <= 0) goto L2f
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r0.a(r3, r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            r6 = move-exception
            goto L48
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r6 = move-exception
            r6.printStackTrace()
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L58
        L3b:
            r6 = move-exception
            r6.printStackTrace()
            goto L58
        L40:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L59
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L48:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.printStackTrace()
        L55:
            r1.close()     // Catch: java.io.IOException -> L3b
        L58:
            return r0
        L59:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r0.printStackTrace()
        L63:
            r1.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            r0.printStackTrace()
        L6b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.v.b(byte[]):G4.c");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0053 -> B:18:0x006a). Please report as a decompilation issue!!! */
    public static byte[] c(G4.c cVar) {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        if (cVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            objectOutputStream.writeInt(cVar.c());
            for (c.a aVar : cVar.b()) {
                objectOutputStream.writeUTF(aVar.a().toString());
                objectOutputStream.writeBoolean(aVar.b());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            byteArrayOutputStream.close();
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e7) {
                e7.printStackTrace();
                throw th;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static G4.a d(int i) {
        if (i == 0) {
            return G4.a.EXPONENTIAL;
        }
        if (i == 1) {
            return G4.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    public static G4.n e(int i) {
        if (i == 0) {
            return G4.n.NOT_REQUIRED;
        }
        if (i == 1) {
            return G4.n.CONNECTED;
        }
        if (i == 2) {
            return G4.n.UNMETERED;
        }
        if (i == 3) {
            return G4.n.NOT_ROAMING;
        }
        if (i == 4) {
            return G4.n.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return G4.n.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    public static G4.q f(int i) {
        if (i == 0) {
            return G4.q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return G4.q.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
    }

    public static G4.v g(int i) {
        if (i == 0) {
            return G4.v.ENQUEUED;
        }
        if (i == 1) {
            return G4.v.RUNNING;
        }
        if (i == 2) {
            return G4.v.SUCCEEDED;
        }
        if (i == 3) {
            return G4.v.FAILED;
        }
        if (i == 4) {
            return G4.v.BLOCKED;
        }
        if (i == 5) {
            return G4.v.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    public static int h(G4.n nVar) {
        int i = a.c[nVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && nVar == G4.n.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + nVar + " to int");
    }

    public static int i(G4.q qVar) {
        int i = a.d[qVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + qVar + " to int");
    }

    public static int j(G4.v vVar) {
        switch (a.a[vVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + vVar + " to int");
        }
    }
}
