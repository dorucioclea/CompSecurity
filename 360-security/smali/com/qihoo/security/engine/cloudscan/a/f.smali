.class public final Lcom/qihoo/security/engine/cloudscan/a/f;
.super Lnet/jarlehansen/protobuf/javame/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/cloudscan/a/f$a;
    }
.end annotation


# static fields
.field private static a:Lnet/jarlehansen/protobuf/javame/a/a/b;


# instance fields
.field private final b:Ljava/util/Vector;

.field private final c:Ljava/util/Vector;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/jarlehansen/protobuf/javame/a/a/a;->a()Lnet/jarlehansen/protobuf/javame/a/a/a;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/cloudscan/a/f;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    return-void
.end method

.method private constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/f$a;)V
    .locals 1

    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/a;-><init>()V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/f$a;->a(Lcom/qihoo/security/engine/cloudscan/a/f$a;)Ljava/util/Vector;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f;->b:Ljava/util/Vector;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/f$a;->b(Lcom/qihoo/security/engine/cloudscan/a/f$a;)Ljava/util/Vector;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f;->c:Ljava/util/Vector;

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/f$a;Lcom/qihoo/security/engine/cloudscan/a/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/qihoo/security/engine/cloudscan/a/f;-><init>(Lcom/qihoo/security/engine/cloudscan/a/f$a;)V

    return-void
.end method

.method public static a()Lcom/qihoo/security/engine/cloudscan/a/f$a;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/f$a;-><init>(Lcom/qihoo/security/engine/cloudscan/a/f$a;)V

    return-object v0
.end method

.method static a(Lnet/jarlehansen/protobuf/javame/a/a;)Lcom/qihoo/security/engine/cloudscan/a/f;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0}, Lcom/qihoo/security/engine/cloudscan/a/f;->b(Lnet/jarlehansen/protobuf/javame/a/a;)I

    move-result v0

    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/f;->a()Lcom/qihoo/security/engine/cloudscan/a/f$a;

    move-result-object v1

    :goto_0
    if-gtz v0, :cond_0

    invoke-virtual {v1}, Lcom/qihoo/security/engine/cloudscan/a/f$a;->a()Lcom/qihoo/security/engine/cloudscan/a/f;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {p0, v1, v0}, Lcom/qihoo/security/engine/cloudscan/a/f;->a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/f$a;I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lnet/jarlehansen/protobuf/javame/a/a;->b()V

    :cond_1
    invoke-static {p0}, Lcom/qihoo/security/engine/cloudscan/a/f;->b(Lnet/jarlehansen/protobuf/javame/a/a;)I

    move-result v0

    goto :goto_0
.end method

.method public static a([B)Lcom/qihoo/security/engine/cloudscan/a/f;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lnet/jarlehansen/protobuf/javame/a/a;

    sget-object v1, Lcom/qihoo/security/engine/cloudscan/a/f;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    invoke-direct {v0, p0, v1}, Lnet/jarlehansen/protobuf/javame/a/a;-><init>([BLnet/jarlehansen/protobuf/javame/a/a/b;)V

    invoke-static {v0}, Lcom/qihoo/security/engine/cloudscan/a/f;->a(Lnet/jarlehansen/protobuf/javame/a/a;)Lcom/qihoo/security/engine/cloudscan/a/f;

    move-result-object v0

    return-object v0
.end method

.method static a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/f$a;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v2, 0x1

    packed-switch p2, :pswitch_data_0

    :goto_0
    return v0

    :pswitch_0
    invoke-virtual {p0, v2}, Lnet/jarlehansen/protobuf/javame/a/a;->f(I)Ljava/util/Vector;

    move-result-object v3

    move v1, v0

    :goto_1
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/i;->a()Lcom/qihoo/security/engine/cloudscan/a/i$a;

    move-result-object v4

    new-instance v5, Lnet/jarlehansen/protobuf/javame/a/a;

    sget-object v6, Lcom/qihoo/security/engine/cloudscan/a/f;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    invoke-direct {v5, v0, v6}, Lnet/jarlehansen/protobuf/javame/a/a;-><init>([BLnet/jarlehansen/protobuf/javame/a/a/b;)V

    move v0, v2

    :goto_2
    if-nez v0, :cond_1

    invoke-virtual {v4}, Lcom/qihoo/security/engine/cloudscan/a/i$a;->a()Lcom/qihoo/security/engine/cloudscan/a/i;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/engine/cloudscan/a/f$a;->a(Lcom/qihoo/security/engine/cloudscan/a/i;)Lcom/qihoo/security/engine/cloudscan/a/f$a;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_1
    invoke-static {v5}, Lcom/qihoo/security/engine/cloudscan/a/f;->b(Lnet/jarlehansen/protobuf/javame/a/a;)I

    move-result v0

    invoke-static {v5, v4, v0}, Lcom/qihoo/security/engine/cloudscan/a/i;->a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/i$a;I)Z

    move-result v0

    goto :goto_2

    :pswitch_1
    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lnet/jarlehansen/protobuf/javame/a/a;->f(I)Ljava/util/Vector;

    move-result-object v3

    move v1, v0

    :goto_3
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/j;->a()Lcom/qihoo/security/engine/cloudscan/a/j$a;

    move-result-object v4

    new-instance v5, Lnet/jarlehansen/protobuf/javame/a/a;

    sget-object v6, Lcom/qihoo/security/engine/cloudscan/a/f;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    invoke-direct {v5, v0, v6}, Lnet/jarlehansen/protobuf/javame/a/a;-><init>([BLnet/jarlehansen/protobuf/javame/a/a/b;)V

    move v0, v2

    :goto_4
    if-nez v0, :cond_3

    invoke-virtual {v4}, Lcom/qihoo/security/engine/cloudscan/a/j$a;->a()Lcom/qihoo/security/engine/cloudscan/a/j;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/engine/cloudscan/a/f$a;->a(Lcom/qihoo/security/engine/cloudscan/a/j;)Lcom/qihoo/security/engine/cloudscan/a/f$a;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :cond_3
    invoke-static {v5}, Lcom/qihoo/security/engine/cloudscan/a/f;->b(Lnet/jarlehansen/protobuf/javame/a/a;)I

    move-result v0

    invoke-static {v5, v4, v0}, Lcom/qihoo/security/engine/cloudscan/a/j;->a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/j$a;I)Z

    move-result v0

    goto :goto_4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static b(Lnet/jarlehansen/protobuf/javame/a/a;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lnet/jarlehansen/protobuf/javame/a/a;->a()I

    move-result v0

    return v0
.end method

.method private e()I
    .locals 4

    const/16 v3, 0x8

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/f;->b:Ljava/util/Vector;

    invoke-static {v1, v3, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(IILjava/util/Vector;)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/f;->c:Ljava/util/Vector;

    invoke-static {v1, v3, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(IILjava/util/Vector;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public a(Lnet/jarlehansen/protobuf/javame/b/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v2, 0x8

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/f;->b:Ljava/util/Vector;

    invoke-virtual {p1, v0, v2, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(IILjava/util/Vector;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/f;->c:Ljava/util/Vector;

    invoke-virtual {p1, v0, v2, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(IILjava/util/Vector;)V

    return-void
.end method

.method public b()I
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/f;->e()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public c()Ljava/util/Vector;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f;->b:Ljava/util/Vector;

    return-object v0
.end method

.method public d()Ljava/util/Vector;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f;->c:Ljava/util/Vector;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, ""

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "sections = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "kvmap = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/f;->c:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
