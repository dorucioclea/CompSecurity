.class public final Ljp/co/cyberagent/android/a/p;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# instance fields
.field private y:F

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/p;-><init>(B)V

    .line 72
    return-void
.end method

.method private constructor <init>(B)V
    .locals 2

    .prologue
    .line 75
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "precision highp float;\nvarying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform mediump float hueAdjust;\nconst highp vec4 kRGBToYPrime = vec4 (0.299, 0.587, 0.114, 0.0);\nconst highp vec4 kRGBToI = vec4 (0.595716, -0.274453, -0.321263, 0.0);\nconst highp vec4 kRGBToQ = vec4 (0.211456, -0.522591, 0.31135, 0.0);\n\nconst highp vec4 kYIQToR = vec4 (1.0, 0.9563, 0.6210, 0.0);\nconst highp vec4 kYIQToG = vec4 (1.0, -0.2721, -0.6474, 0.0);\nconst highp vec4 kYIQToB = vec4 (1.0, -1.1070, 1.7046, 0.0);\n\nvoid main ()\n{\n    // Sample the input pixel\n    highp vec4 color = texture2D(inputImageTexture, textureCoordinate);\n\n    // Convert to YIQ\n    highp float YPrime = dot (color, kRGBToYPrime);\n    highp float I = dot (color, kRGBToI);\n    highp float Q = dot (color, kRGBToQ);\n\n    // Calculate the hue and chroma\n    highp float hue = atan (Q, I);\n    highp float chroma = sqrt (I * I + Q * Q);\n\n    // Make the user\'s adjustments\n    hue += (-hueAdjust); //why negative rotation?\n\n    // Convert back to YIQ\n    Q = chroma * sin (hue);\n    I = chroma * cos (hue);\n\n    // Convert back to RGB\n    highp vec4 yIQ = vec4 (YPrime, I, Q, 0.0);\n    color.r = dot (yIQ, kYIQToR);\n    color.g = dot (yIQ, kYIQToG);\n    color.b = dot (yIQ, kYIQToB);\n\n    // Save the result\n    gl_FragColor = color;\n}\n"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const/high16 v0, 0x42b40000    # 90.0f

    iput v0, p0, Ljp/co/cyberagent/android/a/p;->y:F

    .line 77
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 3

    .prologue
    .line 92
    iput p1, p0, Ljp/co/cyberagent/android/a/p;->y:F

    .line 93
    iget v0, p0, Ljp/co/cyberagent/android/a/p;->y:F

    const/high16 v1, 0x43b40000    # 360.0f

    rem-float/2addr v0, v1

    const v1, 0x40490fdb    # (float)Math.PI

    mul-float/2addr v0, v1

    const/high16 v1, 0x43340000    # 180.0f

    div-float/2addr v0, v1

    .line 94
    iget v1, p0, Ljp/co/cyberagent/android/a/p;->z:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 95
    iget v1, p0, Ljp/co/cyberagent/android/a/p;->z:I

    invoke-virtual {p0, v1, v0}, Ljp/co/cyberagent/android/a/p;->a(IF)V

    .line 96
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 81
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 82
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/p;->p()I

    move-result v0

    const-string v1, "hueAdjust"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/p;->z:I

    .line 83
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 87
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->d()V

    .line 88
    iget v0, p0, Ljp/co/cyberagent/android/a/p;->y:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 89
    return-void
.end method
